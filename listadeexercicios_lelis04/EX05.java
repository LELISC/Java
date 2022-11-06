package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		/* Elaborar um programa que efetue a apresentação do valor da conversão em dólar de um valor lido em real.
		 *  O programa deve solicitar o valor da cotação do dólar
		 *   e também a quantidade de reais disponível com o usuário, para que seja apresentado o valor em moeda americana.
		 */
		
		
		float qtdreal;
		float conversao;
		float dolar;
		
		
	   System.out.println("olá,\ndigite por favor o valor da cotação do dolar:");
	  
	   Scanner escopo = new Scanner(System.in);
	   
	   dolar = escopo.nextFloat();
	   
	   System.out.println("ok,\nagora digite por gentileza, quantos reais(brasileiro)você tem:");
	   
	   qtdreal = escopo.nextFloat();
	   
	   conversao = qtdreal/dolar;
	   
	   System.out.println("a quantidade de reais que você possui equivale a "+ conversao+" dólares");
	   
	   escopo.close();
	   
	   	   		
		
		
	}

}
