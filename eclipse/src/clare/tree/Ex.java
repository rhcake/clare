package clare.tree;

import clare.asm.Asm;
import clare.asm.VReg;

public abstract class Ex {

	private Type mType;

	public Type getType() { return mType; }
	
	public Ex(Type type) { mType = type; }
	
	public void store(Asm asm, Fun fun, VReg src) {
		System.err.println("can't store in " + this);
	}
	
	public VReg load(Asm asm, Fun fun) {
		System.err.println("can't load " + this);
		return null;
	}
	
	public VReg addr(Asm asm, Fun fun) {
		System.err.println("can't get address of " + this);
		return null;
	}
}











