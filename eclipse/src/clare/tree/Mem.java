package clare.tree;

import clare.asm.Asm;
import clare.asm.VReg;
import clare.x86.X86;


public class Mem extends Ex {
	
	private Ex mBase;
	private int mOffset;

	public Mem(Ex base, int offset, Type type) {
		super(type);
		mBase = base;
		mOffset = offset;
	}
	
	@Override
	public VReg addr(Asm asm, Fun fun) {
		VReg base = mBase.addr(asm, fun);
		VReg r = new VReg(fun);
		asm.emit(X86.lea(r, base, mOffset));
		return r;
	}
	
	@Override
	public void store(Asm asm, Fun fun, VReg src) {
		VReg base = mBase.addr(asm, fun);
		asm.emit(X86.mov(base, mOffset, src));
	}
	
	@Override
	public VReg load(Asm asm, Fun fun) {
		VReg base = mBase.addr(asm, fun);
		VReg r = new VReg(fun);
		asm.emit(X86.mov(r, base, mOffset));
		return r;
	}
	
	@Override
	public String toString() {
		return "[" + mBase + " + " + mOffset + "]";
	}
}













