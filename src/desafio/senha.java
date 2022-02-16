package desafio;

import java.util.Scanner;

public class senha {
	public static void main(String[] args) {

		boolean numero = false;
		boolean maiuscula = false;
		boolean minuscula = false;
		boolean simbolo = false;
		String senha;
		Scanner leia = new Scanner(System.in);

		do {

			System.out.println("\nDigite sua senha");
			senha = leia.nextLine();

			if (senha.length() < 6) {
				System.out.println("A senha contém menos de 6 caracteres");
			} else {
				for (char c : senha.toCharArray()) {
					if (c >= '0' && c <= '9') {
						numero = true;
					} else if (c >= 'A' && c <= 'Z') {
						maiuscula = true;
					} else if (c >= 'a' && c <= 'z') {
						minuscula = true;
					} else {
						simbolo = true;
					}
				}
				if (numero == true && maiuscula == true && minuscula == true && simbolo == true) {
					System.out.println("\nSenha válida!\n");
				} else {
					System.out.println("\nSenha inválida!\n");
				}
				if (numero == true) {
					System.out.println("Número: Válido");
				} else {
					System.out.println("Número: Inválido. \nA senha precisa ter pelo menos um número");
				}
				if (maiuscula == true) {
					System.out.println("Letra maiúscula: Válido");
				} else {
					System.out.println("Letra maiúscula: Inválido. \nA senha precisa ter pelo menos uma letra maiúscula");
				}
				if (minuscula == true) {
					System.out.println("Letra minúscula: Válido");
				} else {
					System.out.println("Letra minúscula: Inválido. \nA senha precisa ter pelo menos uma letra minúscula");
				}
				if (simbolo == true) {
					System.out.println("Símbolo: Válido");
				} else {
					System.out.println("Símbolo: Inválido. \nA senha precisa ter pelo menos um símbolo");
				}

			}
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false);
	}

}
