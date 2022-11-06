package filipe_lelis;

import java.util.Scanner;

public class If_Else_Encadeado {

	public static void main(String[] args) {
		// IF ELSE ENCADEADO
		
		System.out.println("digite um valor:");
		
         Scanner escopo = new Scanner(System.in);
         
         int numero = escopo.nextInt();
         
         if (numero>20) {
        	 
         System.out.println("é maior que 20 ");
         
         }
         
         else if (numero==20) {
        	 
        	 System.out.println("é igual a 20");
        	 
        	 
        	 
			
		} else {
			
			System.out.println("é menor que 20");
		}
         
         escopo.close();
         
         
	}
}

         
         
