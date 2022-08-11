package Exercicios;
/*
 * 1- Faça um programa que possua um vetor denominado A que armazene 6 números inteiros. O programa deve executar os seguintes passos: 
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. 
(d) Mostre na tela cada valor do vetor A, um em cada linha.

 */
import java.util.Scanner;

public class Vetor1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int [] num= {1,0,5,-2,-5,7};
		int[] A = new int [6];
		int x,soma=0,atribuidor=0;
		
		soma = num[0]+num[1]+num[5];
		System.out.printf("\nA soma das linhas 0; 1 e 5: %d ",soma);
		System.out.println("\n(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100. ");
		atribuidor = num[4] + 100;
		System.out.printf("\nO valor foi: %d ",atribuidor);
		System.out.println("\n(d) Mostre na sua tela o valor do vetor de A, um em cada linha ");
		for (x=0;x<6;x++) {
			System.out.printf("\nLinha: %d = %d",(x),num[x]);
		}
	}

}
