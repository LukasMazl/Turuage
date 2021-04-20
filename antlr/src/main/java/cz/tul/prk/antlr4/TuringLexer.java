package cz.tul.prk.antlr4;// Generated from Turing.g4 by ANTLR 4.7.1

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.ATN;
import org.antlr.v4.runtime.atn.ATNDeserializer;
import org.antlr.v4.runtime.atn.LexerATNSimulator;
import org.antlr.v4.runtime.atn.PredictionContextCache;
import org.antlr.v4.runtime.dfa.DFA;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TuringLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, L=7, R=8, TAPE=9, ACCEPT=10,
		REJECT=11, STATE=12, ASSIGN=13, OPEN_BRACKET=14, CLOSE_BRACKET=15, COMMA=16,
		TURING_FUNCTION=17, STRING=18, TapeValue=19, Identifier=20, COMMENT=21,
		LINE_COMMENT=22, WS=23;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "L", "R", "TAPE", "ACCEPT",
		"REJECT", "STATE", "ASSIGN", "OPEN_BRACKET", "CLOSE_BRACKET", "COMMA",
		"TURING_FUNCTION", "STRING", "TapeValue", "Identifier", "TurringLetter",
		"COMMENT", "LINE_COMMENT", "WS"
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


	public TuringLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Turing.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\31\u00a2\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\7\3\b\3\b\3\t"+
		"\3\t\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3"+
		"\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\17\3\17\3\20\3"+
		"\20\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\7\23o\n\23"+
		"\f\23\16\23r\13\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\7\25|\n\25"+
		"\f\25\16\25\177\13\25\3\26\3\26\3\27\3\27\3\27\3\27\7\27\u0087\n\27\f"+
		"\27\16\27\u008a\13\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\7\30"+
		"\u0095\n\30\f\30\16\30\u0098\13\30\3\30\3\30\3\31\6\31\u009d\n\31\r\31"+
		"\16\31\u009e\3\31\3\31\3\u0088\2\32\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n"+
		"\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24\'\25)\26+\2-\27/"+
		"\30\61\31\3\2\5\7\2&&\62;C\\aac|\4\2\f\f\17\17\5\2\13\f\16\17\"\"\2\u00a5"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2"+
		"\2\2\3\63\3\2\2\2\5\65\3\2\2\2\7\67\3\2\2\2\t9\3\2\2\2\13;\3\2\2\2\r="+
		"\3\2\2\2\17@\3\2\2\2\21B\3\2\2\2\23D\3\2\2\2\25I\3\2\2\2\27P\3\2\2\2\31"+
		"W\3\2\2\2\33]\3\2\2\2\35_\3\2\2\2\37a\3\2\2\2!c\3\2\2\2#e\3\2\2\2%l\3"+
		"\2\2\2\'u\3\2\2\2)y\3\2\2\2+\u0080\3\2\2\2-\u0082\3\2\2\2/\u0090\3\2\2"+
		"\2\61\u009c\3\2\2\2\63\64\7}\2\2\64\4\3\2\2\2\65\66\7~\2\2\66\6\3\2\2"+
		"\2\678\7\177\2\28\b\3\2\2\29:\7*\2\2:\n\3\2\2\2;<\7+\2\2<\f\3\2\2\2=>"+
		"\7/\2\2>?\7@\2\2?\16\3\2\2\2@A\7N\2\2A\20\3\2\2\2BC\7T\2\2C\22\3\2\2\2"+
		"DE\7V\2\2EF\7c\2\2FG\7r\2\2GH\7g\2\2H\24\3\2\2\2IJ\7C\2\2JK\7e\2\2KL\7"+
		"e\2\2LM\7g\2\2MN\7r\2\2NO\7v\2\2O\26\3\2\2\2PQ\7T\2\2QR\7g\2\2RS\7l\2"+
		"\2ST\7g\2\2TU\7e\2\2UV\7v\2\2V\30\3\2\2\2WX\7U\2\2XY\7v\2\2YZ\7c\2\2Z"+
		"[\7v\2\2[\\\7g\2\2\\\32\3\2\2\2]^\7?\2\2^\34\3\2\2\2_`\7]\2\2`\36\3\2"+
		"\2\2ab\7_\2\2b \3\2\2\2cd\7.\2\2d\"\3\2\2\2ef\7V\2\2fg\7w\2\2gh\7t\2\2"+
		"hi\7k\2\2ij\7p\2\2jk\7i\2\2k$\3\2\2\2lp\7$\2\2mo\5+\26\2nm\3\2\2\2or\3"+
		"\2\2\2pn\3\2\2\2pq\3\2\2\2qs\3\2\2\2rp\3\2\2\2st\7$\2\2t&\3\2\2\2uv\7"+
		")\2\2vw\5+\26\2wx\7)\2\2x(\3\2\2\2y}\5+\26\2z|\5+\26\2{z\3\2\2\2|\177"+
		"\3\2\2\2}{\3\2\2\2}~\3\2\2\2~*\3\2\2\2\177}\3\2\2\2\u0080\u0081\t\2\2"+
		"\2\u0081,\3\2\2\2\u0082\u0083\7\61\2\2\u0083\u0084\7,\2\2\u0084\u0088"+
		"\3\2\2\2\u0085\u0087\13\2\2\2\u0086\u0085\3\2\2\2\u0087\u008a\3\2\2\2"+
		"\u0088\u0089\3\2\2\2\u0088\u0086\3\2\2\2\u0089\u008b\3\2\2\2\u008a\u0088"+
		"\3\2\2\2\u008b\u008c\7,\2\2\u008c\u008d\7\61\2\2\u008d\u008e\3\2\2\2\u008e"+
		"\u008f\b\27\2\2\u008f.\3\2\2\2\u0090\u0091\7\61\2\2\u0091\u0092\7\61\2"+
		"\2\u0092\u0096\3\2\2\2\u0093\u0095\n\3\2\2\u0094\u0093\3\2\2\2\u0095\u0098"+
		"\3\2\2\2\u0096\u0094\3\2\2\2\u0096\u0097\3\2\2\2\u0097\u0099\3\2\2\2\u0098"+
		"\u0096\3\2\2\2\u0099\u009a\b\30\2\2\u009a\60\3\2\2\2\u009b\u009d\t\4\2"+
		"\2\u009c\u009b\3\2\2\2\u009d\u009e\3\2\2\2\u009e\u009c\3\2\2\2\u009e\u009f"+
		"\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0\u00a1\b\31\2\2\u00a1\62\3\2\2\2\b\2"+
		"p}\u0088\u0096\u009e\3\2\3\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}
