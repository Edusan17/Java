package Exercicios;

import java.util.Scanner;

public class Vetor2 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int[] num = new int[6];
		int numerosP=0,somaP=0,quantImpar=0,numeroImpar=0,x,n;
		
		for(x=0;x<6;x++) {
			System.out.println("\nDigite uma numero que seja inteiro: ");
			n = leia.nextInt();
			
			if (n % 2 == 0) {
				numerosP++;
				somaP += n;
			}
			else {
				System.out.println("\nNumero impar: "+n+"\n");
				quantImpar++;
			}
		}
		System.out.println("\nOs numeros pares digitados: "+numerosP);
		System.out.println("\nA soma dos números pares digitados: "+somaP);
		System.out.println("\n A quantidade de números ímpares digitados: "+quantImpar);

	}

}
