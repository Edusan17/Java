package Exercicios;
/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias e mostre-a expressa em anos, meses e dias. 
*/
import java.util.Scanner;

public class ExercicioSeq2 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int dias, anos = 0, meses = 0, soma;
		
		System.out.println("\nEscreva sua idade em dias: ");
		dias = ler.nextInt();
		anos = dias / 365;
		meses = (dias % 365) / 30;
		dias = dias - (anos * 365) - (meses * 30);
		
		System.out.println("\nSua idade expressa em anos é igual a " + anos + " Expressa em meses é " + meses + " Ja expressa em dias é " + dias );

	}

}
