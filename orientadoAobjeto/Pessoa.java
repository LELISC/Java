package orientadoAobjeto;

public class Pessoa {
	
	String nome = "Filipe";
	int idade = 20;
	String profissao = "est�giario";
	
	

	public static void main(String[] args) {
		
		Pessoa escopo = new Pessoa();
		
		System.out.println("o nome da pessoa � "+escopo.nome);
		System.out.println("sua idade � "+escopo.idade+" anos ");
		System.out.println("e sua profiss�o atual � "+escopo.profissao);
		
	}

}
