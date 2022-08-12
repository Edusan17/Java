package com.generation.paciente.model;
/*
 * 7) Crie uma classe paciente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto paciente, defina as instancias deste
objeto e apresente as informações deste objeto no console.
 */
public class Paciente {
		
	private String nome;
	private String sobrenome;
	private int idade;
	private String tipoSanguíneo;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getTipoSanguíneo() {
		return tipoSanguíneo;
	}
	public void setTipoSanguíneo(String tipoSanguíneo) {
		this.tipoSanguíneo = tipoSanguíneo;
	}
	public void estado() {
		System.out.println("\n\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\");
		System.out.println("\nQuadro da paciente é Estavél");
		System.out.println("\nNão existiu sequelas do acidente");
		System.out.println("\nAlta do hospital amanhã as 15:00 hrs");
	}
	
	
}
