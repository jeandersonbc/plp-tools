/*
 * generated by Xtext 2.9.2
 */
package br.ufpe.cin.plp.imperativa1.web

import com.google.inject.Provider
import java.util.List
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import javax.servlet.annotation.WebServlet
import org.eclipse.xtext.web.servlet.XtextServlet

/**
 * Deploy this class into a servlet container to enable DSL-specific services.
 */
@WebServlet(name = 'XtextServices', urlPatterns = '/xtext-service/*')
class Imperativa1Servlet extends XtextServlet {
	
	val List<ExecutorService> executorServices = newArrayList
	
	override init() {
		super.init()
		val Provider<ExecutorService> executorServiceProvider = [Executors.newCachedThreadPool => [executorServices += it]]
		new Imperativa1WebSetup(executorServiceProvider).createInjectorAndDoEMFRegistration()
	}
	
	override destroy() {
		executorServices.forEach[shutdown()]
		executorServices.clear()
		super.destroy()
	}
	
}
