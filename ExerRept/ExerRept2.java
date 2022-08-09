package Exercicios;

import java.util.Scanner;

/*
 * 2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 */
public class ExerRept2 {

	public static void main(String[] args) {
		int i,n,par=0, impar=0;
		Scanner ler = new Scanner(System.in);
		 for(i=0; i<=10; i++) {
			 System.out.println("\nDigite um numero: ");
			 n = ler.nextInt();
			 if (n % 2 == 0) {
				 par++;
			 }
			 else {
				 impar++;
			 }
		 }
		 System.out.println("Você digitou " + par + " números pares e " + impar + " números ímpar");

	}

}
