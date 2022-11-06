package listadeexercicios_lelis10;
public class Ex11 {

	public static void main(String[] args) {
		
       /*Elaborar um programa que apresente
        *   como resultado o valor do fatorial dos valores ímpares situados na faixa numérica de 1 a 10   
        */
		
		int fatorial = 0;
      for (int i = 3; i < 11; i++) {
    	  
    	  if (i%2 != 0) {
    		 
    		  while (fatorial > 1) {
    			  
    			  fatorial = i*(i-1);
    			  System.out.println(fatorial); 
			 } if ( fatorial == 1) {
				
				System.out.println("o progama terminou");
				
			}
    		  
    		 
    	 
    		 	
		}
		
	}
	
		
	}

}
