package desafio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class escada {
	 public static void main(String[] args) {
		 Scanner leia = new Scanner(System.in);

			List<String> linhas = new ArrayList<>();

			System.out.print("Digite a quantidade de linhas: ");
			int qtdLinhas = leia.nextInt();

			for (int i = 0; i < qtdLinhas; i++) {
				linhas.add(" ".repeat(qtdLinhas - i) + "*".repeat(i + 1));
			}

			for (String imprimir : linhas) {
				System.out.println(imprimir);
			}
	    }

}
