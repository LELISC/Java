package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		/*  Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os:
		 * morango at� 5kg = 2,50 por kg; ma�� at� 5kg = 1,80
		 * morango acima de 5kg = 2,20 por kg; ma�� acima de 5kg = 1,50 por kg
		 * 
		 * 
		 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
		 * receber� ainda um desconto 
		 * de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade (em Kg) 
		 * de ma�as adquiridas e escreva o 
		 * valor a ser pago pelo cliente.
		 * 
		 */

		Scanner escopo = new Scanner(System.in);
		
		// valor do morando e ma�� por kg at� 5kg
		double valorMorango1 = 2.50, valorMaca1 = 1.80;
		// valor do morango e ma�� por kg acima de 5kg 
		double valorMorango2 = 2.20, valorMaca2 = 1.50;
		
		// regras e instru��es para receber desconto
		
		System.out.println("segue nossa regra de compras aqui na loja HORTI-FRUIT!");
		System.out.println("\nmorango at� 5kg = 2,50 por kg; ma�� at� 5kg = 1,80\nmorango acima de 5kg = 2,20 por kg; ma�� acima de 5kg = 1,50 por kg");
		System.out.println("Se voc� comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00 reais, receber� ainda um desconto de 10%\nsobre o valor total! ");
		
		
		
		System.out.println("\n\ndigite quantos kg de morango voc� comprou:");
		double morango = escopo.nextDouble();
		
		System.out.println("show, agora digite quantos kg de ma�� voc� comprou:");
		double maca = escopo.nextDouble();
		
		
		
		double resultado1 = morango*valorMorango1;
		double resultado2 = maca*valorMaca1;
		double resultado3 = maca*valorMorango2;
		double resultado4 = maca*valorMaca2;
		
		double kgTotal = maca+morango;
		double porcentagem = 0.1*(resultado3+resultado4);
		double valorComPorcentagem = (resultado3+resultado4)-porcentagem;
		
	    if (morango <= 5 && maca <=5 ) {
			
			
		System.out.println("como voc� comprou "+morango+" Kg de morango,ele saiu por "+resultado1+" reais");
          
			
		System.out.println("como voc� comprou "+maca+" Kg de ma��, saiu por "+resultado2+" reais");
			
		
		System.out.println("e soma da sua compra � de: "+resultado1+resultado2);		

		}
		else if (morango <= 5 && maca > 5) {
			
			
		       System.out.println("como voc� comprou "+morango+" Kg de morango,ele saiu por "+resultado1+" reais");
		          
					
					System.out.println("como voc� comprou "+maca+" Kg de ma��, saiu por "+resultado4+" reais");
					
				
					System.out.println("e soma da sua compra � de: "+(resultado1+resultado4));
		
		
		}else if (morango > 5 && maca <= 5) {
			
			
		       System.out.println("como voc� comprou "+morango+" Kg de morango,ele saiu por "+resultado3+" reais");
		          
					
					System.out.println("como voc� comprou "+maca+" Kg de ma��, saiu por "+resultado2+" reais");
					
				
					System.out.println("e soma da sua compra � de: "+(resultado3+resultado2));
			
		
		}if (kgTotal > 8 || kgTotal*(resultado3+resultado4) > 25 ) {
			
			System.out.println("opa, mas como voc� comprou "+kgTotal+" Kg de frutas,ganhou 10% de desconto e sua compra saiu por "+valorComPorcentagem+" reais");
		
		
	
			
		}
	
		
		escopo.close();
		
	}

}
