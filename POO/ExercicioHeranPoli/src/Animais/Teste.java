package Animais;

public class Teste {
	public static void main(String[] args) {
		//cachorro
		Cachorro cachorro = new Cachorro();
		cachorro.setNome("Thor");
		cachorro.setIdade(4);
		System.out.println("O nome do Cachorro � " + cachorro.getNome() + " e ele tem " + cachorro.getIdade() + " anos");
		cachorro.EmitirSom();
		cachorro.Correr();
		
		//cavalo
		Cavalo cavalo = new Cavalo();
		cavalo.setNome("Ventania");
		cavalo.setIdade(17);
		System.out.println("\nO nome do Cavalo � " + cavalo.getNome() + " e ele tem " + cavalo.getIdade() + " anos");
		cavalo.EmitirSom();
		cavalo.Correr();
		
		//pregui�a
		Pregui�a pregui�a = new Pregui�a();
		pregui�a.setNome("Dony");
		pregui�a.setIdade(33);
		System.out.println("\nO nome da Pregui�a � " + pregui�a.getNome() + " e ele tem " + pregui�a.getIdade() + " anos");
		pregui�a.EmitirSom();
		pregui�a.Subir();
		
	}
}
