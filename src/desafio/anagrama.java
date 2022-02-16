package desafio;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class anagrama {
public static void main(String[] args) {
		
		String palavra;
		
		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o texto : ");
        palavra = leia.nextLine();
		
        anagrama(palavra);
	}
	
	 static void anagrama( String palavra ){
	        
	        HashMap<String, Integer> mapa = new HashMap<>();

	        for(int i  = 0; i <= palavra.length(); i++){
	            
	       
	            for( int j = i; j < palavra.length(); j++ ){
	                
	                char[] caracter = palavra.substring(i, j+1).toCharArray();
	                Arrays.sort(caracter);
	                String subCaract = new String(caracter);

	                if(mapa.containsKey(subCaract)){
	                    mapa.put(subCaract, mapa.get(subCaract) + 1);
	                }                    
	                else{
	                    mapa.put(subCaract,1);
	                }                    
	            }
	        }

	        int contaPares = 0;
	        
	        for(String cont: mapa.keySet()) {
	            
	            int n = mapa.get(cont);
	            contaPares += (n*(n-1))/2;
	        }
	        System.out.print(contaPares);
	    }


}