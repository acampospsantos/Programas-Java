package Vetor;

import java.util.Scanner;

public class QuestaoVetor {

	public static Scanner entrada = new Scanner (System.in);
	public static final int MIN = 3;
	public static final int MAX = 66;
	
	public static void main(String[]args) {
		int numAlunos, i;
		int soma = 0;
		double[] notas;
		double media = 0;
		double maiorNota = 0, menorNota = 10.0;
		double a=0, b=0;
		
		do {
			System.out.println("Quantos alunos tem na sala? ");
			numAlunos = entrada.nextInt();
		} while(numAlunos < MIN || numAlunos > MAX);
		notas = new double[numAlunos]; //Inicializando vetor 'notas'
		
		for(i=0; i < notas.length; i = i + 1) {
			do {
				System.out.printf("Digite a %dº nota: ", i + 1);
				notas[i] = entrada.nextDouble();
			} while(notas[i] < 0 || notas[i] > 10);
			media = media + notas[i];
			}
		media = media / notas.length;
		
		System.out.println("\n\n Alunos com notas abaixo da média da turma (" + media + "): ");
		for(i=0; i<notas.length; i++) {
			if(notas[i] < media) {
				System.out.println( (i+1) + "º Aluno : " + notas[i]);
				System.out.println("");
			}
		}
		
		System.out.println("Alunos com notas igual ou maior que 7: ");
		for(i=0; i< notas.length; i=i+1) {
			if(notas[i] >= 7) {
				soma = soma + 1;
			}
		}
		System.out.println(soma + " alunos ");
		
		for(i=0; i < notas.length; i = i + 1) {
			if (notas[i] > maiorNota) {
				maiorNota = notas[i];
			}
		}
		System.out.println("\nMaior nota: " + maiorNota);
		
		for(i=0; i< notas.length; i = i + 1) {
			if(menorNota > notas[i]) {
				menorNota = notas[i];
			}
		}
		System.out.println("Menor nota: " + menorNota);
		
		for(i=0; i < notas.length; i = i + 1) {
			if(notas[i] > media) {
				a = notas[i];
				if (notas[i] < a) {
					a = notas[i];
				}
			}
		}
		System.out.println("\nA menor nota ACIMA da média da turma é: " + a);
		
		for(i=0; i < notas.length; i++) {
			if(notas[i] < media) {
				b = notas[i];
				if (notas[i] > b) {
					b = notas[i];
				}
			}
		}
		System.out.println("A maior nota ABAIXO da média da turma é: " + b);
		
		System.out.print("\n {");
		
		for(i=0; i < notas.length; i=i+1) {
			
			System.out.printf("%.1f", notas[i]);
			
			if(i != notas.length - 1) {
				System.out.print(" , ");
			} else {
				System.out.println("}");
			}
		}
		
	}
}
