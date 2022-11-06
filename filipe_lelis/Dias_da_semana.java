package filipe_lelis;

import java.util.Scanner;

public class Dias_da_semana {

	public static void main(String[] args) {
		// IF ELSE DIAS DA SEMANA

		System.out.println("digite um número de 1 a 7:");

		Scanner escopo = new Scanner(System.in);

		int numero = escopo.nextInt();

		if (numero == 1) {

			System.out.println("segunda-feira");

			if (numero == 2) {

				System.out.println("terça-feira");

				if (numero == 3) {
					System.out.println("quarta-feira");

					if (numero == 4) {
						System.out.println("quinta-feira");

						if (numero == 5) {
							System.out.println("sexta-feira");

							if (numero == 6) {
								System.out.println("sábado");

								if (numero == 7) {
									System.out.println("domingo");

								}

							}

						}

					}

				}

			}

		}

		else {

			System.out.println("esse número não é correspondente a um dia da semana");

			escopo.close();
		}

	}

}
