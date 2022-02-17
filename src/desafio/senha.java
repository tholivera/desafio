/*D�bora se inscreveu em uma rede social para se manter em contato com seus amigos. 
 *A p�gina de cadastro exigia o preenchimento dos campos de nome e senha, por�m a senha precisa ser forte. 
 *O site considera uma senha forte quando ela satisfaz os seguintes crit�rios:
 *Possui no m�nimo 6 caracteres.
 *Cont�m no m�nimo 1 digito.
 *Cont�m no m�nimo 1 letra em min�sculo.
 *Cont�m no m�nimo 1 letra em mai�sculo.
 *Cont�m no m�nimo 1 caractere especial. Os caracteres especiais s�o: !@#$%^&*()-+
 *D�bora digitou uma string aleat�ria no campo de senha, por�m ela n�o tem certeza se � uma senha forte. 
 *Para ajudar D�bora, construa um algoritmo que informe qual � o n�mero m�nimo de caracteres que devem ser adicionados 
 *para uma string qualquer ser considerada segura.
*/

package desafio;

import java.util.Scanner;

public class senha {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//Iniciando vari�veis
		boolean numero = false;
		boolean maiuscula = false;
		boolean minuscula = false;
		boolean simbolo = false;
		String senha;
		

		do {
			//Solicitando senha ao usu�rio
			System.out.println("\nDigite sua senha");
			senha = leia.nextLine();

			//Verifica��o da quantidade de caracteres digitados
			if (senha.length() < 6) {
				System.out.println("A senha cont�m menos de 6 caracteres");
			} else {
				for (char c : senha.toCharArray()) { 	//Iniciando la�o de repeti��o para verificar cada caracter digitado
					if (c >= '0' && c <= '9') {		// Verificando se as condi��es para a cria��o da senha est�o sendo respeitadas
						numero = true; 					
					} else if (c >= 'A' && c <= 'Z') {
						maiuscula = true;
					} else if (c >= 'a' && c <= 'z') {
						minuscula = true;
					} else {
						simbolo = true;
					}
				}
				
				//Informando ao usu�rio se a senha est� de acordo com o solicitado ou n�o. 
				//Caso n�o, � indicado o que est� faltando.
				if (numero == true && maiuscula == true && minuscula == true && simbolo == true) {
					System.out.println("\nSenha v�lida!\n");
				} else {
					System.out.println("\nSenha inv�lida!\n");
				}
				if (numero == true) {
					System.out.println("N�mero: V�lido");
				} else {
					System.out.println("N�mero: Inv�lido. (A senha precisa ter pelo menos um n�mero)");
				}
				if (maiuscula == true) {
					System.out.println("Letra mai�scula: V�lido");
				} else {
					System.out.println("Letra mai�scula: Inv�lido. (A senha precisa ter pelo menos uma letra mai�scula)");
				}
				if (minuscula == true) {
					System.out.println("Letra min�scula: V�lido");
				} else {
					System.out.println("Letra min�scula: Inv�lido. (A senha precisa ter pelo menos uma letra min�scula)");
				}
				if (simbolo == true) {
					System.out.println("S�mbolo: V�lido");
				} else {
					System.out.println("S�mbolo: Inv�lido. (A senha precisa ter pelo menos um s�mbolo)");
				}

			}
		} while (numero == false || maiuscula == false || minuscula == false || simbolo == false); //Condi��o para repetir o c�digo.
	}

}
