package clare.tree;

import clare.asm.Asm;

public abstract class Stm {

	public void genAsm(Asm asm, Fun fun) {
		System.err.println("can't generate asm for " + this);
	}
	
	private static class DummyStm extends Stm {
		
		@Override
		public void genAsm(Asm asm, Fun fun) {}
	}
	
	public static final Stm DUMMY = new DummyStm();
}
