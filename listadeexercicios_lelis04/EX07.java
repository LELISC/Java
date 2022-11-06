package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX07 {

	public static void main(String[] args) {
	/*  Elaborar um programa que efetue a leitura de três valores (A, B e C) e apresente como resultado final à soma dos quadrados dos três valores lidos.*/
		
		
		int numero1;
		int numero2;
		int numero3;
		int quadrado;
		int soma;
		
		System.out.println("opa, tudo bem?\npor favor, digite um numero:");
		
		Scanner escopo = new Scanner(System.in);
		
		numero1 = escopo.nextInt();
		
		System.out.println("digite o segundo numero: ");
		
		numero2 = escopo.nextInt();
		
		System.out.println("digite o terceiro numero:");
		
		numero3 = escopo.nextInt();
		
		soma = numero1+numero2+numero3;
		
		quadrado = soma*soma;
		
		System.out.println("muito bem\nse somarmos os valores e depois elevarmos ao o quadrado, temos um total de: "+quadrado);
		 
		
		
		escopo.close();
		
		
		
		
		

	}

}
