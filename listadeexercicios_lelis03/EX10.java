package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		
		/* Ler dois valores (inteiros, reais ou caracteres) para as variáveis A e B, 
		 * e efetuar a troca dos valores de forma que a variável A passe a possuir o valor da variável B e a variável B passe a
		 *  possuir o valor da variável A. Apresentar os valores trocados.
		 */
   
		
		String valor,valor1;
	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("didgite um valor:");
		
		valor = sc.nextLine();
		
		System.out.println("digite outro valor:");
		
		valor1 = sc.nextLine();
		
		
		System.out.println("\n"+valor1+"\n"+valor);
		
	   
	    sc.close();
	 
	
	}

}
