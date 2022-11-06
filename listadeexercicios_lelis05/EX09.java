package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		/*  A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário que trabalhar mais de 40 horas receberá hora extra,
		 *  cujo cálculo é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número de horas trabalhadas em um mês,
		 *  o salário por hora e escreva o salário total do funcionário, que deverá ser acrescido das horas extras, 
		 * caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
		 */

		
		
		System.out.println("simulação de salário com hora extra\n\n");
		System.out.println("digite seu salário fixo: ");
		
		Scanner escopo = new Scanner(System.in);
		
		float salarioFixo = escopo.nextFloat();
		
		int horasPadraoMes = 160;
		
		float salarioHora = salarioFixo/horasPadraoMes; 
		
		System.out.println("digite quantas horas você trabalhou no mês:");
		
        int horasTrabalhadas = escopo.nextInt();
        
        float salarioExtra = salarioFixo*50/100+salarioHora+salarioFixo;
        
       
		if (horasTrabalhadas > horasPadraoMes) {
			
			
			System.out.println("você trabalhou hora extra e recebera um aumento de 50% na hora trabalhada dando um total de: "+salarioExtra+" reais");
			
		} else {

			System.out.println("você não trabalho hora extra e recebera "+salarioFixo+" reais");
			
			
			escopo.close();
			
		}
		
		
	
		
	}

}
