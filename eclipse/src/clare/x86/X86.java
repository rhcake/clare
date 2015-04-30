package clare.x86;

import com.sun.org.apache.bcel.internal.generic.NEW;

import clare.asm.In;
import clare.asm.Off;
import clare.asm.Reg;
import clare.asm.VReg;
import clare.tree.Fun;



public class X86 {

	public static final int ADD 		= 1;
	public static final int PUSH 		= 2;
	public static final int POP 		= 3;
	public static final int CALL 		= 4;
	public static final int MOV 		= 5;
	public static final int COMMENT 	= 6;
	public static final int CMP 		= 7;
	public static final int JZ 			= 8;
	public static final int LABEL 		= 9;
	public static final int SECTION 	= 10;
	public static final int IMUL	 	= 11;
	public static final int IDIV	 	= 12;
	public static final int CDQ	 		= 13;
	public static final int SUB	 		= 14;
	public static final int PROLOGUE	= 15;
	public static final int EPILOGUE	= 16;
	public static final int LEA			= 17;

	public static In add(VReg dst, VReg src) {
		return new In(ADD).arg1(dst).arg2(src).use(dst, src).def(dst);
	}

	public static In add(Reg dst, int src) {
		return new In(ADD).arg1(dst).arg2(src);
	}
	
	public static In push(VReg src) {
		return new In(PUSH).arg1(src).use(src);
	}
	
	public static In pop(Reg dst) {
		return new In(POP).arg1(dst);
	}
	
	public static In push(Reg src) {
		return new In(PUSH).arg1(src);
	}
	
	public static In call(VReg eax, String name) {
		return new In(CALL).arg1(name).def(eax);
	}
	
	public static In mov(Reg dst, Reg src) {
		return new In(MOV).arg1(dst).arg2(src);
	}
	
	public static In mov(VReg dst, int src) {
		return new In(MOV).arg1(dst).arg2(src).def(dst);
	}
	
	public static In mov(VReg dst, VReg src) {
		return new In(MOV).arg1(dst).arg2(src).def(dst).use(src);
	}
	
	public static In mov(VReg dst, String src) {
		return new In(MOV).arg1(dst).arg2(src).def(dst);
	}
	
	public static In mov(VReg base, int offset, VReg src) {
		return new In(MOV)
		.arg1(new Off(base, offset))
		.arg2(src)
		.use(base, src);
	}
	
	public static In mov(VReg dst, VReg base, int offset) {
		return new In(MOV)
		.arg1(dst)
		.arg2(new Off(base, offset))
		.use(base).def(dst);
	}
	
	public static In comment(String comment) {
		return new In(COMMENT).arg1(comment);
	}
	
	public static In cmp(VReg dst, VReg src) {
		return new In(CMP).arg1(dst).arg2(src).use(dst, src);
	}
	
	public static In jz(String label) {
		return new In(JZ).arg1(label);
	}
	
	public static In label(String name) {
		return new In(LABEL).arg1(name);
	}
	
	public static In section(String name) {
		return new In(SECTION).arg1(name);
	}

	public static In sub(VReg dst, VReg src) {
		return new In(SUB).arg1(dst).arg2(src).use(dst, src).def(dst);
	}

	public static In imul(VReg dst, VReg src) {
		return new In(IMUL).arg1(dst).arg2(src).use(dst, src).def(dst);
	}

	public static In idiv(VReg src, VReg eax, VReg edx) {
		return new In(IDIV).arg1(src).use(src, eax, edx).def(eax, edx);
	}

	public static In cdq(VReg eax, VReg edx) {
		return new In(CDQ).use(eax).def(edx, eax);
	}
	
	public static In prologue(Fun fun) {
		return new In(PROLOGUE).arg1(fun);
	}
	
	public static In epilogue(Fun fun) {
		return new In(EPILOGUE).arg1(fun);
	}
	
	public static In lea(VReg dst, String src) {
		return new In(LEA).arg1(dst).arg2(src).def(dst);
	}

	public static In lea(VReg dst, VReg base, int offset) {
		return new In(LEA)
		.arg1(dst)
		.arg2(new Off(base, offset))
		.use(base).def(dst);
	}
}













