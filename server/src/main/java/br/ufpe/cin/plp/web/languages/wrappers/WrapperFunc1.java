package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf1.plp.functional1.Programa;
import lf1.plp.functional1.parser.Func1Parser;
import lf1.plp.functional1.parser.ParseException;
import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperFunc1 implements Interpreter {
	private Func1Parser func1Parser;

	@Override
	public String run(String source, String input) throws GenericParseException {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (func1Parser == null) {
			func1Parser = new Func1Parser(fis);
		} else {
			Func1Parser.ReInit(fis);
		}
		try {
			prog = Func1Parser.Input();
		} catch (ParseException e) {
			throw new GenericParseException();
		}

		return (prog.checaTipo() ? prog.executar().toString()
				: "Erro det tipos!");

	}

}
