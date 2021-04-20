package cz.tul.prk.context;

import org.antlr.v4.runtime.ParserRuleContext;

public abstract class AbstractContext {

    private ParserRuleContext parserRuleContext;

    public ParserRuleContext getParserRuleContext() {
        return parserRuleContext;
    }

    public void setParserRuleContext(ParserRuleContext parserRuleContext) {
        this.parserRuleContext = parserRuleContext;
    }
}
