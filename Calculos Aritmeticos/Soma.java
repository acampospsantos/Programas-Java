package Treino;

import java.util.Scanner;

public class Soma { //Ideia é fazer um somador como se fosse uma calculadora (Envolvendo modularização)
	
	public static void main (String[] args){
		Scanner entrada = new Scanner(System.in);
		int a;
		int result;
		int soma = 0;		
		
		do {				
		   System.out.print("Digite o valor: ");
		   a = entrada.nextInt();
		  
		   result = somador(a, soma);
		   soma = result;
		   if(a < 0) {
			   soma = soma + Math.abs(a);
		   }
		   System.out.println("= " + soma);		  	
		   System.out.println();		   
	    } while(a > 0);		
	}
	
	public static int somador(int a, int soma) {
		int resultado;
		resultado = a + soma;
		return resultado;
	}

}
