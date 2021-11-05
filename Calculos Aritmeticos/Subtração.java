package Treino;

import java.util.Scanner;

public class Subtração {//Ideia é fazer subtrações sucessivas como se fosse uma calculadora(envolvendo modularização)
	
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double a; //Valor Integral a se subtrair...
		double b;
		double calculo, result = 0;
		
		System.out.print("Digite o valor Integral: ");
		a = entrada.nextDouble();
		result = a;
		//
		do {
			b = entrada.nextInt();
			calculo = subtrair(result, b);
			result = calculo;
			System.out.println("= " + result);
		} while(result > -10000);				
	}
	
	public static double subtrair(double a, double b) {
		double resultado;
		resultado = a - (b);
		return resultado;
	}
	
	

}
