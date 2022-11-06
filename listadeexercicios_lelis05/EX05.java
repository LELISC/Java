package listadeexercicios_lelis05;


import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poderá ou não votar este ano (não é necessário considerar o
		 * mês em que a pessoa nasceu).
		 */

		System.out.println("olá, digite o ano que estamos:");

		Scanner escopo = new Scanner(System.in);

		int datahoje = escopo.nextInt();

		System.out.println("digite seu ano de nascimento agora: ");
		int nascimento = escopo.nextInt();
		
		int idade = datahoje-nascimento;
		
		
		if (idade >= 16 ) {
			 System.out.println("como provavelmente você já tem "+idade+" anos de idade, você já pode votar!" );
		} else {
			
			System.out.println("como provavelmente você tem "+idade+" anos de idade, você ainda não pode votar!" );

			
			escopo.close();
		}

		

	}

}
