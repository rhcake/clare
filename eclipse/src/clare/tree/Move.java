package clare.tree;

import clare.asm.Asm;
import clare.asm.VReg;
import clare.x86.X86;


public class Move extends Stm {

	private Ex mDst, mSrc;
	
	public Move(Ex dst, Ex src) {
		Type dt = dst.getType();
		Type st = src.getType();
		if (dt != st)
			System.err.println("can't assign type " + st + " to " + dt);
		mDst = dst;
		mSrc = src;
	}
	
	@Override
	public void genAsm(Asm asm, Fun fun) {
		asm.emit(X86.comment(mDst + " = " + mSrc));
		VReg src = mSrc.load(asm, fun);
		mDst.store(asm, fun, src);
	}
}







