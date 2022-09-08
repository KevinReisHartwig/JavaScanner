/* 1) Faça um programa que leia três valores inteiros, e calcule e exiba a sua média ponderada. A primeira nota 
tem peso 2, a segunda tem peso 3 e a terceira tem peso 5. */
package exercicios;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int x = 2;
		int y = 3;
		int z = 5;
		int media;
		media = (x + y + z) / 3;
		System.out.print("a media ponderada é: " + media);

	}

}
