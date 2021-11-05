package Treino;

import java.util.Scanner;

public class ProvaEster {
	
	public static int calculoA(int qtd) {
        int valueA;
        valueA = qtd * 50;
        return valueA;
    }

    public static int calculoB(int qtd) {
        int valueB;
        valueB = qtd * 70;
        return valueB;
    }

    public static int calculoC(int qtd) {
        int valueC;
        valueC = qtd * 100;
        return valueC;
    }

    public static int calculoValorTotal(int valorParcialA, int valorParcialB, int valorParcialC) {
        int valueT;
        valueT = valorParcialA + valorParcialB + valorParcialC;
        return valueT;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //Produtos (Valor Unitário):
        //a: R$50
        //b: R$70
        //c: R$100
        int choice;
        int produto;
        int a, b, c, totalItens = 0; //Variáveis relacionadas a quantidade 
        int aT = 0, bT = 0, cT = 0; //Variáveis relacionadas a quantidade Total
        int valorParcialA = 0, valorParcialB = 0, valorParcialC = 0, valorParcial, valorTotal;
        boolean keep = true;

        do {
            System.out.println("-----MENU-----");
            System.out.println("1 - A: R$50, B: R$70, C: R$100"); //Nome e preço dos produtos
            System.out.println("2 - Calcular valor parcial");
            System.out.println("3 - Calcular valor total da compra");
            System.out.println("--------------");
            choice = entrada.nextInt();
            System.out.println("");

            switch (choice) {
                case 1:
                    System.out.println("Selecione o produto desejado: ");
                    System.out.println("1 - A");
                    System.out.println("2 - B");
                    System.out.println("3 - C");
                    System.out.println("--------");
                    produto = entrada.nextInt();
                    while(produto < 0 || produto > 3) {
                    	System.out.println("##PRODUTO NÃO ENCONTRADO##");
                    	produto = entrada.nextInt();
                    }
                    System.out.println("---------");
                    System.out.print("Informe a quantidade: ");
                    if (produto == 1) { //A
                        a = entrada.nextInt();
                        aT = a + aT;
                        valorParcialA = calculoA(a) + valorParcialA;                  
                    } else if (produto == 2) { //B
                        b = entrada.nextInt();
                        bT = b + bT;
                        valorParcialB = calculoB(b) + valorParcialB;                      
                    } else {//produto == 3  //C
                        c = entrada.nextInt();
                        cT = c + cT;
                        valorParcialC = calculoC(c) + valorParcialC;                       
                    }                    
                    System.out.println("");
                    //keep = true;
                    break;

                case 2:
                    valorParcial = calculoValorTotal(valorParcialA, valorParcialB, valorParcialC);
                    System.out.print("Valor Parcial: R$" + valorParcial);                    
                    System.out.println("");
                    //keep = true;
                    break;

                case 3:
                    valorTotal = calculoValorTotal(valorParcialA, valorParcialB, valorParcialC);
                    System.out.print("Valor Total: R$" + valorTotal);
                    System.out.println("");
                    totalItens = calculoValorTotal(aT, bT, cT);
                    System.out.println("Quantidade - Produtos A: " + aT);
                    System.out.println("Quantidade - Produtos B: " + bT);
                    System.out.println("Quantidade - Produtos C: " + cT);
                    System.out.println("Quantidade Total de Produtos: " + totalItens);
                    System.out.println("---------------");
                    keep = false;
                    break;

                default:
                    System.out.println("##OPÇÃO INVÁLIDA##");
                    //keep = true;
            }           
        } while (keep == true);
        System.out.println("##PROGRAMA ENCERRADO##");
    }

}
