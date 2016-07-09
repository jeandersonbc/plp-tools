package br.ufpe.cin.plp.web.languages.wrappers;

import java.io.ByteArrayInputStream;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

import li1.plp.expressions2.expression.ValorBooleano;
import li1.plp.expressions2.expression.ValorConcreto;
import li1.plp.expressions2.expression.ValorInteiro;
import li1.plp.expressions2.expression.ValorString;
import li1.plp.imperative1.Programa;
import li1.plp.imperative1.memory.ContextoExecucaoImperativa;
import li1.plp.imperative1.memory.ListaValor;
import li1.plp.imperative1.parser.Imp1Parser;
import br.ufpe.cin.plp.web.languages.Interpreter;

/**
 * Um Wrapper para a linguagem Imperativa1.
 */
public class WrapperImp1 implements Interpreter {

	private Imp1Parser imp1Parser;

	@Override
	public String run(String source, String input) {
		ByteArrayInputStream fis = new ByteArrayInputStream(source.getBytes());
		Programa prog = null;
		if (imp1Parser == null) {
			imp1Parser = new Imp1Parser(fis);
		} else {
			Imp1Parser.ReInit(fis);
		}
		try {
			prog = Imp1Parser.Input();
		} catch (li1.plp.imperative1.parser.ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ListaValor entrada = obterListaEntradaImp1(input);
		try {
			if (prog.checaTipo(new li1.plp.imperative1.memory.ContextoCompilacaoImperativa(
					entrada))) {
				return prog.executar(new ContextoExecucaoImperativa(entrada))
						.toString();
			}
		} catch (Exception e) {
			return e.getMessage();

		}
		return "Erro de tipos!";
	}

	private ListaValor obterListaEntradaImp1(String texto) {
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
			if (parametro.equalsIgnoreCase("true")
					|| parametro.equalsIgnoreCase("false")) {
				Boolean booleano = Boolean.valueOf(parametro);
				valores.add(new ValorBooleano(booleano.booleanValue()));
			} else {
				valores.add(new ValorString(parametro));
			}
		}
		return Imp1Parser.criaListaValor(valores);
	}

}
