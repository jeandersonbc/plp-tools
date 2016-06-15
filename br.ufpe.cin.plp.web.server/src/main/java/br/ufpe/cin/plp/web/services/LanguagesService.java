package br.ufpe.cin.plp.web.services;

import org.springframework.stereotype.Component;

import br.ufpe.cin.plp.web.languages.Interpreter;
import br.ufpe.cin.plp.web.languages.Interpreters;
import br.ufpe.cin.plp.web.model.CompilerOutput;

@Component
public class LanguagesService {

	public CompilerOutput compile(String language, String source, String input) {
		CompilerOutput compilerOutput = new CompilerOutput();
		compilerOutput.setSourceLanguage(language);

		Interpreter interpreter = Interpreters.getByLanguageCode(language);
		String result = interpreter.run(source, input);

		compilerOutput.setOutput(result);
		return compilerOutput;
	}

}
