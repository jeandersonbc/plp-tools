package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf2.plp.functional2.parser.Func2Parser;
import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperFunc2 implements Interpreter {
	private Func2Parser func2Parser;

	@Override
	public String run(String source, String input) throws GenericParseException {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		lf2.plp.functional2.Programa prog;
		if (func2Parser == null) {
			func2Parser = new Func2Parser(fis);
		} else {
			Func2Parser.ReInit(fis);
		}
		try {
			prog = Func2Parser.Input();
		} catch (lf2.plp.functional2.parser.ParseException e) {
			throw new GenericParseException();
		}

		return (prog.checaTipo() ? prog.executar().toString()
				: "Erro det tipos!");

	}

}
