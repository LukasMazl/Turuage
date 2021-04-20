// Generated from C:/Work/antlr/src/main/antlr4\Turing.g4 by ANTLR 4.9
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, L=7, R=8, PASKA=9, ACCEPT=10, 
		REJECT=11, STATE=12, ASSIGN=13, OPEN_BRACKET=14, CLOSE_BRACKET=15, COMMA=16, 
		TURING_FUNCTION=17, STRING=18, ReadingValue=19, Identifier=20, COMMENT=21, 
		LINE_COMMENT=22, WS=23;
	public static final int
		RULE_root_rule = 0, RULE_paska_statement = 1, RULE_accept_statement = 2, 
		RULE_reject_statement = 3, RULE_array = 4, RULE_state_statement = 5, RULE_state_array = 6, 
		RULE_state = 7, RULE_turing_function = 8, RULE_transition_operator = 9;
	private static String[] makeRuleNames() {
		return new String[] {
			"root_rule", "paska_statement", "accept_statement", "reject_statement", 
			"array", "state_statement", "state_array", "state", "turing_function", 
			"transition_operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'{'", "'|'", "'}'", "'('", "')'", "'->'", "'L'", "'R'", "'Paska'", 
			"'Accept'", "'Reject'", "'State'", "'='", "'['", "']'", "','", "'Turing'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, "L", "R", "PASKA", "ACCEPT", 
			"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", 
			"TURING_FUNCTION", "STRING", "ReadingValue", "Identifier", "COMMENT", 
			"LINE_COMMENT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "Turing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TuringParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class Root_ruleContext extends ParserRuleContext {
		public Paska_statementContext paska_statement() {
			return getRuleContext(Paska_statementContext.class,0);
		}
		public Accept_statementContext accept_statement() {
			return getRuleContext(Accept_statementContext.class,0);
		}
		public Reject_statementContext reject_statement() {
			return getRuleContext(Reject_statementContext.class,0);
		}
		public List<State_statementContext> state_statement() {
			return getRuleContexts(State_statementContext.class);
		}
		public State_statementContext state_statement(int i) {
			return getRuleContext(State_statementContext.class,i);
		}
		public List<Turing_functionContext> turing_function() {
			return getRuleContexts(Turing_functionContext.class);
		}
		public Turing_functionContext turing_function(int i) {
			return getRuleContext(Turing_functionContext.class,i);
		}
		public Root_ruleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_root_rule; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterRoot_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitRoot_rule(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitRoot_rule(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Root_ruleContext root_rule() throws RecognitionException {
		Root_ruleContext _localctx = new Root_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(20);
			paska_statement();
			setState(21);
			accept_statement();
			setState(23);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REJECT) {
				{
				setState(22);
				reject_statement();
				}
			}

			setState(28);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATE) {
				{
				{
				setState(25);
				state_statement();
				}
				}
				setState(30);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(34);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TURING_FUNCTION) {
				{
				{
				setState(31);
				turing_function();
				}
				}
				setState(36);
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

	public static class Paska_statementContext extends ParserRuleContext {
		public TerminalNode PASKA() { return getToken(TuringParser.PASKA, 0); }
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(TuringParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(TuringParser.STRING, 0); }
		public Paska_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_paska_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterPaska_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitPaska_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitPaska_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Paska_statementContext paska_statement() throws RecognitionException {
		Paska_statementContext _localctx = new Paska_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_paska_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37);
			match(PASKA);
			setState(38);
			match(Identifier);
			setState(39);
			match(ASSIGN);
			setState(40);
			match(STRING);
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

	public static class Accept_statementContext extends ParserRuleContext {
		public TerminalNode ACCEPT() { return getToken(TuringParser.ACCEPT, 0); }
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(TuringParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Accept_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accept_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterAccept_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitAccept_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitAccept_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Accept_statementContext accept_statement() throws RecognitionException {
		Accept_statementContext _localctx = new Accept_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accept_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(42);
			match(ACCEPT);
			setState(43);
			match(Identifier);
			setState(44);
			match(ASSIGN);
			setState(45);
			array();
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

	public static class Reject_statementContext extends ParserRuleContext {
		public TerminalNode REJECT() { return getToken(TuringParser.REJECT, 0); }
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(TuringParser.ASSIGN, 0); }
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Reject_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_reject_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterReject_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitReject_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitReject_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Reject_statementContext reject_statement() throws RecognitionException {
		Reject_statementContext _localctx = new Reject_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reject_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(47);
			match(REJECT);
			setState(48);
			match(Identifier);
			setState(49);
			match(ASSIGN);
			setState(50);
			array();
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

	public static class ArrayContext extends ParserRuleContext {
		public TerminalNode OPEN_BRACKET() { return getToken(TuringParser.OPEN_BRACKET, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TuringParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TuringParser.Identifier, i);
		}
		public TerminalNode CLOSE_BRACKET() { return getToken(TuringParser.CLOSE_BRACKET, 0); }
		public List<TerminalNode> COMMA() { return getTokens(TuringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TuringParser.COMMA, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(OPEN_BRACKET);
			setState(53);
			match(Identifier);
			setState(58);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(54);
					match(COMMA);
					setState(55);
					match(Identifier);
					}
					} 
				}
				setState(60);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(61);
			match(CLOSE_BRACKET);
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

	public static class State_statementContext extends ParserRuleContext {
		public TerminalNode STATE() { return getToken(TuringParser.STATE, 0); }
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(TuringParser.ASSIGN, 0); }
		public State_arrayContext state_array() {
			return getRuleContext(State_arrayContext.class,0);
		}
		public State_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterState_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitState_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitState_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_statementContext state_statement() throws RecognitionException {
		State_statementContext _localctx = new State_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(63);
			match(STATE);
			setState(64);
			match(Identifier);
			setState(65);
			match(ASSIGN);
			setState(66);
			state_array();
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

	public static class State_arrayContext extends ParserRuleContext {
		public List<StateContext> state() {
			return getRuleContexts(StateContext.class);
		}
		public StateContext state(int i) {
			return getRuleContext(StateContext.class,i);
		}
		public State_arrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterState_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitState_array(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitState_array(this);
			else return visitor.visitChildren(this);
		}
	}

	public final State_arrayContext state_array() throws RecognitionException {
		State_arrayContext _localctx = new State_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(68);
			match(T__0);
			setState(69);
			state();
			setState(74);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(70);
				match(T__1);
				setState(71);
				state();
				}
				}
				setState(76);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(77);
			match(T__2);
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

	public static class StateContext extends ParserRuleContext {
		public List<TerminalNode> ReadingValue() { return getTokens(TuringParser.ReadingValue); }
		public TerminalNode ReadingValue(int i) {
			return getToken(TuringParser.ReadingValue, i);
		}
		public Transition_operatorContext transition_operator() {
			return getRuleContext(Transition_operatorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TuringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TuringParser.COMMA, i);
		}
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode L() { return getToken(TuringParser.L, 0); }
		public TerminalNode R() { return getToken(TuringParser.R, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitState(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitState(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_state);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ReadingValue);
			setState(80);
			transition_operator();
			setState(81);
			match(ReadingValue);
			setState(82);
			match(COMMA);
			setState(83);
			_la = _input.LA(1);
			if ( !(_la==L || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(84);
			match(COMMA);
			setState(85);
			match(Identifier);
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

	public static class Turing_functionContext extends ParserRuleContext {
		public TerminalNode TURING_FUNCTION() { return getToken(TuringParser.TURING_FUNCTION, 0); }
		public List<TerminalNode> Identifier() { return getTokens(TuringParser.Identifier); }
		public TerminalNode Identifier(int i) {
			return getToken(TuringParser.Identifier, i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TuringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TuringParser.COMMA, i);
		}
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public Turing_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_turing_function; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterTuring_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitTuring_function(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitTuring_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Turing_functionContext turing_function() throws RecognitionException {
		Turing_functionContext _localctx = new Turing_functionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_turing_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(87);
			match(TURING_FUNCTION);
			setState(88);
			match(T__3);
			setState(89);
			match(Identifier);
			setState(90);
			match(COMMA);
			setState(91);
			match(Identifier);
			setState(92);
			match(COMMA);
			setState(95);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(93);
				match(Identifier);
				setState(94);
				match(COMMA);
				}
			}

			setState(97);
			array();
			setState(98);
			match(T__4);
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

	public static class Transition_operatorContext extends ParserRuleContext {
		public Transition_operatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transition_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterTransition_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitTransition_operator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof TuringVisitor ) return ((TuringVisitor<? extends T>)visitor).visitTransition_operator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Transition_operatorContext transition_operator() throws RecognitionException {
		Transition_operatorContext _localctx = new Transition_operatorContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_transition_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			match(T__5);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31i\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\3"+
		"\2\3\2\3\2\5\2\32\n\2\3\2\7\2\35\n\2\f\2\16\2 \13\2\3\2\7\2#\n\2\f\2\16"+
		"\2&\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3\5\3\5\3"+
		"\6\3\6\3\6\3\6\7\6;\n\6\f\6\16\6>\13\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3\b"+
		"\3\b\3\b\3\b\7\bK\n\b\f\b\16\bN\13\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\5\nb\n\n\3\n\3\n\3\n\3\13\3\13"+
		"\3\13\3<\2\f\2\4\6\b\n\f\16\20\22\24\2\3\3\2\t\n\2d\2\26\3\2\2\2\4\'\3"+
		"\2\2\2\6,\3\2\2\2\b\61\3\2\2\2\n\66\3\2\2\2\fA\3\2\2\2\16F\3\2\2\2\20"+
		"Q\3\2\2\2\22Y\3\2\2\2\24f\3\2\2\2\26\27\5\4\3\2\27\31\5\6\4\2\30\32\5"+
		"\b\5\2\31\30\3\2\2\2\31\32\3\2\2\2\32\36\3\2\2\2\33\35\5\f\7\2\34\33\3"+
		"\2\2\2\35 \3\2\2\2\36\34\3\2\2\2\36\37\3\2\2\2\37$\3\2\2\2 \36\3\2\2\2"+
		"!#\5\22\n\2\"!\3\2\2\2#&\3\2\2\2$\"\3\2\2\2$%\3\2\2\2%\3\3\2\2\2&$\3\2"+
		"\2\2\'(\7\13\2\2()\7\26\2\2)*\7\17\2\2*+\7\24\2\2+\5\3\2\2\2,-\7\f\2\2"+
		"-.\7\26\2\2./\7\17\2\2/\60\5\n\6\2\60\7\3\2\2\2\61\62\7\r\2\2\62\63\7"+
		"\26\2\2\63\64\7\17\2\2\64\65\5\n\6\2\65\t\3\2\2\2\66\67\7\20\2\2\67<\7"+
		"\26\2\289\7\22\2\29;\7\26\2\2:8\3\2\2\2;>\3\2\2\2<=\3\2\2\2<:\3\2\2\2"+
		"=?\3\2\2\2><\3\2\2\2?@\7\21\2\2@\13\3\2\2\2AB\7\16\2\2BC\7\26\2\2CD\7"+
		"\17\2\2DE\5\16\b\2E\r\3\2\2\2FG\7\3\2\2GL\5\20\t\2HI\7\4\2\2IK\5\20\t"+
		"\2JH\3\2\2\2KN\3\2\2\2LJ\3\2\2\2LM\3\2\2\2MO\3\2\2\2NL\3\2\2\2OP\7\5\2"+
		"\2P\17\3\2\2\2QR\7\25\2\2RS\5\24\13\2ST\7\25\2\2TU\7\22\2\2UV\t\2\2\2"+
		"VW\7\22\2\2WX\7\26\2\2X\21\3\2\2\2YZ\7\23\2\2Z[\7\6\2\2[\\\7\26\2\2\\"+
		"]\7\22\2\2]^\7\26\2\2^a\7\22\2\2_`\7\26\2\2`b\7\22\2\2a_\3\2\2\2ab\3\2"+
		"\2\2bc\3\2\2\2cd\5\n\6\2de\7\7\2\2e\23\3\2\2\2fg\7\b\2\2g\25\3\2\2\2\b"+
		"\31\36$<La";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}