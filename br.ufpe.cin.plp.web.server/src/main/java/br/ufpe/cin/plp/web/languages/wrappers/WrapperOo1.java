package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import br.ufpe.cin.plp.web.languages.Interpreter;
import loo1.plp.orientadaObjetos1.Programa;
import loo1.plp.orientadaObjetos1.expressao.valor.ValorBooleano;
import loo1.plp.orientadaObjetos1.expressao.valor.ValorConcreto;
import loo1.plp.orientadaObjetos1.expressao.valor.ValorInteiro;
import loo1.plp.orientadaObjetos1.expressao.valor.ValorString;
import loo1.plp.orientadaObjetos1.memoria.colecao.ListaValor;
import loo1.plp.orientadaObjetos1.parser.OO1Parser;
import loo1.plp.orientadaObjetos1.parser.ParseException;

/**
 * Um Wrapper para a linguagem OO1.
 */
public class WrapperOo1 implements Interpreter {

	private OO1Parser oo1Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog;
		if (oo1Parser == null) {
			this.oo1Parser = new OO1Parser(fis);
		} else {
			oo1Parser.ReInit(fis);
		}
		try {
			prog = oo1Parser.processaEntrada();
		} catch (ParseException e1) {
			return e1.getLocalizedMessage();
		}

		ListaValor entrada = obterListaEntradaOO1(input);
		try {
			if (prog.checaTipo(new loo1.plp.orientadaObjetos1.memoria.ContextoCompilacaoOO1(entrada))) {
				return prog.executar(new loo1.plp.orientadaObjetos1.memoria.ContextoExecucaoOO1(entrada)).toString();
			}
		} catch (Exception e) {
			return e.getMessage();

		}
		return "Erro de tipos!";

	}

	private ListaValor obterListaEntradaOO1(String input) {
		List<ValorConcreto> valores = new LinkedList<ValorConcreto>();
		StringTokenizer parser = new StringTokenizer(input);
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
		return OO1Parser.criaListaValor(valores);
	}

}
