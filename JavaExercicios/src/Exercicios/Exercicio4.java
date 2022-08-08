package Exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double raiz, potencia;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int numero = entrada.nextInt();
		
		if(numero % 2==0) {
			raiz = Math.sqrt(numero);
			System.out.println("Este número é par e sua raiz quadrada é: " + raiz);
			
		}else {
			potencia = numero * numero;
			System.out.println("Este número é ímpar e sua raiz quadrada é: " + potencia);
		}

	}

}
