package Exercicios;

import java.util.Scanner;

public class Matrizes3 {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
		int [][]valores = new int[3][3];
		int contNumeroMaior=0, l,c;
		
		for(l=0;l<3;l++) {
			for(c=0;c<3;c++) {
				System.out.printf("\nDigite um numero [%d][%d]: ", l, c);
				valores[l][c] = leia.nextInt();
				
				if (valores[l][c] > 10) {
					contNumeroMaior++;
				}
			}
		}
		System.out.println("\nQuantidade de numeros maiores que 10: "+contNumeroMaior);

	}

}
