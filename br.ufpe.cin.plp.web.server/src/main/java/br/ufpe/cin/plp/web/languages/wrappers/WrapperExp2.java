package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import br.ufpe.cin.plp.web.languages.Interpreter;
import le2.plp.expressions2.Programa;
import le2.plp.expressions2.parser.Exp2Parser;

/**
 * Um Wrapper para a linguagem Expressão2.
 */
public class WrapperExp2 implements Interpreter {

	private Exp2Parser exp2Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog = null;
		if (exp2Parser == null) {
			exp2Parser = new Exp2Parser(fis);
		} else {
			Exp2Parser.ReInit(fis);
		}
		String result = null;
		try {
			prog = Exp2Parser.Input();
			result = (prog.checaTipo() ? prog.executar().toString() : "Erro de tipos!");
		} catch (Exception e) {
			return e.getMessage();
		}
		return result;
	}

}
