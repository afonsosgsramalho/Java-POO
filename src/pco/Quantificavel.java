package pco;

/**
 * @author Afonso Ramalho 53344, André Ramos 53299, Sebastião Oliveira 53336
 * 		   Grupo 22
 * @date Outubro 2019
 */

import java.util.Map;

public interface Quantificavel {
	
	/**
	 * Devolve o conjunto de valores 
	 * @return o conjunto de key e value  
	 */
	Map<String, Double> valores();
}
