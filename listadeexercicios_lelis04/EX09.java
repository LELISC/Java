package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		/* Ler o valor correspondente ao sal�rio mensal (vari�vel SM) de um trabalhador
		 * e tamb�m o valor do percentual de reajuste (vari�vel PR) a ser atribu�do. Apresentar o valor do novo sal�rio (vari�vel NS).
		 */
		
		
	   int salariomensal;
	   int percentual;
	   int novosalario;
		
		System.out.println("ol�, por favor, digite seu salario mensal:");
		
		Scanner escopo = new Scanner(System.in);
		
		salariomensal = escopo.nextInt();
		
		System.out.println("digite o percentual de aumento:");
		
		percentual = escopo.nextInt();System.out.println("%");
		
		novosalario = salariomensal/100*percentual+salariomensal;
		
		System.out.println("o novo sal�rio com o acr�cismo de "+percentual+"% � de "+novosalario+" reais ");
		
		escopo.close();
		
		
		
		
		
		

	}

}
