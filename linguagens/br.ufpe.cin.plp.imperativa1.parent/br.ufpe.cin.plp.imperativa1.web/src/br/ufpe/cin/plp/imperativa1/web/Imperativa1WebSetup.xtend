/*
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.web

import br.ufpe.cin.plp.imperativa1.Imperativa1RuntimeModule
import br.ufpe.cin.plp.imperativa1.Imperativa1StandaloneSetup
import com.google.inject.Guice
import com.google.inject.Injector
import com.google.inject.Provider
import com.google.inject.util.Modules
import java.util.concurrent.ExecutorService
import org.eclipse.xtend.lib.annotations.FinalFieldsConstructor

/**
 * Initialization support for running Xtext languages in web applications.
 */
@FinalFieldsConstructor
class Imperativa1WebSetup extends Imperativa1StandaloneSetup {
	
	val Provider<ExecutorService> executorServiceProvider;
	
	override Injector createInjector() {
		val runtimeModule = new Imperativa1RuntimeModule()
		val webModule = new Imperativa1WebModule(executorServiceProvider)
		return Guice.createInjector(Modules.override(runtimeModule).with(webModule))
	}
	
}