package listadeexercicios_lelis05;


import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		/*
		 * Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem
		 * que diga se ela poder� ou n�o votar este ano (n�o � necess�rio considerar o
		 * m�s em que a pessoa nasceu).
		 */

		System.out.println("ol�, digite o ano que estamos:");

		Scanner escopo = new Scanner(System.in);

		int datahoje = escopo.nextInt();

		System.out.println("digite seu ano de nascimento agora: ");
		int nascimento = escopo.nextInt();
		
		int idade = datahoje-nascimento;
		
		
		if (idade >= 16 ) {
			 System.out.println("como provavelmente voc� j� tem "+idade+" anos de idade, voc� j� pode votar!" );
		} else {
			
			System.out.println("como provavelmente voc� tem "+idade+" anos de idade, voc� ainda n�o pode votar!" );

			
			escopo.close();
		}

		

	}

}
