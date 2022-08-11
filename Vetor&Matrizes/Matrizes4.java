package Exercicios;

import java.util.Scanner;

public class Matrizes4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		float[][] matriz1 = new float[2][2];
		float[][] matriz2 = new float[2][2];
		float[][] matriz3 = new float[2][2];
		int i,j,numero,op;
		
		for(i=0;i<2;i++) {
			for(j=0;j<2;j++) {
				System.out.println("\nEntre com o valor da matriz1: ");
				matriz1[i][j] = leia.nextFloat();
			}
		}
		do {
			System.out.println("\n\t\tMenu de Matrizes ");
			System.out.println("\n1- Somar as duas matrizes ");
			System.out.println("\n2- Subtrair a primeira da segunda ");
			System.out.println("\n3- Adicionar uma constante de duas matrizes ");
			System.out.println("\n4- Imprimir as matrizes ");
			System.out.println("\n0- Sair do programa ");
			System.out.println("\nDigite a sua opção ");
			op = leia.nextInt();
			
			switch(op) {
			
			case 1:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz1[i][j] + matriz2[i][j];
						System.out.println("\nSoma: "+ matriz3[i][j]);
					}
				}
				break;
			case 2:
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz3[i][j] = matriz2[i][j] - matriz1[i][j];
						System.out.println("\nDiferença: "+ matriz3[i][j]);
			}
		} 
				break;
			case 3:
				System.out.println("\nLeia um numero: ");
				numero = leia.nextInt();
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						matriz1[i][j] += numero;
						matriz2[i][j] += numero;
						System.out.println("\nMatriz1 mais o numero: "+ matriz1[i][j]);
						System.out.println("\nMatriz2 mais o numero: "+ matriz2[i][j]);
			}
		} 
				break;
			case 4:
				System.out.println("\nLeia um numero: ");
				numero = leia.nextInt();
				for(i=0;i<2;i++) {
					for(j=0;j<2;j++) {
						System.out.println("\nMatriz1 mais o numero: "+ matriz1[i][j]);
						System.out.println("\nMatriz2 mais o numero: "+ matriz2[i][j]);
			}
		} 
			case 0:
				System.out.println("\nMuito obrigado por utilizar o nosso programa!!! ");
				break;
				default:
					System.out.println("\nOpçao invalida!!!");
			}
		}
		while(op!=0);
	}

}
