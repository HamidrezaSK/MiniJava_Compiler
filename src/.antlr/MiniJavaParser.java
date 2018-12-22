// Generated from /Users/apple/Documents/Project_For_Compiler/src/MiniJava.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class MiniJavaParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, T__26=27, T__27=28, T__28=29, T__29=30, T__30=31, 
		T__31=32, T__32=33, Boolean=34, Identifier=35, Integer=36, WS=37, LineComment=38, 
		Comment=39;
	public static final int
		RULE_goal = 0, RULE_mainClass = 1, RULE_classDeclaration = 2, RULE_varDeclaration = 3, 
		RULE_methodDeclaration = 4, RULE_mtype = 5, RULE_statement = 6, RULE_expression = 7;
	public static final String[] ruleNames = {
		"goal", "mainClass", "classDeclaration", "varDeclaration", "methodDeclaration", 
		"mtype", "statement", "expression"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'class'", "'{'", "'public'", "'static'", "'void'", "'main'", "'('", 
		"'String'", "'['", "']'", "')'", "'}'", "'extends'", "';'", "','", "'return'", 
		"'int'", "'boolean'", "'if'", "'else'", "'while'", "'System.out.println'", 
		"'='", "'&&'", "'<'", "'+'", "'-'", "'*'", "'.'", "'length'", "'this'", 
		"'new'", "'!'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, "Boolean", 
		"Identifier", "Integer", "WS", "LineComment", "Comment"
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
	public String getGrammarFileName() { return "MiniJava.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniJavaParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GoalContext extends ParserRuleContext {
		public MainClassContext mainClass() {
			return getRuleContext(MainClassContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniJavaParser.EOF, 0); }
		public List<ClassDeclarationContext> classDeclaration() {
			return getRuleContexts(ClassDeclarationContext.class);
		}
		public ClassDeclarationContext classDeclaration(int i) {
			return getRuleContext(ClassDeclarationContext.class,i);
		}
		public GoalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_goal; }
	}

	public final GoalContext goal() throws RecognitionException {
		GoalContext _localctx = new GoalContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_goal);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			mainClass();
			setState(20);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__0) {
				{
				{
				setState(17);
				classDeclaration();
				}
				}
				setState(22);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(23);
			match(EOF);
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

	public static class MainClassContext extends ParserRuleContext {
		public MainClassContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mainClass; }
	 
		public MainClassContext() { }
		public void copyFrom(MainClassContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MainclassContext extends MainClassContext {
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public MainclassContext(MainClassContext ctx) { copyFrom(ctx); }
	}

	public final MainClassContext mainClass() throws RecognitionException {
		MainClassContext _localctx = new MainClassContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_mainClass);
		try {
			_localctx = new MainclassContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(25);
			match(T__0);
			setState(26);
			match(Identifier);
			setState(27);
			match(T__1);
			setState(28);
			match(T__2);
			setState(29);
			match(T__3);
			setState(30);
			match(T__4);
			setState(31);
			match(T__5);
			setState(32);
			match(T__6);
			setState(33);
			match(T__7);
			setState(34);
			match(T__8);
			setState(35);
			match(T__9);
			setState(36);
			match(Identifier);
			setState(37);
			match(T__10);
			setState(38);
			match(T__1);
			setState(39);
			statement();
			setState(40);
			match(T__11);
			setState(41);
			match(T__11);
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

	public static class ClassDeclarationContext extends ParserRuleContext {
		public ClassDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_classDeclaration; }
	 
		public ClassDeclarationContext() { }
		public void copyFrom(ClassDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dec_classContext extends ClassDeclarationContext {
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<MethodDeclarationContext> methodDeclaration() {
			return getRuleContexts(MethodDeclarationContext.class);
		}
		public MethodDeclarationContext methodDeclaration(int i) {
			return getRuleContext(MethodDeclarationContext.class,i);
		}
		public Dec_classContext(ClassDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final ClassDeclarationContext classDeclaration() throws RecognitionException {
		ClassDeclarationContext _localctx = new ClassDeclarationContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_classDeclaration);
		int _la;
		try {
			_localctx = new Dec_classContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			match(T__0);
			setState(44);
			match(Identifier);
			setState(47);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==T__12) {
				{
				setState(45);
				match(T__12);
				setState(46);
				match(Identifier);
				}
			}

			setState(49);
			match(T__1);
			setState(53);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				{
				setState(50);
				varDeclaration();
				}
				}
				setState(55);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(56);
				methodDeclaration();
				}
				}
				setState(61);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(62);
			match(T__11);
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

	public static class VarDeclarationContext extends ParserRuleContext {
		public VarDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_varDeclaration; }
	 
		public VarDeclarationContext() { }
		public void copyFrom(VarDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dec_varContext extends VarDeclarationContext {
		public MtypeContext mtype() {
			return getRuleContext(MtypeContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public Dec_varContext(VarDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final VarDeclarationContext varDeclaration() throws RecognitionException {
		VarDeclarationContext _localctx = new VarDeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_varDeclaration);
		try {
			_localctx = new Dec_varContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			mtype();
			setState(65);
			match(Identifier);
			setState(66);
			match(T__13);
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

	public static class MethodDeclarationContext extends ParserRuleContext {
		public MethodDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_methodDeclaration; }
	 
		public MethodDeclarationContext() { }
		public void copyFrom(MethodDeclarationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Dec_methodContext extends MethodDeclarationContext {
		public List<MtypeContext> mtype() {
			return getRuleContexts(MtypeContext.class);
		}
		public MtypeContext mtype(int i) {
			return getRuleContext(MtypeContext.class,i);
		}
		public List<TerminalNode> Identifier() { return getTokens(MiniJavaParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(MiniJavaParser.Identifier, i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<VarDeclarationContext> varDeclaration() {
			return getRuleContexts(VarDeclarationContext.class);
		}
		public VarDeclarationContext varDeclaration(int i) {
			return getRuleContext(VarDeclarationContext.class,i);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public Dec_methodContext(MethodDeclarationContext ctx) { copyFrom(ctx); }
	}

	public final MethodDeclarationContext methodDeclaration() throws RecognitionException {
		MethodDeclarationContext _localctx = new MethodDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_methodDeclaration);
		int _la;
		try {
			int _alt;
			_localctx = new Dec_methodContext(_localctx);
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__2);
			setState(69);
			mtype();
			setState(70);
			match(Identifier);
			setState(71);
			match(T__6);
			setState(83);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__16) | (1L << T__17) | (1L << Identifier))) != 0)) {
				{
				setState(72);
				mtype();
				setState(73);
				match(Identifier);
				setState(80);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__14) {
					{
					{
					setState(74);
					match(T__14);
					setState(75);
					mtype();
					setState(76);
					match(Identifier);
					}
					}
					setState(82);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(85);
			match(T__10);
			setState(86);
			match(T__1);
			setState(90);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(87);
					varDeclaration();
					}
					} 
				}
				setState(92);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(96);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
				{
				{
				setState(93);
				statement();
				}
				}
				setState(98);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(99);
			match(T__15);
			setState(100);
			expression(0);
			setState(101);
			match(T__13);
			setState(102);
			match(T__11);
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

	public static class MtypeContext extends ParserRuleContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public MtypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mtype; }
	}

	public final MtypeContext mtype() throws RecognitionException {
		MtypeContext _localctx = new MtypeContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_mtype);
		try {
			setState(110);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(104);
				match(T__16);
				setState(105);
				match(T__8);
				setState(106);
				match(T__9);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(107);
				match(T__17);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(108);
				match(T__16);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(109);
				match(Identifier);
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

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class State_printContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public State_printContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class State_defContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public State_defContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class State_ifContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public State_ifContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class State_whileContext extends StatementContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public State_whileContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class State_idContext extends StatementContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public State_idContext(StatementContext ctx) { copyFrom(ctx); }
	}
	public static class State_lrparentsContext extends StatementContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public State_lrparentsContext(StatementContext ctx) { copyFrom(ctx); }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		int _la;
		try {
			setState(153);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				_localctx = new State_lrparentsContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(112);
				match(T__1);
				setState(116);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__18) | (1L << T__20) | (1L << T__21) | (1L << Identifier))) != 0)) {
					{
					{
					setState(113);
					statement();
					}
					}
					setState(118);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(119);
				match(T__11);
				}
				break;
			case 2:
				_localctx = new State_ifContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(120);
				match(T__18);
				setState(121);
				match(T__6);
				setState(122);
				expression(0);
				setState(123);
				match(T__10);
				setState(124);
				statement();
				setState(125);
				match(T__19);
				setState(126);
				statement();
				}
				break;
			case 3:
				_localctx = new State_whileContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(128);
				match(T__20);
				setState(129);
				match(T__6);
				setState(130);
				expression(0);
				setState(131);
				match(T__10);
				setState(132);
				statement();
				}
				break;
			case 4:
				_localctx = new State_printContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(134);
				match(T__21);
				setState(135);
				match(T__6);
				setState(136);
				expression(0);
				setState(137);
				match(T__10);
				setState(138);
				match(T__13);
				}
				break;
			case 5:
				_localctx = new State_defContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(140);
				match(Identifier);
				setState(141);
				match(T__22);
				setState(142);
				expression(0);
				setState(143);
				match(T__13);
				}
				break;
			case 6:
				_localctx = new State_idContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(145);
				match(Identifier);
				setState(146);
				match(T__8);
				setState(147);
				expression(0);
				setState(148);
				match(T__9);
				setState(149);
				match(T__22);
				setState(150);
				expression(0);
				setState(151);
				match(T__13);
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

	public static class ExpressionContext extends ParserRuleContext {
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	 
		public ExpressionContext() { }
		public void copyFrom(ExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Exp_lrparentsContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Exp_lrparentsContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_thisContext extends ExpressionContext {
		public Exp_thisContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_method_callingContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public Exp_method_callingContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_int_arrayContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Exp_int_arrayContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_notContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Exp_notContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_operationContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Exp_operationContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_idContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public Exp_idContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_boolContext extends ExpressionContext {
		public TerminalNode Boolean() { return getToken(MiniJavaParser.Boolean, 0); }
		public Exp_boolContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_lengthContext extends ExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Exp_lengthContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_arrayContext extends ExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Exp_arrayContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_intContext extends ExpressionContext {
		public TerminalNode Integer() { return getToken(MiniJavaParser.Integer, 0); }
		public Exp_intContext(ExpressionContext ctx) { copyFrom(ctx); }
	}
	public static class Exp_classContext extends ExpressionContext {
		public TerminalNode Identifier() { return getToken(MiniJavaParser.Identifier, 0); }
		public Exp_classContext(ExpressionContext ctx) { copyFrom(ctx); }
	}

	public final ExpressionContext expression() throws RecognitionException {
		return expression(0);
	}

	private ExpressionContext expression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExpressionContext _localctx = new ExpressionContext(_ctx, _parentState);
		ExpressionContext _prevctx = _localctx;
		int _startState = 14;
		enterRecursionRule(_localctx, 14, RULE_expression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				_localctx = new Exp_intContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(156);
				match(Integer);
				}
				break;
			case 2:
				{
				_localctx = new Exp_boolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(157);
				match(Boolean);
				}
				break;
			case 3:
				{
				_localctx = new Exp_idContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(158);
				match(Identifier);
				}
				break;
			case 4:
				{
				_localctx = new Exp_thisContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(159);
				match(T__30);
				}
				break;
			case 5:
				{
				_localctx = new Exp_int_arrayContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(160);
				match(T__31);
				setState(161);
				match(T__16);
				setState(162);
				match(T__8);
				setState(163);
				expression(0);
				setState(164);
				match(T__9);
				}
				break;
			case 6:
				{
				_localctx = new Exp_classContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(166);
				match(T__31);
				setState(167);
				match(Identifier);
				setState(168);
				match(T__6);
				setState(169);
				match(T__10);
				}
				break;
			case 7:
				{
				_localctx = new Exp_notContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(170);
				match(T__32);
				setState(171);
				expression(2);
				}
				break;
			case 8:
				{
				_localctx = new Exp_lrparentsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(172);
				match(T__6);
				setState(173);
				expression(0);
				setState(174);
				match(T__10);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(206);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(204);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
					case 1:
						{
						_localctx = new Exp_operationContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(178);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(179);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__23) | (1L << T__24) | (1L << T__25) | (1L << T__26) | (1L << T__27))) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(180);
						expression(13);
						}
						break;
					case 2:
						{
						_localctx = new Exp_arrayContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(181);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(182);
						match(T__8);
						setState(183);
						expression(0);
						setState(184);
						match(T__9);
						}
						break;
					case 3:
						{
						_localctx = new Exp_lengthContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(186);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(187);
						match(T__28);
						setState(188);
						match(T__29);
						}
						break;
					case 4:
						{
						_localctx = new Exp_method_callingContext(new ExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expression);
						setState(189);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(190);
						match(T__28);
						setState(191);
						match(Identifier);
						setState(192);
						match(T__6);
						setState(201);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__6) | (1L << T__30) | (1L << T__31) | (1L << T__32) | (1L << Boolean) | (1L << Identifier) | (1L << Integer))) != 0)) {
							{
							setState(193);
							expression(0);
							setState(198);
							_errHandler.sync(this);
							_la = _input.LA(1);
							while (_la==T__14) {
								{
								{
								setState(194);
								match(T__14);
								setState(195);
								expression(0);
								}
								}
								setState(200);
								_errHandler.sync(this);
								_la = _input.LA(1);
							}
							}
						}

						setState(203);
						match(T__10);
						}
						break;
					}
					} 
				}
				setState(208);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,15,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 7:
			return expression_sempred((ExpressionContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expression_sempred(ExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 12);
		case 1:
			return precpred(_ctx, 11);
		case 2:
			return precpred(_ctx, 10);
		case 3:
			return precpred(_ctx, 9);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3)\u00d4\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\7\2\25"+
		"\n\2\f\2\16\2\30\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\5\4\62\n\4\3\4\3\4\7"+
		"\4\66\n\4\f\4\16\49\13\4\3\4\7\4<\n\4\f\4\16\4?\13\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\7\6Q\n\6\f\6\16\6T\13\6"+
		"\5\6V\n\6\3\6\3\6\3\6\7\6[\n\6\f\6\16\6^\13\6\3\6\7\6a\n\6\f\6\16\6d\13"+
		"\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\5\7q\n\7\3\b\3\b\7\bu\n"+
		"\b\f\b\16\bx\13\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\b\3\b\3\b\5\b\u009c\n\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\t\u00b3\n\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u00c7\n"+
		"\t\f\t\16\t\u00ca\13\t\5\t\u00cc\n\t\3\t\7\t\u00cf\n\t\f\t\16\t\u00d2"+
		"\13\t\3\t\2\3\20\n\2\4\6\b\n\f\16\20\2\3\3\2\32\36\2\u00e9\2\22\3\2\2"+
		"\2\4\33\3\2\2\2\6-\3\2\2\2\bB\3\2\2\2\nF\3\2\2\2\fp\3\2\2\2\16\u009b\3"+
		"\2\2\2\20\u00b2\3\2\2\2\22\26\5\4\3\2\23\25\5\6\4\2\24\23\3\2\2\2\25\30"+
		"\3\2\2\2\26\24\3\2\2\2\26\27\3\2\2\2\27\31\3\2\2\2\30\26\3\2\2\2\31\32"+
		"\7\2\2\3\32\3\3\2\2\2\33\34\7\3\2\2\34\35\7%\2\2\35\36\7\4\2\2\36\37\7"+
		"\5\2\2\37 \7\6\2\2 !\7\7\2\2!\"\7\b\2\2\"#\7\t\2\2#$\7\n\2\2$%\7\13\2"+
		"\2%&\7\f\2\2&\'\7%\2\2\'(\7\r\2\2()\7\4\2\2)*\5\16\b\2*+\7\16\2\2+,\7"+
		"\16\2\2,\5\3\2\2\2-.\7\3\2\2.\61\7%\2\2/\60\7\17\2\2\60\62\7%\2\2\61/"+
		"\3\2\2\2\61\62\3\2\2\2\62\63\3\2\2\2\63\67\7\4\2\2\64\66\5\b\5\2\65\64"+
		"\3\2\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28=\3\2\2\29\67\3\2\2\2:"+
		"<\5\n\6\2;:\3\2\2\2<?\3\2\2\2=;\3\2\2\2=>\3\2\2\2>@\3\2\2\2?=\3\2\2\2"+
		"@A\7\16\2\2A\7\3\2\2\2BC\5\f\7\2CD\7%\2\2DE\7\20\2\2E\t\3\2\2\2FG\7\5"+
		"\2\2GH\5\f\7\2HI\7%\2\2IU\7\t\2\2JK\5\f\7\2KR\7%\2\2LM\7\21\2\2MN\5\f"+
		"\7\2NO\7%\2\2OQ\3\2\2\2PL\3\2\2\2QT\3\2\2\2RP\3\2\2\2RS\3\2\2\2SV\3\2"+
		"\2\2TR\3\2\2\2UJ\3\2\2\2UV\3\2\2\2VW\3\2\2\2WX\7\r\2\2X\\\7\4\2\2Y[\5"+
		"\b\5\2ZY\3\2\2\2[^\3\2\2\2\\Z\3\2\2\2\\]\3\2\2\2]b\3\2\2\2^\\\3\2\2\2"+
		"_a\5\16\b\2`_\3\2\2\2ad\3\2\2\2b`\3\2\2\2bc\3\2\2\2ce\3\2\2\2db\3\2\2"+
		"\2ef\7\22\2\2fg\5\20\t\2gh\7\20\2\2hi\7\16\2\2i\13\3\2\2\2jk\7\23\2\2"+
		"kl\7\13\2\2lq\7\f\2\2mq\7\24\2\2nq\7\23\2\2oq\7%\2\2pj\3\2\2\2pm\3\2\2"+
		"\2pn\3\2\2\2po\3\2\2\2q\r\3\2\2\2rv\7\4\2\2su\5\16\b\2ts\3\2\2\2ux\3\2"+
		"\2\2vt\3\2\2\2vw\3\2\2\2wy\3\2\2\2xv\3\2\2\2y\u009c\7\16\2\2z{\7\25\2"+
		"\2{|\7\t\2\2|}\5\20\t\2}~\7\r\2\2~\177\5\16\b\2\177\u0080\7\26\2\2\u0080"+
		"\u0081\5\16\b\2\u0081\u009c\3\2\2\2\u0082\u0083\7\27\2\2\u0083\u0084\7"+
		"\t\2\2\u0084\u0085\5\20\t\2\u0085\u0086\7\r\2\2\u0086\u0087\5\16\b\2\u0087"+
		"\u009c\3\2\2\2\u0088\u0089\7\30\2\2\u0089\u008a\7\t\2\2\u008a\u008b\5"+
		"\20\t\2\u008b\u008c\7\r\2\2\u008c\u008d\7\20\2\2\u008d\u009c\3\2\2\2\u008e"+
		"\u008f\7%\2\2\u008f\u0090\7\31\2\2\u0090\u0091\5\20\t\2\u0091\u0092\7"+
		"\20\2\2\u0092\u009c\3\2\2\2\u0093\u0094\7%\2\2\u0094\u0095\7\13\2\2\u0095"+
		"\u0096\5\20\t\2\u0096\u0097\7\f\2\2\u0097\u0098\7\31\2\2\u0098\u0099\5"+
		"\20\t\2\u0099\u009a\7\20\2\2\u009a\u009c\3\2\2\2\u009br\3\2\2\2\u009b"+
		"z\3\2\2\2\u009b\u0082\3\2\2\2\u009b\u0088\3\2\2\2\u009b\u008e\3\2\2\2"+
		"\u009b\u0093\3\2\2\2\u009c\17\3\2\2\2\u009d\u009e\b\t\1\2\u009e\u00b3"+
		"\7&\2\2\u009f\u00b3\7$\2\2\u00a0\u00b3\7%\2\2\u00a1\u00b3\7!\2\2\u00a2"+
		"\u00a3\7\"\2\2\u00a3\u00a4\7\23\2\2\u00a4\u00a5\7\13\2\2\u00a5\u00a6\5"+
		"\20\t\2\u00a6\u00a7\7\f\2\2\u00a7\u00b3\3\2\2\2\u00a8\u00a9\7\"\2\2\u00a9"+
		"\u00aa\7%\2\2\u00aa\u00ab\7\t\2\2\u00ab\u00b3\7\r\2\2\u00ac\u00ad\7#\2"+
		"\2\u00ad\u00b3\5\20\t\4\u00ae\u00af\7\t\2\2\u00af\u00b0\5\20\t\2\u00b0"+
		"\u00b1\7\r\2\2\u00b1\u00b3\3\2\2\2\u00b2\u009d\3\2\2\2\u00b2\u009f\3\2"+
		"\2\2\u00b2\u00a0\3\2\2\2\u00b2\u00a1\3\2\2\2\u00b2\u00a2\3\2\2\2\u00b2"+
		"\u00a8\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3\2\2\2\u00b3\u00d0\3\2"+
		"\2\2\u00b4\u00b5\f\16\2\2\u00b5\u00b6\t\2\2\2\u00b6\u00cf\5\20\t\17\u00b7"+
		"\u00b8\f\r\2\2\u00b8\u00b9\7\13\2\2\u00b9\u00ba\5\20\t\2\u00ba\u00bb\7"+
		"\f\2\2\u00bb\u00cf\3\2\2\2\u00bc\u00bd\f\f\2\2\u00bd\u00be\7\37\2\2\u00be"+
		"\u00cf\7 \2\2\u00bf\u00c0\f\13\2\2\u00c0\u00c1\7\37\2\2\u00c1\u00c2\7"+
		"%\2\2\u00c2\u00cb\7\t\2\2\u00c3\u00c8\5\20\t\2\u00c4\u00c5\7\21\2\2\u00c5"+
		"\u00c7\5\20\t\2\u00c6\u00c4\3\2\2\2\u00c7\u00ca\3\2\2\2\u00c8\u00c6\3"+
		"\2\2\2\u00c8\u00c9\3\2\2\2\u00c9\u00cc\3\2\2\2\u00ca\u00c8\3\2\2\2\u00cb"+
		"\u00c3\3\2\2\2\u00cb\u00cc\3\2\2\2\u00cc\u00cd\3\2\2\2\u00cd\u00cf\7\r"+
		"\2\2\u00ce\u00b4\3\2\2\2\u00ce\u00b7\3\2\2\2\u00ce\u00bc\3\2\2\2\u00ce"+
		"\u00bf\3\2\2\2\u00cf\u00d2\3\2\2\2\u00d0\u00ce\3\2\2\2\u00d0\u00d1\3\2"+
		"\2\2\u00d1\21\3\2\2\2\u00d2\u00d0\3\2\2\2\22\26\61\67=RU\\bpv\u009b\u00b2"+
		"\u00c8\u00cb\u00ce\u00d0";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}