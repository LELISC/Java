package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		/*  Ler o nome de 2 times e o n�mero de gols marcados na partida (para cada time). Escrever o nome do vencedor.
		 *  Caso n�o haja vencedor dever� ser impressa a palavra EMPATE.
		 */

		Scanner escopo = new Scanner(System.in);
		String time1,time2;
		int numerogol,numerogol1;
		
		
		System.out.println("digite o nome do primeiro time:");
		time1 = escopo.nextLine();
		
		System.out.println("digite o n�mero de gols feito por esse time:");
		numerogol = escopo.nextInt();
		
		System.out.println("digite o nome do segundo time:");
		time2 = escopo.next();
		
		System.out.println("digite agora o n�mero de gols feito por esse time:");
		numerogol1 = escopo.nextInt();
		
		if (numerogol > numerogol1) {
			
			System.out.println("o time vencedor � o "+time1+"!");
			
		} else {

			System.out.println("o time vencedor � o "+time2+"!");
			
		}
		
		
		escopo.close();
		
		
	}

}
