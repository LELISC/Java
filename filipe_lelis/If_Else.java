package filipe_lelis;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// IF ELSE

		System.out.println("digite um número:");

		Scanner escopo = new Scanner(System.in);

		int numero = escopo.nextInt();

		if (numero > 20) {
			System.out.println("o número é maior que 20");

		} else {
			System.out.println("o número é menor que 20");
		}
     escopo.close();
	}

}
