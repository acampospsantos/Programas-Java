package CalculosMatematicos;

import java.util.Scanner;

public class ValidacaoTriangulo {
	
	public static void main (String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Vari�veis
		double lado1, lado2, lado3;
		
		System.out.println("Digite o valor do 1� lado do Tri�ngulo: ");
		lado1 = entrada.nextDouble();
		while (lado1 < 0) {
			System.out.println("Valor Inv�lido! Digite Novamente: ");
			lado1 = entrada.nextDouble();
		}
		
		System.out.println("Digite o valor do 2� lado do Tri�ngulo: ");
		lado2 = entrada.nextDouble();
		while(lado2 < 0) {
			System.out.println("Valor inv�lido! Digite novamente: ");
			lado2 = entrada.nextDouble();
		}
		
		System.out.println("Digite o valor do 3� lado do Tri�ngulo: ");
		lado3 = entrada.nextDouble();
		while(lado3 < 0) {
			System.out.println("Valor Inv�lido! Digite novamente: ");
			lado3 = entrada.nextDouble();
		}
		
		boolean validacao = formacaoTriangulo(lado1, lado2, lado3);
		if (validacao = true) {
			String trianguloTipo = tipoTriangulo(lado1, lado2, lado3);
			System.out.println("O tri�ngulo � " + trianguloTipo);
		} else {
			System.out.println("## TRI�NGULO N�O FORMADO ##");
		}
		
	}
	
	public static boolean formacaoTriangulo(double lado1, double lado2, double lado3) {
		boolean valido;
		if( (lado1 < (lado2 + lado3)) && (lado2 < (lado1 + lado3)) && (lado3 < (lado1 + lado2))) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}
	
	public static String tipoTriangulo(double lado1, double lado2, double lado3) {
		String retorno;
		if( lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			retorno = "Escaleno";
		} else if( lado1 == lado2 && lado2 == lado3) {
			retorno = "Equil�tero";
		} else {
			retorno = "Is�sceles";
		}
		return retorno;
	}
}
