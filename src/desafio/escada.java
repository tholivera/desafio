/* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espaços. 
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A última linha não deve conter nenhum espaço.
 */


package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

		 	//Lista onde o array será adicionado
			List<String> linhas = new ArrayList<>();

			
			//Solicitando um número para o usuário
			System.out.print("Digite um número: ");
			int qtdLinhas = leia.nextInt();

			
			//Iniciando laço de repetição e adicionando ao arraylist
			for (int i = 0; i < qtdLinhas; i++) {
				linhas.add(" ".repeat(qtdLinhas - i) + "*".repeat(i + 1));
			}

			//Imprimindo o laço de repetição que contém o arraylist
			for (String imprimir : linhas) {
				System.out.println(imprimir);
			}
	    }

}
