// Generated from C:/Users/student/Documents/Projects/XML2JSON/src/main/java/org/example\GQ.g4 by ANTLR 4.12.0
package org.example;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class GQ extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		STRELKA=1, DOT=2, LPARENTHESIS=3, RPARENTHESIS=4, ASTRING=5, WS=6;
	public static final int
		RULE_start = 0, RULE_left = 1, RULE_right = 2;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "left", "right"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'->'", "'.'", "'('", "')'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "STRELKA", "DOT", "LPARENTHESIS", "RPARENTHESIS", "ASTRING", "WS"
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
	public String getGrammarFileName() { return "GQ.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public GQ(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StartContext extends ParserRuleContext {
		public LeftContext left() {
			return getRuleContext(LeftContext.class,0);
		}
		public TerminalNode STRELKA() { return getToken(GQ.STRELKA, 0); }
		public RightContext right() {
			return getRuleContext(RightContext.class,0);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GQVisitor ) return ((GQVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(6);
			left();
			setState(7);
			match(STRELKA);
			setState(8);
			right();
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

	@SuppressWarnings("CheckReturnValue")
	public static class LeftContext extends ParserRuleContext {
		public List<TerminalNode> ASTRING() { return getTokens(GQ.ASTRING); }
		public TerminalNode ASTRING(int i) {
			return getToken(GQ.ASTRING, i);
		}
		public List<TerminalNode> DOT() { return getTokens(GQ.DOT); }
		public TerminalNode DOT(int i) {
			return getToken(GQ.DOT, i);
		}
		public LeftContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).enterLeft(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).exitLeft(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GQVisitor ) return ((GQVisitor<? extends T>)visitor).visitLeft(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeftContext left() throws RecognitionException {
		LeftContext _localctx = new LeftContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_left);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			match(ASTRING);
			setState(11);
			match(DOT);
			setState(12);
			match(ASTRING);
			setState(13);
			match(DOT);
			setState(14);
			match(ASTRING);
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

	@SuppressWarnings("CheckReturnValue")
	public static class RightContext extends ParserRuleContext {
		public List<TerminalNode> ASTRING() { return getTokens(GQ.ASTRING); }
		public TerminalNode ASTRING(int i) {
			return getToken(GQ.ASTRING, i);
		}
		public TerminalNode DOT() { return getToken(GQ.DOT, 0); }
		public TerminalNode LPARENTHESIS() { return getToken(GQ.LPARENTHESIS, 0); }
		public TerminalNode RPARENTHESIS() { return getToken(GQ.RPARENTHESIS, 0); }
		public RightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).enterRight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GQListener ) ((GQListener)listener).exitRight(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof GQVisitor ) return ((GQVisitor<? extends T>)visitor).visitRight(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RightContext right() throws RecognitionException {
		RightContext _localctx = new RightContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_right);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(16);
			match(ASTRING);
			setState(17);
			match(DOT);
			setState(18);
			match(ASTRING);
			setState(19);
			match(LPARENTHESIS);
			setState(20);
			match(ASTRING);
			setState(21);
			match(RPARENTHESIS);
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
		"\u0004\u0001\u0006\u0018\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0000"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0000\u0000\u0003\u0000\u0002\u0004\u0000\u0000"+
		"\u0014\u0000\u0006\u0001\u0000\u0000\u0000\u0002\n\u0001\u0000\u0000\u0000"+
		"\u0004\u0010\u0001\u0000\u0000\u0000\u0006\u0007\u0003\u0002\u0001\u0000"+
		"\u0007\b\u0005\u0001\u0000\u0000\b\t\u0003\u0004\u0002\u0000\t\u0001\u0001"+
		"\u0000\u0000\u0000\n\u000b\u0005\u0005\u0000\u0000\u000b\f\u0005\u0002"+
		"\u0000\u0000\f\r\u0005\u0005\u0000\u0000\r\u000e\u0005\u0002\u0000\u0000"+
		"\u000e\u000f\u0005\u0005\u0000\u0000\u000f\u0003\u0001\u0000\u0000\u0000"+
		"\u0010\u0011\u0005\u0005\u0000\u0000\u0011\u0012\u0005\u0002\u0000\u0000"+
		"\u0012\u0013\u0005\u0005\u0000\u0000\u0013\u0014\u0005\u0003\u0000\u0000"+
		"\u0014\u0015\u0005\u0005\u0000\u0000\u0015\u0016\u0005\u0004\u0000\u0000"+
		"\u0016\u0005\u0001\u0000\u0000\u0000\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}