package listadeexercicios_lelis08;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/*Elaborar um programa que efetue a leitura de 10 valores num�ricos e apresente no final
		 *  o total do somat�rio e a m�dia aritm�tica dos valores lidos.
		 */

		Scanner escopo = new Scanner(System.in);
	  System.out.println("ol�, digite 10 n�meros:");
	  int numero1 = escopo.nextInt();
	  int numero2 = escopo.nextInt();
	  int numero3 = escopo.nextInt();
	  int numero4 = escopo.nextInt();
	  int numero5 = escopo.nextInt();
	  int numero6 = escopo.nextInt();
	  int numero7 = escopo.nextInt();
	  int numero8 = escopo.nextInt();
	  int numero9 = escopo.nextInt();
	  int numero10 = escopo.nextInt();
	 
	  int numeros [] = {numero1,numero2,numero3,numero4,numero5,numero6,numero7,numero8,numero9,numero10};
	  
	  int aux = 0;
	  
	 for (int i = 0; i < numeros.length; i++) {
		
		aux+=numeros[i];
		
		
	}
		
	 System.out.println(" a soma dos valores � "+aux);
	 System.out.println("e a media aritim�tica � aproximadamente "+(aux/10));
		
	 escopo.close();
	 
	}
	 
	 
	  
	  
	   
	
	 
	  
	  
	
	  
		
	}


