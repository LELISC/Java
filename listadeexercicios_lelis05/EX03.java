package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		/*  As maçãs custam R$ 1,30 cada se forem compradas menos de uma d�zia, e R$ 1,00 se foremcompradas pelo menos 12. 
		 * Escreva um programa que leia o n�mero de ma��s compradas, calcule e escreva o custo total da compra.
		 */

		
		System.out.println("quantas ma��s voc� comprou?");
		
		Scanner escopo = new Scanner(System.in);
		
		int numeromacas = escopo.nextInt();
		
		float valor1 = (float) (1.30*numeromacas);
		
		float valor2 = (float) (1.00*numeromacas);
		
		if (numeromacas>= 12 ) {
			
		 System.out.println("como você comprou "+numeromacas+" você irá pagar "+ valor2);
			
		} else {
			
			 System.out.println("como voc� comprou "+numeromacas+" você irá pagar "+ valor1);
			 
			 	 
		escopo.close();

		}
		
				
		
	}

}
