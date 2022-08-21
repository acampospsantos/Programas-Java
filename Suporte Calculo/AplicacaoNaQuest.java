package SuporteCalculo;

import java.util.Scanner;

public class AplicacaoNaQuest {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Variáveis
		int x;
		double calculo;
		
		System.out.println("Digite o valor de x");
		x = entrada.nextInt();
		calculo = ( (Math.pow(x, 2)) / (Math.pow(2, x)) );
		System.out.println("f(x) = " + calculo);
	}
}
