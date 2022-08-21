package TreinoLogica;

import java.util.Scanner;

public class Menu {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Atributos
		int opcao, option=0;
		double altura, peso, imc;
		double kmH, mS;
		int a1, q, n, somaPg;
		double lado1, lado2, lado3;
		boolean valido1, valido2, valido3, valido;
		
		do {
			System.out.println("");
			System.out.println("Menu");
			System.out.println("");
			
			System.out.println("1 - Para calcular o IMC");
			System.out.println("2 - Para conversão de Km/h para m/s");
			System.out.println("3 - Para verificar validação do triângulo");
			System.out.println("4 - Para calcular a soma de uma P.G.");
			System.out.println("---------------------------");
			System.out.println("Escolha a opção que deseja: ");
			opcao = entrada.nextInt();
			
			switch (opcao) {
			case 1:
				System.out.println("\n\nVocê escolheu calcular o IMC");
				System.out.println("Digite a altura (em metros)");
				altura = entrada.nextDouble();
				System.out.println("Digite o peso(em Kg)");
				peso = entrada.nextDouble();
				imc = calculoImc(peso, altura);
				System.out.println("IMC = " + imc + " Kg/m²");
				System.out.println("-----------------");
				System.out.println(" ## Classificação ##");
				if (imc < 18.5) {
					System.out.println("--> MAGREZA");
				} else if (imc >= 18.5 && imc <= 24.9) {
					System.out.println("--> NORMAL");
				} else if(imc >= 25 && imc <= 29.9) {
					System.out.println("--> SOBREPESO");
				} else if(imc >= 30 && imc <= 39.9) {
					System.out.println("--> OBESIDADE");
				} else {
					System.out.println("--> OBESIDADE GRAVE");
				}
				System.out.println("--------------------");
				break;
				
			case 2:
				System.out.println("\n\nVocê escolheu converter de Km/h para m/s");
				System.out.println("Digite o valor em Km/h: ");
				kmH = entrada.nextDouble();
				mS = conversao(kmH);
				System.out.println(kmH + " Km/h = " + mS + " m/s");
				break;
				
			case 3: 
				System.out.println("\n\nVocê escolheu verificar a validação do triângulo");
				System.out.println("Digite os valores dos lados(em m), respectivamente ");
				lado1 = entrada.nextDouble();
				lado2 = entrada.nextDouble();
				lado3 = entrada.nextDouble();
				valido1 = validacao1(lado1, lado2, lado3);
				valido2 = validacao2(lado2, lado1, lado3);
				valido3 = validacao3(lado3, lado1, lado2);
				
				if (valido1 == true && valido2 == true && valido3 == true) {
					valido = true;
					System.out.println("## Triângulo é válido ##");
				} else {
					valido = false;
					System.out.println("## Triângulo NÃO é válido ##");
				}
				System.out.println("--------------------");
				break;
				
			case 4:
				System.out.println("\n\nVocê escolher calcular a soma de uma P.G.");
				System.out.println("Digite o valor inicial da P.G.");
				a1 = entrada.nextInt();
				System.out.println("Digite o valor da Razão:");
				q = entrada.nextInt();
				System.out.println("Digite o valor do número de termos:");
				n = entrada.nextInt();
				somaPg = progressaoGeometrica(a1, q, n);
				System.out.println("A soma dos termos da P.G. é: " + somaPg);
				System.out.println("--------------------");
				break;			
			}		
			
			System.out.println("\nDeseja usar o Menu novamente?");
			System.out.println("1 - Para parar o programa");
			option = entrada.nextInt();
			
		} while(option != 1);		
		System.out.println("");
		System.out.println("## PROGRAMA FINALIZADO ##");
	}
	
	
	public static double calculoImc(double peso, double altura) {
		double resultado;
		resultado = peso/ (Math.pow(altura,2));
		return resultado;
	}
	
	public static double conversao(double kmH) {
		double resultado;
		resultado = kmH / 3.6;
		return resultado;
	}
	
	public static boolean validacao1(double lado1, double lado2, double lado3) {
		boolean valido;
		if ((lado2 - lado3) < lado1 && lado1 < (lado2 + lado3)) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}
	
	public static boolean validacao2(double lado2, double lado1, double lado3) {
		boolean valido;
		if ((lado1 - lado3) < lado2 && lado2 < (lado1 + lado3)) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}
	
	public static boolean validacao3(double lado3, double lado1, double lado2) {
		boolean valido;
		if((lado1 - lado2) < lado3 && lado3 < (lado1 + lado2)) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}
	
	public static int progressaoGeometrica(int a1, int q, int n) {
		int somaDaPg;
		somaDaPg = (int) (a1 * (Math.pow(q, n) - 1) / (q - 1) );
		return somaDaPg;
	}

}
