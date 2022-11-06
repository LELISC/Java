package listadeexercicios_lelis04;

import java.util.Scanner;

public class Teste {

	public static void main(String[] args) {
		
		int idade;
		int soma;
		
		
		System.out.println("olá,\ntudo bem?");
		System.out.println("digite sua idade");
		Scanner escopo = new Scanner(System.in);
		
		
		idade = escopo.nextInt();
		
			
		soma = idade+5;
		
		
		System.out.println("daqui cinco anos, você terá exatamente: "+soma+" anos");
		
		escopo.close();
		
		
		
		
		
		
				
				
		
	

	}

}
