package Treino;

import java.util.Scanner;

public class RevisaoP1 {
	
	public static void calculo(double nota1, double nota2) {
        double media;
        media = (nota1 + nota2) / (2);
        System.out.println("Média do aluno: " + media);
        conceito(media);
    }

    public static void conceito(double media) {
        //0,0 ≤ média < 5,0  :D
        //5,0 ≤ média < 7,0  :C
        //7,0 ≤ média < 9,0  :B
        //9,0 ≤ média ≤ 10,0 :A
        if (media >= 0 && media < 5) {
            System.out.println("Conceito D");
        } else if (media >= 5 && media < 7) {
            System.out.println("Conceito C");
        } else if (media >= 7 && media < 9) {
            System.out.println("Conceito B");
        } else {//media >=9 && media <=10
            System.out.println("Conceito A");
        }
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Variáveis:
        int qtdAlunos = 60;
        double nota1, nota2;

        for (int i = 0; i < qtdAlunos; i = i + 1) {
            System.out.println((i + 1) + "º Aluno: ");
            System.out.print("Digite a sua 1º nota: ");
            nota1 = entrada.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("##NOTA INVÁLIDA##");
                nota1 = entrada.nextDouble();
            }
            System.out.print("Digite a sua 2º nota: ");
            nota2 = entrada.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("##NOTA INVÁLIDA##");
                nota2 = entrada.nextDouble();
            }
            System.out.println("");
            calculo(nota1, nota2);
            System.out.println("---------------------");
            System.out.println("");
        }
    }
}

//60 Alunos
