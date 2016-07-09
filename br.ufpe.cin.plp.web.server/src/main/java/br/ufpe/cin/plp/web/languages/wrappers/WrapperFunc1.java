package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf1.plp.functional1.Programa;
import lf1.plp.functional1.parser.Func1Parser;
import br.ufpe.cin.plp.web.languages.Interpreter;

/**
 * Um Wrapper para a linguagem Funcional1.
 */
public class WrapperFunc1 implements Interpreter {
	private Func1Parser func1Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (func1Parser == null) {
			func1Parser = new Func1Parser(fis);
		} else {
			Func1Parser.ReInit(fis);
		}
		String result = "";
		try {
			prog = Func1Parser.Input();
			result = (prog.checaTipo() ? prog.executar().toString()
					: "Erro det tipos!");
		} catch (Exception e) {
			return e.getMessage();
		}

		return result;
	}

}
