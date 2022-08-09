package Exercicios;

import java.util.Scanner;

public class ExercicioSeq4 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double A,B,C,R,S,D;
		
		System.out.println("\nEscreva um valor a A: ");
		A = ler.nextDouble();
		System.out.println("\nEscreva um valor a B: ");
		B = ler.nextDouble();
		System.out.println("\nEscreva um valor a C: ");
		C = ler.nextDouble();
		
		R = (A+B)*(A+B);
		S = (C+B)*(A+B);
		
		D = (R + S) / 2;
		System.out.println("\nO valor de D é: " +D);
	}

}
