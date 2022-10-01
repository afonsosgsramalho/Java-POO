package pco;

/**
 * @author Afonso Ramalho 53344, André Ramos 53299, Sebastião Oliveira 53336
 * 		   Grupo 22
 * @date Outubro 2019
 */

import java.util.HashMap;
import java.util.Map;

public class Circulo implements Quantificavel {
	
	private String circ;
	private int numDep;
	private Map<String, Integer> votos;

	/**
	 * Inicia o objeto Circulo com circ nome do circulo, numDep numero de deputados e 
	 * Map votos com os votos de cada partido
	 * @param circ O nome do Circulo 
	 * @param numDep Numero de deputados a eleger 
	 * @param votos Os votos por partido
	 * @requires circ != null && numDep != null && votos,length > 0
	 */
	public Circulo (String circ, int numDep, Map<String,Integer> votos) {
		this.circ = circ;
		this.numDep = numDep;
		this.votos = votos;
	}
	
	/**
	 * Devolve o nome do Circulo eleitoral
	 * @return nome do circulo 
	 */
	public String nome () {
		return this.circ;
	}
	
	/**
	 * Devolve o numero de deputados a eleger 
	 * @return num de deputados 
	 */
	public int numDeputados () {
		return this.numDep;
	}
	
	/**
	 * Devolve numero de votos de um dado partido
	 * @param part nome do partido 
	 * @return numero de votos do partido 
	 */
	public int numeroVotos (String part) {
		int numeroVotos = 0;
		for (Map.Entry<String,Integer> entry : this.votos.entrySet()) {
			if (entry.getKey().equals(part)) {
				numeroVotos = entry.getValue();
			}
		}
		return numeroVotos;
	}
	
	/**
	 * Representacao textual deste objeto
	 */
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: " + this.circ);
		sb.append("Numero de deputados: " + this.numDep + "\n");
		for(Map.Entry<String,Integer> entry : this.votos.entrySet()) {
			sb.append("Partido: " + entry.getKey() + "votos: " + entry.getValue() + "\n");
		}
		return sb.toString();
	}
	
	/**
	 * Devolve para cada partido, a sigla do partido e o numero de votos obtidos para esse
	 * mesmo partido, nesse circulo eleitoral 
	 * @return a sigla do partido e os votos  
	 */
	public Map<String, Double> valores (){
		Map<String, Double> valores = new HashMap<String, Double>();
		for (Map.Entry<String,Integer> entry : this.votos.entrySet()) {
			double value = entry.getValue();
			valores.put(entry.getKey(), value);
		}
		return valores;
	}
	
	
	
	
	
	
}
