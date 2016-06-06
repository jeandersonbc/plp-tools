package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;

import lf2.plp.functional2.parser.Func2Parser;
import lf3.plp.functional3.parser.Func3Parser;
import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperFunc3 implements Interpreter {
	private Func3Parser func3Parser;

	@Override
	public String run(String source, String input) throws GenericParseException {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		lf3.plp.functional3.Programa prog;
		if (func3Parser == null) {
			func3Parser = new Func3Parser(fis);
		} else {
			Func3Parser.ReInit(fis);
		}
		try {
			prog = Func3Parser.Input();
		} catch (lf3.plp.functional3.parser.ParseException e) {
			throw new GenericParseException();
		}

		return (prog.checaTipo() ? prog.executar().toString()
				: "Erro det tipos!");

	}

}
