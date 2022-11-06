package filipe_lelis;

import java.util.Scanner;

public class Temporizador {

	public static void main(String[] args) {
		// Temporizador 		
		Scanner escopo = new Scanner(System.in);
		
		System.out.println("digite o tempo de cozimento da carne em\nhoras:");
		int horas = escopo.nextInt();
		
		System.out.println("minutos:");
		
		int minutos = escopo.nextInt();
		
		System.out.println("segundos:");
		int segundos = escopo.nextInt();
		
		
		for (int i = horas; i >= 0 ; i--) {
			for (int j = minutos; j >= 0; j--) {
		for (int k = segundos; k >= 0; k--) {
			
				System.out.println(i+":"+j+":"+k);
				minutos = 59;
				segundos = 59;
				
				escopo.close();
		
	
					
		}
			}
		}
	}
}
					
					
				
			
			
		
		
		


	


