package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX04 {

	public static void main(String[] args) {
	/* O custo de um carro novo ao consumidor � a soma do custo de f�brica com a porcentagem do distribuidor e dos impostos 
	 * (aplicados ao custo de f�brica). Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
	 * escrever um algoritmo para ler o custo de f�brica de um carro,
	 *  calcular e escrever o custo final ao consumidor.
		*/

		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("digite o valor do carro: ");
		
		float valorcarro = ler.nextFloat();
		
	    float valorfinal =  (valorcarro*45/100)+(valorcarro*28/100)+(valorcarro);
	    
	    System.out.println("o valor do carro com os impostos � de: "+ valorfinal);
	    
	    ler.close();
	}

}
