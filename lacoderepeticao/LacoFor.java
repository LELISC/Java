package lacoderepeticao;

import java.util.Scanner;

public class LacoFor {

	public static void main(String[] args) {
		// La�o de repeti��o for
		
		
		System.out.println("ol�, digite o n�mero:");
		
		Scanner escopo = new Scanner(System.in);
		
		int numero = escopo.nextInt();
	
		for (int numero2 = 10; numero <= numero2; numero++) {
			
			System.out.println(numero);
			
			escopo.close();
		}

	}

}
