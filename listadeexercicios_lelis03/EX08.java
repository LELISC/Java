package listadeexercicios_lelis03;

import java.util.Scanner;

public class EX08 {

	public static void main(String[] args) {
		/*Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um autom�vel que faz 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto

(TEMPO) e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a dist�ncia percorrida com a f�rmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da

dist�ncia, basta calcular a quantidade de litros de combust�vel utilizada na viagem com a f�rmula LITROS_USADOS=DISTANCIA/12. Ao final, o programa deve apresentar os valores da velocidade

m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a distancia percorrida (DISTANCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem.
		 * 
		 */

		
		Scanner ler = new Scanner(System.in);
		
		float tempogasto,velocidademedia,distancia,litros;
		
		System.out.println("vamos calcular quantos litros voc� ir� gastar por viagem no seu automvel que faz 12km por litro\nok?\nvamos l�!");
		 System.out.println("digite o tempo gasto na corrida:");
		 tempogasto = ler.nextFloat();
		 
		 System.out.println("digite a velocidade media para o tempo:");
		 velocidademedia = ler.nextFloat();
		 
		 distancia = tempogasto*velocidademedia;
		 
		 litros = distancia/12;
		 
		 System.out.println("velocidade m�dia: "+velocidademedia+"\ntempo gasto: "+tempogasto+" horas\ndist�ncia : "+distancia+" KM "+"\nlitros usados: "+litros+" litros!" );
		 
		 
		 ler.close();
		 
		 
		 
	}

}
