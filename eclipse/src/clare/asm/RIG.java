package clare.asm;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

public class RIG {

	private Map<VReg, Set<VReg>> mGraph = new HashMap<>();
	
	public void addNode(VReg n) {
		if (mGraph.get(n) == null) 
			mGraph.put(n, new HashSet<>());
	}
	
	public void addEdge(VReg a, VReg b) {
		addNode(a);
		addNode(b);
		mGraph.get(a).add(b);
		mGraph.get(b).add(a);
	}
	
	private void addEdges(VReg a, Set<VReg> bs) {
		addNode(a);
		bs.forEach(b -> addEdge(a, b));
	}
	
	public void addNodesAndEdges(Set<VReg> nodes) {
		nodes.forEach(this::addNode);
		Sets.forPairs(nodes, (a, b) -> addEdge(a, b));
	}
	
	private Set<VReg> getNodes() { return mGraph.keySet(); }
	
	private Set<VReg> getEdges(VReg n) { return mGraph.get(n); }
	
	private Set<VReg> copyEdges(VReg n) { return Sets.copy(getEdges(n)); }
	
	private void removeNode(VReg n) {
		mGraph.remove(n);
		for (VReg k : getNodes())
			getEdges(k).remove(n);
	}

	public void print() {
		for (VReg n : getNodes()) {
			System.out.print(n.getVName() + " : [");
			System.out.print(
					getEdges(n).stream()
					.map(VReg::getVName)
					.collect(Collectors.joining(", ")));
			System.out.println("]");
		}
	}
	
	private static final Reg[] REGS = {
		Reg.EAX, Reg.ECX, Reg.EDX, Reg.EBX, Reg.ESI, Reg.EDI
	};
	
	private static class Pair {
		public VReg n;
		public Set<VReg> edges;
		public Pair(VReg n, Set<VReg> edges) {
			this.n = n;
			this.edges = edges;
		}
	}
	
	private Pair pair(VReg n) {
		return new Pair(n, copyEdges(n));
	}
	
	private int degree(VReg n) { return getEdges(n).size(); }
	
	private VReg smallestNode() {
		return getNodes().stream()
		.filter(n -> !n.allocated())
		.min((a, b) -> degree(a) - degree(b))
		.orElse(null);
	}
	
	public void color() throws SpillException {
		
		Stack<Pair> stack = new Stack<>();
		
		VReg node = null;
		while ((node = smallestNode()) != null) {
			if (degree(node) >= REGS.length)
				node.markForSpill();
			stack.push(pair(node));
			removeNode(node);
		}
		
		getNodes().stream()
		.filter(n -> n.allocated())
		.forEach(n -> {
			getEdges(n).stream()
			.filter(e -> e.allocated())
			.filter(e -> n.getReg() == e.getReg())
			.forEach(e -> {
				System.err.println(
						"register conflict: " + n.getVName() + " " + e.getVName());
			});
		});
		
		while (!stack.empty()) {
			
			Pair pair = stack.pop();
			VReg n = pair.n;
			addEdges(n, pair.edges);
			
			Set<Reg> regs = Sets.asSet(REGS);
			getEdges(n).forEach(e -> regs.remove(e.getReg()));
			if (regs.size() != 0) {
				Reg reg = regs.stream().findAny().get();
				n.alloc(reg);
			} else {
				throw new SpillException(n);
			}
		}
	}
}













