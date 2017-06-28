// Generated from virtualMachine.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class virtualMachineParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SC=1, ENTER=2, CLASS=3, MAIN=4, ARGS=5, NAME=6, MODIFICATOR=7, LCB=8, 
		RCB=9, LB=10, RB=11, TYPE=12, RETURN_TYPE=13, FOR=14, WHILE=15, IF=16, 
		ELSE=17, DIGIT=18, VAR=19, ASSIGN=20, PLUS=21, MINUS=22, ARITHM1=23, CMP=24, 
		AND=25, OR=26, UNOT=27, TRUE=28, FALSE=29, INC=30, DEC=31, WS=32;
	public static final int
		RULE_start = 0, RULE_class_ = 1, RULE_section = 2, RULE_param = 3, RULE_main = 4, 
		RULE_for_ = 5, RULE_while_ = 6, RULE_if_ = 7, RULE_thensection = 8, RULE_whilesection = 9, 
		RULE_elsesection = 10, RULE_assign = 11, RULE_math = 12, RULE_term = 13, 
		RULE_logic = 14, RULE_num = 15, RULE_bool = 16, RULE_inc = 17, RULE_dec = 18;
	public static final String[] ruleNames = {
		"start", "class_", "section", "param", "main", "for_", "while_", "if_", 
		"thensection", "whilesection", "elsesection", "assign", "math", "term", 
		"logic", "num", "bool", "inc", "dec"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "';'", null, "'class'", "'main'", "'String[] args'", null, null, 
		"'{'", "'}'", "'('", "')'", null, null, "'for'", "'while'", "'if'", "'else'", 
		null, null, null, "'+'", "'-'", null, null, "'&&'", "'||'", "'!'", "'true'", 
		"'false'", "'++'", "'--'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "SC", "ENTER", "CLASS", "MAIN", "ARGS", "NAME", "MODIFICATOR", "LCB", 
		"RCB", "LB", "RB", "TYPE", "RETURN_TYPE", "FOR", "WHILE", "IF", "ELSE", 
		"DIGIT", "VAR", "ASSIGN", "PLUS", "MINUS", "ARITHM1", "CMP", "AND", "OR", 
		"UNOT", "TRUE", "FALSE", "INC", "DEC", "WS"
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
	public String getGrammarFileName() { return "virtualMachine.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public virtualMachineParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitStart(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(38);
			class_();
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

	public static class Class_Context extends ParserRuleContext {
		public TerminalNode CLASS() { return getToken(virtualMachineParser.CLASS, 0); }
		public TerminalNode NAME() { return getToken(virtualMachineParser.NAME, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public List<TerminalNode> MODIFICATOR() { return getTokens(virtualMachineParser.MODIFICATOR); }
		public TerminalNode MODIFICATOR(int i) {
			return getToken(virtualMachineParser.MODIFICATOR, i);
		}
		public Class_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_class_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterClass_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitClass_(this);
		}
	}

	public final Class_Context class_() throws RecognitionException {
		Class_Context _localctx = new Class_Context(_ctx, getState());
		enterRule(_localctx, 2, RULE_class_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFICATOR) {
				{
				{
				setState(40);
				match(MODIFICATOR);
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(46);
			match(CLASS);
			setState(47);
			match(NAME);
			setState(48);
			section();
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

	public static class SectionContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(virtualMachineParser.LCB, 0); }
		public List<TerminalNode> ENTER() { return getTokens(virtualMachineParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(virtualMachineParser.ENTER, i);
		}
		public TerminalNode RCB() { return getToken(virtualMachineParser.RCB, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public SectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_section; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterSection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitSection(this);
		}
	}

	public final SectionContext section() throws RecognitionException {
		SectionContext _localctx = new SectionContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(50);
			match(LCB);
			setState(51);
			match(ENTER);
			setState(57);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MODIFICATOR) | (1L << LB) | (1L << TYPE) | (1L << RETURN_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DIGIT) | (1L << VAR) | (1L << MINUS))) != 0)) {
				{
				{
				setState(52);
				param();
				setState(53);
				match(ENTER);
				}
				}
				setState(59);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(60);
			match(RCB);
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

	public static class ParamContext extends ParserRuleContext {
		public Class_Context class_() {
			return getRuleContext(Class_Context.class,0);
		}
		public MainContext main() {
			return getRuleContext(MainContext.class,0);
		}
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public While_Context while_() {
			return getRuleContext(While_Context.class,0);
		}
		public For_Context for_() {
			return getRuleContext(For_Context.class,0);
		}
		public If_Context if_() {
			return getRuleContext(If_Context.class,0);
		}
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public DecContext dec() {
			return getRuleContext(DecContext.class,0);
		}
		public ParamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_param; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterParam(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitParam(this);
		}
	}

	public final ParamContext param() throws RecognitionException {
		ParamContext _localctx = new ParamContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_param);
		try {
			setState(71);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				class_();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(63);
				main();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(64);
				math(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(65);
				while_();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(66);
				for_();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(67);
				if_();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(68);
				assign();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(69);
				inc();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(70);
				dec();
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

	public static class MainContext extends ParserRuleContext {
		public TerminalNode RETURN_TYPE() { return getToken(virtualMachineParser.RETURN_TYPE, 0); }
		public TerminalNode MAIN() { return getToken(virtualMachineParser.MAIN, 0); }
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public TerminalNode ARGS() { return getToken(virtualMachineParser.ARGS, 0); }
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public List<TerminalNode> MODIFICATOR() { return getTokens(virtualMachineParser.MODIFICATOR); }
		public TerminalNode MODIFICATOR(int i) {
			return getToken(virtualMachineParser.MODIFICATOR, i);
		}
		public MainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_main; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterMain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitMain(this);
		}
	}

	public final MainContext main() throws RecognitionException {
		MainContext _localctx = new MainContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_main);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==MODIFICATOR) {
				{
				{
				setState(73);
				match(MODIFICATOR);
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
			match(RETURN_TYPE);
			setState(80);
			match(MAIN);
			setState(81);
			match(LB);
			setState(82);
			match(ARGS);
			setState(83);
			match(RB);
			setState(84);
			section();
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

	public static class For_Context extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(virtualMachineParser.FOR, 0); }
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public AssignContext assign() {
			return getRuleContext(AssignContext.class,0);
		}
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public IncContext inc() {
			return getRuleContext(IncContext.class,0);
		}
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public SectionContext section() {
			return getRuleContext(SectionContext.class,0);
		}
		public For_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterFor_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitFor_(this);
		}
	}

	public final For_Context for_() throws RecognitionException {
		For_Context _localctx = new For_Context(_ctx, getState());
		enterRule(_localctx, 10, RULE_for_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(86);
			match(FOR);
			setState(87);
			match(LB);
			setState(88);
			assign();
			setState(89);
			logic();
			setState(90);
			inc();
			setState(91);
			match(RB);
			setState(92);
			section();
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

	public static class While_Context extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(virtualMachineParser.WHILE, 0); }
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public WhilesectionContext whilesection() {
			return getRuleContext(WhilesectionContext.class,0);
		}
		public While_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterWhile_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitWhile_(this);
		}
	}

	public final While_Context while_() throws RecognitionException {
		While_Context _localctx = new While_Context(_ctx, getState());
		enterRule(_localctx, 12, RULE_while_);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(WHILE);
			setState(95);
			match(LB);
			setState(96);
			logic();
			setState(97);
			match(RB);
			setState(98);
			whilesection();
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

	public static class If_Context extends ParserRuleContext {
		public TerminalNode IF() { return getToken(virtualMachineParser.IF, 0); }
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public LogicContext logic() {
			return getRuleContext(LogicContext.class,0);
		}
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public ThensectionContext thensection() {
			return getRuleContext(ThensectionContext.class,0);
		}
		public TerminalNode ELSE() { return getToken(virtualMachineParser.ELSE, 0); }
		public ElsesectionContext elsesection() {
			return getRuleContext(ElsesectionContext.class,0);
		}
		public If_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterIf_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitIf_(this);
		}
	}

	public final If_Context if_() throws RecognitionException {
		If_Context _localctx = new If_Context(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(IF);
			setState(101);
			match(LB);
			setState(102);
			logic();
			setState(103);
			match(RB);
			setState(104);
			thensection();
			setState(107);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(105);
				match(ELSE);
				setState(106);
				elsesection();
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

	public static class ThensectionContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(virtualMachineParser.LCB, 0); }
		public List<TerminalNode> ENTER() { return getTokens(virtualMachineParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(virtualMachineParser.ENTER, i);
		}
		public TerminalNode RCB() { return getToken(virtualMachineParser.RCB, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ThensectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_thensection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterThensection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitThensection(this);
		}
	}

	public final ThensectionContext thensection() throws RecognitionException {
		ThensectionContext _localctx = new ThensectionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_thensection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(109);
			match(LCB);
			setState(110);
			match(ENTER);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MODIFICATOR) | (1L << LB) | (1L << TYPE) | (1L << RETURN_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DIGIT) | (1L << VAR) | (1L << MINUS))) != 0)) {
				{
				{
				setState(111);
				param();
				setState(112);
				match(ENTER);
				}
				}
				setState(118);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(119);
			match(RCB);
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

	public static class WhilesectionContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(virtualMachineParser.LCB, 0); }
		public List<TerminalNode> ENTER() { return getTokens(virtualMachineParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(virtualMachineParser.ENTER, i);
		}
		public TerminalNode RCB() { return getToken(virtualMachineParser.RCB, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public WhilesectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whilesection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterWhilesection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitWhilesection(this);
		}
	}

	public final WhilesectionContext whilesection() throws RecognitionException {
		WhilesectionContext _localctx = new WhilesectionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_whilesection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LCB);
			setState(122);
			match(ENTER);
			setState(128);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MODIFICATOR) | (1L << LB) | (1L << TYPE) | (1L << RETURN_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DIGIT) | (1L << VAR) | (1L << MINUS))) != 0)) {
				{
				{
				setState(123);
				param();
				setState(124);
				match(ENTER);
				}
				}
				setState(130);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(131);
			match(RCB);
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

	public static class ElsesectionContext extends ParserRuleContext {
		public TerminalNode LCB() { return getToken(virtualMachineParser.LCB, 0); }
		public List<TerminalNode> ENTER() { return getTokens(virtualMachineParser.ENTER); }
		public TerminalNode ENTER(int i) {
			return getToken(virtualMachineParser.ENTER, i);
		}
		public TerminalNode RCB() { return getToken(virtualMachineParser.RCB, 0); }
		public List<ParamContext> param() {
			return getRuleContexts(ParamContext.class);
		}
		public ParamContext param(int i) {
			return getRuleContext(ParamContext.class,i);
		}
		public ElsesectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_elsesection; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterElsesection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitElsesection(this);
		}
	}

	public final ElsesectionContext elsesection() throws RecognitionException {
		ElsesectionContext _localctx = new ElsesectionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_elsesection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(133);
			match(LCB);
			setState(134);
			match(ENTER);
			setState(140);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << CLASS) | (1L << MODIFICATOR) | (1L << LB) | (1L << TYPE) | (1L << RETURN_TYPE) | (1L << FOR) | (1L << WHILE) | (1L << IF) | (1L << DIGIT) | (1L << VAR) | (1L << MINUS))) != 0)) {
				{
				{
				setState(135);
				param();
				setState(136);
				match(ENTER);
				}
				}
				setState(142);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(143);
			match(RCB);
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
		public TerminalNode TYPE() { return getToken(virtualMachineParser.TYPE, 0); }
		public TerminalNode VAR() { return getToken(virtualMachineParser.VAR, 0); }
		public TerminalNode ASSIGN() { return getToken(virtualMachineParser.ASSIGN, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode SC() { return getToken(virtualMachineParser.SC, 0); }
		public AssignContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assign; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitAssign(this);
		}
	}

	public final AssignContext assign() throws RecognitionException {
		AssignContext _localctx = new AssignContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_assign);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(154);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(145);
				match(TYPE);
				setState(146);
				match(VAR);
				}
				break;
			case 2:
				{
				setState(147);
				match(TYPE);
				setState(148);
				match(VAR);
				setState(149);
				match(ASSIGN);
				setState(150);
				math(0);
				}
				break;
			case 3:
				{
				setState(151);
				match(VAR);
				setState(152);
				match(ASSIGN);
				setState(153);
				math(0);
				}
				break;
			}
			setState(157);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(156);
				match(SC);
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

	public static class MathContext extends ParserRuleContext {
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public List<MathContext> math() {
			return getRuleContexts(MathContext.class);
		}
		public MathContext math(int i) {
			return getRuleContext(MathContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(virtualMachineParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(virtualMachineParser.MINUS, 0); }
		public MathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitMath(this);
		}
	}

	public final MathContext math() throws RecognitionException {
		return math(0);
	}

	private MathContext math(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		MathContext _localctx = new MathContext(_ctx, _parentState);
		MathContext _prevctx = _localctx;
		int _startState = 24;
		enterRecursionRule(_localctx, 24, RULE_math, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(160);
			term(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(167);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new MathContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_math);
					setState(162);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(163);
					_la = _input.LA(1);
					if ( !(_la==PLUS || _la==MINUS) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(164);
					math(3);
					}
					} 
				}
				setState(169);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public static class TermContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public TermContext term() {
			return getRuleContext(TermContext.class,0);
		}
		public TerminalNode ARITHM1() { return getToken(virtualMachineParser.ARITHM1, 0); }
		public TermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_term; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterTerm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitTerm(this);
		}
	}

	public final TermContext term() throws RecognitionException {
		return term(0);
	}

	private TermContext term(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TermContext _localctx = new TermContext(_ctx, _parentState);
		TermContext _prevctx = _localctx;
		int _startState = 26;
		enterRecursionRule(_localctx, 26, RULE_term, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				{
				setState(171);
				num();
				}
				break;
			case 2:
				{
				setState(172);
				match(LB);
				setState(173);
				math(0);
				setState(174);
				match(RB);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(183);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,12,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TermContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_term);
					setState(178);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(179);
					match(ARITHM1);
					setState(180);
					num();
					}
					} 
				}
				setState(185);
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

	public static class LogicContext extends ParserRuleContext {
		public List<BoolContext> bool() {
			return getRuleContexts(BoolContext.class);
		}
		public BoolContext bool(int i) {
			return getRuleContext(BoolContext.class,i);
		}
		public TerminalNode CMP() { return getToken(virtualMachineParser.CMP, 0); }
		public LogicContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logic; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterLogic(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitLogic(this);
		}
	}

	public final LogicContext logic() throws RecognitionException {
		LogicContext _localctx = new LogicContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_logic);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(186);
			bool();
			setState(187);
			match(CMP);
			setState(188);
			bool();
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

	public static class NumContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(virtualMachineParser.DIGIT, 0); }
		public TerminalNode VAR() { return getToken(virtualMachineParser.VAR, 0); }
		public TerminalNode MINUS() { return getToken(virtualMachineParser.MINUS, 0); }
		public TerminalNode LB() { return getToken(virtualMachineParser.LB, 0); }
		public MathContext math() {
			return getRuleContext(MathContext.class,0);
		}
		public TerminalNode RB() { return getToken(virtualMachineParser.RB, 0); }
		public NumContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_num; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitNum(this);
		}
	}

	public final NumContext num() throws RecognitionException {
		NumContext _localctx = new NumContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_num);
		int _la;
		try {
			setState(202);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(190);
				match(DIGIT);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(191);
					match(MINUS);
					}
				}

				setState(194);
				match(VAR);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(196);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(195);
					match(MINUS);
					}
				}

				setState(198);
				match(LB);
				setState(199);
				math(0);
				setState(200);
				match(RB);
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

	public static class BoolContext extends ParserRuleContext {
		public TerminalNode DIGIT() { return getToken(virtualMachineParser.DIGIT, 0); }
		public TerminalNode VAR() { return getToken(virtualMachineParser.VAR, 0); }
		public TerminalNode UNOT() { return getToken(virtualMachineParser.UNOT, 0); }
		public TerminalNode MINUS() { return getToken(virtualMachineParser.MINUS, 0); }
		public BoolContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitBool(this);
		}
	}

	public final BoolContext bool() throws RecognitionException {
		BoolContext _localctx = new BoolContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_bool);
		int _la;
		try {
			setState(209);
			switch (_input.LA(1)) {
			case DIGIT:
				enterOuterAlt(_localctx, 1);
				{
				setState(204);
				match(DIGIT);
				}
				break;
			case VAR:
			case MINUS:
			case UNOT:
				enterOuterAlt(_localctx, 2);
				{
				setState(206);
				_la = _input.LA(1);
				if (_la==MINUS || _la==UNOT) {
					{
					setState(205);
					_la = _input.LA(1);
					if ( !(_la==MINUS || _la==UNOT) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				setState(208);
				match(VAR);
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

	public static class IncContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode INC() { return getToken(virtualMachineParser.INC, 0); }
		public TerminalNode SC() { return getToken(virtualMachineParser.SC, 0); }
		public IncContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inc; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterInc(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitInc(this);
		}
	}

	public final IncContext inc() throws RecognitionException {
		IncContext _localctx = new IncContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_inc);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(211);
			num();
			setState(212);
			match(INC);
			setState(214);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(213);
				match(SC);
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

	public static class DecContext extends ParserRuleContext {
		public NumContext num() {
			return getRuleContext(NumContext.class,0);
		}
		public TerminalNode DEC() { return getToken(virtualMachineParser.DEC, 0); }
		public TerminalNode SC() { return getToken(virtualMachineParser.SC, 0); }
		public DecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).enterDec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof virtualMachineListener ) ((virtualMachineListener)listener).exitDec(this);
		}
	}

	public final DecContext dec() throws RecognitionException {
		DecContext _localctx = new DecContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_dec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(216);
			num();
			setState(217);
			match(DEC);
			setState(219);
			_la = _input.LA(1);
			if (_la==SC) {
				{
				setState(218);
				match(SC);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 12:
			return math_sempred((MathContext)_localctx, predIndex);
		case 13:
			return term_sempred((TermContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_sempred(MathContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean term_sempred(TermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\"\u00e0\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\3\2\3\2\3\3\7\3,\n\3\f\3\16\3/\13\3\3\3\3\3\3\3\3"+
		"\3\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\3\4\3\4\3\5\3\5\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\5\5J\n\5\3\6\7\6M\n\6\f\6\16\6P\13\6\3\6\3\6\3\6"+
		"\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3"+
		"\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\5\tn\n\t\3\n\3\n\3\n\3\n\3\n\7\nu\n\n\f"+
		"\n\16\nx\13\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\7\13\u0081\n\13\f\13\16"+
		"\13\u0084\13\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\7\f\u008d\n\f\f\f\16\f\u0090"+
		"\13\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u009d\n\r\3\r\5"+
		"\r\u00a0\n\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u00a8\n\16\f\16\16\16"+
		"\u00ab\13\16\3\17\3\17\3\17\3\17\3\17\3\17\5\17\u00b3\n\17\3\17\3\17\3"+
		"\17\7\17\u00b8\n\17\f\17\16\17\u00bb\13\17\3\20\3\20\3\20\3\20\3\21\3"+
		"\21\5\21\u00c3\n\21\3\21\3\21\5\21\u00c7\n\21\3\21\3\21\3\21\3\21\5\21"+
		"\u00cd\n\21\3\22\3\22\5\22\u00d1\n\22\3\22\5\22\u00d4\n\22\3\23\3\23\3"+
		"\23\5\23\u00d9\n\23\3\24\3\24\3\24\5\24\u00de\n\24\3\24\2\4\32\34\25\2"+
		"\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&\2\4\3\2\27\30\4\2\30\30\35"+
		"\35\u00e9\2(\3\2\2\2\4-\3\2\2\2\6\64\3\2\2\2\bI\3\2\2\2\nN\3\2\2\2\fX"+
		"\3\2\2\2\16`\3\2\2\2\20f\3\2\2\2\22o\3\2\2\2\24{\3\2\2\2\26\u0087\3\2"+
		"\2\2\30\u009c\3\2\2\2\32\u00a1\3\2\2\2\34\u00b2\3\2\2\2\36\u00bc\3\2\2"+
		"\2 \u00cc\3\2\2\2\"\u00d3\3\2\2\2$\u00d5\3\2\2\2&\u00da\3\2\2\2()\5\4"+
		"\3\2)\3\3\2\2\2*,\7\t\2\2+*\3\2\2\2,/\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\60"+
		"\3\2\2\2/-\3\2\2\2\60\61\7\5\2\2\61\62\7\b\2\2\62\63\5\6\4\2\63\5\3\2"+
		"\2\2\64\65\7\n\2\2\65;\7\4\2\2\66\67\5\b\5\2\678\7\4\2\28:\3\2\2\29\66"+
		"\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<>\3\2\2\2=;\3\2\2\2>?\7\13\2\2"+
		"?\7\3\2\2\2@J\5\4\3\2AJ\5\n\6\2BJ\5\32\16\2CJ\5\16\b\2DJ\5\f\7\2EJ\5\20"+
		"\t\2FJ\5\30\r\2GJ\5$\23\2HJ\5&\24\2I@\3\2\2\2IA\3\2\2\2IB\3\2\2\2IC\3"+
		"\2\2\2ID\3\2\2\2IE\3\2\2\2IF\3\2\2\2IG\3\2\2\2IH\3\2\2\2J\t\3\2\2\2KM"+
		"\7\t\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OQ\3\2\2\2PN\3\2\2\2Q"+
		"R\7\17\2\2RS\7\6\2\2ST\7\f\2\2TU\7\7\2\2UV\7\r\2\2VW\5\6\4\2W\13\3\2\2"+
		"\2XY\7\20\2\2YZ\7\f\2\2Z[\5\30\r\2[\\\5\36\20\2\\]\5$\23\2]^\7\r\2\2^"+
		"_\5\6\4\2_\r\3\2\2\2`a\7\21\2\2ab\7\f\2\2bc\5\36\20\2cd\7\r\2\2de\5\24"+
		"\13\2e\17\3\2\2\2fg\7\22\2\2gh\7\f\2\2hi\5\36\20\2ij\7\r\2\2jm\5\22\n"+
		"\2kl\7\23\2\2ln\5\26\f\2mk\3\2\2\2mn\3\2\2\2n\21\3\2\2\2op\7\n\2\2pv\7"+
		"\4\2\2qr\5\b\5\2rs\7\4\2\2su\3\2\2\2tq\3\2\2\2ux\3\2\2\2vt\3\2\2\2vw\3"+
		"\2\2\2wy\3\2\2\2xv\3\2\2\2yz\7\13\2\2z\23\3\2\2\2{|\7\n\2\2|\u0082\7\4"+
		"\2\2}~\5\b\5\2~\177\7\4\2\2\177\u0081\3\2\2\2\u0080}\3\2\2\2\u0081\u0084"+
		"\3\2\2\2\u0082\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083\u0085\3\2\2\2\u0084"+
		"\u0082\3\2\2\2\u0085\u0086\7\13\2\2\u0086\25\3\2\2\2\u0087\u0088\7\n\2"+
		"\2\u0088\u008e\7\4\2\2\u0089\u008a\5\b\5\2\u008a\u008b\7\4\2\2\u008b\u008d"+
		"\3\2\2\2\u008c\u0089\3\2\2\2\u008d\u0090\3\2\2\2\u008e\u008c\3\2\2\2\u008e"+
		"\u008f\3\2\2\2\u008f\u0091\3\2\2\2\u0090\u008e\3\2\2\2\u0091\u0092\7\13"+
		"\2\2\u0092\27\3\2\2\2\u0093\u0094\7\16\2\2\u0094\u009d\7\25\2\2\u0095"+
		"\u0096\7\16\2\2\u0096\u0097\7\25\2\2\u0097\u0098\7\26\2\2\u0098\u009d"+
		"\5\32\16\2\u0099\u009a\7\25\2\2\u009a\u009b\7\26\2\2\u009b\u009d\5\32"+
		"\16\2\u009c\u0093\3\2\2\2\u009c\u0095\3\2\2\2\u009c\u0099\3\2\2\2\u009d"+
		"\u009f\3\2\2\2\u009e\u00a0\7\3\2\2\u009f\u009e\3\2\2\2\u009f\u00a0\3\2"+
		"\2\2\u00a0\31\3\2\2\2\u00a1\u00a2\b\16\1\2\u00a2\u00a3\5\34\17\2\u00a3"+
		"\u00a9\3\2\2\2\u00a4\u00a5\f\4\2\2\u00a5\u00a6\t\2\2\2\u00a6\u00a8\5\32"+
		"\16\5\u00a7\u00a4\3\2\2\2\u00a8\u00ab\3\2\2\2\u00a9\u00a7\3\2\2\2\u00a9"+
		"\u00aa\3\2\2\2\u00aa\33\3\2\2\2\u00ab\u00a9\3\2\2\2\u00ac\u00ad\b\17\1"+
		"\2\u00ad\u00b3\5 \21\2\u00ae\u00af\7\f\2\2\u00af\u00b0\5\32\16\2\u00b0"+
		"\u00b1\7\r\2\2\u00b1\u00b3\3\2\2\2\u00b2\u00ac\3\2\2\2\u00b2\u00ae\3\2"+
		"\2\2\u00b3\u00b9\3\2\2\2\u00b4\u00b5\f\3\2\2\u00b5\u00b6\7\31\2\2\u00b6"+
		"\u00b8\5 \21\2\u00b7\u00b4\3\2\2\2\u00b8\u00bb\3\2\2\2\u00b9\u00b7\3\2"+
		"\2\2\u00b9\u00ba\3\2\2\2\u00ba\35\3\2\2\2\u00bb\u00b9\3\2\2\2\u00bc\u00bd"+
		"\5\"\22\2\u00bd\u00be\7\32\2\2\u00be\u00bf\5\"\22\2\u00bf\37\3\2\2\2\u00c0"+
		"\u00cd\7\24\2\2\u00c1\u00c3\7\30\2\2\u00c2\u00c1\3\2\2\2\u00c2\u00c3\3"+
		"\2\2\2\u00c3\u00c4\3\2\2\2\u00c4\u00cd\7\25\2\2\u00c5\u00c7\7\30\2\2\u00c6"+
		"\u00c5\3\2\2\2\u00c6\u00c7\3\2\2\2\u00c7\u00c8\3\2\2\2\u00c8\u00c9\7\f"+
		"\2\2\u00c9\u00ca\5\32\16\2\u00ca\u00cb\7\r\2\2\u00cb\u00cd\3\2\2\2\u00cc"+
		"\u00c0\3\2\2\2\u00cc\u00c2\3\2\2\2\u00cc\u00c6\3\2\2\2\u00cd!\3\2\2\2"+
		"\u00ce\u00d4\7\24\2\2\u00cf\u00d1\t\3\2\2\u00d0\u00cf\3\2\2\2\u00d0\u00d1"+
		"\3\2\2\2\u00d1\u00d2\3\2\2\2\u00d2\u00d4\7\25\2\2\u00d3\u00ce\3\2\2\2"+
		"\u00d3\u00d0\3\2\2\2\u00d4#\3\2\2\2\u00d5\u00d6\5 \21\2\u00d6\u00d8\7"+
		" \2\2\u00d7\u00d9\7\3\2\2\u00d8\u00d7\3\2\2\2\u00d8\u00d9\3\2\2\2\u00d9"+
		"%\3\2\2\2\u00da\u00db\5 \21\2\u00db\u00dd\7!\2\2\u00dc\u00de\7\3\2\2\u00dd"+
		"\u00dc\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\'\3\2\2\2\26-;INmv\u0082\u008e"+
		"\u009c\u009f\u00a9\u00b2\u00b9\u00c2\u00c6\u00cc\u00d0\u00d3\u00d8\u00dd";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}