/*2) Realizarei uma viagem de vários dias em meu automóvel, e gostaria de saber a quilometragem média por 
litro de gasolina. Para isto, anotarei a quilometragem no velocímetro ao sair de viagem, e depois ao chegar. 
Também vou somar toda a gasolina que comprar para o carro. Você poderia fazer um programa que me 
desse, com estes dados, quantos km fiz, em média, por litro de gasolina? */
package exercicios;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		float km;
		float gasolina;
		float media;

		System.out.print("informe quantos km percorridos: ");
		km = entrada.nextFloat();

		System.out.print("informe quantos litros de gasolina foram gastos: ");
		gasolina = entrada.nextFloat();

		media = km / gasolina;

		System.out.println("a media de gasolina por km é: " + media + " l/km");

	}

}
