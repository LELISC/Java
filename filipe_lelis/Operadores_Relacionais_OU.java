package filipe_lelis;

import java.util.Scanner;

public class Operadores_Relacionais_OU {

	public static void main(String[] args) {
		// operador ou 
		
		
		System.out.println("Olá, digite um número: ");
		
		Scanner escopo = new Scanner(System.in);
		
		int numero1 = escopo.nextInt();
		
		int numero2 = 3;
		
		int numero3 = 4;
		
		if (numero1 == numero2 || numero1 == numero3 ) {
			
			System.out.println("numero correto!");
			
		} else {
           System.out.println("numero incorreto!");
           
           escopo.close();
		}

	}

}
