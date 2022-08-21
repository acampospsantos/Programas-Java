package CalculosMatematicos;

import java.util.Scanner;

public class ConversaoHorasMinutos {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		//Declaração Variáveis
		int horas;
		int minutos;
		int segundos;
		int opcao, opcao1, opcao2;
		
		System.out.println("Deseja converter: ");
		System.out.println("1 - Horas -> Segundos");
		System.out.println("2 - Segundos -> Horas");
		System.out.println("--------------");
		
		opcao = entrada.nextInt();
		while(opcao < 1 || opcao > 2) {
			System.out.println("##OPÇÃO INVÁLIDA##");
			System.out.println("Digite novamente!");
			opcao = entrada.nextInt();
		}
		
		if (opcao == 1) { //Converter horas pra segundos
			System.out.println("Digite a quantidade de horas");
			horas = entrada.nextInt();
			System.out.println("Digite a quantidade de minutos");
			minutos = entrada.nextInt();
			while(minutos < 0) {
				System.out.println("## Minutagem inválida ##");
				minutos = entrada.nextInt();
			}
			System.out.println("Digite a quantidade de segundos");
			segundos = entrada.nextInt();
			while(segundos < 0) {
				System.out.println("## Segundos inválida ##");
				segundos = entrada.nextInt();
			}
			opcao1 = conversao1(horas, minutos, segundos);
			System.out.println(opcao1 + " segundos");
			
		} else { //Converter segundos pra horas
			System.out.println("Digite a quantidade de horas");
			horas = entrada.nextInt();
			System.out.println("Digite a quantidade de minutos");
			minutos = entrada.nextInt();
			while(minutos < 0) {
				System.out.println("## Minutagem inválida ##");
				minutos = entrada.nextInt();
			}
			System.out.println("Digite a quantidade de segundos");
			segundos = entrada.nextInt();
			while(segundos < 0) {
				System.out.println("## Segundos inválida ##");
				segundos = entrada.nextInt();
			}			
			opcao2 = conversao2(horas, minutos, segundos);
			System.out.println(opcao2 + " horas");
		}
	}
	
	public static int conversao1 (int hora, int minuto, int segundo) {
		int conversao;
	    int horas = hora * 3600;
	    int minutos = minuto * 60;
	    conversao = horas + minutos + segundo;
	    return conversao;
	}
	
	public static int conversao2 (int hora, int minuto, int segundo) {
		int conversao;
		int minutos = minuto/60;
		int segundos = segundo/3600;
		conversao = hora + minutos + segundos; 
		return conversao;
	}
	
}
