package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX04 {
	
	
	/* Elaborar um programa que efetue a apresenta��o 
	   do valor da convers�o em real de um valor lido em d�lar. 
	   O programa deve solicitar o valor da cota��o do d�lar
	   e tamb�m a quantidade de d�lares dispon�vel com o usu�rio, para que seja apresentado o valor em moeda brasileira.*/
	
	public static void main(String[] args) {
		
		float dolar;
		float dolarqtd;
		float conversao;
		
		
		System.out.println("Ol�, por favor digite o valor da cota��o do d�lar");
		
		Scanner escopo = new Scanner(System.in);
		
		dolar = escopo.nextFloat();
		
		System.out.println("quantos dolares voc� possui?");
		
		dolarqtd = escopo.nextFloat();
		
		
		conversao = dolarqtd*dolar;
		
	    System.out.println(" a quantidade de dolar que voc� pussi se convertido em real � "+conversao+" reais");
	
		escopo.close();
		
		
		

	}

}
