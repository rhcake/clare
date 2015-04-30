package clare.antlr;

import java.util.Stack;

import clare.clareBaseVisitor;
import clare.clareParser.ArgdeclsContext;
import clare.clareParser.ExAddSubContext;
import clare.clareParser.ExCallContext;
import clare.clareParser.ExFieldContext;
import clare.clareParser.ExIdContext;
import clare.clareParser.ExIntContext;
import clare.clareParser.ExMulDivContext;
import clare.clareParser.ExParenContext;
import clare.clareParser.FieldsContext;
import clare.clareParser.ModContext;
import clare.clareParser.ParamsContext;
import clare.clareParser.StmContext;
import clare.clareParser.StmIfContext;
import clare.clareParser.StmMoveContext;
import clare.clareParser.StmRetContext;
import clare.clareParser.StmVarDeclContext;
import clare.clareParser.StmVarDefContext;
import clare.clareParser.TopClassDefContext;
import clare.clareParser.TopFunDefContext;
import clare.tree.BinOp;
import clare.tree.Call;
import clare.tree.Ex;
import clare.tree.Fun;
import clare.tree.I32;
import clare.tree.Id;
import clare.tree.Id.Storage;
import clare.tree.If;
import clare.tree.Mem;
import clare.tree.Mod;
import clare.tree.Move;
import clare.tree.Ret;
import clare.tree.Stm;
import clare.tree.Type;

public class Visitor extends clareBaseVisitor<Object> {

	
	private Scope mScope;
	private Mod mMod;
	
	
	@Override
	public Object visitMod(ModContext ctx) {
		mMod = new Mod();
		mScope = new Scope();
		
		mScope.addType(Type.I32);
		
		ctx.top().forEach(tc -> visit(tc));
		mScope = null;
		return mMod;
	}
	
	
	private Type mType;
	
	
	@Override
	public Object visitTopClassDef(TopClassDefContext ctx) {
		String name = ctx.Id().getText();
		Type type = new Type(name, 0);
		mType = type;
		
		if (ctx.fields() != null)
			visit(ctx.fields());
		
		mScope.addType(type);
		mType = null;
		return null;
	}
	
	
	@Override
	public Object visitFields(FieldsContext ctx) {
		Type type = mScope.getType(ctx.Id(0).getText());
		String name = ctx.Id(1).getText();
		
		mType.addField(name, type);
		
		if (ctx.fields() != null)
			visit(ctx.fields());
		return null;
	}
	
	
	@Override
	public Object visitExField(ExFieldContext ctx) {
		String name = ctx.Id().getText();
		Ex base = (Ex)visit(ctx.ex());
		Type baseType = base.getType();
		int offset = baseType.getFieldOffset(name);
		Type type = baseType.getFieldType(name);
		return new Mem(base, offset, type);
	}
	
	
	private Fun mFun;
	
	
	@Override
	public Object visitTopFunDef(TopFunDefContext ctx) {
		String name = "_" + ctx.Id(1).getText();
		Type retType = mScope.getType(ctx.Id(0).getText());
		Fun fun = new Fun(name, retType);
		mFun = fun;
		
		Scope old = mScope;
		mScope = old.subScope();
		
		if (ctx.argdecls() != null)
			visit(ctx.argdecls());
		for (StmContext sc : ctx.stm())
			fun.addStm((Stm)visit(sc));
		
		mScope = old;
		
		mMod.addFun(fun);
		mFun = null;
		return fun;
	}
	
	
	@Override
	public Object visitArgdecls(ArgdeclsContext ctx) {
		String name = ctx.Id(1).getText();
		Type type = mScope.getType(ctx.Id(0).getText());
		Id id = new Id(name, type, Storage.PARAM);
		mScope.addId(id);
		id.setOffset(mFun.addParam(id.getType().getSize()));
		if (ctx.argdecls() != null)
			visit(ctx.argdecls());
		return null;
	}
	
	
	@Override
	public Object visitStmVarDecl(StmVarDeclContext ctx) {
		String name = ctx.Id(1).getText();
		Type type = mScope.getType(ctx.Id(0).getText());
		Id id = new Id(name, type, Storage.LOCAL);
		mScope.addId(id);
		if (type == Type.I32)
			return new Move(id, new I32(0));
		else {
			id.setOffset(mFun.addLocal(type.getSize()));
			return Stm.DUMMY;
		}
	}
	
	
	@Override
	public Object visitStmVarDef(StmVarDefContext ctx) {
		String name = ctx.Id(1).getText();
		Type type = mScope.getType(ctx.Id(0).getText());
		Id id = new Id(name, type, Storage.LOCAL);
		mScope.addId(id);
		return new Move(id, (Ex)visit(ctx.ex()));
	}
	
	
	@Override
	public Object visitStmMove(StmMoveContext ctx) {
		return new Move(
				(Ex)visit(ctx.ex(0)),
				(Ex)visit(ctx.ex(1)));
	}
	
	
	@Override
	public Object visitStmRet(StmRetContext ctx) {
		return new Ret(mFun, (Ex)visit(ctx.ex()));
	}
	
	
	@Override
	public Object visitStmIf(StmIfContext ctx) {
		If ifstm = new If((Ex)visit(ctx.ex()));
		for (StmContext sc : ctx.stm())
			ifstm.addStm((Stm)visit(sc));
		return ifstm;
	}
	
	
	@Override
	public Object visitExInt(ExIntContext ctx) {
		return new I32(ctx.Int().getText());
	}
	
	
	@Override
	public Object visitExId(ExIdContext ctx) {
		return mScope.getId(ctx.Id().getText());
	}
	
	@Override
	public Object visitExAddSub(ExAddSubContext ctx) {
		return new BinOp(
				(ctx.Add() != null)? BinOp.ADD : BinOp.SUB,
				(Ex)visit(ctx.ex(0)),
				(Ex)visit(ctx.ex(1)));
	}
	
	
	@Override
	public Object visitExMulDiv(ExMulDivContext ctx) {
		return new BinOp(
				(ctx.Mul() != null)? BinOp.MUL : BinOp.DIV,
				(Ex)visit(ctx.ex(0)),
				(Ex)visit(ctx.ex(1)));
	}
	
	
	@Override
	public Object visitExParen(ExParenContext ctx) {
		return visit(ctx.ex());
	}
	
	
	private Stack<Call> mCall = new Stack<>();
	
	
	@Override
	public Object visitExCall(ExCallContext ctx) {
		Fun fun = mMod.getFun("_" + ctx.Id().getText());
		Call call = new Call(fun);
		mCall.push(call);
		if (ctx.params() != null)
			visit(ctx.params());
		mCall.pop();
		return call;
	}
	
	
	@Override
	public Object visitParams(ParamsContext ctx) {
		Ex ex = (Ex)visit(ctx.ex());
		mCall.peek().addParam(ex);
		if (ctx.params() != null)
			visit(ctx.params());
		return ex;
	}
}















