package lacoderepeticao;

import java.util.Scanner;

public class LacoWhile {

	public static void main(String[] args) {
		// la�o de repeti��o while(enquanto)
		
		

		System.out.println("digite um numero:");

		Scanner escopo = new Scanner(System.in);

		int contadora = escopo.nextInt();

		while (contadora <= 100) {

			System.out.println(contadora);
			 
			contadora++;
			
			escopo.close();
			
			

		}

	}

}
