package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf3.plp.functional3.Programa;
import lf3.plp.functional3.parser.Func3Parser;
import br.ufpe.cin.plp.web.languages.Interpreter;

/**
 * Um Wrapper para a linguagem Funcional3.
 */
public class WrapperFunc3 implements Interpreter {
	private Func3Parser func3Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (func3Parser == null) {
			func3Parser = new Func3Parser(fis);
		} else {
			Func3Parser.ReInit(fis);
		}
		String result = "";
		try {
			prog = Func3Parser.Input();
			result = (prog.checaTipo() ? prog.executar().toString()
					: "Erro det tipos!");
		} catch (Exception e) {
			return e.getMessage();
		}

		return result;
	}


}
