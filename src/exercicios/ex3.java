/*3) Faça um programa que leia o nome de um piloto, uma distância percorrida em km e o tempo que o piloto 
levou para percorrê-la (em horas). O programa deve calcular a velocidade média em km/h, e exibir a 
seguinte frase: A velocidade média de XX foi YY km/h, onde XX é o nome do piloto, e YY é a velocidade média. */
package exercicios;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float km;
		int horas;
		float media;

		System.out.print("Informe o nome do pilito: ");
		String nome = entrada.next();
		System.out.print("informe quantos km foram percorridos: ");
		km = entrada.nextFloat();

		System.out.print("informe as horas gastas no percuso: ");
		horas = entrada.nextInt();

		media = km / horas;
		System.out.print("O nome do piloto é: " + nome + " e a media de km/h é: " + media);

	}

}
