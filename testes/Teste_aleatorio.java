package testes;

import java.util.Scanner;

public class Teste_aleatorio {

	public static void main(String[] args) {
		// OU COM STRING
		
		
		System.out.println("digite uma das subcausas abaixo:\n\n-endereço incorreto\n-carteiro não atendido");
		
		Scanner escopo = new Scanner(System.in);
		
		String causaraiz = "entrega não efetuada";
	
		
		
		
		String subcausa = escopo.nextLine();
		
		String subcausa1 = "endereço incorreto";
		
		String subcausa2 = "carteiro não atendido";
		
		if (subcausa.equals(subcausa1)  || subcausa.equals(subcausa2)) {
			
			System.out.println("\ncausa raiz: "+causaraiz);
			
		} else {
			
			System.out.println("o valor digitado não é uma subcausa!");
			
			escopo.close();

		}
		
	
	

	}

}
