package br.ufpe.cin.plp.web.languages.wrappers;

import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperFunc2 implements Interpreter {

	@Override
	public String run(String source, String input) {
		return "Parser nao encontrado";
	}

}
