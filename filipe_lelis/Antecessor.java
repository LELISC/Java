package filipe_lelis;

import java.util.Scanner;

public class Antecessor {

	public static void main(String[] args) {
		
		System.out.println("ol�, digite um n�mero, por favor!");
		
		
		Scanner sc = new Scanner(System.in);
		
		int resposta1 = sc.nextInt();
		
		int antecessor = resposta1-1;
		
		System.out.println("ok, seu antecessor � "+antecessor);
		
		sc.close();
	

	}

}
