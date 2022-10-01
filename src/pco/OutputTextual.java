package pco;

/**
 * @author Afonso Ramalho 53344, André Ramos 53299, Sebastião Oliveira 53336
 * 		   Grupo 22
 * @date Outubro 2019
 */	

import java.util.List;

/**
 * Este interface define um tipo de dados que sera representado textualmente
 * onde e verificado se o mesmo pode ser ou nao representado textualmente
 * e o transforma de forma a o ser 
 */
public interface OutputTextual {
	
	/**
	 * Um dado Quantificavel eh representavel?
	 * @param q O quantificavel
	 * @return true se q e representavel e false caso contrario
	 */
	boolean ehRepresentavel (Quantificavel q);
	
	/**
	 * Uma dada lista de pares eh representavel?
	 * @param l A lista de pares
	 * @return true se q e representavel e false caso contrario
	 */
	boolean ehRepresentavel (List<Par> pares);
	
	/**
	 * A representacao textual em formato de texto corrido de
     * um dado Quantificavel
	 * @param q O Quantificavel
	 * @requires this.ehRepresentavel(q)
	 * @return A representacao textual de um grafico de pontos de q
	 */
	String outputTexto (Quantificavel q);
	
	/**
	 * A representacao textual em formato de texto corrido de
     * um dado Par
	 * @param lp O Par
	 * @requires this.ehRepresentavel(lp)
	 * @return A representacao textual de um grafico de pontos de lq
	 */
	String outputTexto (List<Par> pares);
}
