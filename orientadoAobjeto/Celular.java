package orientadoAobjeto;

public class Celular {
	
	String cor = "preto",cor2 = "cinza",cor3 = "azul", memoriaRam = "4 gb",memoriaRam2 = "2gb",memoriaRam3 = "8 gb",tela = "5 megapixel",tela2= "8 megapixel",tela3 ="4 megapixel",
    marca = "samsung",marca2 = "iphone",marca3 = "motorola",preco = "900 reais",preco2 = "1.500 reais",preco3 ="1.300 reais";
	

	public static void main(String[] args) {
		// atributos do celular
		
	    Celular escopo = new Celular();
		
		System.out.println("a cor do celular � "+escopo.cor);
		System.out.println("a memoria ram do celular � "+escopo.memoriaRam);
		System.out.println("a tela do celular � "+escopo.tela);
		System.out.println("a marca do celular � "+escopo.marca);

		
		
	}

}
