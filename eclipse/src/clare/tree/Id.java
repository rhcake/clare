package clare.tree;

import clare.asm.Asm;
import clare.asm.VReg;
import clare.x86.X86;


public class Id extends Ex {

	private String mName;
	
	public String getName() { return mName; }
	
	public enum Storage {
		LOCAL,
		PARAM,
		FIELD
	}
	
	private Storage mStorage;
	private int mOffset;
	
	public void setOffset(int offset) { mOffset = offset; }
	
	public int getOffset() { return mOffset; }
	
	public Id(String name, Type type, Storage storage) {
		super(type);
		mName = name;
		mStorage = storage;
	}
	
	@Override
	public String toString() {
		return mName;
	}
	
	private VReg mVReg;
	
	@Override
	public VReg addr(Asm asm, Fun fun) {
		VReg r = new VReg(fun);
		switch (mStorage) {
		case LOCAL:
			asm.emit(X86.lea(r, "[ebp - " + mOffset + "]"));
			break;
		case PARAM:
			asm.emit(X86.lea(r, "[ebp + " + mOffset + "]"));
			break;
		}
		return r;
	}
	
	@Override
	public VReg load(Asm asm, Fun fun) {
		
		VReg r = new VReg(fun);
		switch (mStorage) {
		case LOCAL:
			asm.emit(X86.mov(r, mVReg));
			break;
		case PARAM:{
			if (mVReg == null) {
				mVReg = new VReg(fun);
				asm.emit(X86.mov(mVReg, "[ebp + " + getOffset() + "]"));
			}
			asm.emit(X86.mov(r, mVReg));
			break;
		}
		}
		return r;
	}
	
	@Override
	public void store(Asm asm, Fun fun, VReg src) {
		if (mVReg == null)
			mVReg = new VReg(fun);
		asm.emit(X86.mov(mVReg, src));
	}
}















