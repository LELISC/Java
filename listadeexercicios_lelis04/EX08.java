package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		/* Elaborar um programa de computador que efetue a leitura de quatro valores inteiros (vari�veis A, B, C e D).
		 * Ao final o programa deve apresentar o resultado do produto (vari�vel P) do primeiro com o terceiro valor, e o resultado do produto (vari�vel P) 
		 * do primeiro com o terceiro valor, e o resultado da soma (vari�vel S) do segundo com o quarto valor.
		 */
		
		
		
	    int variavelA; //1
		int variavelB; //2
		int variavelC; //3
		int variavelD; //4
		int variavelP; //4
		int variavelS; //5
		

		
		 System.out.println(" ol�\npor favor, digite um n�mero:");
		 
		 Scanner escopo = new Scanner(System.in);
		 
		 variavelA = escopo.nextInt();
		 
		 System.out.println("digite mais um n�mero, por favor:");
		 
		 variavelB = escopo.nextInt();
		 
		 System.out.println("digite mais um:");
		 
		 variavelC = escopo.nextInt();
		 
		 System.out.println(" digite o ultimo n�mero:");
		 
		 variavelD = escopo.nextInt();
		 
		 variavelP = variavelA*variavelC;
		 
		 variavelS = variavelB+variavelD;
		 
		  System.out.println("se multiplicarmos o primeiro valor com o terceiro, temos um total de: "+variavelP+" e se somarmos o segundo n�mero digitado com o quarto, temos um total de: "+variavelS);
		
		 
		 escopo.close();
		 
	
		 
		 
	}

}
