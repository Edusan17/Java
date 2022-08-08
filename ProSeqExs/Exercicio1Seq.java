package Exercicios;

import java.util.Scanner;

public class Exercicio1Seq {

	public static void main(String[] args) {
		int anos,meses,dias,soma;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\nDigite a sua idade: ");
		    anos = ler.nextInt();
		System.out.println("\nDigite quantos meses se passaram: ");
			meses = ler.nextInt();
		System.out.println("\nQue dia é hoje: ");
		    dias = ler.nextInt();
		    
		    anos = (anos * 365);
		    meses = (meses * 30);
		    soma = anos + meses + dias;
		    System.out.println("\nJa se passaram " + soma + " dias desde que voce nasceu");

	}

}
