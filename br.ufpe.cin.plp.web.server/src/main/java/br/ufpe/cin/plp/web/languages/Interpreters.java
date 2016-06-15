package br.ufpe.cin.plp.web.languages;

import java.util.HashMap;
import java.util.Map;

import br.ufpe.cin.plp.web.languages.wrappers.WrapperExp1;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperExp2;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperFunc1;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperFunc2;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperFunc3;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperImp1;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperImp2;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperOo1;
import br.ufpe.cin.plp.web.languages.wrappers.WrapperOo2;

/**
 * Esta classe disponibiliza wrappers capazes de executarem um respectivo
 * interpretador de uma linguagem.
 *
 */
public class Interpreters {

	/**
	 * Enumerador de códigos dos interpretadores das linguagens.
	 */
	enum InterpreterCode {
		EXP1, EXP2, FUNC1, FUNC2, FUNC3, IMP1, IMP2, OO1, OO2;
	}

	/**
	 * Mapa de wrappers
	 */
	private static Map<InterpreterCode, Interpreter> interpreterWrappers;

	/*
	 * Novos intepretadores precisam ser registrados aqui.
	 */
	static {
		interpreterWrappers = new HashMap<>();
		interpreterWrappers.put(InterpreterCode.EXP1, new WrapperExp1());
		interpreterWrappers.put(InterpreterCode.EXP2, new WrapperExp2());
		interpreterWrappers.put(InterpreterCode.FUNC1, new WrapperFunc1());
		interpreterWrappers.put(InterpreterCode.FUNC2, new WrapperFunc2());
		interpreterWrappers.put(InterpreterCode.FUNC3, new WrapperFunc3());
		interpreterWrappers.put(InterpreterCode.IMP1, new WrapperImp1());
		interpreterWrappers.put(InterpreterCode.IMP2, new WrapperImp2());
		interpreterWrappers.put(InterpreterCode.OO1, new WrapperOo1());
		interpreterWrappers.put(InterpreterCode.OO2, new WrapperOo2());
	}

	private Interpreters() {
	}

	/**
	 * Retorna uma implementação de wrapper pra um interpretado dado o código
	 * informado.
	 * 
	 * @param code
	 *            O código do interpretador requisitado
	 * @return Uma implementação de Wrapper para um interpretador.
	 */
	public static Interpreter getByLanguageCode(String code) {
		// Should NEVER be null!
		// FIXME: A better approach would be throwing an exception,
		// otherwise, the application may crash due to a null reference.
		InterpreterCode interpreterCode = InterpreterCode.valueOf(normalize(code));
		return interpreterWrappers.get(interpreterCode);
	}

	/**
	 * Normaliza a string de entrada para o formato toString de código do
	 * enumerador {@link InterpreterCode}.
	 * 
	 * @param code
	 *            A string a ser normalizada
	 * @return A string normalizada.
	 */
	private static String normalize(String code) {
		return code.toUpperCase().replaceAll(" ", "");
	}

}
