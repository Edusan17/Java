package Animais;

public class Teste {
	public static void main(String[] args) {
		//cachorro
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Thor");
		cachorro.setIdade(4);
		System.out.println("O nome do Cachorro é " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos");
		cachorro.EmitirSom();
		cachorro.Correr();
		
		//cavalo
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Ventania");
		cavalo.setIdade(17);
		System.out.println("\nO nome do Cavalo é " + cavalo.getNome() + " e ele tem " + cavalo.getIdade() + " anos");
		cavalo.EmitirSom();
		cavalo.Correr();
		
		//preguiça
		Preguiça preguiça = new Preguiça();
		preguiça.setNome("Dony");
		preguiça.setIdade(33);
		System.out.println("\nO nome da Preguiça é " + preguiça.getNome() + " e ele tem " + preguiça.getIdade() + " anos");
		preguiça.EmitirSom();
		preguiça.Subir();
		
	}
}
