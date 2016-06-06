package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import le1.plp.expressions1.parser.Exp1Parser;
import le1.plp.expressions1.parser.ParseException;
import le2.plp.expressions2.Programa;
import le2.plp.expressions2.parser.Exp2Parser;
import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperExp1 implements Interpreter {
	
	private Exp1Parser exp1Parser;
	
	@Override
	public String run(String source, String input) throws GenericParseException {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		le1.plp.expressions1.Programa prog = null;
		if (exp1Parser == null) {
			exp1Parser = new Exp1Parser(fis);
		} else {
			Exp1Parser.ReInit(fis);
		}
		try {
			prog = Exp1Parser.Input();
		} catch (ParseException e) {
			throw new GenericParseException();
		}
		return (prog.checaTipo() ? prog.executar().toString() : "Erro de tipos!");
	}

}
