/*Débora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 *A página de cadastro exigia o preenchimento dos campos de nome e senha, porém a senha precisa ser forte. 
 *O site considera uma senha forte quando ela satisfaz os seguintes critérios:
 *Possui no mínimo 6 caracteres.
 *Contém no mínimo 1 digito.
 *Contém no mínimo 1 letra em minúsculo.
 *Contém no mínimo 1 letra em maiúsculo.
 *Contém no mínimo 1 caractere especial. Os caracteres especiais são: !@#$%^&*()-+
 *Débora digitou uma string aleatória no campo de senha, porém ela não tem certeza se é uma senha forte. 
 *Para ajudar Débora, construa um algoritmo que informe qual é o número mínimo de caracteres que devem ser adicionados 
 *para uma string qualquer ser considerada segura.
*/

package desafio;

import java.util.Scanner;

public class senha {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Iniciando variáveis
		boolean numero = false;
		boolean maiuscula = false;
		boolean minuscula = false;
		boolean simbolo = false;
		String senha;
		

		do {
			//Solicitando senha ao usuário
			System.out.println("\nDigite sua senha");
			senha = leia.nextLine();

			//Verificação da quantidade de caracteres digitados
			if (senha.length() < 6) {
				System.out.println("A senha contém menos de 6 caracteres");
			} else {
				for (char c : senha.toCharArray()) { 	//Iniciando laço de repetição para verificar cada caracter digitado
					if (c >= '0' && c <= '9') {		// Verificando se as condições para a criação da senha estão sendo respeitadas
						numero = true; 					
					} else if (c >= 'A' && c <= 'Z') {
						maiuscula = true;
					} else if (c >= 'a' && c <= 'z') {
						minuscula = true;
					} else {
						simbolo = true;
					}
				}
				
				//Informando ao usuário se a senha está de acordo com o solicitado ou não. 
				//Caso não, é indicado o que está faltando.
				if (numero == true && maiuscula == true && minuscula == true && simbolo == true) {
					System.out.println("\nSenha válida!\n");
				} else {
					System.out.println("\nSenha inválida!\n");
				}
				if (numero == true) {
					System.out.println("Número: Válido");
				} else {
					System.out.println("Número: Inválido. (A senha precisa ter pelo menos um número)");
				}
				if (maiuscula == true) {
					System.out.println("Letra maiúscula: Válido");
				} else {
					System.out.println("Letra maiúscula: Inválido. (A senha precisa ter pelo menos uma letra maiúscula)");
				}
				if (minuscula == true) {
					System.out.println("Letra minúscula: Válido");
				} else {
					System.out.println("Letra minúscula: Inválido. (A senha precisa ter pelo menos uma letra minúscula)");
				}
				if (simbolo == true) {
					System.out.println("Símbolo: Válido");
				} else {
					System.out.println("Símbolo: Inválido. (A senha precisa ter pelo menos um símbolo)");
				}

			}
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false); //Condição para repetir o código.
	}

}
