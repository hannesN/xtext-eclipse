/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.encoding.ide;

import com.google.inject.Binder;
import com.google.inject.name.Names;
import org.eclipse.xtext.ide.DefaultIdeModule;
import org.eclipse.xtext.ide.LexerIdeBindings;
import org.eclipse.xtext.ide.editor.contentassist.antlr.IContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
import org.eclipse.xtext.ui.tests.editor.encoding.ide.contentassist.antlr.EncodingUiTestLanguageParser;
import org.eclipse.xtext.ui.tests.editor.encoding.ide.contentassist.antlr.internal.InternalEncodingUiTestLanguageLexer;

/**
 * Manual modifications go to {@link EncodingUiTestLanguageIdeModule}.
 */
@SuppressWarnings("all")
public abstract class AbstractEncodingUiTestLanguageIdeModule extends DefaultIdeModule {

	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public void configureContentAssistLexer(Binder binder) {
		binder.bind(Lexer.class)
			.annotatedWith(Names.named(LexerIdeBindings.CONTENT_ASSIST))
			.to(InternalEncodingUiTestLanguageLexer.class);
	}
	
	// contributed by org.eclipse.xtext.xtext.generator.parser.antlr.XtextAntlrGeneratorFragment2
	public Class<? extends IContentAssistParser> bindIContentAssistParser() {
		return EncodingUiTestLanguageParser.class;
	}
	
}