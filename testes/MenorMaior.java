package testes;

import java.util.Scanner;

public class MenorMaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
 float maior, numero;
 int count=2;
   
   Scanner entrada = new Scanner(System.in);

   System.out.print("Numero 1: ");
   numero = entrada.nextFloat();
   maior = numero;

   while(count <= 10){
    System.out.print("Numero " + count + ": ");
    numero = entrada.nextFloat();

    if(numero > maior){
     maior = numero;
    }

    count++;
    
   }

   System.out.println("O maior numero digitado é: "+maior);

   
   entrada.close();
	}

}
