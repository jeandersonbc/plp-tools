package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf2.plp.functional2.Programa;
import lf2.plp.functional2.parser.Func2Parser;
import br.ufpe.cin.plp.web.languages.Interpreter;

/**
 * Um Wrapper para a linguagem Funcional2.
 */
public class WrapperFunc2 implements Interpreter {
	private Func2Parser func2Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (func2Parser == null) {
			func2Parser = new Func2Parser(fis);
		} else {
			Func2Parser.ReInit(fis);
		}
		String result = "";
		try {
			prog = Func2Parser.Input();
			result = (prog.checaTipo() ? prog.executar().toString()
					: "Erro det tipos!");
		} catch (Exception e) {
			return e.getMessage();
		}

		return result;
	}


}
