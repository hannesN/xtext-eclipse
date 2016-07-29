/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.ui.tests.editor.contentassist.parser.antlr.internal.InternalDatatypeRuleTestLanguageParser;
import org.eclipse.xtext.ui.tests.editor.contentassist.services.DatatypeRuleTestLanguageGrammarAccess;

public class DatatypeRuleTestLanguageParser extends AbstractAntlrParser {

	@Inject
	private DatatypeRuleTestLanguageGrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDatatypeRuleTestLanguageParser createParser(XtextTokenStream stream) {
		return new InternalDatatypeRuleTestLanguageParser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Model";
	}

	public DatatypeRuleTestLanguageGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(DatatypeRuleTestLanguageGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
