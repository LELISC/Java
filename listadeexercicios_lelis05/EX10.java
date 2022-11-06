package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX10 {

	public static void main(String[] args) {
		/* Ler o salário fixo e o valor das vendas efetuadas pelo vendedor de uma empresa.
		 * Sabendo-se que ele recebe uma comissão de 3% sobre o total das vendas até R$ 1.500,00 mais 5% sobre o que ultrapassar este valor, 
		 * calcular e escrever o seu salário total.
		 */
		
		//Digitar salario fixo

		System.out.println("digite seu salário Fixo:");
		
		Scanner escopo = new Scanner(System.in);
		
		float salarioFixo = escopo.nextFloat();
				
		System.out.println(salarioFixo);
		
		
		//Digitar vendas

		System.out.println("digite suas vendas:");
		
		float vendas = escopo.nextFloat();
			
		
		System.out.println(vendas);
		
		//Valor a receber (salario + vendas)
		
		float  taxadecomissao = 3;
				
		float vlr_receber;
		
		float vlr_comissao;
		
		vlr_comissao = vendas * (taxadecomissao / 100);
		
		vlr_receber = (vlr_comissao + salarioFixo);
		
		System.out.println(vendas);
		
		System.out.println(taxadecomissao);
		
		System.out.println(vlr_receber);
		
		escopo.close();
		
		//System.out.println("digite quanto você vendeu:");
		
		//float vendas = escopo.nextFloat();
		
		//float comissao1 = 3/100;
		
		//float comissao2 = 5/100;
		
		
		//System.out.println(vendas);
		
	
	
		/*if (vendas <= 1.500 ) {
			
			
			System.out.println("seu salário final é de:"+salarioFixo+" com  uma comissão de 3% sobre o total de vendas");
			
			
		} else {

			System.out.println("seu salário final é de:"+salarioFixo+" com  uma comissão de 3% sobre o total de vendas");
			
			
			
			escopo.close();
		}
		
		*/
		
		
		
		
		
		
	}

}


