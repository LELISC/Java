package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
		 *  e escreva a idade dessa pessoa expressa apenas em dias.
		 *  Considerar ano com 365 dias e mês com 30 dias.
		 */

		
		System.out.println("olá, digite abaixo sua idade com informações de ano mês e dia: ");
		System.out.println("por exemplo: 1 ano 4 meses e 5 dias");
		System.out.println("\nANOS:");
		
		Scanner escopo = new Scanner(System.in); 
		int idade = escopo.nextInt();
		
		System.out.println("MESES: ");
		int mes = escopo.nextInt();
		
		System.out.println("DIAS: ");
		int dia = escopo.nextInt();
		
		
		
		int idadedias = idade*365; int mesdias = mes*30; int soma = idadedias+mesdias+dia;
		
        
        System.out.println("bom, com base nos dados que você informou, você possui exatamente:"+soma+" dias de idade");
        
        
        escopo.close();
        
     	
	}

}
