package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		/*  Escreva um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
		 *  Calcular e escrever o valor do novo salário.
		 *  
		 */;
		 
      Scanner ler = new Scanner(System.in);
      
      System.out.println("Olá, digite o salario mensal atual: ");
      
      float salarioatual = ler.nextFloat();
      
      System.out.println("digite o percentual de reajuste: ");
      
      float reajustePercentual = ler.nextFloat();
      
      float novosalario = salarioatual*reajustePercentual/100+salarioatual;
      
      System.out.println("novo salário:"+ novosalario+" R$"); 
       
      
      ler.close();
      
		
		
		
	}
	
	

}
