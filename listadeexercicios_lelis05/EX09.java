package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		/*  A jornada de trabalho semanal de um funcion�rio � de 40 horas. O funcion�rio que trabalhar mais de 40 horas receber� hora extra,
		 *  cujo c�lculo � o valor da hora regular com um acr�scimo de 50%. Escreva um algoritmo que leia o n�mero de horas trabalhadas em um m�s,
		 *  o sal�rio por hora e escreva o sal�rio total do funcion�rio, que dever� ser acrescido das horas extras, 
		 * caso tenham sido trabalhadas (considere que o m�s possua 4 semanas exatas).
		 */

		
		
		System.out.println("simula��o de sal�rio com hora extra\n\n");
		System.out.println("digite seu sal�rio fixo: ");
		
		Scanner escopo = new Scanner(System.in);
		
		float salarioFixo = escopo.nextFloat();
		
		int horasPadraoMes = 160;
		
		float salarioHora = salarioFixo/horasPadraoMes; 
		
		System.out.println("digite quantas horas voc� trabalhou no m�s:");
		
        int horasTrabalhadas = escopo.nextInt();
        
        float salarioExtra = salarioFixo*50/100+salarioHora+salarioFixo;
        
       
		if (horasTrabalhadas > horasPadraoMes) {
			
			
			System.out.println("voc� trabalhou hora extra e recebera um aumento de 50% na hora trabalhada dando um total de: "+salarioExtra+" reais");
			
		} else {

			System.out.println("voc� n�o trabalho hora extra e recebera "+salarioFixo+" reais");
			
			
			escopo.close();
			
		}
		
		
	
		
	}

}
