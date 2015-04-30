package clare;

import java.io.IOException;

import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import clare.antlr.Visitor;
import clare.asm.Asm;
import clare.asm.Context;
import clare.tree.Mod;
import clare.x86.X86Context;

public class Main {

	public static void main(String... args) {
		
		try {
			
			ANTLRFileStream in = new ANTLRFileStream("examples/a.clare");
			clareLexer lexer = new clareLexer(in);
			CommonTokenStream tokens = new CommonTokenStream(lexer);
			clareParser parser = new clareParser(tokens);
			
			ParseTree root = parser.mod();
			Mod mod = (Mod)new Visitor().visit(root);
			Asm asm = mod.genAsm();
			
			Context cxt = new X86Context();
			asm.regAlloc(cxt);
			asm.print(cxt);
			
		} catch (IOException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
}














