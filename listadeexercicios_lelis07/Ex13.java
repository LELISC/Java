package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		/* Fa�a um algoritmo para ler: a descri��o do produto (nome), a quantidade adquirida e o pre�o 
		 * unit�rio. Calcular e escrever o total (total = quantidade adquirida * pre�o unit�rio),
		 *  o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:
		 *  
		 *  - Se quantidade <= 5 o desconto ser� de 2%

            - Se quantidade > 5 e quantidade <=10 o desconto ser� de 3%
   
             - Se quantidade > 10 o desconto ser� de 5%
             */
		
		  Scanner escopo = new Scanner (System.in);
		  System.out.println("ol�, seja bem vindo a loja de camisetas fashion black!");
		  
		  // tabela de pre�os
		  System.out.println("\nsegue nossa tabela de pre�os:\n|camiseta air jordan|\n35 reais\n|shorts air jordan|\n30 reais\n|cal�a air jordan|\n55 reais");
		
		  
		  
		  // solicitar para que o us�ario informe qual produto 
		  System.out.println("\n\ndigite o n�mero do produto voc� prefere!: ");
		  System.out.println("\n1- camiseta jordan\n2- shorts jordan\n3- cal�a joradn ");
		  int produto = escopo.nextInt();

		  // se for uma camiseta 
		  
		  if (produto == 1) {
			  
			
			  System.out.println("show, voc� escolheu a camiseta joradn\n agora digite a quantidade que voc� quer:");
			  int  quantidade = escopo.nextInt();
			  
			  
			   if (quantidade <= 5) {
				  
				  
				  int valorCamiseta = 35;
				  
				  float soma = valorCamiseta*quantidade;
				  float prCamiseta1 = ((float)3/100*(soma));
				  float valorPagar = soma-prCamiseta1;
				  
				  System.out.println("voc� recebeu um desconto de 2% e portanto pagara um total de:"+valorPagar);
				  System.out.println("\nObrigado por comprar com a Nike!");
				  
				  
			  }  if (quantidade > 5 && quantidade <=10) {
					  
					  
					  int valorCamiseta = 35;
					  
					  float soma = valorCamiseta*quantidade;
					  float prCamiseta1 = ((float)3/100*(soma));
					  float valorPagar = soma-prCamiseta1;
					  
					  System.out.println("voc� recebeu um desconto de 3% e portanto pagara um total de:"+valorPagar);
					  System.out.println("\nObrigado por comprar com a Nike!");
					  
				} if (quantidade > 10 ) {
					
					int valorCamiseta = 35;
					  
					  float soma = valorCamiseta*quantidade;
					  float prCamiseta1 = ((float)5/100*(soma));
					  float valorPagar = soma-prCamiseta1;
					  
					  System.out.println("voc� recebeu um desconto de 5% e portanto pagara um total de:"+valorPagar);
					  
					  System.out.println("\nObrigado por comprar com a Nike!");
		
				} }
				 // se for shorts
				
                     else if (produto == 2) {
					
					System.out.println("show, voc� escolheu o shorts jordan\n agora digite a quantidade que voc� quer:");
					
					int quantidade2 = escopo.nextInt();
					
					if (quantidade2 <= 5 ) {
						
						 int valorShorts = 30;
						  
						  float soma = valorShorts*quantidade2;
						  float prShorts1 = ((float)2/100*(soma));
						  float valorPagar = soma-prShorts1;
						  
						  System.out.println(" voc� recebeu um desconto de 2% e portanto pagara um total de: "+valorPagar );
						  System.out.println("\nObrigado por comprar com a Nike!");
						  
					} if (quantidade2 > 5 && quantidade2 <= 10 ) 	{
							  
						int valorShorts = 30;
						  
						  float soma = valorShorts*quantidade2;
						  float prShorts1 = ((float)3/100*(soma));
						  float valorPagar = soma-prShorts1;
						  
						  System.out.println(" voc� recebeu um desconto de 3% e portanto pagara um total de: "+valorPagar );
						  System.out.println("\nObrigado por comprar com a Nike!");
						  
							
						} if (quantidade2 > 10) {
							
							int valorShorts = 30;
							  
							  float soma = valorShorts*quantidade2;
							  float prShorts1 = ((float)5/100*(soma));
							  float valorPagar = soma-prShorts1;
							  
					 System.out.println(" voc� recebeu um desconto de 5% e portanto pagara um total de: "+valorPagar);
					 System.out.println("\nObrigado por comprar com a Nike!");
					 
					 
					     // se for cal�a
							  
						}} else if (produto == 3) {
							
	 
						System.out.println("show, voc� escolheu a cal�a da jordan\n agora digite a quantidade que voc� quer:");
									
						int quantidade2 = escopo.nextInt();
									
					    if (quantidade2 <= 5 ) {
										
							int valorCalca = 55;
										  
							float soma = valorCalca*quantidade2;
							float prCalca = ((float)2/100*(soma));
							 float valorPagar = soma-prCalca;
							 
							 
							 System.out.println(" voc� recebeu um desconto de 2% e portanto pagara um total de: "+valorPagar );
							  System.out.println("\nObrigado por comprar com a Nike!");
							  			  
										  
									} if (quantidade2 > 5 && quantidade2 <= 10 ) 	{
											  
										int valorCalca = 55;
										  
										  float soma = valorCalca*quantidade2;
										  float prCalca = ((float)3/100*(soma));
										  float valorPagar = soma-prCalca;
										  
										  System.out.println(" voc� recebeu um desconto de 3% e portanto pagara um total de: "+valorPagar );
										  System.out.println("\nObrigado por comprar com a Nike!");
										  
											
										} if (quantidade2 > 10) {
											
											int valorCalca = 55;
											  
											  float soma = valorCalca*quantidade2;
											  float prCalca1 = ((float)5/100*(soma));
											  float valorPagar = soma-prCalca1;
											  
									 System.out.println(" voc� recebeu um desconto de 5% e portanto pagara um total de: "+valorPagar);
									 System.out.println("\nObrigado por comprar com a Nike!");
									 
							
					
						}}else {
							System.out.println("voc� n�o digitou um n�mero de produto valido!");
						}
				
				
				escopo.close();
				
				
	}
	
	
	}

		  
	
		  
		
		
	


