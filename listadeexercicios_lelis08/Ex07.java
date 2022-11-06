package listadeexercicios_lelis08;

public class Ex07 {

	public static void main(String[] args) {
	/* Escreva um programa que apresente a s�rie de Fibonacci at� o d�cimo quinto termo. A s�rie de Fibonacci � 
	 * formada pela seq��ncia:
	 *  1, 1, 2, 3, 5, 8, 13, 21, 34, ..., etc. Esta s�rie se caracteriza pela soma de um termo atual com o seu
	 *   anterior subseq�ente,
	 *   para que seja formado o pr�ximo valor da seq��ncia. Portanto come�ando com os n�meros 1, 1 o pr�ximo termo
	 *    � 1+1=2, o pr�ximo � 1+2=3
	 *   , o pr�ximo � 2+3=5, o pr�ximo 3+5=8, etc.
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


