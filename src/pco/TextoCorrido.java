package pco;

/**
 * @author Afonso Ramalho 53344, André Ramos 53299, Sebastião Oliveira 53336
 * 		   Grupo 22
 * @date Outubro 2019
 */

import java.util.List;
import java.util.Map;

public class TextoCorrido implements OutputTextual {
	
	/**
	 * Um dado Quantificavel eh representavel
	 * @param q O quantificavel
	 * @return true se q e representavel e false caso contrario
	 */
	@Override
	public boolean ehRepresentavel (Quantificavel q) {
		if (q != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * Uma dada lista de pares eh representavel
	 * @param l A lista de pares
	 * @return true se q e representavel e false caso contrario
	 */
	@Override
	public boolean ehRepresentavel (List<Par> lp) {
		if (lp != null) {
			return true;
		}
		return false;
	}
	
	/**
	 * A representacao textual em formato de texto corrido de
     * um dado Quantificavel
	 * @param q O Quantificavel
	 * @requires this.ehRepresentavel(q)
	 * @return A representacao textual de um grafico de pontos de q
	 */
	@Override
	public String outputTexto (Quantificavel q) {
		StringBuilder str = new StringBuilder();
		for (Map.Entry<String,Double> entry : q.valores().entrySet()) {
			str.append(entry.getKey() + " --> " + entry.getValue() + "\n");
		}
		return str.toString();
	}
	
	/**
	 * A representacao textual em formato de texto corrido de
     * um dado Quantificavel
	 * @param q O Quantificavel
	 * @requires this.ehRepresentavel(q)
	 * @return A representacao textual de um grafico de pontos de q
	 */
	@Override
	public String outputTexto (List<Par> lp) {
		StringBuilder str = new StringBuilder();
		for (int i = 0; i < lp.size(); i++) {
			str.append(lp.get(i).primeiro() + " --> " + lp.get(i).segundo() + "\n");
		}
		return str.toString();
	}
	
}
