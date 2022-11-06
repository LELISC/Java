package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX01 {

	public static void main(String[] args) {
		
		//  SOLICITAR QUATRO NUMEROS INTEIROS E REALIZA A DISTRIBUTIVA DE ADIÇÃO E SUBTRAÇÃO
		
		System.out.println("por favor, digite quatro numeros");
		
		
		Scanner escopo = new Scanner(System.in);
		
		int numero1 = escopo.nextInt();
		
		int numero2 = escopo.nextInt();
		
		int numero3 = escopo.nextInt();
				
		int numero4 = escopo.nextInt();
		
		int distributiva = numero1*(numero2+numero3+numero4);
		
		
		
				
		System.out.println("a distributiva de multiplicação do primeiro numero com a soma dos outros numeros digitados é igual a: "+distributiva);
		
		escopo.close();
	

	}

}
