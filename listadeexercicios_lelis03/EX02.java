package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o n�mero total de eleitores de um munic�pio, o n�mero de votos brancos, nulos e v�lidos. 
		 * Calcular e escrever o percentual que cada um representa em rela��o ao total de eleitores. */
	
		
		System.out.println("digite o n�mero de votos validos: ");
		
		Scanner escopo = new Scanner(System.in);
		int validos = escopo.nextInt();
		 
		System.out.println(" agora digite a quntidade de votos em Branco: ");
	    int brancos = escopo.nextInt();
	    
	    System.out.println("digite a quantidade de votos nulos");
	    int nulos = escopo.nextInt();
	    
	    int totaleleitores = validos+brancos+nulos;
	    int validosporcentagem = validos*100/totaleleitores;
	    int brancosporcentagem = brancos*100/totaleleitores;
	    int nulosporcentagem = nulos*100/totaleleitores;
	   
	  System.out.println("ok, muito obrigado pelos dados!\nsegue informa��es abaixo:\ntotal eleitores: "+totaleleitores);
	  System.out.println("validos: "+validos+" = "+validosporcentagem+"%");
	  System.out.println("brancos: "+brancos+" = "+brancosporcentagem+"%");
	  System.out.println("nulos: "+nulos+" = "+nulosporcentagem+"%");
	   
	    
	    
		 
	escopo.close();	 
		 
		 
	}

}
