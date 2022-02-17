/* Escreva um algoritmo que mostre na tela uma escada de tamanho n utilizando o caractere * e espa�os. 
 * A base e altura da escada devem ser iguais ao valor de n. 
 * A �ltima linha n�o deve conter nenhum espa�o.
 */


package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

		 	//Lista onde o array ser� adicionado
			List<String> linhas = new ArrayList<>();

			
			//Solicitando um n�mero para o usu�rio
			System.out.print("Digite um n�mero: ");
			int qtdLinhas = leia.nextInt();

			
			//Iniciando la�o de repeti��o e adicionando ao arraylist
			for (int i = 0; i < qtdLinhas; i++) {
				linhas.add(" ".repeat(qtdLinhas - i) + "*".repeat(i + 1));
			}

			//Imprimindo o la�o de repeti��o que cont�m o arraylist
			for (String imprimir : linhas) {
				System.out.println(imprimir);
			}
	    }

}
