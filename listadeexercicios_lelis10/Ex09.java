package listadeexercicios_lelis10;

public class Ex09 {

	public static void main(String[] args) {
		/* Escreva um programa que apresente a série de Fibonacci até o décimo quinto termo.
		 *  A série de Fibonacci é formada pela seqüência: 1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc.
		 *   Esta série se caracteriza pela soma de um termo atual com o seu anterior subseqüente, para que seja formado 
		 *   o próximo valor da seqüência. Portanto começando com os números 1, 1 o próximo termo é 1+1=2, o próximo 
		 *   é 1+2=3, o próximo é 2+3=5, o próximo 3+5=8, etc.
		 */

		
		  int numero1 = 1;
	         
	         int numero2 = 0;
	         
	         int auxiliar = numero1;
	         
	         for (int i = 0; i < 16; i++) {
	        	 
	        	 System.out.println(numero1);
	        	 auxiliar = numero1;
	        	 numero1 = numero1+ numero2;
	        	 
	        	 numero2 = auxiliar;
				
		
		
	}

}
}
