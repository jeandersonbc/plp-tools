package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import br.ufpe.cin.plp.web.languages.Interpreter;
import loo2.plp.orientadaObjetos1.expressao.valor.ValorBooleano;
import loo2.plp.orientadaObjetos1.expressao.valor.ValorConcreto;
import loo2.plp.orientadaObjetos1.expressao.valor.ValorInteiro;
import loo2.plp.orientadaObjetos1.expressao.valor.ValorString;
import loo2.plp.orientadaObjetos1.memoria.colecao.ListaValor;
import loo2.plp.orientadaObjetos2.Programa;
import loo2.plp.orientadaObjetos2.memoria.ContextoCompilacaoOO2;
import loo2.plp.orientadaObjetos2.memoria.ContextoExecucaoOO2;
import loo2.plp.orientadaObjetos2.parser.OO2Parser;
import loo2.plp.orientadaObjetos2.parser.ParseException;

/**
 * Um Wrapper para a linguagem OO2.
 */
public class WrapperOo2 implements Interpreter {

	private OO2Parser oo2Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog = null;
		if (oo2Parser == null) {
			this.oo2Parser = new OO2Parser(fis);
		} else {
			oo2Parser.ReInit(fis);
		}
		try {
			prog = oo2Parser.processaEntrada();
		} catch (ParseException e) {
			return e.getMessage();
		}

		ListaValor entrada = obterListaEntradaOO2(input);
		try {
			if (prog.checaTipo(new ContextoCompilacaoOO2(entrada))) {
				return prog.executar(new ContextoExecucaoOO2(entrada)).toString();
			}
		} catch (Exception e) {
			return e.getMessage();
		}
		return "Erro de tipos!";
	}

	private ListaValor obterListaEntradaOO2(String texto) {
		List<ValorConcreto> valores = new LinkedList<ValorConcreto>();
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
		return OO2Parser.criaListaValor(valores);

	}
}
