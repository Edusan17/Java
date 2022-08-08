package Exercicios;

import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		double nota1, nota2, nota3, mediaPon;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite sua primeira nota: ");
		nota1 = ler.nextDouble();
		System.out.println("\nDigite sua segunda nota: ");
		nota2 = ler.nextDouble();
		System.out.println("\nDigite sua terceira nota: ");
		nota3 = ler.nextDouble();
		
		mediaPon = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("\nA média ponderada é " + mediaPon);

	}

}
