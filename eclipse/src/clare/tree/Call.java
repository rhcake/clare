package clare.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;

import clare.asm.Asm;
import clare.asm.Reg;
import clare.asm.VReg;
import clare.x86.X86;

public class Call extends Ex {

	private Fun mFun;
	private List<Ex> mParams = new ArrayList<Ex>();
	
	public Call(Fun fun) {
		super(fun.getRetType());
		mFun = fun;
	}
	
	public void addParam(Ex ex) { mParams.add(ex); }
	
	@Override
	public VReg load(Asm asm, Fun fun) {
		
		asm.emit(X86.push(Reg.ECX));
		asm.emit(X86.push(Reg.EDX));
		
		int paramSize = 0;
		ListIterator<Ex> li = mParams.listIterator(mParams.size());
		while (li.hasPrevious()) {
			Ex param = li.previous();
			VReg r = param.load(asm, fun);
			asm.emit(X86.push(r));
			paramSize += 4;
		}
		
		VReg eax = new VReg(fun);
		eax.preColor(Reg.EAX);
		
		asm.emit(X86.call(eax, mFun.getName()));
		asm.emit(X86.add(Reg.ESP, paramSize));

		asm.emit(X86.pop(Reg.EDX));
		asm.emit(X86.pop(Reg.ECX));
		
		return eax;
	}
	
	@Override
	public String toString() {
		return mFun.getName() + "(" + mParams.stream()
				.map(Object::toString)
				.collect(Collectors.joining(", ")) + ")";
	}
}













