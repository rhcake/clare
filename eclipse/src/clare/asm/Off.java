package clare.asm;


public class Off {

	private VReg mBase;
	private int mOffset;
	
	public Off(VReg base, int offset) {
		mBase = base;
		mOffset = offset;
	}
	
	@Override
	public String toString() {
		return "[" + mBase + " + " + mOffset + "]";
	}
}
