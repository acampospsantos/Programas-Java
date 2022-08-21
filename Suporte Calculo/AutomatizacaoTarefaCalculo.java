package SuporteCalculo;

import java.util.Scanner;

public class AutomatizacaoTarefaCalculo {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		double x;
		double calculo;
		
		System.out.println("Digite o valor desejado de x");
		x = entrada.nextDouble();
		
		calculo = calculoAutomatizacao(x);
		System.out.println("f(x) = " + calculo);
		
		System.out.println("Quando x tende a " + x + ", f(x) tende a " + calculo);
	}
	
	public static double calculoAutomatizacao(double x) {
		double calculo;
		calculo = (Math.pow(x, 2) - 2 * x) / (Math.pow(x, 2) - x - 2);
		return calculo;
	}

}
