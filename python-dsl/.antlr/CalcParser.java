// Generated from /home/lucas/Documentos/ifes/5 Periodo/LFA/trabalho-dsl/python-dsl/Calc.g4 by ANTLR 4.7.1

import lfa.calc.ast.Expr;
import lfa.calc.ast.Operator;
import static lfa.calc.ast.Expr.*;
import lfa.calc.ast.Op;
import java.util.LinkedList;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CalcParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMERO=1, OR=2, AND=3, NOT=4, IF=5, THEN=6, ELSE=7, WHILE=8, DO=9, IDENT=10, 
		GETS=11, PLUS=12, MINUS=13, TIMES=14, DIVIDE=15, MOD=16, EXP=17, LPAR=18, 
		RPAR=19, LBRC=20, RBRC=21, COMMA=22, SEMI=23, EQU=24, NEQ=25, LT=26, LEQ=27, 
		GT=28, GEQ=29, WS=30, COMMENT=31;
	public static final int
		RULE_inicio = 0, RULE_statement = 1, RULE_ifExpr = 2, RULE_whileExpr = 3, 
		RULE_block = 4, RULE_sttmtSeq = 5, RULE_expr = 6, RULE_assign = 7, RULE_bexpr = 8, 
		RULE_disj = 9, RULE_conj = 10, RULE_relOp = 11, RULE_aexpr = 12, RULE_parcela = 13, 
		RULE_fator = 14, RULE_termo = 15, RULE_argList = 16;
	public static final String[] ruleNames = {
		"inicio", "statement", "ifExpr", "whileExpr", "block", "sttmtSeq", "expr", 
		"assign", "bexpr", "disj", "conj", "relOp", "aexpr", "parcela", "fator", 
		"termo", "argList"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'or'", "'and'", "'not'", "'if'", "'then'", "'else'", "'while'", 
		"'do'", null, "'='", "'+'", "'-'", "'*'", "'/'", "'%'", "'^'", "'('", 
		"')'", "'{'", "'}'", "','", "';'", "'=='", "'!='", "'<'", "'<='", "'>'", 
		"'>='"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMERO", "OR", "AND", "NOT", "IF", "THEN", "ELSE", "WHILE", "DO", 
		"IDENT", "GETS", "PLUS", "MINUS", "TIMES", "DIVIDE", "MOD", "EXP", "LPAR", 
		"RPAR", "LBRC", "RBRC", "COMMA", "SEMI", "EQU", "NEQ", "LT", "LEQ", "GT", 
		"GEQ", "WS", "COMMENT"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Calc.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CalcParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class InicioContext extends ParserRuleContext {
		public List<Expr> result;
		public StatementContext s;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public InicioContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inicio; }
	}

	public final InicioContext inicio() throws RecognitionException {
		InicioContext _localctx = new InicioContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_inicio);

		    ((InicioContext)_localctx).result =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(34);
				((InicioContext)_localctx).s = statement();
				_localctx.result.add(((InicioContext)_localctx).s.result);
				}
				}
				setState(41);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class StatementContext extends ParserRuleContext {
		public Expr result;
		public ExprContext e;
		public IfExprContext i;
		public WhileExprContext w;
		public BlockContext b;
		public TerminalNode SEMI() { return getToken(CalcParser.SEMI, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IfExprContext ifExpr() {
			return getRuleContext(IfExprContext.class,0);
		}
		public WhileExprContext whileExpr() {
			return getRuleContext(WhileExprContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(55);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUMERO:
			case NOT:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(42);
				((StatementContext)_localctx).e = expr();
				setState(43);
				match(SEMI);
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).e.result;
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(46);
				((StatementContext)_localctx).i = ifExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).i.result;
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(49);
				((StatementContext)_localctx).w = whileExpr();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).w.result;
				}
				break;
			case LBRC:
				enterOuterAlt(_localctx, 4);
				{
				setState(52);
				((StatementContext)_localctx).b = block();
				((StatementContext)_localctx).result =  ((StatementContext)_localctx).b.result;
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

	public static class IfExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext c;
		public StatementContext t;
		public StatementContext e;
		public TerminalNode IF() { return getToken(CalcParser.IF, 0); }
		public TerminalNode THEN() { return getToken(CalcParser.THEN, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(CalcParser.ELSE, 0); }
		public IfExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExpr; }
	}

	public final IfExprContext ifExpr() throws RecognitionException {
		IfExprContext _localctx = new IfExprContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_ifExpr);
		try {
			setState(71);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(57);
				match(IF);
				setState(58);
				((IfExprContext)_localctx).c = bexpr();
				setState(59);
				match(THEN);
				setState(60);
				((IfExprContext)_localctx).t = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				match(IF);
				setState(64);
				((IfExprContext)_localctx).c = bexpr();
				setState(65);
				match(THEN);
				setState(66);
				((IfExprContext)_localctx).t = statement();
				setState(67);
				match(ELSE);
				setState(68);
				((IfExprContext)_localctx).e = statement();
				((IfExprContext)_localctx).result =  mkIf(((IfExprContext)_localctx).c.result, ((IfExprContext)_localctx).t.result, ((IfExprContext)_localctx).e.result);
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

	public static class WhileExprContext extends ParserRuleContext {
		public Expr result;
		public BexprContext c;
		public StatementContext d;
		public TerminalNode WHILE() { return getToken(CalcParser.WHILE, 0); }
		public TerminalNode DO() { return getToken(CalcParser.DO, 0); }
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public WhileExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whileExpr; }
	}

	public final WhileExprContext whileExpr() throws RecognitionException {
		WhileExprContext _localctx = new WhileExprContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_whileExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(73);
			match(WHILE);
			setState(74);
			((WhileExprContext)_localctx).c = bexpr();
			setState(75);
			match(DO);
			setState(76);
			((WhileExprContext)_localctx).d = statement();
			((WhileExprContext)_localctx).result =  mkWhile(((WhileExprContext)_localctx).c.result, ((WhileExprContext)_localctx).d.result);
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

	public static class BlockContext extends ParserRuleContext {
		public Expr result;
		public SttmtSeqContext st;
		public TerminalNode LBRC() { return getToken(CalcParser.LBRC, 0); }
		public TerminalNode RBRC() { return getToken(CalcParser.RBRC, 0); }
		public SttmtSeqContext sttmtSeq() {
			return getRuleContext(SttmtSeqContext.class,0);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_block);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(LBRC);
			setState(80);
			((BlockContext)_localctx).st = sttmtSeq();
			setState(81);
			match(RBRC);
			((BlockContext)_localctx).result =  mkBlock(((BlockContext)_localctx).st.sttmts);
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

	public static class SttmtSeqContext extends ParserRuleContext {
		public List<Expr> sttmts;
		public StatementContext s1;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public SttmtSeqContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sttmtSeq; }
	}

	public final SttmtSeqContext sttmtSeq() throws RecognitionException {
		SttmtSeqContext _localctx = new SttmtSeqContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_sttmtSeq);

		    ((SttmtSeqContext)_localctx).sttmts =  new LinkedList<>();

		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(89);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << NUMERO) | (1L << NOT) | (1L << IF) | (1L << WHILE) | (1L << IDENT) | (1L << MINUS) | (1L << LPAR) | (1L << LBRC))) != 0)) {
				{
				{
				setState(84);
				((SttmtSeqContext)_localctx).s1 = statement();
				_localctx.sttmts.add(((SttmtSeqContext)_localctx).s1.result);
				}
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ExprContext extends ParserRuleContext {
		public Expr result;
		public AssignContext a;
		public BexprContext e;
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public BexprContext bexpr() {
			return getRuleContext(BexprContext.class,0);
		}
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expr);
		try {
			setState(98);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(92);
				((ExprContext)_localctx).a = assign();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).a.result;
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(95);
				((ExprContext)_localctx).e = bexpr();
				((ExprContext)_localctx).result =  ((ExprContext)_localctx).e.result;
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

	public static class AssignContext extends ParserRuleContext {
		public Expr result;
		public Token IDENT;
		public ExprContext e;
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public TerminalNode GETS() { return getToken(CalcParser.GETS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_assign);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			((AssignContext)_localctx).IDENT = match(IDENT);
			setState(101);
			match(GETS);
			setState(102);
			((AssignContext)_localctx).e = expr();
			((AssignContext)_localctx).result =  mkAssign((((AssignContext)_localctx).IDENT!=null?((AssignContext)_localctx).IDENT.getText():null), ((AssignContext)_localctx).e.result);
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

	public static class BexprContext extends ParserRuleContext {
		public Expr result;
		public DisjContext d1;
		public DisjContext d2;
		public List<DisjContext> disj() {
			return getRuleContexts(DisjContext.class);
		}
		public DisjContext disj(int i) {
			return getRuleContext(DisjContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(CalcParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(CalcParser.OR, i);
		}
		public BexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bexpr; }
	}

	public final BexprContext bexpr() throws RecognitionException {
		BexprContext _localctx = new BexprContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(105);
			((BexprContext)_localctx).d1 = disj();
			((BexprContext)_localctx).result =  ((BexprContext)_localctx).d1.result;
			setState(113);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(107);
				match(OR);
				setState(108);
				((BexprContext)_localctx).d2 = disj();
				((BexprContext)_localctx).result =  mkComposite(Op.OR, _localctx.result, ((BexprContext)_localctx).d2.result);
				}
				}
				setState(115);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class DisjContext extends ParserRuleContext {
		public Expr result;
		public ConjContext c1;
		public ConjContext c2;
		public List<ConjContext> conj() {
			return getRuleContexts(ConjContext.class);
		}
		public ConjContext conj(int i) {
			return getRuleContext(ConjContext.class,i);
		}
		public List<TerminalNode> AND() { return getTokens(CalcParser.AND); }
		public TerminalNode AND(int i) {
			return getToken(CalcParser.AND, i);
		}
		public DisjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_disj; }
	}

	public final DisjContext disj() throws RecognitionException {
		DisjContext _localctx = new DisjContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_disj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(116);
			((DisjContext)_localctx).c1 = conj();
			((DisjContext)_localctx).result =  ((DisjContext)_localctx).c1.result;
			setState(124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND) {
				{
				{
				setState(118);
				match(AND);
				setState(119);
				((DisjContext)_localctx).c2 = conj();
				((DisjContext)_localctx).result =  mkComposite(Op.AND, _localctx.result, ((DisjContext)_localctx).c2.result);
				}
				}
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ConjContext extends ParserRuleContext {
		public Expr result;
		public AexprContext a1;
		public RelOpContext o;
		public AexprContext a2;
		public List<AexprContext> aexpr() {
			return getRuleContexts(AexprContext.class);
		}
		public AexprContext aexpr(int i) {
			return getRuleContext(AexprContext.class,i);
		}
		public RelOpContext relOp() {
			return getRuleContext(RelOpContext.class,0);
		}
		public ConjContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conj; }
	}

	public final ConjContext conj() throws RecognitionException {
		ConjContext _localctx = new ConjContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_conj);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(127);
			((ConjContext)_localctx).a1 = aexpr();
			((ConjContext)_localctx).result =  ((ConjContext)_localctx).a1.result;
			setState(133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << EQU) | (1L << NEQ) | (1L << LT) | (1L << LEQ) | (1L << GT) | (1L << GEQ))) != 0)) {
				{
				setState(129);
				((ConjContext)_localctx).o = relOp();
				setState(130);
				((ConjContext)_localctx).a2 = aexpr();
				((ConjContext)_localctx).result =  mkComposite(((ConjContext)_localctx).o.result, _localctx.result, ((ConjContext)_localctx).a2.result);
				}
			}

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

	public static class RelOpContext extends ParserRuleContext {
		public Operator result;
		public TerminalNode EQU() { return getToken(CalcParser.EQU, 0); }
		public TerminalNode NEQ() { return getToken(CalcParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(CalcParser.LT, 0); }
		public TerminalNode LEQ() { return getToken(CalcParser.LEQ, 0); }
		public TerminalNode GT() { return getToken(CalcParser.GT, 0); }
		public TerminalNode GEQ() { return getToken(CalcParser.GEQ, 0); }
		public RelOpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relOp; }
	}

	public final RelOpContext relOp() throws RecognitionException {
		RelOpContext _localctx = new RelOpContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_relOp);
		try {
			setState(147);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EQU:
				enterOuterAlt(_localctx, 1);
				{
				setState(135);
				match(EQU);
				((RelOpContext)_localctx).result =  Op.EQU;
				}
				break;
			case NEQ:
				enterOuterAlt(_localctx, 2);
				{
				setState(137);
				match(NEQ);
				((RelOpContext)_localctx).result =  Op.NEQ;
				}
				break;
			case LT:
				enterOuterAlt(_localctx, 3);
				{
				setState(139);
				match(LT);
				((RelOpContext)_localctx).result =  Op.LT;
				}
				break;
			case LEQ:
				enterOuterAlt(_localctx, 4);
				{
				setState(141);
				match(LEQ);
				((RelOpContext)_localctx).result =  Op.LEQ;
				}
				break;
			case GT:
				enterOuterAlt(_localctx, 5);
				{
				setState(143);
				match(GT);
				((RelOpContext)_localctx).result =  Op.GT;
				}
				break;
			case GEQ:
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(GEQ);
				((RelOpContext)_localctx).result =  Op.GEQ;
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

	public static class AexprContext extends ParserRuleContext {
		public Expr result;
		public ParcelaContext p1;
		public ParcelaContext p2;
		public List<ParcelaContext> parcela() {
			return getRuleContexts(ParcelaContext.class);
		}
		public ParcelaContext parcela(int i) {
			return getRuleContext(ParcelaContext.class,i);
		}
		public List<TerminalNode> PLUS() { return getTokens(CalcParser.PLUS); }
		public TerminalNode PLUS(int i) {
			return getToken(CalcParser.PLUS, i);
		}
		public List<TerminalNode> MINUS() { return getTokens(CalcParser.MINUS); }
		public TerminalNode MINUS(int i) {
			return getToken(CalcParser.MINUS, i);
		}
		public AexprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aexpr; }
	}

	public final AexprContext aexpr() throws RecognitionException {
		AexprContext _localctx = new AexprContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_aexpr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(149);
			((AexprContext)_localctx).p1 = parcela();
			((AexprContext)_localctx).result =  ((AexprContext)_localctx).p1.result;
			setState(161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PLUS || _la==MINUS) {
				{
				setState(159);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS:
					{
					setState(151);
					match(PLUS);
					setState(152);
					((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.PLUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				case MINUS:
					{
					setState(155);
					match(MINUS);
					setState(156);
					((AexprContext)_localctx).p2 = parcela();
					((AexprContext)_localctx).result =  mkComposite(Op.MINUS, _localctx.result, ((AexprContext)_localctx).p2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class ParcelaContext extends ParserRuleContext {
		public Expr result;
		public FatorContext f1;
		public FatorContext f2;
		public List<FatorContext> fator() {
			return getRuleContexts(FatorContext.class);
		}
		public FatorContext fator(int i) {
			return getRuleContext(FatorContext.class,i);
		}
		public List<TerminalNode> TIMES() { return getTokens(CalcParser.TIMES); }
		public TerminalNode TIMES(int i) {
			return getToken(CalcParser.TIMES, i);
		}
		public List<TerminalNode> DIVIDE() { return getTokens(CalcParser.DIVIDE); }
		public TerminalNode DIVIDE(int i) {
			return getToken(CalcParser.DIVIDE, i);
		}
		public List<TerminalNode> MOD() { return getTokens(CalcParser.MOD); }
		public TerminalNode MOD(int i) {
			return getToken(CalcParser.MOD, i);
		}
		public ParcelaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parcela; }
	}

	public final ParcelaContext parcela() throws RecognitionException {
		ParcelaContext _localctx = new ParcelaContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_parcela);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			((ParcelaContext)_localctx).f1 = fator();
			((ParcelaContext)_localctx).result =  ((ParcelaContext)_localctx).f1.result;
			setState(180);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << TIMES) | (1L << DIVIDE) | (1L << MOD))) != 0)) {
				{
				setState(178);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case TIMES:
					{
					setState(166);
					match(TIMES);
					setState(167);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.TIMES, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case DIVIDE:
					{
					setState(170);
					match(DIVIDE);
					setState(171);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.DIVIDE, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				case MOD:
					{
					setState(174);
					match(MOD);
					setState(175);
					((ParcelaContext)_localctx).f2 = fator();
					((ParcelaContext)_localctx).result =  mkComposite(Op.MOD, _localctx.result, ((ParcelaContext)_localctx).f2.result);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(182);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
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

	public static class FatorContext extends ParserRuleContext {
		public Expr result;
		public TermoContext t1;
		public TermoContext t2;
		public List<TermoContext> termo() {
			return getRuleContexts(TermoContext.class);
		}
		public TermoContext termo(int i) {
			return getRuleContext(TermoContext.class,i);
		}
		public TerminalNode EXP() { return getToken(CalcParser.EXP, 0); }
		public FatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fator; }
	}

	public final FatorContext fator() throws RecognitionException {
		FatorContext _localctx = new FatorContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_fator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(183);
			((FatorContext)_localctx).t1 = termo();
			((FatorContext)_localctx).result =  ((FatorContext)_localctx).t1.result;
			setState(189);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EXP) {
				{
				setState(185);
				match(EXP);
				setState(186);
				((FatorContext)_localctx).t2 = termo();
				((FatorContext)_localctx).result =  mkComposite(Op.EXP, _localctx.result, ((FatorContext)_localctx).t2.result);
				}
			}

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

	public static class TermoContext extends ParserRuleContext {
		public Expr result;
		public TermoContext t1;
		public ExprContext e1;
		public Token NUMERO;
		public Token IDENT;
		public ArgListContext a;
		public TerminalNode MINUS() { return getToken(CalcParser.MINUS, 0); }
		public TermoContext termo() {
			return getRuleContext(TermoContext.class,0);
		}
		public TerminalNode NOT() { return getToken(CalcParser.NOT, 0); }
		public TerminalNode LPAR() { return getToken(CalcParser.LPAR, 0); }
		public TerminalNode RPAR() { return getToken(CalcParser.RPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode NUMERO() { return getToken(CalcParser.NUMERO, 0); }
		public TerminalNode IDENT() { return getToken(CalcParser.IDENT, 0); }
		public ArgListContext argList() {
			return getRuleContext(ArgListContext.class,0);
		}
		public TermoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_termo; }
	}

	public final TermoContext termo() throws RecognitionException {
		TermoContext _localctx = new TermoContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_termo);
		try {
			setState(214);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(191);
				match(MINUS);
				setState(192);
				((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.UMINUS, ((TermoContext)_localctx).t1.result);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(195);
				match(NOT);
				setState(196);
				((TermoContext)_localctx).t1 = termo();
				((TermoContext)_localctx).result =  mkComposite(Op.NOT, ((TermoContext)_localctx).t1.result);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(199);
				match(LPAR);
				setState(200);
				((TermoContext)_localctx).e1 = expr();
				setState(201);
				match(RPAR);
				((TermoContext)_localctx).result =  ((TermoContext)_localctx).e1.result;
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(204);
				((TermoContext)_localctx).NUMERO = match(NUMERO);
				((TermoContext)_localctx).result =  mkNumeric(Double.parseDouble((((TermoContext)_localctx).NUMERO!=null?((TermoContext)_localctx).NUMERO.getText():null)));
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(206);
				((TermoContext)_localctx).IDENT = match(IDENT);
				((TermoContext)_localctx).result =  mkVar((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null));
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(208);
				((TermoContext)_localctx).IDENT = match(IDENT);
				setState(209);
				match(LPAR);
				setState(210);
				((TermoContext)_localctx).a = argList();
				setState(211);
				match(RPAR);
				((TermoContext)_localctx).result =  mkFunCall((((TermoContext)_localctx).IDENT!=null?((TermoContext)_localctx).IDENT.getText():null), ((TermoContext)_localctx).a.args);
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

	public static class ArgListContext extends ParserRuleContext {
		public List<Expr> args;
		public ExprContext e1;
		public ExprContext e2;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(CalcParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(CalcParser.COMMA, i);
		}
		public ArgListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_argList; }
	}

	public final ArgListContext argList() throws RecognitionException {
		ArgListContext _localctx = new ArgListContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_argList);

		    ((ArgListContext)_localctx).args =  new LinkedList<Expr>();

		int _la;
		try {
			setState(228);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case RPAR:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case NUMERO:
			case NOT:
			case IDENT:
			case MINUS:
			case LPAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(217);
				((ArgListContext)_localctx).e1 = expr();
				_localctx.args.add(((ArgListContext)_localctx).e1.result);
				setState(225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(219);
					match(COMMA);
					setState(220);
					((ArgListContext)_localctx).e2 = expr();
					_localctx.args.add(((ArgListContext)_localctx).e2.result);
					}
					}
					setState(227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
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

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3!\u00e9\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\3\2\3\2\3\2\7\2(\n\2\f\2\16\2+\13\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\5\3:\n\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\5\4J\n\4\3\5\3\5\3\5\3\5\3\5\3\5\3\6\3\6\3\6\3\6\3\6\3"+
		"\7\3\7\3\7\7\7Z\n\7\f\7\16\7]\13\7\3\b\3\b\3\b\3\b\3\b\3\b\5\be\n\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\nr\n\n\f\n\16\nu\13\n\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\7\13}\n\13\f\13\16\13\u0080\13\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\5\f\u0088\n\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3"+
		"\r\3\r\5\r\u0096\n\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\7\16\u00a2\n\16\f\16\16\16\u00a5\13\16\3\17\3\17\3\17\3\17\3\17\3\17"+
		"\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\7\17\u00b5\n\17\f\17\16\17\u00b8"+
		"\13\17\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00c0\n\20\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\5\21\u00d9\n\21\3\22\3\22\3\22\3\22\3\22"+
		"\3\22\3\22\7\22\u00e2\n\22\f\22\16\22\u00e5\13\22\5\22\u00e7\n\22\3\22"+
		"\2\2\23\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"\2\2\2\u00f3\2)\3\2\2"+
		"\2\49\3\2\2\2\6I\3\2\2\2\bK\3\2\2\2\nQ\3\2\2\2\f[\3\2\2\2\16d\3\2\2\2"+
		"\20f\3\2\2\2\22k\3\2\2\2\24v\3\2\2\2\26\u0081\3\2\2\2\30\u0095\3\2\2\2"+
		"\32\u0097\3\2\2\2\34\u00a6\3\2\2\2\36\u00b9\3\2\2\2 \u00d8\3\2\2\2\"\u00e6"+
		"\3\2\2\2$%\5\4\3\2%&\b\2\1\2&(\3\2\2\2\'$\3\2\2\2(+\3\2\2\2)\'\3\2\2\2"+
		")*\3\2\2\2*\3\3\2\2\2+)\3\2\2\2,-\5\16\b\2-.\7\31\2\2./\b\3\1\2/:\3\2"+
		"\2\2\60\61\5\6\4\2\61\62\b\3\1\2\62:\3\2\2\2\63\64\5\b\5\2\64\65\b\3\1"+
		"\2\65:\3\2\2\2\66\67\5\n\6\2\678\b\3\1\28:\3\2\2\29,\3\2\2\29\60\3\2\2"+
		"\29\63\3\2\2\29\66\3\2\2\2:\5\3\2\2\2;<\7\7\2\2<=\5\22\n\2=>\7\b\2\2>"+
		"?\5\4\3\2?@\b\4\1\2@J\3\2\2\2AB\7\7\2\2BC\5\22\n\2CD\7\b\2\2DE\5\4\3\2"+
		"EF\7\t\2\2FG\5\4\3\2GH\b\4\1\2HJ\3\2\2\2I;\3\2\2\2IA\3\2\2\2J\7\3\2\2"+
		"\2KL\7\n\2\2LM\5\22\n\2MN\7\13\2\2NO\5\4\3\2OP\b\5\1\2P\t\3\2\2\2QR\7"+
		"\26\2\2RS\5\f\7\2ST\7\27\2\2TU\b\6\1\2U\13\3\2\2\2VW\5\4\3\2WX\b\7\1\2"+
		"XZ\3\2\2\2YV\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\\r\3\2\2\2][\3\2"+
		"\2\2^_\5\20\t\2_`\b\b\1\2`e\3\2\2\2ab\5\22\n\2bc\b\b\1\2ce\3\2\2\2d^\3"+
		"\2\2\2da\3\2\2\2e\17\3\2\2\2fg\7\f\2\2gh\7\r\2\2hi\5\16\b\2ij\b\t\1\2"+
		"j\21\3\2\2\2kl\5\24\13\2ls\b\n\1\2mn\7\4\2\2no\5\24\13\2op\b\n\1\2pr\3"+
		"\2\2\2qm\3\2\2\2ru\3\2\2\2sq\3\2\2\2st\3\2\2\2t\23\3\2\2\2us\3\2\2\2v"+
		"w\5\26\f\2w~\b\13\1\2xy\7\5\2\2yz\5\26\f\2z{\b\13\1\2{}\3\2\2\2|x\3\2"+
		"\2\2}\u0080\3\2\2\2~|\3\2\2\2~\177\3\2\2\2\177\25\3\2\2\2\u0080~\3\2\2"+
		"\2\u0081\u0082\5\32\16\2\u0082\u0087\b\f\1\2\u0083\u0084\5\30\r\2\u0084"+
		"\u0085\5\32\16\2\u0085\u0086\b\f\1\2\u0086\u0088\3\2\2\2\u0087\u0083\3"+
		"\2\2\2\u0087\u0088\3\2\2\2\u0088\27\3\2\2\2\u0089\u008a\7\32\2\2\u008a"+
		"\u0096\b\r\1\2\u008b\u008c\7\33\2\2\u008c\u0096\b\r\1\2\u008d\u008e\7"+
		"\34\2\2\u008e\u0096\b\r\1\2\u008f\u0090\7\35\2\2\u0090\u0096\b\r\1\2\u0091"+
		"\u0092\7\36\2\2\u0092\u0096\b\r\1\2\u0093\u0094\7\37\2\2\u0094\u0096\b"+
		"\r\1\2\u0095\u0089\3\2\2\2\u0095\u008b\3\2\2\2\u0095\u008d\3\2\2\2\u0095"+
		"\u008f\3\2\2\2\u0095\u0091\3\2\2\2\u0095\u0093\3\2\2\2\u0096\31\3\2\2"+
		"\2\u0097\u0098\5\34\17\2\u0098\u00a3\b\16\1\2\u0099\u009a\7\16\2\2\u009a"+
		"\u009b\5\34\17\2\u009b\u009c\b\16\1\2\u009c\u00a2\3\2\2\2\u009d\u009e"+
		"\7\17\2\2\u009e\u009f\5\34\17\2\u009f\u00a0\b\16\1\2\u00a0\u00a2\3\2\2"+
		"\2\u00a1\u0099\3\2\2\2\u00a1\u009d\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1"+
		"\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4\33\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6"+
		"\u00a7\5\36\20\2\u00a7\u00b6\b\17\1\2\u00a8\u00a9\7\20\2\2\u00a9\u00aa"+
		"\5\36\20\2\u00aa\u00ab\b\17\1\2\u00ab\u00b5\3\2\2\2\u00ac\u00ad\7\21\2"+
		"\2\u00ad\u00ae\5\36\20\2\u00ae\u00af\b\17\1\2\u00af\u00b5\3\2\2\2\u00b0"+
		"\u00b1\7\22\2\2\u00b1\u00b2\5\36\20\2\u00b2\u00b3\b\17\1\2\u00b3\u00b5"+
		"\3\2\2\2\u00b4\u00a8\3\2\2\2\u00b4\u00ac\3\2\2\2\u00b4\u00b0\3\2\2\2\u00b5"+
		"\u00b8\3\2\2\2\u00b6\u00b4\3\2\2\2\u00b6\u00b7\3\2\2\2\u00b7\35\3\2\2"+
		"\2\u00b8\u00b6\3\2\2\2\u00b9\u00ba\5 \21\2\u00ba\u00bf\b\20\1\2\u00bb"+
		"\u00bc\7\23\2\2\u00bc\u00bd\5 \21\2\u00bd\u00be\b\20\1\2\u00be\u00c0\3"+
		"\2\2\2\u00bf\u00bb\3\2\2\2\u00bf\u00c0\3\2\2\2\u00c0\37\3\2\2\2\u00c1"+
		"\u00c2\7\17\2\2\u00c2\u00c3\5 \21\2\u00c3\u00c4\b\21\1\2\u00c4\u00d9\3"+
		"\2\2\2\u00c5\u00c6\7\6\2\2\u00c6\u00c7\5 \21\2\u00c7\u00c8\b\21\1\2\u00c8"+
		"\u00d9\3\2\2\2\u00c9\u00ca\7\24\2\2\u00ca\u00cb\5\16\b\2\u00cb\u00cc\7"+
		"\25\2\2\u00cc\u00cd\b\21\1\2\u00cd\u00d9\3\2\2\2\u00ce\u00cf\7\3\2\2\u00cf"+
		"\u00d9\b\21\1\2\u00d0\u00d1\7\f\2\2\u00d1\u00d9\b\21\1\2\u00d2\u00d3\7"+
		"\f\2\2\u00d3\u00d4\7\24\2\2\u00d4\u00d5\5\"\22\2\u00d5\u00d6\7\25\2\2"+
		"\u00d6\u00d7\b\21\1\2\u00d7\u00d9\3\2\2\2\u00d8\u00c1\3\2\2\2\u00d8\u00c5"+
		"\3\2\2\2\u00d8\u00c9\3\2\2\2\u00d8\u00ce\3\2\2\2\u00d8\u00d0\3\2\2\2\u00d8"+
		"\u00d2\3\2\2\2\u00d9!\3\2\2\2\u00da\u00e7\3\2\2\2\u00db\u00dc\5\16\b\2"+
		"\u00dc\u00e3\b\22\1\2\u00dd\u00de\7\30\2\2\u00de\u00df\5\16\b\2\u00df"+
		"\u00e0\b\22\1\2\u00e0\u00e2\3\2\2\2\u00e1\u00dd\3\2\2\2\u00e2\u00e5\3"+
		"\2\2\2\u00e3\u00e1\3\2\2\2\u00e3\u00e4\3\2\2\2\u00e4\u00e7\3\2\2\2\u00e5"+
		"\u00e3\3\2\2\2\u00e6\u00da\3\2\2\2\u00e6\u00db\3\2\2\2\u00e7#\3\2\2\2"+
		"\23)9I[ds~\u0087\u0095\u00a1\u00a3\u00b4\u00b6\u00bf\u00d8\u00e3\u00e6";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}