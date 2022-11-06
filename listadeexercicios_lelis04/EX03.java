package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX03 {

	public static void main(String[] args) {
		
  // Ler dois inteiros (vari�veis A e B) e imprimir o resultado do quadrado da diferen�a do primeiro valor pelo segundo.

    int a;
    int b;
	int resultado1;
	int resultado2;
	int diferenca;
	
	////////////////////////////////////////////////////////////////////////////////////
	
	System.out.println(" olá\npor favor digite um número:");
	Scanner escopo = new Scanner(System.in);
	
	  a = escopo.nextInt();
	
	
     System.out.println("ok, digite mais um:");
     
      b = escopo.nextInt();
     
     
      resultado1 = a*a;
     
      resultado2 = b*b;
      
      diferenca = resultado1-resultado2;
    		 
    		 System.out.println("os dois números digitados elevado ao quatrado � "+resultado1+" e "+resultado2+" e a difernça do primeiro para o segundo é de "+diferenca);
     
     escopo.close();
     
	
	
     
  
   
	
	}

}
