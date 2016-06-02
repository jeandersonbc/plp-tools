package br.ufpe.cin.plp.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.plp.web.model.CompilerOutput;
import br.ufpe.cin.plp.web.services.LanguagesService;

@RequestMapping("compile")
@RestController()
public class LanguagesController {

	@Autowired
	LanguagesService service;

	@RequestMapping(method = RequestMethod.GET)
	public CompilerOutput compile(@RequestParam String language,
			@RequestParam(required = false, defaultValue = "") String input) {

		return service.compile(language, input);
	}
}
