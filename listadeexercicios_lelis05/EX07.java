package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
		// Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los em ordem crescente.
		
		
		int valor1,valor2;
		
		
		System.out.println("digite um valor:");
		
		Scanner escopo = new Scanner(System.in);
		
		valor1 = escopo.nextInt();
	
		
		System.out.println("digite um segundo valor(diferente do primeiro): ");
		
		valor2 = escopo.nextInt();
		
		if (valor1 > valor2 ) {
			
			System.out.println(valor1+","+valor2);
			
		} else {

			System.out.println(valor2+","+valor1);
			
			
			escopo.close();
		}
		
		
		

	}

}
