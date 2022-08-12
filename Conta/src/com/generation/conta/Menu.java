package com.generation.conta;

import com.generation.conta.model.Conta;

public class Menu {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(123456, "123", "CC", "João da Silva", 2000.5f);
		c1.visualizar();
		
		Conta c2 = new Conta(1234567, "123", "CC", "Amanda", 2000000.0f);
		c2.visualizar();
		
		System.out.println("\nSaldo da Conta c1: "+ c1.getSaldo());
		System.out.println("\nSaldo da Conta c2: "+ c2.getSaldo());
		
		c1.setSaldo(3000.0f);
		System.out.println("\nSaldo Atualizado da Conta c1: "+ c1.getSaldo());
		
		c2.setTitular("Amanda Giacometti");
		System.out.println("Nome do Titular Atualizado da Conta c2: "+ c2.getTitular());
		
		
		if (c2.sacar(25000.0f) == true)
			c2.visualizar();
		else
			System.out.println("\nSaldo Insuficiente!!!");
		
	}

}
