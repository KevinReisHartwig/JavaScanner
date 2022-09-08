/* 7) Construa um algoritmo que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1,y1) e 
P(x2,y2), escreva a distância entre eles. A fórmula que efetua tal cálculo é:  */
package exercicios;
import java.util.Scanner;
public class ex7 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double x2,y2,x1,y1,f;
		
		System.out.print("Digite o valor do primeiro x: ");
		x1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo x: ");
		x2 = entrada.nextDouble();
		
		System.out.print("digite o primeiro y: ");
		y1 = entrada.nextDouble();
		
		System.out.print("digite o segundo numero: ");
		y2 = entrada.nextDouble();
		
		f = Math.sqrt(Math.pow(x1-x2,2) + Math.pow(y1-y2,2));
		
		System.out.println("o calculo de x1,x2 e y1,y2 na formula é = " + f);
		
		
		
		
		
		
		
		
		
	}

}
