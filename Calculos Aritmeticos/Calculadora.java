package Treino;

import java.util.Scanner;

public class Calculadora {

    public static double somatorio(double a, double b) {
        double resultado;
        resultado = a + b;
        return resultado;
    }

    public static double subtrario(double a, double b) {
        double resultado;
        resultado = a - (b);
        return resultado;
    }

    public static double divisorio(double a, double b) {
        double resultado;
        resultado = a / b;
        return resultado;
    }

    public static double multiplicador(double a, double b) {
        double resultado;
        resultado = a * b;
        return resultado;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //VARI�VEIS:
        int choice;
        double calculo, resultado = 0;
        double a, b;

        System.out.print("Digite o valor: ");
        a = entrada.nextDouble();        
        //MENU
        do {
        	System.out.println("");
            System.out.println("+ : 1");//1 - Adi��o
            System.out.println("- : 2");//2 - Subtra��o
            System.out.println("x : 3");//3 - Multiplica��o
            System.out.println("� : 4");//4 - Divis�o
            System.out.print("Opera��o Desejada: ");
            choice = entrada.nextInt();           
            System.out.println("");
            System.out.print(a);

            switch (choice) {
                case 1:
                	System.out.print(" + ");
                    b = entrada.nextDouble();
                    calculo = somatorio(a, b);
                    resultado = calculo;
                    break;
                case 2:
                	System.out.print(" - ");
                    b = entrada.nextDouble();
                    calculo = subtrario(a, b);
                    resultado = calculo;
                    break;
                case 3:
                	System.out.print(" x ");
                	b = entrada.nextDouble();
                    calculo = multiplicador(a, b);
                    resultado = calculo;
                    break;
                case 4:                 
                	System.out.print(" � ");
                    b = entrada.nextDouble();
                    calculo = divisorio(a, b);
                    resultado = calculo;
                    break;
            }
            System.out.print("= " + resultado);         
            System.out.println("");
            a = resultado;

        } while (choice > 0 || choice < 5);
    }
}
