package Exercicios;

import java.util.Scanner;

public class Exercicios1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero = 0;
		
		System.out.println("Digite o 1º número: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite o 2º número: ");
		int numero2 = entrada.nextInt();
		
		System.out.println("Digite o 3º número: ");
		int numero3 = entrada.nextInt();
		
		if(numero1 > numero) {
			numero = numero1;
		} if (numero2 > numero) {
			numero = numero2;
		} if (numero3 > numero) {
			numero = numero3;
		}
		
		System.out.println("O maior número digitado foi: " + numero);

	}

}