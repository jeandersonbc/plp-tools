package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.ParseException;

import le1.plp.expressions1.parser.Exp1Parser;
import br.ufpe.cin.plp.web.languages.Interpreter;

/**
 * Um Wrapper para a linguagem Expressão1.
 *
 */
public class WrapperExp1 implements Interpreter {

	private Exp1Parser exp1Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		le1.plp.expressions1.Programa prog = null;

		if (exp1Parser == null) {
			exp1Parser = new Exp1Parser(fis);
		} else {
			Exp1Parser.ReInit(fis);
		}
		String result = "";
		try {
			prog = Exp1Parser.Input();
			result = (prog.checaTipo() ? prog.executar().toString()
					: "Erro de tipos!");
		} catch (Exception e) {
			return e.getMessage();
		}

		return result;

	}

}
