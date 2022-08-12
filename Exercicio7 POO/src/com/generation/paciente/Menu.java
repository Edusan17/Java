package com.generation.paciente;


import com.generation.paciente.model.Paciente;

public class Menu {

	public static void main(String[] args) {
		Paciente paciente = new Paciente();
		
		paciente.setNome("Patrícia");
		paciente.setSobrenome("Alves");
		paciente.setIdade(25);
		paciente.setTipoSanguíneo("O-");
		
		System.out.println("Nome da paciente: "+ paciente.getNome()+" "+ paciente.getSobrenome());
		System.out.println("Idade: "+paciente.getIdade());
		System.out.println("Tipo Sanguíneo: "+paciente.getTipoSanguíneo());
		
		paciente.estado();
	}

}
