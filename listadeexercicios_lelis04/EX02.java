package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX02 {
	
	
	public static void main(String[] args) {
		
		//declarar as variaveis para usar 
		
		float comprimento;
		float largura;
		float altura;
		Scanner teclado;
		
	/////////////////////////////////////////////////////////////////////////////////////////////
			
		System.out.println("olá\npara que possamos calcular o volume do retângulo, precisamos de alguns dados\ndigite o comprimento do retângulo: ");
		
		teclado = new Scanner(System.in);
		comprimento = teclado.nextFloat();
		
		System.out.println("digite a largura do retângulo: ");
		largura = teclado.nextFloat();
		
	    System.out.println("digite a altura");
	    altura = teclado.nextFloat();
	
	    
	
	     System.out.println("o volume do retângulo corresponde á: " + comprimento*largura*altura);
		
		
		
		teclado.close();
		
		
		
	
}	
	
}
