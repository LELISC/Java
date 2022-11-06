package filipe_lelis;

import java.util.Scanner;

public class Calcular_Imc {

	public static void main(String[] args) {
		// CALCULAR IMC

		/*
		 * O IMC é calculado dividindo o peso pela altura elevada ao quadrado. Ou seja,
		 * de forma mais simples, você multiplica sua altura por ela mesma e depois
		 * divide seu peso pelo resultado da última conta
		 */

		System.out.println(" olá, para que possamos calcular seu imc, digite as seguintes informações:\npeso: ");

		Scanner escopo = new Scanner(System.in);

		float peso = escopo.nextFloat();

		System.out.println("altura:");

		float altura = escopo.nextFloat();

		float calculoImc = peso / (altura * altura);

		System.out.println("show\nseu IMC é: " + calculoImc);

		escopo.close();

		// CALCULO ESTÁ INCORRETO, MAS SEM PROBLEMA... VAI PRA CIMA!

	}

}
