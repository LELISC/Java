package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX12 {

	public static void main(String[] args) {
		/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em estoque e
		 *  quantidade mínima em estoque de um produto. Calcular e escrever a quantidade média 
		 *  ((quantidademédia = quantidade máxima + quantidade mínima)/2). Se a quantidade em estoque for maior ou igual 
		 *  a quantidade média escrever a mensagem '
		 *  Não efetuar compra',
		 *  senão escrever a mensagem 'Efetuar compra'.
		 */

		
		
		System.out.println("digite a quantidade atual em estoque:");
		
		Scanner escopo = new Scanner(System.in);
		
		int qtd_estoque = escopo.nextInt();
		
		int qtd_maxima = 300;
		int qtd_minima = 200;
		
		int qtd_media = ((qtd_maxima+qtd_minima)/2);
		
		
		if (qtd_estoque >= qtd_media ) {
			
			System.out.println("não efetuar a compra");
			
		} else {

			System.out.println("efetuar a compra");
			
			
			escopo.close();
			
		}
		
	}

}
