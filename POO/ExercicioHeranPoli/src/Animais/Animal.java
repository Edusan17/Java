package Animais;

public class Animal {
	private String nome;
	private int idade;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}




	//fun??o
	public void EmitirSom() {
		 System.out.println("Emite som");
	 }

}
