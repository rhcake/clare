package clare.tree;

import java.util.ArrayList;
import java.util.List;

import clare.asm.Asm;
import clare.asm.Reg;
import clare.x86.X86;

public class Fun {
	
	private String mName;
	private Type mRetType;
	private int mLocalSize;
	private int mParamSize;
	
	public int getLocalSize() { return mLocalSize; }
	
	public String getName() { return mName; }
	
	public Type getRetType() { return mRetType; }
	
	public int addLocal(int size) {
		mLocalSize += size;
		return mLocalSize;
	}
	
	public int addParam(int size) {
		int off = mParamSize + 8;
		mParamSize += size;
		return off;
	}
	
	public Fun(String name, Type retType) {
		mName = name;
		mRetType = retType;
	}
	
	private List<Stm> mStms = new ArrayList<Stm>();
	
	public void addStm(Stm stm) { mStms.add(stm); }

	public void genAsm(Asm asm) {
		asm.emit(X86.prologue(this));
		mStms.forEach(s -> s.genAsm(asm, this));
	}
}










