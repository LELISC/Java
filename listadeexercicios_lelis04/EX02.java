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
			
		System.out.println("ol�\npara que possamos calcular o volume do ret�ngulo, precisamos de alguns dados\ndigite o comprimento do ret�ngulo: ");
		
		teclado = new Scanner(System.in);
		comprimento = teclado.nextFloat();
		
		System.out.println("digite a largura do ret�ngulo: ");
		largura = teclado.nextFloat();
		
	    System.out.println("digite a altura");
	    altura = teclado.nextFloat();
	
	    
	
	     System.out.println("o volume do ret�ngulo corresponde �: " + comprimento*largura*altura);
		
		
		
		teclado.close();
		
		
		
	
}	
	
}
