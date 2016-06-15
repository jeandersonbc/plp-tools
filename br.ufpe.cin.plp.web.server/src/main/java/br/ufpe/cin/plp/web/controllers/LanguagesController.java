package br.ufpe.cin.plp.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.ufpe.cin.plp.web.model.CompilerOutput;
import br.ufpe.cin.plp.web.services.LanguagesService;

@RequestMapping("compile")
@RestController()
public class LanguagesController {

	@Autowired
	LanguagesService service;

	@RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseEntity<CompilerOutput> compile(@RequestParam String language,
			@RequestParam String source, @RequestParam(required = false, defaultValue = "") String input) {

		return new ResponseEntity<>(service.compile(language, source, input), HttpStatus.OK);
	}
}
