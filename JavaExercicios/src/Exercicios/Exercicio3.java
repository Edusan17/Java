package Exercicios;

import java.util.Scanner;

public class Exercicio3 {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int idade;
		
		System.out.println("\nEscreva a sua idade: ");
		idade = leia.nextInt();
		
		if(idade <10) {
			System.out.println("\nNão existe essa categoria para sua idade! ");
		}
		else if(idade >=10 && idade <=14) {
			System.out.println("\nVoce esta na categoria Infantil! ");
		}else if (idade >= 15 && idade <=17) {
			System.out.println("\nVoce esta na categoria Juvenil! ");
		}else if(idade >=18 && idade <=25) {
			System.out.println("\nVoce esta na categoria Adulto! ");
		}else if(idade >25) {
			System.out.println("\nNão existe essa categoria para sua idade! ");
		}
	}

}
