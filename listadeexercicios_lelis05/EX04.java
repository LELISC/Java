package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
		/*
		 * Ler as notas da 1a. e 2a. avalia��es de um aluno. Calcular a m�dia aritm�tica
		 * simples e escrever uma mensagem que diga se o aluno foi ou n�o aprovado
		 * (considerar que nota igual ou maior que 6 o aluno � aprovado). Escrever
		 * tamb�m a m�dia calculada.
		 */

		System.out.println("DIGITE A PRIMEIRA NOTA DO ALUNO:");

		Scanner escopo = new Scanner(System.in);

		float nota1 = escopo.nextFloat();

		System.out.println("digite a segunda nota do aluno:");

		float nota2 = escopo.nextFloat();
		
		float media = (float) (nota1+nota2)/2;
		
		if (media >= 6) {
			
			System.out.println("a m�dia final do aluno � "+media+" portanto, ele foi aprovado!");
			
		} else {
			
			System.out.println("a m�dia final do aluno � "+media+" portanto, ele foi reprovado!");

			
			escopo.close();
		}
		
				
				

	}

}
