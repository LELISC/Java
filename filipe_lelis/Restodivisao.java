package filipe_lelis;

import java.util.Scanner;

public class Restodivisao {

	public static void main(String[] args) {
		// Resto da divisao
		
		
		System.out.println("olá, digite um numero: ");
		
		Scanner ler = new Scanner(System.in);
		
		int numero = ler.nextInt();

		
	    System.out.println("digite mais um numero: ");
	    
	    int numero1 = ler.nextInt();
	    
	    int restodivisao = numero%numero1;
	    
	    System.out.println("o resto da divisão é: "+restodivisao);
	    
	    ler.close();
		

	}

}
