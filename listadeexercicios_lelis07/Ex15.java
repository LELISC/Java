package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
     /* Uma empresa quer verificar se um empregado est� qualificado para a aposentadoria ou n�o. Para estar 
      * em condi��es, 
      * um dos seguintes requisitos 
      * deve ser satisfeito:

    - Ter no m�nimo 65 anos de idade.

     - Ter trabalhado no m�nimo 30 anos.

    - Ter no m�nimo 60 anos e ter trabalhado no m�nimo 25 anos.
 
      Com base nas informa��es acima, fa�a um algoritmo que leia: o n�mero do empregado (c�digo), 
     o ano de seu nascimento e o ano de seu ingresso na empresa. O programa dever� escrever a idade e 
     o tempo de trabalho do empregado e a mensagem 'Requerer aposentadoria' ou 'N�o requerer'.
*/
		
		
		// requisitos necess�rios para aposentadoria
		
		int idadeMinima = 65;
		int trabalhoMinimo = 30;
		int idadeMinima2 = 60;
		int trabalhoMinimo2 = 25;
		
		
		Scanner escopo = new Scanner(System.in);
		
		System.out.println("digite seu c�digo de empresa:");
		int codigoEmpresa = escopo.nextInt();
		 
		System.out.println("digite o seu ano de nascimento sem dia e m�s:");
		int nascimento = escopo.nextInt();
		
		System.out.println("digite o ano que voc� entrou na empresa sem dia e m�s:");
		int anoEntrada = escopo.nextInt();
		
		int idadeAtual = 2022-nascimento;
		int tempoTrabalho = anoEntrada-2022;
		
		if (idadeAtual >= idadeMinima ) {
			
			System.out.println("c�digo colaborador: "+codigoEmpresa);
			System.out.println("bom, voc� tem aproximadamente "+idadeAtual+" anos de idade e est� trabalhando na empresa a "+tempoTrabalho+" anos");
			
			System.out.println("\nrequerer aposentadoria");
		
		}else if (tempoTrabalho >= trabalhoMinimo) {
			
			System.out.println("c�digo colaborador: "+codigoEmpresa);
			
           System.out.println("bom, voc� tem aproximadamente "+idadeAtual+" anos de idade e est� trabalhando na empresa a "+tempoTrabalho+" anos");
			
			System.out.println("\nrequerer aposentadoria");
		
			
		}else if (tempoTrabalho >= trabalhoMinimo2 && idadeAtual >= idadeMinima2) {
			
			
			System.out.println("c�digo colaborador: "+codigoEmpresa);
			
			  System.out.println("bom, voc� tem aproximadamente "+idadeAtual+" anos de idade e est� trabalhando na empresa a "+tempoTrabalho+" anos");
				
				System.out.println("\nrequerer aposentadoria");
			
			
		}else {
			
			System.out.println("c�digo colaborador: "+codigoEmpresa);
			
			  System.out.println("bom, voc� tem aproximadamente "+idadeAtual+" anos de idade e est� trabalhando na empresa a "+tempoTrabalho+" anos");
				
				System.out.println("\nn�o requerer aposentadoria");
			
			
		}
		
		
escopo.close();
				
		
		
		
		
	}

}
