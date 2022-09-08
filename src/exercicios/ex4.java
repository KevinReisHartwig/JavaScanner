/*4) Em uma pizzaria, cada tulipa de chope custa R$1,80 e uma pizza mista grande custa R$25,00 mais R$ 3,50 
por tipo de cobertura pedida (queijo, presunto, banana, etc.). Uma turma vai à pizzaria e pede uma 
determinada quantidade de "chopes" e uma pizza grande com uma determinada quantidade de coberturas. 
Faca um programa que calcula a conta e, sabendo que a será informada a quantidade de pessoas, quanto 
que cada um deve pagar. Lembre-se dos 10% do garçom.*/
package exercicios;
import java.util.Scanner;
public class ex4 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int chope;
		int pizza;
		int cobertura;
		double gastos;
		int pessoas;
		double pagamento;
		
		System.out.print("digite a quantidade de chopes comprados: ");
		chope = entrada.nextInt();
		
		System.out.print("digite a quantidade de pizzas compradas: ");
		pizza = entrada.nextInt();
		
		System.out.print("digite a quantidade de coberturas escolhidas: ");
		cobertura = entrada.nextInt();
		
		System.out.print("digite a quantidade de pessoas: ");
		pessoas = entrada.nextInt();
		
		
		gastos = (chope*1.80)+(pizza*25)+(cobertura*3.50);
		pagamento = (gastos+(gastos*0.10))/pessoas;
		
		System.out.println("teve um total de R$:"+gastos+" gastos e o pagamento incluindo a taxa de 10% do garçom ficou para cada pessoal pagar R$: "+pagamento);
		
		
		

	}

}
