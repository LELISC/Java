package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		/*Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto

(TEMPO) e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da

distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade

média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
		 * 
		 */

		
		Scanner ler = new Scanner(System.in);
		
		float tempogasto,velocidademedia,distancia,litros;
		
		System.out.println("vamos calcular quantos litros você irá gastar por viagem no seu automvel que faz 12km por litro\nok?\nvamos lá!");
		 System.out.println("digite o tempo gasto na corrida:");
		 tempogasto = ler.nextFloat();
		 
		 System.out.println("digite a velocidade media para o tempo:");
		 velocidademedia = ler.nextFloat();
		 
		 distancia = tempogasto*velocidademedia;
		 
		 litros = distancia/12;
		 
		 System.out.println("velocidade média: "+velocidademedia+"\ntempo gasto: "+tempogasto+" horas\ndistância : "+distancia+" KM "+"\nlitros usados: "+litros+" litros!" );
		 
		 
		 ler.close();
		 
		 
		 
	}

}
