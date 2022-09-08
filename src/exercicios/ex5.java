/*5) A conversão de graus Fahrenheit para Celsius é obtida pela fórmula abaixo. Faça um algoritmo que leia um 
valor em graus Centígrados e imprima seu correspondente em graus Fahrenheit .*/
package exercicios;
import java.util.Scanner;
public class ex5 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float f;
		float c;
		
		System.out.print("digite a temperatura em Centígrados: ");
		c = entrada.nextFloat();
		
		f = (float)(c * 1.8 + 32);
		
		System.out.print("o grau centígrados corresponde em Fahrenheit: "+f);
				
		
		

	}

}
