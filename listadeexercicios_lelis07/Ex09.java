package listadeexercicios_lelis07;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		/* Um posto est� vendendo combust�veis com a seguinte tabela de descontos: 

    �lcool
    
  at� 20 litros,desconto de 3% por litro
  acima de 20 itros, desconto de 4% POR litro

  Gasolina

 at� 20 litros, desconto de 4% por litro
 acima de 20 itros, desconto de 6% por litro 
 
 Escreva um algoritmo que leia o n�mero de litros vendidos e o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), 
 calcule e imprima 
 o valor a ser pago pelo cliente sabendo-se que o pre�o do litro da gasolina � R$ 3,30 e o pre�o do litro do �lcool � R$ 2,90.

*/
	
		Scanner escopo = new Scanner(System.in);
		double valorgasolina = 3.30;
		double valoralcool = 2.90;
		
		System.out.println("qual combustivel voc� comprou?:");
		String tipo = escopo.nextLine();
		
		System.out.println("quantos litros voc� adquiriu?:");
		double litros = escopo.nextDouble();
		
		double gasolina = valorgasolina*litros;
		
		double alcool = valoralcool*litros;
		
		// se for gasolina
		
		if (tipo.equals("gasolina") && (double)litros > 20 ) {
			
			System.out.println("bom, como voc� comprou "+litros+"L de gasolina, voc� recebeu um desconto de 6% e pagar�:"+(gasolina-(6/100*gasolina)+" REAIS "));
			
		} else if (tipo.equals("gasolina") && (double)litros <= 20 ) {
			
			
			System.out.println("bom, como voc� comprou "+litros+"L de gasolina, voc� recebeu um desconto de 4% e pagar�:"+(gasolina-(4/100*gasolina)+" REAIS "));
			
			// se for alcool 
					
		}else if (tipo.equals("alcool") || tipo.equals("�lcool") && litros > 20) {
			
			System.out.println("bom, como voc� comprou "+litros+"L de "+tipo+", voc� recebeu um desconto de 4% e pagar�:"+(alcool-(4/100*alcool)+" REAIS "));
			
			
		}else if (tipo.equals("alcool") || tipo.equals("�lcool") && litros > 20) {
			
			
			System.out.println("bom, como voc� comprou "+litros+"L de "+tipo+", voc� recebeu um desconto de 3% e pagar�:"+(alcool-(4/100*alcool)+" REAIS "));
			
			
		}else {
			
			System.out.println("\nocorreu um erro na leitura dos dados informados!\npor favor, verifique oas dados digitados e tente novamente");
			System.out.println("\ninforma��es aceitaveis\ntipo combustivel: gasolina, alcool ou �lcool\nquantidade litros: n�o aceitamos letras ou caracteres");

			escopo.close();
			
		}
		
	
	
		

}
}
