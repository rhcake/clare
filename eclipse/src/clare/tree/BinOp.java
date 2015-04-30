package clare.tree;

import org.stringtemplate.v4.compiler.STParser.namedArg_return;

import clare.asm.Asm;
import clare.asm.Reg;
import clare.asm.VReg;
import clare.x86.X86;

public class BinOp extends Ex {

	public static final int ADD = 1;
	public static final int SUB = 2;
	public static final int MUL = 3;
	public static final int DIV = 4;
	
	private int mOp;
	private Ex mA, mB;
	
	public BinOp(int op, Ex a, Ex b) {
		super(Type.max(a.getType(), b.getType()));
		mOp = op;
		mA = a;
		mB = b;
	}
	
	@Override
	public String toString() {
		switch (mOp) {
		case ADD: return mA + " + " + mB;
		case SUB: return mA + " - " + mB;
		case MUL: return mA + " * " + mB;
		case DIV: return mA + " / " + mB;
		}
		return mA + " ? " + mB;
	}
	
	@Override
	public VReg load(Asm asm, Fun fun) {
		switch (mOp) {
		case ADD: return add(asm, fun);
		case SUB: return sub(asm, fun);
		case MUL: return mul(asm, fun);
		case DIV: return div(asm, fun);
		default:
			return null;
		}
	}
	
	private VReg add(Asm asm, Fun fun) {
		VReg a = mA.load(asm, fun);
		VReg b = mB.load(asm, fun);
		asm.emit(X86.add(a, b));
		return a;
	}
	
	private VReg sub(Asm asm, Fun fun) {
		VReg a = mA.load(asm, fun);
		VReg b = mB.load(asm, fun);
		asm.emit(X86.sub(a, b));
		return a;
	}
	
	private VReg mul(Asm asm, Fun fun) {
		VReg a = mA.load(asm, fun);
		VReg b = mB.load(asm, fun);
		asm.emit(X86.imul(a, b));
		return a;
	}
	
	private VReg div(Asm asm, Fun fun) {
		VReg a = mA.load(asm, fun);
		VReg b = mB.load(asm, fun);
		
		VReg eax = new VReg(fun);
		eax.preColor(Reg.EAX);
		asm.emit(X86.mov(eax, a));
		VReg edx = new VReg(fun);
		edx.preColor(Reg.EDX);
		asm.emit(X86.cdq(eax, edx));
		
		asm.emit(X86.idiv(b, eax, edx));
		return a;
	}
}














