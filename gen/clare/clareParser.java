// Generated from C:/Users/Otto/Desktop/clare/clare.g4 by ANTLR 4.2

package clare;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class clareParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__10=1, T__9=2, T__8=3, T__7=4, T__6=5, T__5=6, T__4=7, T__3=8, T__2=9, 
		T__1=10, T__0=11, Comment=12, Int=13, Add=14, Sub=15, Mul=16, Div=17, 
		Id=18, Ws=19;
	public static final String[] tokenNames = {
		"<INVALID>", "'return'", "'('", "')'", "'class'", "';'", "'{'", "','", 
		"'='", "'}'", "'.'", "'if'", "Comment", "Int", "'+'", "'-'", "'*'", "'/'", 
		"Id", "Ws"
	};
	public static final int
		RULE_mod = 0, RULE_top = 1, RULE_fields = 2, RULE_argdecls = 3, RULE_stm = 4, 
		RULE_ex = 5, RULE_params = 6;
	public static final String[] ruleNames = {
		"mod", "top", "fields", "argdecls", "stm", "ex", "params"
	};

	@Override
	public String getGrammarFileName() { return "clare.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }




	public clareParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ModContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(clareParser.EOF, 0); }
		public List<TopContext> top() {
			return getRuleContexts(TopContext.class);
		}
		public TopContext top(int i) {
			return getRuleContext(TopContext.class,i);
		}
		public ModContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mod; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterMod(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitMod(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitMod(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ModContext mod() throws RecognitionException {
		ModContext _localctx = new ModContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_mod);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(15); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(14); top();
				}
				}
				setState(17); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==4 || _la==Id );
			setState(19); match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TopContext extends ParserRuleContext {
		public TopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_top; }
	 
		public TopContext() { }
		public void copyFrom(TopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TopClassDefContext extends TopContext {
		public TerminalNode Id() { return getToken(clareParser.Id, 0); }
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public TopClassDefContext(TopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterTopClassDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitTopClassDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitTopClassDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TopFunDefContext extends TopContext {
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<TerminalNode> Id() { return getTokens(clareParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(clareParser.Id, i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public ArgdeclsContext argdecls() {
			return getRuleContext(ArgdeclsContext.class,0);
		}
		public TopFunDefContext(TopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterTopFunDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitTopFunDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitTopFunDef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TopContext top() throws RecognitionException {
		TopContext _localctx = new TopContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_top);
		int _la;
		try {
			setState(43);
			switch (_input.LA(1)) {
			case Id:
				_localctx = new TopFunDefContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(21); match(Id);
				setState(22); match(Id);
				setState(23); match(2);
				setState(25);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(24); argdecls();
					}
				}

				setState(27); match(3);
				setState(28); match(6);
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 11) | (1L << Int) | (1L << Id))) != 0)) {
					{
					{
					setState(29); stm();
					}
					}
					setState(34);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(35); match(9);
				}
				break;
			case 4:
				_localctx = new TopClassDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(36); match(4);
				setState(37); match(Id);
				setState(38); match(6);
				setState(40);
				_la = _input.LA(1);
				if (_la==Id) {
					{
					setState(39); fields();
					}
				}

				setState(42); match(9);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FieldsContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(clareParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(clareParser.Id, i);
		}
		public FieldsContext fields() {
			return getRuleContext(FieldsContext.class,0);
		}
		public FieldsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fields; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterFields(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitFields(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitFields(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldsContext fields() throws RecognitionException {
		FieldsContext _localctx = new FieldsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_fields);
		try {
			setState(52);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(45); match(Id);
				setState(46); match(Id);
				setState(47); match(5);
				setState(48); fields();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(49); match(Id);
				setState(50); match(Id);
				setState(51); match(5);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArgdeclsContext extends ParserRuleContext {
		public List<TerminalNode> Id() { return getTokens(clareParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(clareParser.Id, i);
		}
		public ArgdeclsContext argdecls() {
			return getRuleContext(ArgdeclsContext.class,0);
		}
		public ArgdeclsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argdecls; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterArgdecls(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitArgdecls(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitArgdecls(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArgdeclsContext argdecls() throws RecognitionException {
		ArgdeclsContext _localctx = new ArgdeclsContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_argdecls);
		try {
			setState(60);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54); match(Id);
				setState(55); match(Id);
				setState(56); match(7);
				setState(57); argdecls();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(58); match(Id);
				setState(59); match(Id);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StmContext extends ParserRuleContext {
		public StmContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stm; }
	 
		public StmContext() { }
		public void copyFrom(StmContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class StmVarDeclContext extends StmContext {
		public List<TerminalNode> Id() { return getTokens(clareParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(clareParser.Id, i);
		}
		public StmVarDeclContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterStmVarDecl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitStmVarDecl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitStmVarDecl(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmVarDefContext extends StmContext {
		public List<TerminalNode> Id() { return getTokens(clareParser.Id); }
		public TerminalNode Id(int i) {
			return getToken(clareParser.Id, i);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public StmVarDefContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterStmVarDef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitStmVarDef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitStmVarDef(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmIfContext extends StmContext {
		public StmContext stm(int i) {
			return getRuleContext(StmContext.class,i);
		}
		public List<StmContext> stm() {
			return getRuleContexts(StmContext.class);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public StmIfContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterStmIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitStmIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitStmIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmRetContext extends StmContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public StmRetContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterStmRet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitStmRet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitStmRet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StmMoveContext extends StmContext {
		public ExContext ex(int i) {
			return getRuleContext(ExContext.class,i);
		}
		public List<ExContext> ex() {
			return getRuleContexts(ExContext.class);
		}
		public StmMoveContext(StmContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterStmMove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitStmMove(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitStmMove(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StmContext stm() throws RecognitionException {
		StmContext _localctx = new StmContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stm);
		int _la;
		try {
			setState(93);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				_localctx = new StmVarDeclContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(62); match(Id);
				setState(63); match(Id);
				setState(64); match(5);
				}
				break;

			case 2:
				_localctx = new StmVarDefContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(65); match(Id);
				setState(66); match(Id);
				setState(67); match(8);
				setState(68); ex(0);
				setState(69); match(5);
				}
				break;

			case 3:
				_localctx = new StmMoveContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(71); ex(0);
				setState(72); match(8);
				setState(73); ex(0);
				setState(74); match(5);
				}
				break;

			case 4:
				_localctx = new StmRetContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(76); match(1);
				setState(77); ex(0);
				setState(78); match(5);
				}
				break;

			case 5:
				_localctx = new StmIfContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(80); match(11);
				setState(81); match(2);
				setState(82); ex(0);
				setState(83); match(3);
				setState(84); match(6);
				setState(88);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 1) | (1L << 2) | (1L << 11) | (1L << Int) | (1L << Id))) != 0)) {
					{
					{
					setState(85); stm();
					}
					}
					setState(90);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(91); match(9);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExContext extends ParserRuleContext {
		public ExContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ex; }
	 
		public ExContext() { }
		public void copyFrom(ExContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExIdContext extends ExContext {
		public TerminalNode Id() { return getToken(clareParser.Id, 0); }
		public ExIdContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExId(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExFieldContext extends ExContext {
		public TerminalNode Id() { return getToken(clareParser.Id, 0); }
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ExFieldContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExField(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExCallContext extends ExContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public TerminalNode Id() { return getToken(clareParser.Id, 0); }
		public ExCallContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExParenContext extends ExContext {
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ExParenContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExParen(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExIntContext extends ExContext {
		public TerminalNode Int() { return getToken(clareParser.Int, 0); }
		public ExIntContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExMulDivContext extends ExContext {
		public ExContext ex(int i) {
			return getRuleContext(ExContext.class,i);
		}
		public TerminalNode Div() { return getToken(clareParser.Div, 0); }
		public List<ExContext> ex() {
			return getRuleContexts(ExContext.class);
		}
		public TerminalNode Mul() { return getToken(clareParser.Mul, 0); }
		public ExMulDivContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExAddSubContext extends ExContext {
		public ExContext ex(int i) {
			return getRuleContext(ExContext.class,i);
		}
		public List<ExContext> ex() {
			return getRuleContexts(ExContext.class);
		}
		public TerminalNode Sub() { return getToken(clareParser.Sub, 0); }
		public TerminalNode Add() { return getToken(clareParser.Add, 0); }
		public ExAddSubContext(ExContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterExAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitExAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitExAddSub(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExContext ex() throws RecognitionException {
		return ex(0);
	}

	private ExContext ex(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExContext _localctx = new ExContext(_ctx, _parentState);
		ExContext _prevctx = _localctx;
		int _startState = 10;
		enterRecursionRule(_localctx, 10, RULE_ex, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(108);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				{
				_localctx = new ExParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(96); match(2);
				setState(97); ex(0);
				setState(98); match(3);
				}
				break;

			case 2:
				{
				_localctx = new ExIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(100); match(Int);
				}
				break;

			case 3:
				{
				_localctx = new ExIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(101); match(Id);
				}
				break;

			case 4:
				{
				_localctx = new ExCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(102); match(Id);
				setState(103); match(2);
				setState(105);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << 2) | (1L << Int) | (1L << Id))) != 0)) {
					{
					setState(104); params();
					}
				}

				setState(107); match(3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(121);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=-1 ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(119);
					switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
					case 1:
						{
						_localctx = new ExMulDivContext(new ExContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ex);
						setState(110);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(111);
						_la = _input.LA(1);
						if ( !(_la==Mul || _la==Div) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(112); ex(5);
						}
						break;

					case 2:
						{
						_localctx = new ExAddSubContext(new ExContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ex);
						setState(113);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(114);
						_la = _input.LA(1);
						if ( !(_la==Add || _la==Sub) ) {
						_errHandler.recoverInline(this);
						}
						consume();
						setState(115); ex(4);
						}
						break;

					case 3:
						{
						_localctx = new ExFieldContext(new ExContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_ex);
						setState(116);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(117); match(10);
						setState(118); match(Id);
						}
						break;
					}
					} 
				}
				setState(123);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class ParamsContext extends ParserRuleContext {
		public ParamsContext params() {
			return getRuleContext(ParamsContext.class,0);
		}
		public ExContext ex() {
			return getRuleContext(ExContext.class,0);
		}
		public ParamsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_params; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).enterParams(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof clareListener ) ((clareListener)listener).exitParams(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof clareVisitor ) return ((clareVisitor<? extends T>)visitor).visitParams(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParamsContext params() throws RecognitionException {
		ParamsContext _localctx = new ParamsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_params);
		try {
			setState(129);
			switch ( getInterpreter().adaptivePredict(_input,13,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(124); ex(0);
				setState(125); match(7);
				setState(126); params();
				}
				break;

			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(128); ex(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 5: return ex_sempred((ExContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean ex_sempred(ExContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0: return precpred(_ctx, 4);

		case 1: return precpred(_ctx, 3);

		case 2: return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\25\u0086\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\6\2\22\n\2\r\2\16"+
		"\2\23\3\2\3\2\3\3\3\3\3\3\3\3\5\3\34\n\3\3\3\3\3\3\3\7\3!\n\3\f\3\16\3"+
		"$\13\3\3\3\3\3\3\3\3\3\3\3\5\3+\n\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\5\4\67\n\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5?\n\5\3\6\3\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\7\6Y\n\6\f\6\16\6\\\13\6\3\6\3\6\5\6`\n\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\5\7l\n\7\3\7\5\7o\n\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\7\7z\n\7\f\7\16\7}\13\7\3\b\3\b\3\b\3\b\3\b\5\b\u0084\n\b\3\b\2"+
		"\3\f\t\2\4\6\b\n\f\16\2\4\3\2\22\23\3\2\20\21\u0092\2\21\3\2\2\2\4-\3"+
		"\2\2\2\6\66\3\2\2\2\b>\3\2\2\2\n_\3\2\2\2\fn\3\2\2\2\16\u0083\3\2\2\2"+
		"\20\22\5\4\3\2\21\20\3\2\2\2\22\23\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2"+
		"\24\25\3\2\2\2\25\26\7\2\2\3\26\3\3\2\2\2\27\30\7\24\2\2\30\31\7\24\2"+
		"\2\31\33\7\4\2\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34\3\2\2\2\34\35\3\2\2"+
		"\2\35\36\7\5\2\2\36\"\7\b\2\2\37!\5\n\6\2 \37\3\2\2\2!$\3\2\2\2\" \3\2"+
		"\2\2\"#\3\2\2\2#%\3\2\2\2$\"\3\2\2\2%.\7\13\2\2&\'\7\6\2\2\'(\7\24\2\2"+
		"(*\7\b\2\2)+\5\6\4\2*)\3\2\2\2*+\3\2\2\2+,\3\2\2\2,.\7\13\2\2-\27\3\2"+
		"\2\2-&\3\2\2\2.\5\3\2\2\2/\60\7\24\2\2\60\61\7\24\2\2\61\62\7\7\2\2\62"+
		"\67\5\6\4\2\63\64\7\24\2\2\64\65\7\24\2\2\65\67\7\7\2\2\66/\3\2\2\2\66"+
		"\63\3\2\2\2\67\7\3\2\2\289\7\24\2\29:\7\24\2\2:;\7\t\2\2;?\5\b\5\2<=\7"+
		"\24\2\2=?\7\24\2\2>8\3\2\2\2><\3\2\2\2?\t\3\2\2\2@A\7\24\2\2AB\7\24\2"+
		"\2B`\7\7\2\2CD\7\24\2\2DE\7\24\2\2EF\7\n\2\2FG\5\f\7\2GH\7\7\2\2H`\3\2"+
		"\2\2IJ\5\f\7\2JK\7\n\2\2KL\5\f\7\2LM\7\7\2\2M`\3\2\2\2NO\7\3\2\2OP\5\f"+
		"\7\2PQ\7\7\2\2Q`\3\2\2\2RS\7\r\2\2ST\7\4\2\2TU\5\f\7\2UV\7\5\2\2VZ\7\b"+
		"\2\2WY\5\n\6\2XW\3\2\2\2Y\\\3\2\2\2ZX\3\2\2\2Z[\3\2\2\2[]\3\2\2\2\\Z\3"+
		"\2\2\2]^\7\13\2\2^`\3\2\2\2_@\3\2\2\2_C\3\2\2\2_I\3\2\2\2_N\3\2\2\2_R"+
		"\3\2\2\2`\13\3\2\2\2ab\b\7\1\2bc\7\4\2\2cd\5\f\7\2de\7\5\2\2eo\3\2\2\2"+
		"fo\7\17\2\2go\7\24\2\2hi\7\24\2\2ik\7\4\2\2jl\5\16\b\2kj\3\2\2\2kl\3\2"+
		"\2\2lm\3\2\2\2mo\7\5\2\2na\3\2\2\2nf\3\2\2\2ng\3\2\2\2nh\3\2\2\2o{\3\2"+
		"\2\2pq\f\6\2\2qr\t\2\2\2rz\5\f\7\7st\f\5\2\2tu\t\3\2\2uz\5\f\7\6vw\f\3"+
		"\2\2wx\7\f\2\2xz\7\24\2\2yp\3\2\2\2ys\3\2\2\2yv\3\2\2\2z}\3\2\2\2{y\3"+
		"\2\2\2{|\3\2\2\2|\r\3\2\2\2}{\3\2\2\2~\177\5\f\7\2\177\u0080\7\t\2\2\u0080"+
		"\u0081\5\16\b\2\u0081\u0084\3\2\2\2\u0082\u0084\5\f\7\2\u0083~\3\2\2\2"+
		"\u0083\u0082\3\2\2\2\u0084\17\3\2\2\2\20\23\33\"*-\66>Z_kny{\u0083";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}