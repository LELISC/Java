package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		/* Fa�a um algoritmo para ler: n�mero da conta do cliente, saldo, d�bito e cr�dito. Ap�s, 
		 * calcular e escrever o saldo atual (saldo atual = saldo - d�bito + cr�dito). 
		 * Tamb�m testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', sen�o escrever a mensagem
		 *  'Saldo Negativo'.
		 */

		
		
		System.out.println("DIGITE O NUMERO DA SUA CONTA SEM O DIGITO:");
		
		
	   Scanner escopo = new Scanner(System.in);
	   
	   int conta = escopo.nextInt();
	   
	
	   System.out.println("DIGITE SEU SALDO:");
	   
	   int saldo = escopo.nextInt();
	   
	   System.out.println("DIGITE QUANTO VOC� TEM DE DEBITO:");
	   
	   
	   int debito = escopo.nextInt();
	   
	   System.out.println("DIGITE QUANTO VOC� TEM DE CR�DITO");
	   
	   int credito = escopo.nextInt();
	   
	   int saldoAtual = saldo-debito+credito;
	   
	   
	   if (saldoAtual >=0 ) {
		   
		  System.out.println(conta+"SALDO POSITIVO"); 
		  
		
	} else {
		
		 System.out.println(conta+"SALDO NEGATIVO"); 
		 
		 escopo.close();

	}
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	}

}
