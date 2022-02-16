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
				System.out.println("A senha cont�m menos de 6 caracteres");
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
					System.out.println("\nSenha v�lida!\n");
				} else {
					System.out.println("\nSenha inv�lida!\n");
				}
				if (numero == true) {
					System.out.println("N�mero: V�lido");
				} else {
					System.out.println("N�mero: Inv�lido. \nA senha precisa ter pelo menos um n�mero");
				}
				if (maiuscula == true) {
					System.out.println("Letra mai�scula: V�lido");
				} else {
					System.out.println("Letra mai�scula: Inv�lido. \nA senha precisa ter pelo menos uma letra mai�scula");
				}
				if (minuscula == true) {
					System.out.println("Letra min�scula: V�lido");
				} else {
					System.out.println("Letra min�scula: Inv�lido. \nA senha precisa ter pelo menos uma letra min�scula");
				}
				if (simbolo == true) {
					System.out.println("S�mbolo: V�lido");
				} else {
					System.out.println("S�mbolo: Inv�lido. \nA senha precisa ter pelo menos um s�mbolo");
				}

			}
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false);
	}

}
