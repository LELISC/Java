package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/* Fa�a um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
		 *  e escreva a idade dessa pessoa expressa apenas em dias.
		 *  Considerar ano com 365 dias e m�s com 30 dias.
		 */

		
		System.out.println("ol�, digite abaixo sua idade com informa��es de ano m�s e dia: ");
		System.out.println("por exemplo: 1 ano 4 meses e 5 dias");
		System.out.println("\nANOS:");
		
		Scanner escopo = new Scanner(System.in); 
		int idade = escopo.nextInt();
		
		System.out.println("MESES: ");
		int mes = escopo.nextInt();
		
		System.out.println("DIAS: ");
		int dia = escopo.nextInt();
		
		
		
		int idadedias = idade*365; int mesdias = mes*30; int soma = idadedias+mesdias+dia;
		
        
        System.out.println("bom, com base nos dados que voc� informou, voc� possui exatamente:"+soma+" dias de idade");
        
        
        escopo.close();
        
     	
	}

}
