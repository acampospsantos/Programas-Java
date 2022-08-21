package Vetor;

import java.util.Scanner;
import java.util.Random;

public class PesquisaVetor {
	public static Scanner entrada = new Scanner(System.in);
	public static Random r = new Random(11);

	public static void main(String[]args) {
		//Variáveis
		int []valores = new int[18];
		boolean b1;
		
		preenche(valores);
		imprime(valores);
		b1 = pesquisa(valores, valores.length, 39) != -1;
		System.out.println("39 está no vetor? " + b1);
		System.out.println("66 está no vetor? " + (pesquisa(valores, valores.length, 66) != -1) );
	}
	
	public static void imprime(int[] v) {
		int i;
		for(i=0; i < v.length; i=i+1) {
			System.out.println(v[i] + " ");
		}
		System.out.println();
	}
	
	// Função que preenche aleatoriamente SEM repetição
	public static void preenche(int[] v) {
		int i;
		for(i=0; i < v.length ; i=i+1) {
			do {
				v[i] = r.nextInt(100) + 1;
			} while(false); // chame a função pesquisa
		}
	}
	
	public static void le(int[] v) {
		int i;
		for(i=0; i < v.length; i = i + 1) {
			System.out.printf("Digite o %dº valor ", i + 1);
			v[i] = entrada.nextInt();
		}
	}
	
	public static int pesquisa(int[] v, int n, int valor) {
		int i;
		for (i=0; i < n; i = i + 1) {
			if (v[i] == valor) {
				return i;
			}
		}
		return -1;
	}
	
}
