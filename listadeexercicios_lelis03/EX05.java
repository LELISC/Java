package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		/* Ler uma temperatura em graus Celsius e apresent�-la convertida em graus Fahrenheit.
		 *  A f�rmula de convers�o � F = (9*C + 160)/5,
		 *  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */
    
		
		Scanner ler = new Scanner(System.in);
		
		float celsius;
		float fahrenheit;
		
		System.out.println("digite qual tempertura estamos em graus celsius: ");
		
		celsius = ler.nextFloat();
		
	    fahrenheit = (celsius* 9/5) + 32;
	    
	    System.out.println("essa temperatura em graus fahrenheit � de:  "+fahrenheit+"�");
	    
	    ler.close();
		
	}

}
