package Exercicios;

import java.util.Scanner;

public class ExerRept4 {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int i = 1, pessCalmas= 0, femNervosa = 0, 
		mascAgressivo = 0, outrosCalmos = 0, adultoNervoso = 0,
		jovemCalmo = 0;
		
		int sexo, idade, temperamento;
	
		while( i <= 150) {
			System.out.println("Digite sua idade: ");
			idade = ler.nextInt();
			
			System.out.println("Digite o seu sexo: 1 - feminino | 2 - masculino | 3 - outros ");
			sexo = ler.nextInt();
			
			System.out.println("Digite seu temperamento: 1 - calma(o) | 2 - nervosa(o) | 3 - agressiva(o)");
			temperamento = ler.nextInt();
			
	
			if(temperamento == 1) {
				pessCalmas++;
			} else if (sexo == 1 && temperamento == 2) {
				femNervosa++;
			} else if (sexo == 2 && temperamento ==3) {
				mascAgressivo++;
			} else if(sexo == 3 && temperamento == 1) {
				outrosCalmos++;
			} else if (idade >= 40 && temperamento == 2) {
				adultoNervoso++;
			} else if (idade <= 18 && temperamento == 1) {
				jovemCalmo++;
			}
			
			i++;	
		}
		System.out.println("O número de pessoas calmas é: " + pessCalmas);
		System.out.println("O número de mulheres nervosas é: " + femNervosa);
		System.out.println("O número de homens agressivos é: " + mascAgressivo);
		System.out.println("O número de outros calmos é: " + outrosCalmos);
		System.out.println("O número de pessoas com mais de 40 anos nervosas é: " + adultoNervoso);
		System.out.println("O número de pessoas com menos de 18 anos calmas é: " + jovemCalmo);
		

	}

}