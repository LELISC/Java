package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX09 {

	public static void main(String[] args) {
		/* Ler o valor correspondente ao salário mensal (variável SM) de um trabalhador
		 * e também o valor do percentual de reajuste (variável PR) a ser atribuído. Apresentar o valor do novo salário (variável NS).
		 */
		
		
	   int salariomensal;
	   int percentual;
	   int novosalario;
		
		System.out.println("olá, por favor, digite seu salario mensal:");
		
		Scanner escopo = new Scanner(System.in);
		
		salariomensal = escopo.nextInt();
		
		System.out.println("digite o percentual de aumento:");
		
		percentual = escopo.nextInt();System.out.println("%");
		
		novosalario = salariomensal/100*percentual+salariomensal;
		
		System.out.println("o novo salário com o acrécismo de "+percentual+"% é de "+novosalario+" reais ");
		
		escopo.close();
		
		
		
		
		
		

	}

}
