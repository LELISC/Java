package listadeexercicios_lelis04;

import java.util.Scanner;

public class EX010 {

	public static void main(String[] args) {
		/* Em uma eleição sindical concorreram ao cargo de presidente três candidatos (A, B e C). 
		 * Durante a apuração dos votos foram computados votos nulos e votos em branco, além dos votos válidos para cada candidato. 
		 * Deve ser criado um programa de computador que efetue a leitura da quantidade de votos válidos para cada candidato, além de 
		 * efetuar também a leitura da quantidade de votos nulos e votos em branco. Ao final
		 *  o programa deve apresentar o número total de eleitores,
		 *   considerando votos válidos, nulos e em branco; o percentual correspondente de votos válidos em relação à quantidade de eleitores; 
		 * o percentual correspondente de votos válidos do candidato A em relação à quantidade de eleitores; o percentual correspondente
           de votos válidos do candidato B em relação à quantidade de eleitores; o percentual correspondente de votos válidos 
           do candidato C em relação à quantidade de eleitores; o percentual correspondente de votos nulos em relação à quantidade de eleitores;
            e por último o percentual correspondente de votos em branco em relação à quantidade de eleitores.
		 */

		int candidato1;
		int candidato2;
		int candidato3;
		int nulos;
		int brancos;
		int totaleleitores;
		float percentualvotosvalidos;
		float percentualcandidatoA;
		float percentualcandidatoB;
		float percentualcandidatoC;
		float percentualnulos;
		float percentualbrancos;
		int votosvalidos;
		
		
		System.out.println("Olá, por favor, digite a quantidade de votos para o primeiro candidato:");
		
		Scanner escopo = new Scanner(System.in);
		
		candidato1 = escopo.nextInt();
		
		System.out.println("agora digite a quantidade de votos que recebeu o segundo candidatos: ");
		
		candidato2 = escopo.nextInt();
		
		System.out.println("muito bem!\nagora digite por favor, a quantidade de votos do terceiro candidato: ");
		
		candidato3 = escopo.nextInt();
		
		System.out.println("agora digite a quantidade de votos nulos: ");
		
		nulos = escopo.nextInt();
		
		System.out.println("digite a quantidade de votos brancos: ");
		
		brancos = escopo.nextInt();
		
		totaleleitores = candidato1+candidato2+candidato3+nulos+brancos;
		
		votosvalidos = candidato1+candidato2+candidato3;
		
	    percentualvotosvalidos = votosvalidos*100/totaleleitores;
	    
		percentualcandidatoA =  candidato1*100/totaleleitores;
	
		percentualcandidatoB = candidato2*100/totaleleitores;
		
		percentualcandidatoC = candidato3*100/totaleleitores;
		
		percentualbrancos = brancos*100/totaleleitores;
	
		percentualnulos = nulos*100/totaleleitores;
		
		

		
		
	    // total eleitores por escolha + percentual cada um 
		
		System.out.println("votos válidos: "+votosvalidos+" votos = "+percentualvotosvalidos+"%");
		System.out.println("\nnumero total de eleitores: "+totaleleitores+"\nprimeiro candidato: "+candidato1+" votos = "+percentualcandidatoA+"%");
		System.out.println("segundo candidato: "+candidato2+" votos = "+percentualcandidatoB+"%");
		System.out.println("terceiro candidato: "+candidato3+" votos = "+percentualcandidatoC+"%");
		System.out.println("brancos: "+brancos+" votos = "+percentualbrancos+"%");
		System.out.println("nulos: "+nulos+" votos = "+percentualnulos+"%");
	    
		
		escopo.close();
		
	}

}
