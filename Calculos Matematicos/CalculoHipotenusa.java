package CalculosMatematicos;

import java.util.Scanner;

public class CalculoHipotenusa {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Variáveis
		double hipotenusa, cateto1, cateto2;
		
		System.out.println("Digite o valor do Primeiro cateto");
		cateto1 = entrada.nextDouble();
		System.out.println("Digite o valor do Segundo cateto");
		cateto2 = entrada.nextDouble();
		
		hipotenusa = calculoHipotenusa(cateto1, cateto2);
		System.out.println("Valor da Hipotenusa = " + hipotenusa);
	}
	
	public static double calculoHipotenusa(double cateto1, double cateto2) {
		double valorHipot;
		valorHipot = Math.sqrt( Math.pow(cateto1, 2) + Math.pow(cateto2, 2) );
		return valorHipot;		
	}

}
