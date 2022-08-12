package com.generation.cliente;

import com.generation.cliente.model.Cliente;

public class Menu {

	public static void main(String[] args) {
Cliente cliente = new Cliente();
		
		//atribuindo
		cliente.setNome("Eduardo");
		cliente.setSobrenome("Cordeiro");
		cliente.setIdade(18);
		
		System.out.println("Nome do cliente: " + cliente.getNome() +" " + cliente.getSobrenome() + " \nIdade: " + cliente.getIdade() + " anos");
		
		cliente.comprar();

	}

}
