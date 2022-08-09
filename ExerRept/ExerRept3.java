package Exercicios;
/*
 * 3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99. (WHILE)
 */
import java.util.Scanner;

public class ExerRept3 {

	public static void main(String[] args) {
		int idade=0, menor=0, maior=0;
		Scanner ler = new Scanner (System.in);
		
		 System.out.println("\nDigite sua idade: ");
		 idade = ler.nextInt();
		 
		 while(idade != -99){
			 if(idade<21) {
				 menor++;
			 }
			 else if(idade>50) {
				 maior++;
			 }
			System.out.println("\nDigite outra idade: ");
			 idade = ler.nextInt();
		 }
		 	System.out.println("\nO número de pessoas com menos de 21 anos é: " + menor);
			System.out.println("\nO número de pessoas com mais de 50 anos é: " + maior);
	}

}
