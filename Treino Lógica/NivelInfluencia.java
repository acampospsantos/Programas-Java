package TreinoLogica;

import java.util.Scanner;

public class NivelInfluencia {

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		int influTotal, influ1, influ2, cod, qtdConhec;
		int resp1;
		
		do {
			System.out.println("Digite o c�digo da pessoa: ");
			cod = entrada.nextInt();
			while(cod < 1 || cod > 3) {
				System.out.println("C�digo Incorreto!");
				cod = entrada.nextInt();
			}
			
			if(cod == 1) { //Crian�a
				influ1 = 1;
				System.out.println("Digite a quantidade de pessoas conhecidas pela crian�a: ");
				qtdConhec = entrada.nextInt();
				if(qtdConhec <= 5) {
					influ2 = 2;
					influTotal = influencia(influ1, influ2);
				} else if (qtdConhec > 5 && qtdConhec <= 50) {
					influ2 = 15;
					influTotal = influencia(influ1, influ2);
				} else {
					influ2 = 40;
					influTotal = influencia(influ1, influ2);					
				}
				System.out.println("A influ�ncia da crian�a � de: " + influTotal);
			
			} else if (cod == 2) {
				influ1 = 50;
				System.out.println("Digite a quantidade de pessoas conhecidas pelo jovem: ");
				qtdConhec = entrada.nextInt();
				if(qtdConhec <= 5) {
					influ2 = 2;
					influTotal = influencia(influ1, influ2);
				} else if(qtdConhec > 5 && qtdConhec <= 50) {
					influ2 = 15;
					influTotal = influencia(influ1, influ2);
				} else {
					influ2 = 40;
					influTotal = influencia(influ1, influ2);
				}
				System.out.println("A influ�ncia do jovem � de: " + influTotal);
				
			} else {//cod == 3 / Adulto
				influ1 = 50;
				System.out.println("Digite a quantidade de pessoas conhecidas pelo adulto: ");
				qtdConhec = entrada.nextInt();
				if(qtdConhec <= 5) {
					influ2 = 2;
					influTotal = influencia(influ1, influ2);
				} else if(qtdConhec > 5 && qtdConhec <= 50) {
					influ2 = 15;
					influTotal = influencia(influ1, influ2);
				} else {
					influ2 = 40;
					influTotal = influencia(influ1, influ2);
				}
				System.out.println("A influ�ncia do adulto � de: " + influTotal);
			}
			
			System.out.println("Deseja encerrar o programa? 1-p/ encerrar");
			resp1 = entrada.nextInt();
			
		} while(resp1 != 1);
		System.out.println("## PROGRAMA ENCERRADO ##");
	}
	
	public static int influencia(int influ1, int influ2) {
		int influTotal;
		influTotal = influ1 * influ2;
		return influTotal;
	}	
	
}
