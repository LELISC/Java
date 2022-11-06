package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX02 {

	public static void main(String[] args) {
		/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos brancos, nulos e válidos. 
		 * Calcular e escrever o percentual que cada um representa em relação ao total de eleitores. */
	
		
		System.out.println("digite o número de votos validos: ");
		
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
	   
	  System.out.println("ok, muito obrigado pelos dados!\nsegue informações abaixo:\ntotal eleitores: "+totaleleitores);
	  System.out.println("validos: "+validos+" = "+validosporcentagem+"%");
	  System.out.println("brancos: "+brancos+" = "+brancosporcentagem+"%");
	  System.out.println("nulos: "+nulos+" = "+nulosporcentagem+"%");
	   
	    
	    
		 
	escopo.close();	 
		 
		 
	}

}
