package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX05 {

	public static void main(String[] args) {
		
		/* Elaborar um programa que efetue a apresenta��o do valor da convers�o em d�lar de um valor lido em real.
		 *  O programa deve solicitar o valor da cota��o do d�lar
		 *   e tamb�m a quantidade de reais dispon�vel com o usu�rio, para que seja apresentado o valor em moeda americana.
		 */
		
		
		float qtdreal;
		float conversao;
		float dolar;
		
		
	   System.out.println("ol�,\ndigite por favor o valor da cota��o do dolar:");
	  
	   Scanner escopo = new Scanner(System.in);
	   
	   dolar = escopo.nextFloat();
	   
	   System.out.println("ok,\nagora digite por gentileza, quantos reais(brasileiro)voc� tem:");
	   
	   qtdreal = escopo.nextFloat();
	   
	   conversao = qtdreal/dolar;
	   
	   System.out.println("a quantidade de reais que voc� possui equivale a "+ conversao+" d�lares");
	   
	   escopo.close();
	   
	   	   		
		
		
	}

}
