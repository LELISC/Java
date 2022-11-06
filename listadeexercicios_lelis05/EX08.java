package listadeexercicios_lelis05;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		/*  Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas horas inteiras, sem os minutos) 
		 * e calcule a duração do jogo em horas, sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o 
		 * jogo pode iniciar em um dia e terminar no dia seguinte.
		 */

		
		System.out.println("digite a hora de inicio do jogo:");
		
		Scanner escopo = new Scanner(System.in);
		
		int horainicio = escopo.nextInt();
	
		System.out.println("digite a hora em que a partida terminou ");
		
		int horafim = escopo.nextInt();
		
		
		int duracao1 = horafim-horainicio;
		
		int duracao2 = 24-(horainicio-horafim);
		
		if (horainicio < horafim) {
			    	
	    	System.out.println("a partida durou aproximadamente: "+duracao1);
			
		} else {
			
			
			System.out.println("a partida durou aproximadamente: "+duracao2);

		}
		
		
		escopo.close();
		
		
		
	}

}
