package filipe_lelis;

import java.util.Scanner;

public class If_Else {

	public static void main(String[] args) {
		// IF ELSE

		System.out.println("digite um n�mero:");

		Scanner escopo = new Scanner(System.in);

		int numero = escopo.nextInt();

		if (numero > 20) {
			System.out.println("o n�mero � maior que 20");

		} else {
			System.out.println("o n�mero � menor que 20");
		}
     escopo.close();
	}

}
