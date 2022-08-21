package CalculosMatematicos;

import java.util.Scanner;

public class CalculoAreas {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		// Variáveis
		int opcao;
		int preferencia;
		int tipoTriangulo;
		double lado, altura, raio;
		int a0, razao, n;
		int option;

		do {
			System.out.println("\n\nMenu Principal\n\n");

			System.out.println("1 - Calcular a área");
			System.out.println("2 - Calcular a soma da PA");
			System.out.println("");
			System.out.println("Digite a opção desejada");
			opcao = entrada.nextInt();
			System.out.println("");

			switch (opcao) {
			case 1:
				System.out.println("Você escolheu calcular a área de figuras planas!");
				System.out.println("1 - Área do Triângulo");
				System.out.println("2 - Área do Quadrado");
				System.out.println("3 - Área do Círculo");
				System.out.println("Deseja calcular a área de qual figura: ");
				preferencia = entrada.nextInt();
				System.out.println("");
				while (preferencia < 1 || preferencia > 3) {
					System.out.println("Valor inválido! Digite novamente!");
					preferencia = entrada.nextInt();
				}
				if (preferencia == 1) {
					System.out.println("-CÁLCULO ÁREA DO TRIÂNGULO-");
					System.out.println("Qual triângulo você deseja calcular a área? ");
					System.out.println("1 - Triângulo Equilátero");
					System.out.println("2 - Triângulo Isósceles");
					System.out.println("3 - Triãngulo RetÂngulo");
					System.out.println("");

					tipoTriangulo = entrada.nextInt();
					if (tipoTriangulo == 1) {
						System.out.println("Você selecionou o triângulo Equilátero: ");
						System.out.println("Digite o valor do lado: ");
						lado = entrada.nextDouble();
						System.out.println("O valor da área é " + trianguloEquilatero(lado) + "cm²");

					} else if (tipoTriangulo == 2) {
						System.out.println("Você selecionou o triângulo Isósceles: ");
						System.out.println("Digite o valor da base e da altura, respectivamente: ");
						lado = entrada.nextDouble();
						altura = entrada.nextDouble();
						System.out.println("O valor da área é " + trianguloIsosceles(lado, altura) + "cm²");

					} else { // tipoTriangulo == 3
						System.out.println("Você selecionou o triângulo Retângulo: ");
						System.out.println("Digite o valor da base e da altura, respectivamente: ");
						lado = entrada.nextDouble();
						altura = entrada.nextDouble();
						System.out.println("O valor da área é " + trianguloRetangulo(lado, altura) + "cm²");
					}

				} else if (preferencia == 2) {
					System.out.println("Você selecionou a área do Quadrado");
					System.out.println("Digite o valor do lado do quadrado: ");
					lado = entrada.nextDouble();
					System.out.println("A área do Quadrado é de " + areaQuadrado(lado) + "cm²");

				} else { // preferencia == 3
					System.out.println("Você selecionou a área do Círculo");
					System.out.println("Digite o valor do Raio: ");
					raio = entrada.nextDouble();
					System.out.println("A área do Círculo é de " + areaCirculo(raio) + "cm²");
				}
				break;

			case 2:
				System.out.println("Você escolheu calcular a soma de uma PA");
				System.out.println("Digite o valor inicial da PA: ");
				a0 = entrada.nextInt();
				System.out.println("Digite o valor da Razão da PA: ");
				razao = entrada.nextInt();
				System.out.println("Digite a quantidade de termos: ");
				n = entrada.nextInt();

				System.out.println("O valor da soma dos termos de uma PA é " + progressaoAritmetica(a0, razao, n));
				break;

			default:
				System.out.println("## OPÇÃO INVÁLIDA ##");
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
