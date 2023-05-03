package br.com.fiap.beans;

public class Leao extends Mamifero{

	//var
	private double tamJuba;

	//const vazio
	public Leao() {
		super();
	}

	//const cheio com heranca
	public Leao(String nome, int idade, double peso, double velocidade, double tamJuba) {
		super(nome, idade, peso, velocidade);
		this.tamJuba = tamJuba;
	}

	//getters e setters
	public double getTamJuba() {
		return tamJuba;
	}

	public void setTamJuba(double tamJuba) {
		this.tamJuba = tamJuba;
	}
	
	
	
}
