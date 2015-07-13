package clare.asm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Asm {
	
	private List<In> mIns = new ArrayList<In>();
	
	public void emit(In in) {
		mIns.add(in);
	}
	
	public void print(Context cxt) {
		cxt.toBlocks(mIns).forEach(cxt::printBlock);
	}
	
	public void regAlloc(Context cxt) {
		
		List<Block> blocks = cxt.toBlocks(mIns);
		solveDataflow(blocks);
		try {
			for (Block block : blocks)
				block.regAlloc();
		} catch (SpillException e) {
			System.err.println("Spilling not enabled.");
			System.exit(1);
		}
	}
	
	private void solveDataflow(List<Block> blocks) {
		
		int i = 0;
		boolean flag = true;

		blocks.forEach(b -> b.resetInOutVRegs());
		
		while (flag) {
			
			i++;
			
			for (Block b : blocks) {
				
				Set<VReg> in = b.copyInVRegs();
				Set<VReg> out = b.copyOutVRegs();
				Set<VReg> kill = b.copyKillVRegs();
				Set<VReg> gen = b.copyGenVRegs();
				
				b.setInVRegs(Sets.union(gen, Sets.minus(out, kill)));
				b.setOutVRegs(b.getOutBlocks().stream()
						.map(Block::getInVRegs)
						.reduce((x, y) -> Sets.union(x, y))
						.orElse(new HashSet<>()));
				
				flag &= in.equals(b.getInVRegs());
				flag &= out.equals(b.getOutVRegs());
			}
			
			flag = !flag;
		}
		
		//System.out.println("dataflow iterations: " + i);
	}
}












