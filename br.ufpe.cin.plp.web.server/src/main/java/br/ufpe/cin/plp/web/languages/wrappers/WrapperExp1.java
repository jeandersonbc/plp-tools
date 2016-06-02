package br.ufpe.cin.plp.web.languages.wrappers;

import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;

public class WrapperExp1 implements Interpreter {

	@Override
	public String run(String source, String input) throws GenericParseException {
		// TODO: Implementar quando tiver Parser disponivel
		return "Parser nao encontrado";
	}

}
