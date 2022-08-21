package Vetor;

import java.util.Scanner;

public class PreenchimentoVetor {
	
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[]args) {
		//Variáveis
		int[] vetor = new int [10];
		int maiorValorVet;
		int menorIndiceVet;
		
		preenchimento(vetor);
		maiorValorVet = maiorValor(vetor);
		System.out.println("O maior vetor é: " + maiorValorVet);
		menorIndiceVet = menorValor(vetor);
		System.out.println("O menor vetor se encontra na posição: " + menorIndiceVet);		
	}
	
	public static void preenchimento(int vetor[]) {
		int i;
		for(i=0; i < vetor.length; i = i + 1) {
			System.out.println("Digite os 10 valores do vetor: ");
			vetor[i] = entrada.nextInt();
		}
	}
	
	public static int maiorValor(int vetor[]) {
		int i;
		int maiorValor = vetor[0];
		for(i=0; i < vetor.length; i=i+1) {
			if(maiorValor < vetor[i]) {
				maiorValor = vetor[i];
			}
		}
		return maiorValor;
	}
	
	public static int menorValor(int vetor[]) {
		int i;
		int menorValor = vetor[0];
		int indice=0;
		for(i=0; i < vetor.length; i=i+1) {
			if(menorValor > vetor[i]) {
				menorValor = vetor[i];
				indice = i;
			}
		}
		//Esse índice = i + 1 ... só adicionei +1 p/ melhor entendimento do usuário
		return indice + 1;
	}

}
