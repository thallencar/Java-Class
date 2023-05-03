package br.com.fiap.main;

import javax.swing.JOptionPane;

import br.com.fiap.beans.Humano;
import br.com.fiap.beans.Leao;

public class TesteAnimalia {
	//metodo static
		static String texto (String j) {
			return JOptionPane.showInputDialog(j);
		}
		static int inteiro(String j) {
			return Integer.parseInt(JOptionPane.showInputDialog(j));
		}
		static double decimal(String j) {
			return Double.parseDouble(JOptionPane.showInputDialog(j));
		}

	public static void main(String[] args) {
		
		//instanciar
		Humano objHumano = new Humano(texto("Digite o nome do humano: "),
				inteiro("Digite a idade do humano: "),
				decimal("Digite o peso do humano: "),
				decimal("Digite a velocidade do humano: "),
				texto("Informe o RG do humano"));
		
		Leao objLeao = new Leao(texto("Digite o nome do Leão: "),
				inteiro("Digite a idade do Leão: "),
				decimal("Digite o peso do Leão: "),
				decimal("Digite a velocidade do Leão: "),
				decimal("Digite o tamanho da Juba do Leão: "));
		
		System.out.println("Nome do Humano: " + objHumano.getNome()+
				"\nRG: " + objHumano.getRg());
		System.out.println("Nome do Leão: " + objLeao.getNome()+
				"\nTamanho da Juba do Leão: " + objLeao.getTamJuba());

	}

}
