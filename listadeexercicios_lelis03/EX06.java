package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		/* Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. 
		 * A fórmula deconversão é C=(F-32)*(5/9),
		 *  sendo F a temperatura em Fahrenheit e C a temperatura em Celsius.
		 */

		
		 Scanner ler = new Scanner(System.in);
		 
		 float fahrenheit;
		 float celsius;
		 
		 System.out.println("digite a temperatura atual em fahrenheit:");
		 
		 fahrenheit = ler.nextFloat();
		 
		 celsius = (fahrenheit - 32) * 5/9;
		 
		 System.out.println("a temperatura digitada em graus celsius é de: "+celsius+"°");
		 
		 ler.close();
		 
		 
		 
		 
	}

}
