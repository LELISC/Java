package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {
		// Ler 3 valores (considere que n�o ser�o informados valores iguais) e escrev�-los em ordem crescente.
		
		
		
		Scanner escopo = new Scanner(System.in);
		int numero1,numero2,numero3;
		
		System.out.println("digite tr�s numeros: ");
		numero1 = escopo.nextInt();
		numero2 = escopo.nextInt();
		numero3 = escopo.nextInt();
		
		if (numero1 > numero2 && numero2 > numero3) {
			
			System.out.println("segue os n�meros em ordem crescente:\n"+numero3+"\n"+numero2+"\n"+numero1);
			
		} else if (numero2 > numero1 && numero1 > numero3) {
			
			System.out.println("segue os n�meros em oredem crescente:\n"+numero3+"\n"+numero1+"\n"+numero2);
		
			
		}else if (numero3 > numero2 && numero2 > numero1) {
			
			
			System.out.println("segue os n�meros em oredem crescente:\n"+numero1+"\n"+numero2+"\n"+numero3);
			
		}else if (numero2 > numero3 && numero3 > numero1) {
			
			System.out.println("segue os n�meros em oredem crescente:\n"+numero1+"\n"+numero3+"\n"+numero2);
			
		} else if (numero3 > numero2 && numero1 > numero2) {
			
			System.out.println("segue os n�meros em oredem crescente:\n"+numero2+"\n"+numero1+"\n"+numero3);
		} {
			escopo.close();
		}{

		}
	
		



	}

}
