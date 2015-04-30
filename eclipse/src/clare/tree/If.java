package clare.tree;

import java.util.ArrayList;
import java.util.List;

import clare.asm.Asm;
import clare.asm.Label;
import clare.asm.VReg;
import clare.x86.X86;

public class If extends Stm {

	private Ex mEx;
	private List<Stm> mStms = new ArrayList<>();
	
	public If(Ex ex) { mEx = ex; }
	
	public void addStm(Stm stm) { mStms.add(stm); }
	
	@Override
	public void genAsm(Asm asm, Fun fun) {
		String f = Label.gen();
		asm.emit(X86.comment("if " + mEx + " == 0 goto " + f));
		VReg r = mEx.load(asm, fun);
		VReg z = new I32(0).load(asm, fun);
		asm.emit(X86.cmp(r, z));
		asm.emit(X86.jz(f));
		mStms.forEach(s -> s.genAsm(asm, fun));
		asm.emit(X86.label(f));
	}
}
















