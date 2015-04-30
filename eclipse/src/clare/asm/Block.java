package clare.asm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Block {

	private Set<Block> mInBlocks = new HashSet<>();
	private Set<Block> mOutBlocks = new HashSet<>();

	public Set<Block> copyInBlocks() { return new HashSet<>(mInBlocks); }
	
	public Set<Block> getOutBlocks() { return mOutBlocks; }

	public void chainBlock(Block block) {
		mOutBlocks.add(block);
		block.mInBlocks.add(this);
	}
	
	private static int ID;
	private String mName;
	
	@Override
	public String toString() {
		return mName;
	}
	
	public Block() { mName = ID + ""; ID++; }
	
	public Block(String name) { mName = name; }
	
	private List<In> mIns = new ArrayList<>();
	
	public List<In> getIns() { return mIns; }
	
	public void addIn(In in) { mIns.add(in); }

	private Set<VReg> mInVRegs = new HashSet<>();
	private Set<VReg> mOutVRegs = new HashSet<>();
	
	public void resetInOutVRegs() {
		mInVRegs = new HashSet<VReg>();
		mOutVRegs = new HashSet<VReg>();
	}

	public Set<VReg> getInVRegs() { return mInVRegs; }
	public Set<VReg> getOutVRegs() { return mOutVRegs; }
	
	public Set<VReg> copyInVRegs() { return Sets.copy(mInVRegs); }
	public Set<VReg> copyOutVRegs() { return Sets.copy(mOutVRegs); }

	public void setInVRegs(Set<VReg> in) { mInVRegs = Sets.copy(in); }
	public void setOutVRegs(Set<VReg> out) { mOutVRegs = Sets.copy(out); }
	
	private RIG buildRIG() {
		
		RIG rig = new RIG();
		Set<VReg> set = copyOutVRegs();

		rig.addNodesAndEdges(set);
		
		ListIterator<In> i = mIns.listIterator(mIns.size());
		while (i.hasPrevious()) {
			
			In in = i.previous();

			if (in.isVReg1()) rig.addNode(in.asVReg1());
			if (in.isVReg2()) rig.addNode(in.asVReg2());
			
			set.removeAll(in.getDef());
			set.addAll(in.getUse());

			rig.addNodesAndEdges(set);
		}
		return rig;
	}
	
	public void regAlloc() throws SpillException {
		RIG rig = buildRIG();
		rig.color();
	}
	
	public Set<VReg> copyGenVRegs() {
		Set<VReg> gen = new HashSet<>();
		ListIterator<In> i = mIns.listIterator(mIns.size());
		while (i.hasPrevious()) {
			In in = i.previous();
			gen.removeAll(in.getDef());
			gen.addAll(in.getUse());
		}
		return gen;
	}
	
	public Set<VReg> copyKillVRegs() {
		Set<VReg> kill = new HashSet<>();
		for (In in : mIns)
			kill.addAll(in.getDef());
		return kill;
	}
}













