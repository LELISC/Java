package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		 
		/*Efetuar o c�lculo e a apresenta��o do valor de uma presta��o em atraso, 
		 * utilizando a f�rmula PRESTACAO=VALOR+(VALOR*TAXA/100)*TEMPO).
		 */
		
		Scanner escopo = new Scanner(System.in);
		
		String nome,cidade;
		float prestacao,valor;
		int codigo1,codigo2,tempo,cpf,rg;
	
	
		
		
		System.out.println("digite seu nome completo: ");
		nome = escopo.nextLine();
		
		System.out.println("cidade:");
		cidade = escopo.nextLine();	
		
		System.out.println("rg:");
		rg = escopo.nextInt();	
		
		System.out.println("cpf:");
		cpf = escopo.nextInt();		
	
		
		
		System.out.println("digite seu c�digo de barras");
		codigo1 = escopo.nextInt();
		codigo2 = 123456789;
		
		valor = 1245;
		
		tempo = 12;
		
		prestacao = valor+(valor*10/100)*tempo;
		
		
		 if (codigo1 == codigo2) {
			 
		System.out.println("\nOl�, "+nome+", sua conta est� atrasada!");
		
		
		System.out.println("\n\n"+nome+"\n\nrg: "+rg+"\ncpf: "+cpf+"\ncidade:"+cidade+"\nc�digo: "+codigo1);
		
		System.out.println("valor total da fatura: "+prestacao+" R$");
		
			
		} else{
        
			System.out.println(nome+", esse c�dogo de barras n�o � valido para um boleto!");
			
		
			
		}
		
		
		
			
		escopo.close();
		

	}

}
