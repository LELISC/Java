package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Ler um valor e escrever se � positivo, negativo ou zero.
		
		
		Scanner escopo = new Scanner(System.in);
		int numero;
		
		System.out.println("ol�!\ndigite um n�mero");
		numero = escopo.nextInt();
		
		
		if (numero < 0 ) {
			
		  System.out.println("o n�mero digitado � negativo!");
			
		} if (numero == 0 ){
			
			System.out.println("o n�mero digitado � igual a zero");

		} else if (numero > 0 ) {
			
			System.out.println("o n�mero digitado � positivo");
			
		} 
			
			escopo.close();
		
		
		
	
		
		
		

	}

}
