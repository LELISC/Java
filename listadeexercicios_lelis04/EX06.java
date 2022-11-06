package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX06 {

	public static void main(String[] args) {
		/* Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três valores lidos.*/
		
		
		int numero1;
		int numero2;
		int numero3;
		int resultadofinal;
		int resultado1;
		int resultado2;
		int resultado3;
		
		System.out.println("olá\npor favor, digite um número:");
		
		Scanner escopo = new Scanner(System.in);
		
		numero1 = escopo.nextInt();
		
		System.out.println("digite mais um número:");
		
		numero2 = escopo.nextInt();
		
		System.out.println("digite mais um número: ");
		
		numero3 = escopo.nextInt();
		
		resultado1 = numero1*numero1;
		resultado2 = numero2*numero2;
		resultado3 = numero3*numero3;
		
		resultadofinal = resultado1+resultado2+resultado3;
		
		System.out.println("os numeros digitados elevado ao quadrado são: "+resultado1+", "+ resultado2+", "+ resultado3+", "+" e a soma deles resulta em: "+resultadofinal);
		
		
		
	
		escopo.close();
		
		

	}

}
