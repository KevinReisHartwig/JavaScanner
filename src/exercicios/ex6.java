/* 6) Fazer um programa que leia um número inteiro e mostre o seu triplo, sua metade, a sua raiz cúbica, e por 
fim, o número elevado a potência fracionária 2/3.*/
package exercicios;
import java.util.Scanner;
public class ex6 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n;
		int triplo;
		int metade;
		double raiz;
		double potencia;
		
		System.out.print("digite um numero inteiro: ");
		n = entrada.nextInt();
		triplo = 3*n;
		metade = n/2;
		raiz = Math.cbrt(n);
		potencia = Math.pow(n,1/3);
		
		System.out.println("o seu triplo é: "+triplo);
		System.out.println("a metade é : " + metade);
		System.out.println("a raiz cubica é :" + raiz);
		System.out.println("a potencia fracionária é :" + potencia);
		
		
		
	}
	
}
