package clare.tree;

import java.util.ArrayList;
import java.util.List;

import clare.asm.Asm;
import clare.x86.X86;

public class Mod {
	
	private List<Fun> mFuns = new ArrayList<>();
	
	public Fun getFun(String name) {
		return mFuns.stream()
		.filter(f -> f.getName().equals(name))
		.findAny()
		.get();
	}
	
	public void addFun(Fun fun) { mFuns.add(fun); }
	
	public Asm genAsm() {
		Asm asm = new Asm();
		asm.emit(X86.section(".text"));
		mFuns.forEach(f -> f.genAsm(asm));
		return asm;
	}
}
