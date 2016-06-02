package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import br.ufpe.cin.plp.web.languages.GenericParseException;
import br.ufpe.cin.plp.web.languages.Interpreter;
import li2.plp.expressions2.expression.ValorBooleano;
import li2.plp.expressions2.expression.ValorConcreto;
import li2.plp.expressions2.expression.ValorInteiro;
import li2.plp.expressions2.expression.ValorString;
import li2.plp.imperative1.memory.ContextoCompilacaoImperativa;
import li2.plp.imperative1.memory.ListaValor;
import li2.plp.imperative2.Programa;
import li2.plp.imperative2.parser.Imp2Parser;
import li2.plp.imperative2.parser.ParseException;

public class WrapperImp2 implements Interpreter {

	private Imp2Parser imp2Parser;

	@Override
	public String run(String source, String input) throws GenericParseException {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (imp2Parser == null) {
			imp2Parser = new Imp2Parser(fis);
		} else {
			Imp2Parser.ReInit(fis);
		}
		try {
			prog = Imp2Parser.Input();
		} catch (ParseException e) {
			throw new GenericParseException();
		}

		ListaValor entrada = obterListaEntradaImp2(input);
		try {
			if (prog.checaTipo(new ContextoCompilacaoImperativa(entrada))) {
				return prog.executar(new li2.plp.imperative2.memory.ContextoExecucaoImperativa2(entrada)).toString();
			}
		} catch (Exception e) {
			return e.toString();

		}
		return "Erro de tipos!";
	}

	private ListaValor obterListaEntradaImp2(String texto) {
		List<ValorConcreto<?>> valores = new LinkedList<ValorConcreto<?>>();
		StringTokenizer parser = new StringTokenizer(texto);
		while (parser.hasMoreTokens()) {
			String parametro = parser.nextToken();
			try {
				Integer inteiro = Integer.valueOf(parametro);
				valores.add(new ValorInteiro(inteiro.intValue()));
				continue;
			} catch (NumberFormatException e) {

			}
			if (parametro.equalsIgnoreCase("true") || parametro.equalsIgnoreCase("false")) {
				Boolean booleano = Boolean.valueOf(parametro);
				valores.add(new ValorBooleano(booleano.booleanValue()));
			} else {
				valores.add(new ValorString(parametro));
			}
		}
		return Imp2Parser.criaListaValor(valores);
	}

}
