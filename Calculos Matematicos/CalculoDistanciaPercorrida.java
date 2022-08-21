package CalculosMatematicos;

import java.util.Scanner;

public class CalculoDistanciaPercorrida {

	public static void main (String [] args) {
		Scanner entrada = new Scanner(System.in);
		
		//Variáveis
		double velocidade;
		double distancia;
		double tempo;
		double qtdGasolina;
		
		System.out.println("Digite o tempo gasto(em Horas)");
		tempo = entrada.nextDouble();
		while(tempo < 0) {
			System.out.println("#TEMPO INVÁLIDO ##");
			tempo = entrada.nextDouble();
		}
		System.out.println("Digite a velocidade(em Km/h)");
		velocidade = entrada.nextDouble();
		
		distancia = calculoDistancia(tempo, velocidade);
		
		qtdGasolina = calculoGasolina(distancia);
		
		System.out.println("MENU");
		System.out.println("Tempo gasto: " + tempo + " H");
		System.out.println("Velocidade Média: " + velocidade + " Km/h");
		System.out.println("Distância: " + distancia + " Km");
		System.out.println("Gasto de gasolina: " + qtdGasolina + " L");			
	}
	
	//Método que calcula a distância
	public static double calculoDistancia(double tempo, double velocidade) {
		double distance;
		distance = velocidade * tempo;
		return distance;
	}
	
	//Método que calcula a gasolina gasta
	public static double calculoGasolina(double distancia) {
		double gasosa;
		gasosa = distancia/15; //Levei em consideração que o carro faz 15Km por Litro
		return gasosa;
	}
	
}
