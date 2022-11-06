package filipe_lelis;

import java.util.Scanner;

public class Operadores_Relacionais_diferentes {

	public static void main(String[] args) {
		// 0peradores_Relacionais != diferente
		
		System.out.println("digite um numero: ");
		
		Scanner escopo = new Scanner(System.in);
		
		int numero1 = escopo.nextInt();
		
		int numero2 = 45;
		
		if (numero1 != numero2) {
			
			System.out.println("diferente");
			
		} else {
 
			System.out.println("igual");
			
		}
		
		escopo.close();

	}

}
