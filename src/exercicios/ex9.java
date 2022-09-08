/*9) Escrever um algoritmo que lê:
a) a porcentagem do IPI a ser acrescido no valor das peças 
b) o código da peça 1, valor unitário da peça 1, quantidade de peças 1 
c) o código da peça 2, valor unitário da peça 2, quantidade de peças 2 
O algoritmo deve calcular o valor total a ser pago e apresentar o resultado. 
Fórmula: (valor1*quant1 + valor2*quant2)*(IPI/100 + 1*/
package exercicios;
import java.util.Scanner;
public class ex9 {

	public static void main(String[] args) {
		int ipi, peça1, peça2, quanti1, quanti2;
		double valor1, valor2, formula; 
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite a porcentagem do IPI a ser acrescido no valor das peças: ");
		ipi = entrada.nextInt();
		
		System.out.print("Digite o código da primeira peça: ");
		peça1 = entrada.nextInt();
		
		System.out.print("Digite o valor unitário da primeira peça: ");
		valor1 = entrada.nextDouble();
		
		System.out.print("Digite a quantidade da primeira peça: ");
		quanti1 = entrada.nextInt();
		
		System.out.print("Digite o código da segunda peça: ");
		peça2 = entrada.nextInt();
		
		System.out.print("Digite o valor unitário da segunda peça: ");
		valor2 = entrada.nextDouble();
		
		System.out.print("Digite a quantidade da segunda peça: ");
		quanti2 = entrada.nextInt();
		
		formula = (valor1 * quanti1 + valor2 * quanti2) * (ipi/100 + 1);
		
		System.out.println("o codigo das peças são: " + peça1 +" e "+ peça2 + " e a formula deu como resultado com o IPI de " + ipi + "%, " + formula);
		
	}

}


