package clare.x86;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import clare.asm.Block;
import clare.asm.Context;
import clare.asm.In;
import clare.tree.Fun;

public class X86Context implements Context {

	@Override
	public List<Block> toBlocks(List<In> ins) {
		List<Block> blocks = new ArrayList<>();
		
		Block entry = new Block("entry");
		blocks.add(entry);
		
		Block exit = new Block("exit");
		
		Block current = new Block();
		entry.chainBlock(current);
		blocks.add(current);

		Map<String, Block> namedBlocks = new HashMap<>();
		Map<String, Set<Block>> unresolvedJumps = new HashMap<>();
		
		for (In in : ins) {
			switch (in.op) {
			case X86.PROLOGUE:
				current.chainBlock(exit);
				current = new Block();
				entry.chainBlock(current);
				blocks.add(current);
				current.addIn(in);
				break;
			case X86.EPILOGUE:
				current.addIn(in);
				current.chainBlock(exit);
				break;
			case X86.LABEL: 
			{
				Block block = new Block();
				current.chainBlock(block);
				current = block;
				blocks.add(current);
				current.addIn(in);
				namedBlocks.put((String)in.arg1, current);
			}
				break;
			case X86.JZ:
			{
				current.addIn(in);
				String label = (String)in.arg1;
				if (unresolvedJumps.get(label) == null)
					unresolvedJumps.put(label, new HashSet<>());
				unresolvedJumps.get(label).add(current);
				
				Block block = new Block();
				current.chainBlock(block);
				blocks.add(block);
				current = block;
			}
				break;
			default:
				current.addIn(in);
				break;
			}
		}
		
		for (String label :unresolvedJumps.keySet()) {
			Block target = namedBlocks.get(label);
			for (Block src : unresolvedJumps.get(label))
				src.chainBlock(target);
		}
		
		blocks.add(exit);
		return blocks;
	}
	
	private void print(String line) { System.out.println(line); }
	
	public void printBlock(Block block) {
		print(";--- block " + block + " ---");
		block.getIns().forEach(this::printIn);
	}

	private void printIn(In in) {
		switch (in.op) {
		
		case X86.COMMENT: 		print(";" + in.arg1); 					break;
		case X86.SECTION: 		print("section " + in.arg1); 			break;
		case X86.LABEL: 		print(in.arg1 + ":");					break;
		
		case X86.PROLOGUE: {
			print(";prologue");
			Fun fun = (Fun)in.arg1;
			print("global " + fun.getName());
			print(fun.getName() + ":");
			print("push ebp");
			print("mov ebp, esp");
			print("sub esp, " + fun.getLocalSize());
			print("push ebx");
			print("push esi");
			print("push edi");
			break;
		}
		
		case X86.EPILOGUE: {
			print(";epilogue");
			Fun fun = (Fun)in.arg1;
			print("pop edi");
			print("pop esi");
			print("pop ebx");
			print("add esp, " + fun.getLocalSize());
			print("pop ebp");
			print("ret");
			break;
		}

		case X86.PUSH:	print("push " + in.arg1);					break;
		case X86.MOV:	print("mov " + in.arg1 + ", " + in.arg2);	break;
		case X86.SUB:	print("sub " + in.arg1 + ", " + in.arg2);	break;
		case X86.ADD:	print("add " + in.arg1 + ", " + in.arg2);	break;
		case X86.POP:	print("pop " + in.arg1);					break;
		case X86.CMP:	print("cmp " + in.arg1 + ", " + in.arg2);	break;
		case X86.JZ:	print("jz " + in.arg1);						break;
		case X86.CALL:	print("call " + in.arg1);					break;
		case X86.IMUL:	print("imul " + in.arg1 + ", " + in.arg2);	break;
		case X86.IDIV:	print("idiv " + in.arg1);					break;
		case X86.CDQ:	print("cdq");								break;
		case X86.LEA:	print("lea " + in.arg1 + ", " + in.arg2);	break;
		
		default:
			System.err.println("can't print operation " + in.op);
			break;
		}
	}
}











