package testes;

import java.util.Scanner;

public class Teste_aleatorio {

	public static void main(String[] args) {
		// OU COM STRING
		
		
		System.out.println("digite uma das subcausas abaixo:\n\n-endere�o incorreto\n-carteiro n�o atendido");
		
		Scanner escopo = new Scanner(System.in);
		
		String causaraiz = "entrega n�o efetuada";
	
		
		
		
		String subcausa = escopo.nextLine();
		
		String subcausa1 = "endere�o incorreto";
		
		String subcausa2 = "carteiro n�o atendido";
		
		if (subcausa.equals(subcausa1)  || subcausa.equals(subcausa2)) {
			
			System.out.println("\ncausa raiz: "+causaraiz);
			
		} else {
			
			System.out.println("o valor digitado n�o � uma subcausa!");
			
			escopo.close();

		}
		
	
	

	}

}
