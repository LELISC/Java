package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		/*Fa�a um algoritmo para ler: quantidade atual em estoque, quantidade m�xima em estoque e
		 *  quantidade m�nima em estoque de um produto. Calcular e escrever a quantidade m�dia 
		 *  ((quantidadem�dia = quantidade m�xima + quantidade m�nima)/2). Se a quantidade em estoque for maior ou igual 
		 *  a quantidade m�dia escrever a mensagem '
		 *  N�o efetuar compra',
		 *  sen�o escrever a mensagem 'Efetuar compra'.
		 */

		
		
		System.out.println("digite a quantidade atual em estoque:");
		
		Scanner escopo = new Scanner(System.in);
		
		int qtd_estoque = escopo.nextInt();
		
		int qtd_maxima = 300;
		int qtd_minima = 200;
		
		int qtd_media = ((qtd_maxima+qtd_minima)/2);
		
		
		if (qtd_estoque >= qtd_media ) {
			
			System.out.println("n�o efetuar a compra");
			
		} else {

			System.out.println("efetuar a compra");
			
			
			escopo.close();
			
		}
		
	}

}
