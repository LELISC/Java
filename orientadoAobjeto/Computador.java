package orientadoAobjeto;

public class Computador {
	
	// computador orientado a Objeto com array
	
	String marca[] = {"Lenovo","Positivo"}, sistemaOperacional[] ={"Windows","Linux"},memoriaRam [] = {"4 Gb DDR4","8 Gb DDR4"},
    hD[] = {"250 Gb","400 Gb"}, processador[] = {"Intel Celeron N4020","intel core I3"}, cor [] = {"preto","cinza"},
    bateria [] = {" 225 M.a "," 487 M.a"},
    material [] = {"aço escovado","plástico"},
    preco[] = {"150 R$","200"};
    
	public static void main(String[] args) {
		
		
	     for (int i = 0; i < 2; i++) {
	    	 
	    	 Computador escopo = new Computador();
	    	 
	    	 System.out.println("marca: "+escopo.marca[i]);
	    	 System.out.println("Sistema Operacional: "+escopo.sistemaOperacional[i]);
	    	 System.out.println("memoria Ram: "+escopo.memoriaRam[i]);
	    	 System.out.println("memoria do HD: "+escopo.hD[i]);
	    	 System.out.println("processador: "+escopo.processador[i]);
	    	 System.out.println("cor: "+escopo.cor[i]);
	    	 System.out.println("bateria: "+escopo.bateria[i]);
	    	 System.out.println("material: "+escopo.material[i]);
	    	 System.out.println("preço: "+escopo.preco[i]);
	    	 
	    	 
			
		}
		

	}

}
