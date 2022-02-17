package desafio;

import java.util.ArrayList;
import java.util.Scanner;

public class anagrama {

	public static void main(String[] args) {
	    
	    Scanner leia = new Scanner (System.in);
		String palavra;
	    
	    System.out.println("Digite uma palavra");
	    palavra = leia.nextLine();
	    
	    ArrayList<String> listaDeAnagramas = new ArrayList<String>();
	    
	    for(int i = 0; i <palavra.length(); i++) {
	        for(int j = 1; j < palavra.length(); j++) {
	            if(palavra.charAt(i) == palavra.charAt(j) && i !=j && i < j) {
	                if(palavra.charAt(i) == palavra.charAt(i+1)) {
	                String x = palavra.substring(i, i + 1);
	                listaDeAnagramas.add(x);
	                } else {
	                String k = palavra.substring(i, j);
	                String l = palavra.substring(i + 1, j + 1);
	                String m = palavra.substring(i, i + 1);
	                listaDeAnagramas.add(k);
	                listaDeAnagramas.add(l);
	                listaDeAnagramas.add(m);
	                }
	            }
	        }
	    }
	    
	    System.out.println(listaDeAnagramas.size());
	}
}