package clare.asm;

import java.util.HashSet;
import java.util.Set;



public class In {
	
	public int op;
	public Object arg1, arg2;

	public In arg1(Object arg1) { this.arg1 = arg1; return this; }
	public In arg2(Object arg2) { this.arg2 = arg2; return this; }
	
	public In(int op) { this.op = op; }

	public boolean isVReg1() { return arg1 instanceof VReg; }
	public boolean isVReg2() { return arg2 instanceof VReg; }

	public VReg asVReg1() { return (VReg)arg1; }
	public VReg asVReg2() { return (VReg)arg2; }

	private Set<VReg> mUse = new HashSet<>();
	private Set<VReg> mDef = new HashSet<>();

	public In use(VReg... vRegs) { mUse.addAll(Sets.asSet(vRegs)); return this; }
	public In def(VReg... vRegs) { mDef.addAll(Sets.asSet(vRegs)); return this; }

	public Set<VReg> getUse() { return mUse; }
	public Set<VReg> getDef() { return mDef; }
}













