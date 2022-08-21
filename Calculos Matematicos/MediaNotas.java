package CalculosMatematicos;

import java.util.Scanner;

public class MediaNotas {
	
	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		
		double nota1, nota2, media;
		int i;
		int aprovados = 0, reprovados = 0, recuperacao = 0;
		
		for(i=1; i<= 3; i=i+1) {
			
			System.out.println("Digite a 1º nota: ");
			nota1 = entrada.nextDouble();
			while(nota1 < 0 || nota1 > 10) {
				System.out.println("## NOTA INVÁLIDA ##");
				System.out.println("Digite novamente: ");
				nota1 = entrada.nextDouble();
			}		
			
			System.out.println("Digite a 2º nota: ");
			nota2 = entrada.nextDouble();
			while(nota2 < 0 || nota2 > 10) {
				System.out.println("## NOTA INVÁLIDA ##");
				System.out.println("Digite novamente: ");
				nota2 = entrada.nextDouble();
			}
			
			media = (nota1 + nota2)/2;
			
			if(media >= 7) {
				System.out.println("O aluno obteve média " + media + " e está aprovado por média!");
				aprovados = aprovados + 1;
			} else if(media <= 3) {
				System.out.println("O aluno obteve média " + media + " e está reprovado por média!");
				reprovados = reprovados + 1;
			} else { //entre 3.1 e 6.9
				System.out.println("O aluno obteve média " + media + "e terá de fazer avaliação para suprir déficit de nota!");
				recuperacao = recuperacao + 1;
			}
		}
		
		System.out.println("Total de alunos aprovados: " + aprovados);
		System.out.println("Total de alunos reprovados: " + reprovados);
		System.out.println("Total de alunos em recuperação " + recuperacao);
		
		System.out.println("Total de alunos: " + totalDeAlunos(aprovados, reprovados, recuperacao));
	}
	
	public static int totalDeAlunos(int aprov, int reprov, int recup) {
		int total;
		total = aprov + reprov + recup;
		return total;
	}

}
