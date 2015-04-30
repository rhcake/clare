package clare.asm;

public class Label {

	private Label() {}
	
	private static int ID;
	
	public static String gen() { return "L" + ID++; }
}
