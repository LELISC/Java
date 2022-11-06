package orientadoAobjeto;

public class Pessoa {
	
	String nome = "Filipe";
	int idade = 20;
	String profissao = "estágiario";
	
	

	public static void main(String[] args) {
		
		Pessoa escopo = new Pessoa();
		
		System.out.println("o nome da pessoa é "+escopo.nome);
		System.out.println("sua idade é "+escopo.idade+" anos ");
		System.out.println("e sua profissão atual é "+escopo.profissao);
		
	}

}
