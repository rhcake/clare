package clare.tree;

import clare.asm.Asm;
import clare.asm.VReg;
import clare.x86.X86;

public class I32 extends Ex {

	private int mVal;
	
	public I32(String val) {
		super(Type.I32);
		mVal = Integer.parseInt(val);
	}
	
	public I32(int val) {
		super(Type.I32);
		mVal = val;
	}
	
	@Override
	public String toString() {
		return mVal + "";
	}
	
	@Override
	public VReg load(Asm asm, Fun fun) {
		VReg r = new VReg(fun);
		asm.emit(X86.mov(r, mVal));
		return r;
	}
}

















