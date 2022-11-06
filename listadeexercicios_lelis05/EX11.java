package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX11 {

	public static void main(String[] args) {
		/* Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. Após, 
		 * calcular e escrever o saldo atual (saldo atual = saldo - débito + crédito). 
		 * Também testar se saldo atual for maior ou igual a zero escrever a mensagem 'Saldo Positivo', senão escrever a mensagem
		 *  'Saldo Negativo'.
		 */

		
		
		System.out.println("DIGITE O NUMERO DA SUA CONTA SEM O DIGITO:");
		
		
	   Scanner escopo = new Scanner(System.in);
	   
	   int conta = escopo.nextInt();
	   
	
	   System.out.println("DIGITE SEU SALDO:");
	   
	   int saldo = escopo.nextInt();
	   
	   System.out.println("DIGITE QUANTO VOCÊ TEM DE DEBITO:");
	   
	   
	   int debito = escopo.nextInt();
	   
	   System.out.println("DIGITE QUANTO VOCÊ TEM DE CRÉDITO");
	   
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
