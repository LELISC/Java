package listadeexercicios_lelis08;

import java.util.Random;

public class Ex05 {
	
	int i = 0;
	
	// para chamar  no Ex06
	
	Random sc = new Random();
	Random sc2 = new Random();
	
	double numero1 = sc.nextDouble();
	
	double numero2 = sc2.nextDouble();
	
	double potencia = Math.pow(numero1,numero2);

	  
	    	  
	public static void main(String[] args) {
		/* Apresentar os resultados das pot�ncias de 3, variando do expoente 0 at� o expoente 15. 
		 * Deve ser considerado que qualquer n�mero elevado a zero � 1, e elevado a 1 � ele pr�prio. 
		 * Observe que neste exerc�cio n�o pode ser utilizado o operador de exponencia��o do portuguol (^).
		 */

		for (int i = 0; i < 16 ; i++) {
	    	  
	    	  
	    	 double potencia = Math.pow(3, i);
	    	 
	    	 System.out.println((int)potencia);
    
    	 
    	  
    	  
    	  
		
	}
      
	}

}
