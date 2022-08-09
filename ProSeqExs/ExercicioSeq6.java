package Exercicios;

import java.util.Scanner;

public class ExercicioSeq6 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double x1,x2,y1,y2,D;
		System.out.println("\nDigite X1 e X2");
		x1 = ler.nextDouble();
		x2 = ler.nextDouble();
		
		System.out.println("\nDigite Y1 e Y2");
		y1 = ler.nextDouble();
		y2 = ler.nextDouble();

		D = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		System.out.println("\nO valor de D é: " +D);
		System.out.printf(D+"f%2");
	}

}
