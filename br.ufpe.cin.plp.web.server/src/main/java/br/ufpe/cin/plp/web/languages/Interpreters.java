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

public class Interpreters {

	enum InterpreterCode {
		EXP1, EXP2, FUNC1, FUNC2, FUNC3, IMP1, IMP2, OO1, OO2;
	}

	private static Map<InterpreterCode, Interpreter> interpreterWrappers;

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

	public static Interpreter getByLanguageCode(String code) {
		// Should NEVER be null!
		// FIXME: A better approach would be throwing an exception,
		// otherwise, the application may crash due to a null reference.
		InterpreterCode interpreterCode = InterpreterCode.valueOf(normalize(code));
		return interpreterWrappers.get(interpreterCode);
	}

	private static String normalize(String code) {
		return code.toUpperCase().replaceAll(" ", "");
	}

}
