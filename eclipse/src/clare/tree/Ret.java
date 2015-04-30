package clare.tree;

import clare.asm.Asm;
import clare.asm.Reg;
import clare.asm.VReg;
import clare.x86.X86;

public class Ret extends Stm {

	private Fun mFun;
	private Ex mEx;
	
	public Ret(Fun fun, Ex ex) { mEx = ex; mFun = fun; }
	
	@Override
	public void genAsm(Asm asm, Fun fun) {
		asm.emit(X86.comment("return " + mEx));
		VReg r = mEx.load(asm, fun);
		VReg eax = new VReg(fun);
		eax.preColor(Reg.EAX);
		asm.emit(X86.mov(eax, r));
		asm.emit(X86.epilogue(mFun));
	}
}
