package clare.asm;

public class Reg {

	private String mName;
	
	private Reg(String name) { mName = name; }
	
	@Override
	public String toString() { return mName; }

	public static final Reg EBP = new Reg("ebp");
	public static final Reg ESP = new Reg("esp");

	public static final Reg EAX = new Reg("eax");
	public static final Reg EBX = new Reg("ebx");
	public static final Reg ECX = new Reg("ecx");
	public static final Reg EDX = new Reg("edx");
	public static final Reg ESI = new Reg("esi");
	public static final Reg EDI = new Reg("edi");
}
