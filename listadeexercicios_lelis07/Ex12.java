package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		/*  Fa�a um algoritmo para ler um n�mero que � um c�digo de usu�rio. Caso este c�digo seja
		 * diferente de um c�digo armazenado internamente no algoritmo (igual a 1234) deve ser apresentada a mensagem
		 * �Usu�rio inv�lido!�. Caso o C�digo seja correto, deve ser lido outro valor que � a senha. Se esta senha estiver
		 * incorreta (a certa � 9999) deve ser mostrada a mensagem �senha incorreta�. Caso a senha esteja correta, deve ser
		 * mostrada a mensagem �Acesso permitido�.
		 */
		
		
		Scanner escopo = new Scanner (System.in);
		System.out.println("ol�, digite sua senha:");
		
		String senhaUsuario = escopo.nextLine();
		
		String senha = "Brasil2022";
		
		if (senhaUsuario.equals(senha)) {
			
			System.out.println("acesso permitido!");
	

		}else {
			
			System.out.println("senha incorreta! por favor, digite a senha novamente:");
			
			String senhaUsuario2 = escopo.next();
			if (senhaUsuario2.equals(senha)) {
				
				
				System.out.println("acesso permitido!");
		
		}else {
			
			System.out.println("senha incorreta! Por favor, tente novamente em 05:00 minutos...");
			
			
			
		}
			
			escopo.close();
		
		}
		}
		
	
		
		
		

	}


