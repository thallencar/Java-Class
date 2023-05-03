package br.com.fiap.beans;

public class Humano extends Mamifero{

	//herança é o extends
	
	private String rg;
	
	//const vazio
	public Humano() {
		super();
	}
	
	//const cheio com herança
	public Humano(String nome, int idade, double peso, double velocidade, String rg) {
		super(nome, idade, peso, velocidade);
		this.rg = rg;
	}
	
	//getters e setters
	public String getRg() {
		return rg;
	}
	
	public void  setRg(String rg) {
		this.rg = rg;
	}
	
	
	
}
