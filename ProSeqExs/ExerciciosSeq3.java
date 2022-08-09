package Exercicios;

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica  
 * expressa em segundos e mostre-o expresso em horas, minutos e segundos.
 */
import java.util.Scanner;

public class ExerciciosSeq3 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int seg, horas, min, duraçao;
		System.out.println("\nDigite quantos segundos: ");
		duraçao = ler.nextInt();
		horas = duraçao / 360;
		min = (duraçao % 360) / 60;
		seg = (duraçao % 360) % 60;
		
		System.out.println("\nO tempo expresso em horas é " + horas + " Expresso em min é " + min + " Ja expressa em segundos é " + seg );

	}

}
