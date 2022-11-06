package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		// Ler dois valores (considere que não serão lidos valores iguais) e escrever o maior deles.

		int valor1,valor2;
		
		System.out.println("digite um valor:");
		
		Scanner escopo = new Scanner(System.in);
		
		valor1 = escopo.nextInt();
		
		System.out.println("digite um segundo valor:");
		
		valor2 = escopo.nextInt();
		
		
		if (valor1 > valor2) {
			
			System.out.println("o primeiro valor digitado é o maior = "+valor1);
			
		} else {
			
			System.out.println("o segundo valor digitado é o maior = "+valor2);
			
			escopo.close();

		}
		
		
		
	}

}
