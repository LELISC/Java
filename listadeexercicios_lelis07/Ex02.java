package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrever
		// o maior deles.

		Scanner escopo = new Scanner(System.in);
		int numero1, numero2, numero3;

		System.out.println("digite um n�mero:");
		numero1 = escopo.nextInt();

		System.out.println("digite um n�mero:");
		numero2 = escopo.nextInt();
		System.out.println("digite um n�mero:");
		numero3 = escopo.nextInt();
		
		if (numero1 > numero2 && numero1 > numero3) {
			
			System.out.println("o maior n�mero digitado � o "+numero1);
			
		} else if (numero2 > numero1 && numero2 > numero3) {
			
			System.out.println("o maior n�mero digitado � o "+numero2);

			
		}else if (numero3 > numero1 && numero3 > numero2) {
			
			System.out.println("o maior n�mero digitado � "+numero3);
			
			
		}
		escopo.close();
	}

}
