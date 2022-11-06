package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
	/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e dos impostos 
	 * (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um algoritmo para ler o custo de fábrica de um carro,
	 *  calcular e escrever o custo final ao consumidor.
		*/

		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o valor do carro: ");
		
		float valorcarro = ler.nextFloat();
		
	    float valorfinal =  (valorcarro*45/100)+(valorcarro*28/100)+(valorcarro);
	    
	    System.out.println("o valor do carro com os impostos é de: "+ valorfinal);
	    
	    ler.close();
	}

}
