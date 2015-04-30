// Generated from C:/Users/Otto/Desktop/clare/clare.g4 by ANTLR 4.2

package clare;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class clareLexer extends Lexer {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Comment=12, Int=13, Add=14, Sub=15, Mul=16, Div=17, 
		Id=18, Ws=19;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] tokenNames = {
		"<INVALID>",
		"'return'", "'('", "')'", "'class'", "';'", "'{'", "','", "'='", "'}'", 
		"'.'", "'if'", "Comment", "Int", "'+'", "'-'", "'*'", "'/'", "Id", "Ws"
	};
	public static final String[] ruleNames = {
		"T__10", "T__9", "T__8", "T__7", "T__6", "T__5", "T__4", "T__3", "T__2", 
		"T__1", "T__0", "Comment", "Int", "Add", "Sub", "Mul", "Div", "Id", "Ws", 
		"Digit"
	};





	public clareLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "clare.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\25p\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\3\3\3\3\4"+
		"\3\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3\n\3"+
		"\13\3\13\3\f\3\f\3\f\3\r\3\r\3\r\3\r\7\rP\n\r\f\r\16\rS\13\r\3\r\3\r\3"+
		"\16\6\16X\n\16\r\16\16\16Y\3\17\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23"+
		"\3\23\7\23f\n\23\f\23\16\23i\13\23\3\24\3\24\3\24\3\24\3\25\3\25\2\2\26"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\2\3\2\7\4\2\f\f\17\17\5\2C\\aac|\6\2\62;C\\a"+
		"ac|\5\2\13\f\17\17\"\"\3\2\62;q\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\3+\3\2\2\2"+
		"\5\62\3\2\2\2\7\64\3\2\2\2\t\66\3\2\2\2\13<\3\2\2\2\r>\3\2\2\2\17@\3\2"+
		"\2\2\21B\3\2\2\2\23D\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31K\3\2\2\2\33W\3"+
		"\2\2\2\35[\3\2\2\2\37]\3\2\2\2!_\3\2\2\2#a\3\2\2\2%c\3\2\2\2\'j\3\2\2"+
		"\2)n\3\2\2\2+,\7t\2\2,-\7g\2\2-.\7v\2\2./\7w\2\2/\60\7t\2\2\60\61\7p\2"+
		"\2\61\4\3\2\2\2\62\63\7*\2\2\63\6\3\2\2\2\64\65\7+\2\2\65\b\3\2\2\2\66"+
		"\67\7e\2\2\678\7n\2\289\7c\2\29:\7u\2\2:;\7u\2\2;\n\3\2\2\2<=\7=\2\2="+
		"\f\3\2\2\2>?\7}\2\2?\16\3\2\2\2@A\7.\2\2A\20\3\2\2\2BC\7?\2\2C\22\3\2"+
		"\2\2DE\7\177\2\2E\24\3\2\2\2FG\7\60\2\2G\26\3\2\2\2HI\7k\2\2IJ\7h\2\2"+
		"J\30\3\2\2\2KL\7\61\2\2LM\7\61\2\2MQ\3\2\2\2NP\n\2\2\2ON\3\2\2\2PS\3\2"+
		"\2\2QO\3\2\2\2QR\3\2\2\2RT\3\2\2\2SQ\3\2\2\2TU\b\r\2\2U\32\3\2\2\2VX\5"+
		")\25\2WV\3\2\2\2XY\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z\34\3\2\2\2[\\\7-\2\2\\"+
		"\36\3\2\2\2]^\7/\2\2^ \3\2\2\2_`\7,\2\2`\"\3\2\2\2ab\7\61\2\2b$\3\2\2"+
		"\2cg\t\3\2\2df\t\4\2\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2h&\3\2\2"+
		"\2ig\3\2\2\2jk\t\5\2\2kl\3\2\2\2lm\b\24\3\2m(\3\2\2\2no\t\6\2\2o*\3\2"+
		"\2\2\6\2QYg\4\2\3\2\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}