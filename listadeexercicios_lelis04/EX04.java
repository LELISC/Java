package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX04 {
	
	
	/* Elaborar um programa que efetue a apresentação 
	   do valor da conversão em real de um valor lido em dólar. 
	   O programa deve solicitar o valor da cotação do dólar
	   e também a quantidade de dólares disponível com o usuário, para que seja apresentado o valor em moeda brasileira.*/
	
	public static void main(String[] args) {
		
		float dolar;
		float dolarqtd;
		float conversao;
		
		
		System.out.println("Olá, por favor digite o valor da cotação do dólar");
		
		Scanner escopo = new Scanner(System.in);
		
		dolar = escopo.nextFloat();
		
		System.out.println("quantos dolares você possui?");
		
		dolarqtd = escopo.nextFloat();
		
		
		conversao = dolarqtd*dolar;
		
	    System.out.println(" a quantidade de dolar que você pussi se convertido em real é "+conversao+" reais");
	
		escopo.close();
		
		
		

	}

}
