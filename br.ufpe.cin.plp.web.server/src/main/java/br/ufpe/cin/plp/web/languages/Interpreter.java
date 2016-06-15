package br.ufpe.cin.plp.web.languages;

/**
 * Contrato de um interpretador de linguagem da disciplina.
 *
 */
public interface Interpreter {

	/**
	 * Executa um dado programa com as entradas informadas.<br>
	 * Clientes de classes que implementam este contrato assumem que qualquer
	 * tipo de exceção é tratado na classe que fornece o serviço de execução.
	 * 
	 * @param source
	 *            O string que representa o código fonte.
	 * @param input
	 *            A string que representa uma lista de valores de entrada
	 * @return O resultado da execução
	 */
	String run(String source, String input);

}
