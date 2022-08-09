package Exercicios;

import java.util.Scanner;

public class ExerRept6 {

	public static void main(String[] args) {
		int num, media, quantidade= 0, soma= 0;
		
		Scanner ler = new Scanner (System.in);
        
        do 
        {
        	 System.out.println("\nEscreva um numero inteiro ou digite 0 para finalizar: ");
        	 num = ler.nextInt();
        	 if (num % 3 == 0) {
        		 soma += num;
        		 quantidade++;
        	 }
        } while (num != 0 );
        quantidade -= 1;
        System.out.println("\nA média dos numeros multiplos de 3 digitos é " + soma / quantidade);
	}

}
