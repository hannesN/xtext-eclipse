/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.enumrules.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class EnumRulesUiTestLanguageAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("org/eclipse/xtext/ui/tests/enumrules/parser/antlr/internal/InternalEnumRulesUiTestLanguage.tokens");
	}
}