package cz.tul.prk.antlr4;// Generated from Turing.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.ParserATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.tree.ParseTreeListener;
import org.antlr.v4.runtime.tree.TerminalNode;

import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, L=7, R=8, TAPE=9, ACCEPT=10,
		REJECT=11, STATE=12, ASSIGN=13, OPEN_BRACKET=14, CLOSE_BRACKET=15, COMMA=16,
		TURING_FUNCTION=17, STRING=18, TapeValue=19, Identifier=20, COMMENT=21,
		LINE_COMMENT=22, WS=23;
	public static final int
		RULE_root_rule = 0, RULE_tape_statement = 1, RULE_accept_statement = 2,
		RULE_reject_statement = 3, RULE_array = 4, RULE_state_statement = 5, RULE_state_array = 6,
		RULE_tape_move = 7, RULE_state = 8, RULE_turing_function = 9, RULE_transition_operator = 10;
	public static final String[] ruleNames = {
		"root_rule", "tape_statement", "accept_statement", "reject_statement",
		"array", "state_statement", "state_array", "tape_move", "state", "turing_function",
		"transition_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'|'", "'}'", "'('", "')'", "'->'", "'L'", "'R'", "'Tape'",
		"'Accept'", "'Reject'", "'State'", "'='", "'['", "']'", "','", "'Turing'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "L", "R", "TAPE", "ACCEPT",
		"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA",
		"TURING_FUNCTION", "STRING", "TapeValue", "Identifier", "COMMENT", "LINE_COMMENT",
		"WS"
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
		public Tape_statementContext tape_statement() {
			return getRuleContext(Tape_statementContext.class,0);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterRoot_rule(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitRoot_rule(this);
		}
	}

	public final Root_ruleContext root_rule() throws RecognitionException {
		Root_ruleContext _localctx = new Root_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22);
			tape_statement();
			setState(23);
			accept_statement();
			setState(25);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REJECT) {
				{
				setState(24);
				reject_statement();
				}
			}

			setState(30);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATE) {
				{
				{
				setState(27);
				state_statement();
				}
				}
				setState(32);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(36);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TURING_FUNCTION) {
				{
				{
				setState(33);
				turing_function();
				}
				}
				setState(38);
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

	public static class Tape_statementContext extends ParserRuleContext {
		public TerminalNode TAPE() { return getToken(TuringParser.TAPE, 0); }
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public TerminalNode ASSIGN() { return getToken(TuringParser.ASSIGN, 0); }
		public TerminalNode STRING() { return getToken(TuringParser.STRING, 0); }
		public Tape_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterTape_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitTape_statement(this);
		}
	}

	public final Tape_statementContext tape_statement() throws RecognitionException {
		Tape_statementContext _localctx = new Tape_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tape_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(39);
			match(TAPE);
			setState(40);
			match(Identifier);
			setState(41);
			match(ASSIGN);
			setState(42);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterAccept_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitAccept_statement(this);
		}
	}

	public final Accept_statementContext accept_statement() throws RecognitionException {
		Accept_statementContext _localctx = new Accept_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accept_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(44);
			match(ACCEPT);
			setState(45);
			match(Identifier);
			setState(46);
			match(ASSIGN);
			setState(47);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterReject_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitReject_statement(this);
		}
	}

	public final Reject_statementContext reject_statement() throws RecognitionException {
		Reject_statementContext _localctx = new Reject_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reject_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(49);
			match(REJECT);
			setState(50);
			match(Identifier);
			setState(51);
			match(ASSIGN);
			setState(52);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(54);
			match(OPEN_BRACKET);
			setState(55);
			match(Identifier);
			setState(60);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			while ( _alt!=1 && _alt!= ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(56);
					match(COMMA);
					setState(57);
					match(Identifier);
					}
					}
				}
				setState(62);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
			}
			setState(63);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterState_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitState_statement(this);
		}
	}

	public final State_statementContext state_statement() throws RecognitionException {
		State_statementContext _localctx = new State_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			match(STATE);
			setState(66);
			match(Identifier);
			setState(67);
			match(ASSIGN);
			setState(68);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterState_array(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitState_array(this);
		}
	}

	public final State_arrayContext state_array() throws RecognitionException {
		State_arrayContext _localctx = new State_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_array);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(70);
			match(T__0);
			setState(71);
			state();
			setState(76);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__1) {
				{
				{
				setState(72);
				match(T__1);
				setState(73);
				state();
				}
				}
				setState(78);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(79);
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

	public static class Tape_moveContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(TuringParser.R, 0); }
		public TerminalNode L() { return getToken(TuringParser.L, 0); }
		public Tape_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterTape_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitTape_move(this);
		}
	}

	public final Tape_moveContext tape_move() throws RecognitionException {
		Tape_moveContext _localctx = new Tape_moveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tape_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			_la = _input.LA(1);
			if ( !(_la==L || _la==R) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
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

	public static class StateContext extends ParserRuleContext {
		public List<TerminalNode> TapeValue() { return getTokens(TuringParser.TapeValue); }
		public TerminalNode TapeValue(int i) {
			return getToken(TuringParser.TapeValue, i);
		}
		public Transition_operatorContext transition_operator() {
			return getRuleContext(Transition_operatorContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(TuringParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TuringParser.COMMA, i);
		}
		public Tape_moveContext tape_move() {
			return getRuleContext(Tape_moveContext.class,0);
		}
		public TerminalNode Identifier() { return getToken(TuringParser.Identifier, 0); }
		public StateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_state; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(83);
			match(TapeValue);
			setState(84);
			transition_operator();
			setState(85);
			match(TapeValue);
			setState(86);
			match(COMMA);
			setState(87);
			tape_move();
			setState(88);
			match(COMMA);
			setState(89);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterTuring_function(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitTuring_function(this);
		}
	}

	public final Turing_functionContext turing_function() throws RecognitionException {
		Turing_functionContext _localctx = new Turing_functionContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_turing_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			match(TURING_FUNCTION);
			setState(92);
			match(T__3);
			setState(93);
			match(Identifier);
			setState(94);
			match(COMMA);
			setState(95);
			match(Identifier);
			setState(96);
			match(COMMA);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(97);
				match(Identifier);
				setState(98);
				match(COMMA);
				}
			}

			setState(101);
			array();
			setState(102);
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
			if ( listener instanceof TuringListener) ((TuringListener)listener).enterTransition_operator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener) ((TuringListener)listener).exitTransition_operator(this);
		}
	}

	public final Transition_operatorContext transition_operator() throws RecognitionException {
		Transition_operatorContext _localctx = new Transition_operatorContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_transition_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(104);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\31m\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t\13\4"+
		"\f\t\f\3\2\3\2\3\2\5\2\34\n\2\3\2\7\2\37\n\2\f\2\16\2\"\13\2\3\2\7\2%"+
		"\n\2\f\2\16\2(\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5\3"+
		"\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6=\n\6\f\6\16\6@\13\6\3\6\3\6\3\7\3\7\3\7"+
		"\3\7\3\7\3\b\3\b\3\b\3\b\7\bM\n\b\f\b\16\bP\13\b\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\5\13"+
		"f\n\13\3\13\3\13\3\13\3\f\3\f\3\f\3>\2\r\2\4\6\b\n\f\16\20\22\24\26\2"+
		"\3\3\2\t\n\2g\2\30\3\2\2\2\4)\3\2\2\2\6.\3\2\2\2\b\63\3\2\2\2\n8\3\2\2"+
		"\2\fC\3\2\2\2\16H\3\2\2\2\20S\3\2\2\2\22U\3\2\2\2\24]\3\2\2\2\26j\3\2"+
		"\2\2\30\31\5\4\3\2\31\33\5\6\4\2\32\34\5\b\5\2\33\32\3\2\2\2\33\34\3\2"+
		"\2\2\34 \3\2\2\2\35\37\5\f\7\2\36\35\3\2\2\2\37\"\3\2\2\2 \36\3\2\2\2"+
		" !\3\2\2\2!&\3\2\2\2\" \3\2\2\2#%\5\24\13\2$#\3\2\2\2%(\3\2\2\2&$\3\2"+
		"\2\2&\'\3\2\2\2\'\3\3\2\2\2(&\3\2\2\2)*\7\13\2\2*+\7\26\2\2+,\7\17\2\2"+
		",-\7\24\2\2-\5\3\2\2\2./\7\f\2\2/\60\7\26\2\2\60\61\7\17\2\2\61\62\5\n"+
		"\6\2\62\7\3\2\2\2\63\64\7\r\2\2\64\65\7\26\2\2\65\66\7\17\2\2\66\67\5"+
		"\n\6\2\67\t\3\2\2\289\7\20\2\29>\7\26\2\2:;\7\22\2\2;=\7\26\2\2<:\3\2"+
		"\2\2=@\3\2\2\2>?\3\2\2\2><\3\2\2\2?A\3\2\2\2@>\3\2\2\2AB\7\21\2\2B\13"+
		"\3\2\2\2CD\7\16\2\2DE\7\26\2\2EF\7\17\2\2FG\5\16\b\2G\r\3\2\2\2HI\7\3"+
		"\2\2IN\5\22\n\2JK\7\4\2\2KM\5\22\n\2LJ\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3"+
		"\2\2\2OQ\3\2\2\2PN\3\2\2\2QR\7\5\2\2R\17\3\2\2\2ST\t\2\2\2T\21\3\2\2\2"+
		"UV\7\25\2\2VW\5\26\f\2WX\7\25\2\2XY\7\22\2\2YZ\5\20\t\2Z[\7\22\2\2[\\"+
		"\7\26\2\2\\\23\3\2\2\2]^\7\23\2\2^_\7\6\2\2_`\7\26\2\2`a\7\22\2\2ab\7"+
		"\26\2\2be\7\22\2\2cd\7\26\2\2df\7\22\2\2ec\3\2\2\2ef\3\2\2\2fg\3\2\2\2"+
		"gh\5\n\6\2hi\7\7\2\2i\25\3\2\2\2jk\7\b\2\2k\27\3\2\2\2\b\33 &>Ne";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
