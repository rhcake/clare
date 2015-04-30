package clare.asm;

public class SpillException extends Exception {

	private VReg mVReg;
	
	public SpillException(VReg vReg) { mVReg = vReg; }
	
	public VReg getVReg() { return mVReg; }
}
