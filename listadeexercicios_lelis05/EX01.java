package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/* Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que 10,
		 *  caso contrário escrever NÃO É MAIOR QUE 10!
		 */


       System.out.println("Olá, por favor, digite um número: ");
       
       Scanner escopo = new Scanner(System.in);
       
       int numero1 = escopo.nextInt();
       
        if (numero1 > 10 ) {
			
        	System.out.println("é maior que 10");
        	
		} else {

			System.out.println("é menor que 10");
			
			escopo.close();
			
		}
       
       
	}

}
