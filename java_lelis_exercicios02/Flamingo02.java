package java_lelis_exercicios02;

import java.util.Scanner;

public class Flamingo02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("por favor, digite um numero!");
		
		int numero = sc.nextInt();
		int antecessor = numero-1;
		
		System.out.println(" o numero antecessor ao que você digitou é " + antecessor);
		
		sc.close();
		
		
		
	
	}

}
