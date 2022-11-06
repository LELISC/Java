package listadeexercicios_lelis09;

import java.util.Scanner;

public class Ex08 {
    
	public static void main(String[] args) {
		/* Elaborar um programa que possibilite calcular a área total de uma residência (sala, cozinha,
        banheiro, quartos, área de serviço, quintal, garagem, etc.). O programa deve solicitar a entrada do nome,
         a largura e o comprimento de um determinado cômodo. Em seguida, deve apresentar a área do cômodo lido e também uma mensagem
       solicitando do usuário a confirmação de continuar calculando novos cômodos. Caso o usuário responda “NAO”, o programa deve
       apresentar o valor total acumulado da área residencial.
*/
	     
		
		
		//falta finalizar o código
		
	  Scanner escopo = new Scanner(System.in);
	  System.out.println("olá, vamos medir a área total da sua casa ou dos comodos que você quiser! :)");
	  System.out.println("digite o nome do primeiro comodo");
	  String nome = escopo.nextLine();
	  System.out.println("show, digite agora o comprimento do(a)"+nome+":");
	  float comprimento = escopo.nextFloat();
	  System.out.println("show, agora digite a largura:");
	  float largura = escopo.nextFloat();
	  System.out.println("deseja continuar?");
	  String resposta = escopo.next();
	  float soma = comprimento*largura;
	  float aux = soma;
	  
	  
	  if (resposta.equals("sim")|| resposta.equals("s") || resposta.equals("SIM")|| resposta.equals("sim")) {
		  
		  System.out.println("ok, vamos continuar...");
		  System.out.println("o(a) "+nome+" possui uma área de "+soma+" metros");
		  
		  while (resposta.equals("sim")|| resposta.equals("s") || resposta.equals("SIM")|| resposta.equals("sim")) {
			  
			  System.out.println("digite o nome do comodo:");
			  nome = escopo.next();
			  System.out.println(" digite agora o comprimento do comodo:");
			  comprimento = escopo.nextFloat();
			  System.out.println("agora digite a largura:");
			  largura = escopo.nextFloat();
			  System.out.println("deseja continuar?");
			  resposta = escopo.next();
			  float saida = comprimento*largura;
			  float soma2 = comprimento*largura+(aux);
			  aux = soma2;
			  System.out.println("o(a) "+nome+" possui uma área de "+saida+" metros");
			 	 
		}if (resposta.equals("não")|| resposta.equals("nao")|| resposta.equals("NÃO")|| resposta.equals("Não")) {
			
			System.out.println("e a soma de todos comodos digitados é de "+aux+" metros ");
			
			System.out.println("ok, caso precise, reinicie o promgama! ;)");
		}
		escopo.close();
	}
	  
	  
	  
	  
	  
	  
	 
	
		
		
		
		
	}

}
