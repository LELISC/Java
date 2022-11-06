package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		// Ler um valor e escrever se é positivo ou negativo (considere o valor zero como positivo).
		
		
		
		System.out.println("digite valor: ");
		
		Scanner escopo = new Scanner(System.in);
		
		int numero1 = escopo.nextInt();
		
		
		if (numero1 < 0  ) {
			
			System.out.println("o valor digitado é negativo");
			
		} else {
			
			System.out.println("o valor digitado é positivo");
			
			escopo.close();

		}

	}

}
