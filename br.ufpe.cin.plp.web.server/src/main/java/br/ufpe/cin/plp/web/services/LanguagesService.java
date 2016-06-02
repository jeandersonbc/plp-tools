package br.ufpe.cin.plp.web.services;

import org.springframework.stereotype.Component;

import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;
import br.ufpe.cin.plp.web.languages.Interpreters;
import br.ufpe.cin.plp.web.model.CompilerOutput;

@Component
public class LanguagesService {

	public CompilerOutput compile(String language, String input) {
		CompilerOutput compilerOutput = new CompilerOutput();
		compilerOutput.setSourceLanguage(language);

		// FIXME: mocked source
		String source = "1 + 2";
		Interpreter interpreter = Interpreters.getByLanguageCode(language);
		String result = null;
		try {
			result = interpreter.run(source, input);
		} catch (GenericParseException e) {
			// TODO handle exception properly...
			e.printStackTrace();
		}
		compilerOutput.setOutput(result);
		return compilerOutput;
	}

}
