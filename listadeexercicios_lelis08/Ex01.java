package listadeexercicios_lelis08;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// Apresentar os resultados de uma tabuada de multiplicar (de 1 at� 10) de um n�mero qualquer.

		
		Scanner escopo = new Scanner(System.in);
		
		System.out.println("ol�, digite um n�mero para que possamos realizar a tabuada do 1 ao 10:");
		int numero = escopo.nextInt();
		
		System.out.println("\nsegue a tabuada do "+numero+":\n\n");
		System.out.println(numero+"*1"+"= "+numero*1);
		System.out.println(numero+"*2"+"= "+numero*2);
		System.out.println(numero+"*3"+"= "+numero*3);
		System.out.println(numero+"*4"+"= "+numero*4);
		System.out.println(numero+"*5"+"= "+numero*5);
		System.out.println(numero+"*6"+"= "+numero*6);
		System.out.println(numero+"*7"+"= "+numero*7);
		System.out.println(numero+"*8"+"= "+numero*8);
		System.out.println(numero+"*9"+"= "+numero*9);
		System.out.println(numero+"*10"+"= "+numero*10);
		

		escopo.close();
		
		
	}

}
