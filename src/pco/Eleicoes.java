package pco;

/**
 * @author Afonso Ramalho 53344, André Ramos 53299, Sebastião Oliveira 53336
 * 		   Grupo 22
 * @date Outubro 2019
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class Eleicoes implements Quantificavel {
	
	private String desc;
	private List<String> parts;
	private List<Circulo> eleicoes;
	
	/**
	 * Inicia o objeto Eleiçoes com desc, parts e cria um ArrayList do tipo Circulo
	 * @param desc A descricao 
	 * @param parts Uma list dos partidos
	 * @requires desc != null && parts.length > 0
	 */
	public Eleicoes (String desc, List<String> parts) {
		this.desc = desc;
		this.parts = parts;
		this.eleicoes = new ArrayList<Circulo>();
	}
	
	/**
	 * Adiciona um novo objeto Circulo ao Array eleicoes, com o nome do circulo  
	 * numero de deputados e votos
	 * @param circ Nome do circulo
	 * @param numDep Numeor de deputados a eleger
	 * @param votos Map com partido e numero de votos do partido
	 */
	public void addCirculo (String circ, int numDep, Map<String, Integer> votos) {
		Circulo circulo = new Circulo(circ, numDep, votos);
		this.eleicoes.add(circulo);
	}
	
	/**
	 * Adiciona um novo objeto Circulo ao Array eleicoes
	 * @param circ Um objeto do tipo Circulo
	 */
	public void addCirculo (Circulo circ) {
		this.eleicoes.add(circ);
	}
	
	/**
	 * Verifica se um dado circulo já existe nas eleicoes  
	 * @param circ Nome do circulo
	 * @return true se circulo já existe ou false caso contrario 
	 */
	public boolean existeCirculo (String circ) {
		for (int i = 0; i < this.eleicoes.size(); i++) {
			if (this.eleicoes.get(i).nome().equals(circ)){
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Devolve todos os circulos eleitorais já existente nas eleicoes  
	 * @return lista de circulos eleitorais
	 */
	public List<String> circulosEleitorais (){
		List<String> circulosEleitorias = new ArrayList<String>();
		for (int i = 0; i < this.eleicoes.size(); i++) {
			circulosEleitorias.add(this.eleicoes.get(i).nome());
		}
		return circulosEleitorias;
	}
	
	/**
	 * Devolve todos os partidos já existente nas eleicoes  
	 * @return lista de partidos nas eleicoes
	 */
	public List<String> partidos (){
		return this.parts;
	}
	
	/**
	 * Verifica a existencia de um partido nas eleicoes  
	 * @param part Nome do partido 
	 * @return true se partido ja existe ou false caso contrario 
	 */
	public boolean existePartido (String part) {
		for (int i = 0; i < this.parts.size(); i++) {
			if (this.parts.get(i).equals(part)) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Devolve o numero de de deputados a eleger num dado circulo eleitoral 
	 * @param circ Nome do circulo eleitoral 
	 * @return numero de deputados a eleger 
	 */
	public int deputadosAEleger (String circ) {
		int deputadosAEleger = 0;
		for (int i = 0; i < this.eleicoes.size(); i++) {
			if (this.eleicoes.get(i).nome().equals(circ)) {
				deputadosAEleger = this.eleicoes.get(i).numDeputados();
			}
		}		
		return deputadosAEleger;
	}
	
	/**
	 * Devolve o numero votos que o partido conseguiu obter no circulo eleitoral dado
	 * @param circ Nome do circulo eleitoral 
	 * @param part Nome do partido 
	 * @return numero de votos obtidos pelo partido 
	 */
	public int numeroVotos (String circ, String part) {
		int numeroVotos = 0;
		for (int i = 0; i < this.eleicoes.size(); i++) {
			if (this.eleicoes.get(i).nome().equals(circ)) {
				numeroVotos = this.eleicoes.get(i).numeroVotos(part);
			}
		}		
		return numeroVotos;
	}
	
	/**
	 * Devolve o numero deputados que o partido consegui obter
	 * @param part Nome do partido 
	 * @return numero de deputadas
	 */
	public int deputadosEleitos (String part) {
		return (int) Math.round(this.valores().get(part));	
	}
	
	/**
	 * Representacao textual deste objeto
	 */
	public String toString () {
		StringBuilder sb = new StringBuilder();
		sb.append("Descricao: " + this.desc + "\n");
		sb.append("Partidos: " + "\n");
		for(int i=0; i < this.parts.size(); i++) {
			sb.append(this.parts.get(i) + "\n");
		}
		return sb.toString();

	}
	
	/**
	 * Devolve a sigla do partido e o numero de deputados eleitos para cada partido
	 * @return Map valores com partido e deputados eleitos
	 */
	public abstract Map<String,Double> valores ();
	
	
	
	
	
	
	
	
	
	
}
