package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		/* Ler dois valores e imprimir uma das tr�s mensagens a seguir: �N�meros iguais�, caso os n�meros sejam iguais 
		 * �Primeiro � maior�, caso o primeiro seja maior que o segundo;
		 * �Segundo maior�, caso o segundo seja maior que o primeiro.
		 */

		Scanner escopo = new Scanner(System.in);
		int numero1,numero2;
		
		System.out.println("digite um n�mero:");
		numero1 = escopo.nextInt();
		
		System.out.println("digite o segundo n�mero:");
		numero2 = escopo.nextInt();
		
		if (numero1 > numero2) {
			
			System.out.println("o primeiro n�mero digitado � maior!");
			
		} else if (numero2 > numero1) {
			
			System.out.println("o segundo n�mero digitado � maior!");
			
		}else if (numero1== numero2) {
			
			System.out.println("os n�meros digitados s�o iguais!");
		} {

		}
		
        escopo.close();

	}

}
