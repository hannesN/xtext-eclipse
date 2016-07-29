/*
 * generated by Xtext
 */
package org.eclipse.xtext.ui.tests.editor.contentassist.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug287941TestLanguageRuntimeModule;
import org.eclipse.xtext.ui.tests.editor.contentassist.Bug287941TestLanguageStandaloneSetup;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
public class Bug287941TestLanguageIdeSetup extends Bug287941TestLanguageStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(new Bug287941TestLanguageRuntimeModule(), new Bug287941TestLanguageIdeModule());
	}
}
