package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		/* Ler 3 valores (A, B e C) representando as medidas dos lados de um tri�ngulo e escrever se formam ou n�o um tri�ngulo.
		 *  OBS: para formar um tri�ngulo, o valor de cada lado deve ser menor que a soma dos outros 2 lados.
		 */

		
		
		// na segunda tentativa que ele erra, trava porque o while precisa ser no inicio no problema e n�o no final
		
	  Scanner escopo = new Scanner(System.in);
	  int ladoA,ladoB,ladoC;
	  
	  System.out.println("Ol�, vamos verificar se conseguimos formar um tri�ngulo com as medidas que voc� digita?");
	  System.out.println("\ndgite a medida do primeiro lado(provavel base do tri�ngulo):");
	  ladoA = escopo.nextInt();
	 
	  System.out.println("diite a medida do segundo lado:");
	  ladoB = escopo.nextInt();
	  
	  System.out.println("digite a medida do terceiro lado:");
	  ladoC = escopo.nextInt();
	  
	  if (ladoA < ladoB+ladoC) {
		  
		  System.out.println("\nque legal!\ncom essa medida, � possivel sim criar um tri�ngulo!");
		
	} else {
		
		System.out.println("bom... que pena! com os dados que voc� informou, n�o � possivel formar um tri�ngulo!\ntente colocar um valor que seja menor que a medida dos outros dois lados ");
		
		
	}while (ladoA > ladoB+ladoC) {
		
		 System.out.println("\ndgite novamente a medida do primeiro lado(provavel base do tri�ngulo):");
		  ladoA = escopo.nextInt();
		 
		  System.out.println("diite a medida do segundo lado:");
		  ladoB = escopo.nextInt();
		  
		  System.out.println("digite a medida do terceiro lado:");
		  ladoC = escopo.nextInt();
		  
		  if (ladoA < ladoB+ladoC) {
			  
			  System.out.println("\nque legal!\ncom essa medida, � possivel sim criar um tri�ngulo!");
			
		} else {
			
			System.out.println("bom... que pena! com os dados que voc� informou, n�o � possivel formar um tri�ngulo!\ntente colocar um valor que seja menor que a medida dos outros dois lados ");		
			
	}
	
	 escopo.close();	
		
	}

	}
	
}
