package CalculosMatematicos;

import java.util.Scanner;

public class CalculoAreas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Vari�veis
		int opcao;
		int preferencia;
		int tipoTriangulo;
		double lado, altura, raio;
		int a0, razao, n;
		int option;

		do {
			System.out.println("\n\nMenu Principal\n\n");

			System.out.println("1 - Calcular a �rea");
			System.out.println("2 - Calcular a soma da PA");
			System.out.println("");
			System.out.println("Digite a op��o desejada");
			opcao = entrada.nextInt();
			System.out.println("");

			switch (opcao) {
			case 1:
				System.out.println("Voc� escolheu calcular a �rea de figuras planas!");
				System.out.println("1 - �rea do Tri�ngulo");
				System.out.println("2 - �rea do Quadrado");
				System.out.println("3 - �rea do C�rculo");
				System.out.println("Deseja calcular a �rea de qual figura: ");
				preferencia = entrada.nextInt();
				System.out.println("");
				while (preferencia < 1 || preferencia > 3) {
					System.out.println("Valor inv�lido! Digite novamente!");
					preferencia = entrada.nextInt();
				}
				if (preferencia == 1) {
					System.out.println("-C�LCULO �REA DO TRI�NGULO-");
					System.out.println("Qual tri�ngulo voc� deseja calcular a �rea? ");
					System.out.println("1 - Tri�ngulo Equil�tero");
					System.out.println("2 - Tri�ngulo Is�sceles");
					System.out.println("3 - Tri�ngulo Ret�ngulo");
					System.out.println("");

					tipoTriangulo = entrada.nextInt();
					if (tipoTriangulo == 1) {
						System.out.println("Voc� selecionou o tri�ngulo Equil�tero: ");
						System.out.println("Digite o valor do lado: ");
						lado = entrada.nextDouble();
						System.out.println("O valor da �rea � " + trianguloEquilatero(lado) + "cm�");

					} else if (tipoTriangulo == 2) {
						System.out.println("Voc� selecionou o tri�ngulo Is�sceles: ");
						System.out.println("Digite o valor da base e da altura, respectivamente: ");
						lado = entrada.nextDouble();
						altura = entrada.nextDouble();
						System.out.println("O valor da �rea � " + trianguloIsosceles(lado, altura) + "cm�");

					} else { // tipoTriangulo == 3
						System.out.println("Voc� selecionou o tri�ngulo Ret�ngulo: ");
						System.out.println("Digite o valor da base e da altura, respectivamente: ");
						lado = entrada.nextDouble();
						altura = entrada.nextDouble();
						System.out.println("O valor da �rea � " + trianguloRetangulo(lado, altura) + "cm�");
					}

				} else if (preferencia == 2) {
					System.out.println("Voc� selecionou a �rea do Quadrado");
					System.out.println("Digite o valor do lado do quadrado: ");
					lado = entrada.nextDouble();
					System.out.println("A �rea do Quadrado � de " + areaQuadrado(lado) + "cm�");

				} else { // preferencia == 3
					System.out.println("Voc� selecionou a �rea do C�rculo");
					System.out.println("Digite o valor do Raio: ");
					raio = entrada.nextDouble();
					System.out.println("A �rea do C�rculo � de " + areaCirculo(raio) + "cm�");
				}
				break;

			case 2:
				System.out.println("Voc� escolheu calcular a soma de uma PA");
				System.out.println("Digite o valor inicial da PA: ");
				a0 = entrada.nextInt();
				System.out.println("Digite o valor da Raz�o da PA: ");
				razao = entrada.nextInt();
				System.out.println("Digite a quantidade de termos: ");
				n = entrada.nextInt();

				System.out.println("O valor da soma dos termos de uma PA � " + progressaoAritmetica(a0, razao, n));
				break;

			default:
				System.out.println("## OP��O INV�LIDA ##");
			}

			System.out.println("\nDeseja repetir o programa? 0 - para encerrar");
			option = entrada.nextInt();

		} while (option != 0);
		System.out.println("##PROGRAMA ENCERRADO##");
	}

	public static double trianguloEquilatero(double lado) {
		double area;
		area = (Math.sqrt(3) * Math.pow(lado, 2) / 4);
		return area;
	}

	public static double trianguloIsosceles(double lado, double altura) {
		double area;
		area = (lado * altura) / 2;
		return area;
	}

	public static double trianguloRetangulo(double lado, double altura) {
		double area;
		area = (lado * altura) / 2;
		return area;
	}

	public static double areaQuadrado(double lado) {
		double areaQuadrado;
		areaQuadrado = Math.pow(lado, 2);
		return areaQuadrado;
	}

	public static double areaCirculo(double raio) {
		double areaCirculo, pi = 3.14;
		areaCirculo = pi * Math.pow(raio, 2);
		return areaCirculo;
	}

	public static double progressaoAritmetica(double a0, double razao, double n) {
		double an;
		an = a0 + razao * (n - 1);
		return an;
	}

}
