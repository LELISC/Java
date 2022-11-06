package lacoderepeticao;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// laço de repetição do while 
		
		System.out.println("digite um numero:");
		
		Scanner escopo = new Scanner(System.in);
		
		int numero = escopo.nextInt();
		
		do {
			
			System.out.println(numero);
			
			numero++;
			
		} while (numero <= 100);
		
		escopo.close();

	}

}
