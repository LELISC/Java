package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/* Ler um valor e escrever a mensagem � MAIOR QUE 10! se o valor lido for maior que 10,
		 *  caso contr�rio escrever N�O � MAIOR QUE 10!
		 */


       System.out.println("Ol�, por favor, digite um n�mero: ");
       
       Scanner escopo = new Scanner(System.in);
       
       int numero1 = escopo.nextInt();
       
        if (numero1 > 10 ) {
			
        	System.out.println("� maior que 10");
        	
		} else {

			System.out.println("� menor que 10");
			
			escopo.close();
			
		}
       
       
	}

}
