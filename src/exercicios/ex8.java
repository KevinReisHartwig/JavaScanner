/*8) Desenvolva um algoritmo em Java que leia um número inteiro e imprima o seu antecessor e seu sucessor. */
package exercicios;
import java.util.Scanner;
public class ex8 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int n = 0, sucessor = 1, antecessor = 1;
		
		System.out.print("Digite um numero inteiro: ");
		n = entrada.nextInt();
		
		sucessor = n + sucessor;
		antecessor = n - antecessor;
		
		System.out.println("o numero foi esse "+n+" e seu sucessor foi igual a "+sucessor+" e seu antecessor foi igual a "+antecessor);
	}

}
