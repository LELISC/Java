package orientadoAobjeto;

import java.util.Scanner;

public class ChamaCelular {

	public static void main(String[] args) {
		// chamando a classe celular
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite a marca do celular");
		String marcaSolicita = sc.nextLine();
		
		String marcaCelular = "samsung";
		String marcaCelular1 = "iphone";
		String marcaCelular2 = "motorola";
	
		
		
		if (marcaSolicita.equals(marcaCelular)) {
			
			Celular escopo = new Celular();
			
			System.out.println("marca do celular: "+escopo.marca);
			System.out.println("memoria ram: "+escopo.memoriaRam);
			System.out.println("cor: "+escopo.cor);
			System.out.println("preço:"+escopo.preco);

			
			
	}else if (marcaSolicita.equals(marcaCelular1)) {
		Celular escopo = new Celular();
		
		System.out.println("marca do celular: "+escopo.marca2);
		System.out.println("memoria ram: "+escopo.memoriaRam2);
		System.out.println("cor: "+escopo.cor2);
		System.out.println("preço:"+escopo.preco2);
		
		
	} else if (marcaSolicita.equals(marcaCelular2)) {
		
		Celular escopo = new Celular();
		
		System.out.println("marca do celular: "+escopo.marca3);
		System.out.println("memoria ram: "+escopo.memoriaRam3);
		System.out.println("cor: "+escopo.cor3);
		System.out.println("preço:"+escopo.preco3);
		
	 {
			
		}
	sc.close();
		
	}
		
	}
}


