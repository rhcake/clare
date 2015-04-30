package clare.asm;

import clare.tree.Fun;


public class VReg {

	private static int ID;
	private int mId;
	private boolean mPreColored = false;
	private Reg mReg;
	private boolean mSpill;
	
	public void preColor(Reg reg) {
		if (mPreColored)
			System.err.println(getVName() + " already pre-colored");
		mPreColored = true;
		mReg = reg;
	}
	
	public void markForSpill() { mSpill = true; }
	
	public boolean spillable() { return mSpill; }
	
	public void reset() {
		mSpill = false;
		if (!mPreColored)
			mReg = null;
	}
	
	public Reg getReg() { return mReg; }
	
	public boolean allocated() { return mReg != null; }
	
	public void alloc(Reg reg) { mReg = reg; }
	
	private Fun mFun;
	private int mOffset;
	
	public VReg(Fun fun) { mFun = fun; mId = ID++; }
	
	@Override
	public String toString() { 
		return (mReg != null)? mReg + "" : "r" + mId;
	}
	
	public String getVName() { return "r" + mId; }
	
	public void spill() {
		mOffset = mFun.addLocal(4);
	}
	
	public int getOffset() { return mOffset; }
	
	public Fun getFun() { return mFun; }
}














