
public class Pessoa {
	
	//visibilidade de atributo
	private String nome;
	private int idade;
	
	public Pessoa(String n) {
		this.nome = n;
		this.idade = 0;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(this.idade >= 18) {
		this.nome = nome;
			System.out.println( "Você mudou seu nome para: " + this.nome + "\n");
		}else {
			System.out.println("Só é possivel mudar o nome a partir dps 18 anos \n");
		}
		
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
}


