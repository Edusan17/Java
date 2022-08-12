package com.generation.cliente.model;

/*
 * 1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Cliente {

	//atributos
	private String nome;
	private int idade;
	private String sobrenome;
	
	//getters e setters
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
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	//método
	public void comprar() {
		System.out.println("***********************************");
		System.out.println("Está comprando um produto na MrxMarcas.");
		System.out.println("Valor do produto é de 35,00 R$.");
		System.out.println("Forma de pagamento Dinheiro: ");
		System.out.println("Pagar:35,00"+ " \nValor:35,00"+ "\nTroco: 0,0");
	}
	
	
	
	
}