package Exercicios;

import java.util.Scanner;

public class ExerRept5 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
	int numero, soma = 0;
	
	do {
		System.out.println("Digite um número, para sair digite 0: ");
		numero = ler.nextInt();
		soma += numero;
		
	} while(numero != 0);
	
	System.out.println("A soma dos números deu: " + soma);
	

}

}