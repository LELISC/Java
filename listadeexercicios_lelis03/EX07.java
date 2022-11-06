package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		/* Calcular e apresentar o valor do volume de uma lata de óleo, 
		 * utilizando a fórmula: Volume = π*Raio2*Altura
		 */

		
		
		System.out.println("digite o valor do raio em centímetros: ");
		
		Scanner escopo = new Scanner(System.in);
		
		int raio = escopo.nextInt();
		 
		System.out.println("digite a altura: ");
		
		int altura = escopo.nextInt();
		
		float pi = (float)3.14;
						
		float volumeLata = pi*raio*raio*altura/1000;
		
		
		System.out.println("o volume da lata em centimetros é de: "+volumeLata+" Litros");
		
		escopo.close();
		
	    
		
		
 
}
}