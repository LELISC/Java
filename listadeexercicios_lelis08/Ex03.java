package listadeexercicios_lelis08;

public class Ex03 {

	public static void main(String[] args) {
		//Elaborar um programa que apresente no final o somat�rio dos valores pares existentes na faixa de 1 at� 500.
		
		 int numero = 1;
		  int numero2 = 2;
		  
		  int soma = numero+numero2;
		  
		  while (numero < 501) {
			
			  
			  numero = numero+1;
			  numero2 = numero2+1;
			  soma = soma+numero2;
			  
		}
		  
		  System.out.println("a soma dos n�meros inteiros de 1 a 500 �: "+soma);
		  
		  
	
	

}
}