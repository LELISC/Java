package filipe_lelis;

import java.util.Scanner;

public class Operadores_Relacionais_igual {

	public static void main(String[] args) {
		// 0peradores Relacionais ==

		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite a senha:");

		String valor1 = ler.next();

		String valor2 = "senha";
		
		// quando for string, precisa ser equals

		if ((valor1).equals(valor2)) {

			System.out.println("Bem Vindo!");

		} else {

			System.out.println("senha incorreta!");

			
			ler.close();
		}

	}

}
