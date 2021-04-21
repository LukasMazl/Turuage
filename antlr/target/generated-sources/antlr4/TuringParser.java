// Generated from Turing.g4 by ANTLR 4.7.1
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
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, L=7, R=8, TAPE=9, ACCEPT=10, 
		REJECT=11, STATE=12, ASSIGN=13, OPEN_BRACKET=14, CLOSE_BRACKET=15, COMMA=16, 
		TURING_FUNCTION=17, EMPTY_VALUE=18, ALL_STATES=19, STRING=20, TapeValue=21, 
		Identifier=22, COMMENT=23, LINE_COMMENT=24, WS=25;
	public static final int
		RULE_root_rule = 0, RULE_tape_statement = 1, RULE_accept_statement = 2, 
		RULE_reject_statement = 3, RULE_array = 4, RULE_state_statement = 5, RULE_state_array = 6, 
		RULE_tape_move = 7, RULE_tape_value = 8, RULE_state = 9, RULE_turing_function = 10, 
		RULE_transition_operator = 11;
	public static final String[] ruleNames = {
		"root_rule", "tape_statement", "accept_statement", "reject_statement", 
		"array", "state_statement", "state_array", "tape_move", "tape_value", 
		"state", "turing_function", "transition_operator"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'|'", "'}'", "'('", "')'", "'->'", "'L'", "'R'", "'Tape'", 
		"'Accept'", "'Reject'", "'State'", "'='", "'['", "']'", "','", "'Turing'", 
		"'' ''", "'*'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, "L", "R", "TAPE", "ACCEPT", 
		"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA", 
		"TURING_FUNCTION", "EMPTY_VALUE", "ALL_STATES", "STRING", "TapeValue", 
		"Identifier", "COMMENT", "LINE_COMMENT", "WS"
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
		public List<Tape_statementContext> tape_statement() {
			return getRuleContexts(Tape_statementContext.class);
		}
		public Tape_statementContext tape_statement(int i) {
			return getRuleContext(Tape_statementContext.class,i);
		}
		public List<Accept_statementContext> accept_statement() {
			return getRuleContexts(Accept_statementContext.class);
		}
		public Accept_statementContext accept_statement(int i) {
			return getRuleContext(Accept_statementContext.class,i);
		}
		public List<Reject_statementContext> reject_statement() {
			return getRuleContexts(Reject_statementContext.class);
		}
		public Reject_statementContext reject_statement(int i) {
			return getRuleContext(Reject_statementContext.class,i);
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
	}

	public final Root_ruleContext root_rule() throws RecognitionException {
		Root_ruleContext _localctx = new Root_ruleContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_root_rule);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(25); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(24);
				tape_statement();
				}
				}
				setState(27); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==TAPE );
			setState(30); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(29);
				accept_statement();
				}
				}
				setState(32); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ACCEPT );
			setState(37);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==REJECT) {
				{
				{
				setState(34);
				reject_statement();
				}
				}
				setState(39);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(43);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==STATE) {
				{
				{
				setState(40);
				state_statement();
				}
				}
				setState(45);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(49);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==TURING_FUNCTION) {
				{
				{
				setState(46);
				turing_function();
				}
				}
				setState(51);
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
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterTape_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitTape_statement(this);
		}
	}

	public final Tape_statementContext tape_statement() throws RecognitionException {
		Tape_statementContext _localctx = new Tape_statementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tape_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			match(TAPE);
			setState(53);
			match(Identifier);
			setState(54);
			match(ASSIGN);
			setState(55);
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
	}

	public final Accept_statementContext accept_statement() throws RecognitionException {
		Accept_statementContext _localctx = new Accept_statementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_accept_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(57);
			match(ACCEPT);
			setState(58);
			match(Identifier);
			setState(59);
			match(ASSIGN);
			setState(60);
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
	}

	public final Reject_statementContext reject_statement() throws RecognitionException {
		Reject_statementContext _localctx = new Reject_statementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_reject_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(62);
			match(REJECT);
			setState(63);
			match(Identifier);
			setState(64);
			match(ASSIGN);
			setState(65);
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
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_array);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(67);
			match(OPEN_BRACKET);
			setState(68);
			match(Identifier);
			setState(73);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			while ( _alt!=1 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1+1 ) {
					{
					{
					setState(69);
					match(COMMA);
					setState(70);
					match(Identifier);
					}
					} 
				}
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,5,_ctx);
			}
			setState(76);
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
	}

	public final State_statementContext state_statement() throws RecognitionException {
		State_statementContext _localctx = new State_statementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_state_statement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(78);
			match(STATE);
			setState(79);
			match(Identifier);
			setState(80);
			match(ASSIGN);
			setState(81);
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
	}

	public final State_arrayContext state_array() throws RecognitionException {
		State_arrayContext _localctx = new State_arrayContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_state_array);
		int _la;
		try {
			setState(96);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				match(T__0);
				setState(84);
				state();
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__1) {
					{
					{
					setState(85);
					match(T__1);
					setState(86);
					state();
					}
					}
					setState(91);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(92);
				match(T__2);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				match(T__0);
				setState(95);
				match(T__2);
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

	public static class Tape_moveContext extends ParserRuleContext {
		public TerminalNode R() { return getToken(TuringParser.R, 0); }
		public TerminalNode L() { return getToken(TuringParser.L, 0); }
		public Tape_moveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape_move; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterTape_move(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitTape_move(this);
		}
	}

	public final Tape_moveContext tape_move() throws RecognitionException {
		Tape_moveContext _localctx = new Tape_moveContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tape_move);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
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

	public static class Tape_valueContext extends ParserRuleContext {
		public TerminalNode TapeValue() { return getToken(TuringParser.TapeValue, 0); }
		public TerminalNode EMPTY_VALUE() { return getToken(TuringParser.EMPTY_VALUE, 0); }
		public Tape_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tape_value; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterTape_value(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitTape_value(this);
		}
	}

	public final Tape_valueContext tape_value() throws RecognitionException {
		Tape_valueContext _localctx = new Tape_valueContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_tape_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(100);
			_la = _input.LA(1);
			if ( !(_la==EMPTY_VALUE || _la==TapeValue) ) {
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
		public List<Tape_valueContext> tape_value() {
			return getRuleContexts(Tape_valueContext.class);
		}
		public Tape_valueContext tape_value(int i) {
			return getRuleContext(Tape_valueContext.class,i);
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
			if ( listener instanceof TuringListener ) ((TuringListener)listener).enterState(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TuringListener ) ((TuringListener)listener).exitState(this);
		}
	}

	public final StateContext state() throws RecognitionException {
		StateContext _localctx = new StateContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_state);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			tape_value();
			setState(103);
			transition_operator();
			setState(104);
			tape_value();
			setState(105);
			match(COMMA);
			setState(106);
			tape_move();
			setState(107);
			match(COMMA);
			setState(108);
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
		public TerminalNode ALL_STATES() { return getToken(TuringParser.ALL_STATES, 0); }
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
	}

	public final Turing_functionContext turing_function() throws RecognitionException {
		Turing_functionContext _localctx = new Turing_functionContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_turing_function);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(TURING_FUNCTION);
			setState(111);
			match(T__3);
			setState(112);
			match(Identifier);
			setState(113);
			match(COMMA);
			setState(114);
			match(Identifier);
			setState(115);
			match(COMMA);
			setState(116);
			match(Identifier);
			setState(117);
			match(COMMA);
			setState(120);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==Identifier) {
				{
				setState(118);
				match(Identifier);
				setState(119);
				match(COMMA);
				}
			}

			setState(124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_BRACKET:
				{
				setState(122);
				array();
				}
				break;
			case ALL_STATES:
				{
				setState(123);
				match(ALL_STATES);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(126);
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
	}

	public final Transition_operatorContext transition_operator() throws RecognitionException {
		Transition_operatorContext _localctx = new Transition_operatorContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_transition_operator);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\33\u0085\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\3\2\6\2\34\n\2\r\2\16\2\35\3\2\6\2!\n\2\r\2\16\2"+
		"\"\3\2\7\2&\n\2\f\2\16\2)\13\2\3\2\7\2,\n\2\f\2\16\2/\13\2\3\2\7\2\62"+
		"\n\2\f\2\16\2\65\13\2\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\6\3\6\3\6\3\6\7\6J\n\6\f\6\16\6M\13\6\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\7\bZ\n\b\f\b\16\b]\13\b\3\b\3\b\3\b\3\b\5\b"+
		"c\n\b\3\t\3\t\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\5\f{\n\f\3\f\3\f\5\f\177\n\f\3\f\3\f"+
		"\3\r\3\r\3\r\3K\2\16\2\4\6\b\n\f\16\20\22\24\26\30\2\4\3\2\t\n\4\2\24"+
		"\24\27\27\2\u0082\2\33\3\2\2\2\4\66\3\2\2\2\6;\3\2\2\2\b@\3\2\2\2\nE\3"+
		"\2\2\2\fP\3\2\2\2\16b\3\2\2\2\20d\3\2\2\2\22f\3\2\2\2\24h\3\2\2\2\26p"+
		"\3\2\2\2\30\u0082\3\2\2\2\32\34\5\4\3\2\33\32\3\2\2\2\34\35\3\2\2\2\35"+
		"\33\3\2\2\2\35\36\3\2\2\2\36 \3\2\2\2\37!\5\6\4\2 \37\3\2\2\2!\"\3\2\2"+
		"\2\" \3\2\2\2\"#\3\2\2\2#\'\3\2\2\2$&\5\b\5\2%$\3\2\2\2&)\3\2\2\2\'%\3"+
		"\2\2\2\'(\3\2\2\2(-\3\2\2\2)\'\3\2\2\2*,\5\f\7\2+*\3\2\2\2,/\3\2\2\2-"+
		"+\3\2\2\2-.\3\2\2\2.\63\3\2\2\2/-\3\2\2\2\60\62\5\26\f\2\61\60\3\2\2\2"+
		"\62\65\3\2\2\2\63\61\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\63\3\2\2\2"+
		"\66\67\7\13\2\2\678\7\30\2\289\7\17\2\29:\7\26\2\2:\5\3\2\2\2;<\7\f\2"+
		"\2<=\7\30\2\2=>\7\17\2\2>?\5\n\6\2?\7\3\2\2\2@A\7\r\2\2AB\7\30\2\2BC\7"+
		"\17\2\2CD\5\n\6\2D\t\3\2\2\2EF\7\20\2\2FK\7\30\2\2GH\7\22\2\2HJ\7\30\2"+
		"\2IG\3\2\2\2JM\3\2\2\2KL\3\2\2\2KI\3\2\2\2LN\3\2\2\2MK\3\2\2\2NO\7\21"+
		"\2\2O\13\3\2\2\2PQ\7\16\2\2QR\7\30\2\2RS\7\17\2\2ST\5\16\b\2T\r\3\2\2"+
		"\2UV\7\3\2\2V[\5\24\13\2WX\7\4\2\2XZ\5\24\13\2YW\3\2\2\2Z]\3\2\2\2[Y\3"+
		"\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^_\7\5\2\2_c\3\2\2\2`a\7\3\2\2a"+
		"c\7\5\2\2bU\3\2\2\2b`\3\2\2\2c\17\3\2\2\2de\t\2\2\2e\21\3\2\2\2fg\t\3"+
		"\2\2g\23\3\2\2\2hi\5\22\n\2ij\5\30\r\2jk\5\22\n\2kl\7\22\2\2lm\5\20\t"+
		"\2mn\7\22\2\2no\7\30\2\2o\25\3\2\2\2pq\7\23\2\2qr\7\6\2\2rs\7\30\2\2s"+
		"t\7\22\2\2tu\7\30\2\2uv\7\22\2\2vw\7\30\2\2wz\7\22\2\2xy\7\30\2\2y{\7"+
		"\22\2\2zx\3\2\2\2z{\3\2\2\2{~\3\2\2\2|\177\5\n\6\2}\177\7\25\2\2~|\3\2"+
		"\2\2~}\3\2\2\2\177\u0080\3\2\2\2\u0080\u0081\7\7\2\2\u0081\27\3\2\2\2"+
		"\u0082\u0083\7\b\2\2\u0083\31\3\2\2\2\f\35\"\'-\63K[bz~";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}