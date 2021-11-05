package Treino;

import java.util.Scanner;

public class Copa {
	
	public static int semifinal1(int golsBrasil, int golsJap�o) {
		int vencedor;
		if(golsBrasil > golsJap�o) {
			vencedor = 1;
		} else {//golsBrasil < golsJap�o
			vencedor = 2;
		}
		return vencedor;
	}
	
	public static int semifinal2(int golsFran�a, int golsUruguai) {
		int vencedor;
		if(golsFran�a > golsUruguai) {
			vencedor = 1;
		} else {//golsFran�a < golsUruguai
			vencedor = 2;
		}
		return vencedor;
	}
	//A- Brasil, B- Fran�a, C � Uruguai e D � Jap�o
	public static void anuncia��o(int golsBrasil, int golsJap�o, int golsFran�a, int golsUruguai) {
		int vencedor1, vencedor2;
		vencedor1 = semifinal1(golsBrasil, golsJap�o);
		vencedor2 = semifinal2(golsFran�a, golsUruguai);
		if(vencedor1 == 1) {
			System.out.println("-------------------------");
			System.out.println("BRASIL EST� NA FINAL");
			System.out.println("JAP�O DISPUTAR� O 3�LUGAR");
            System.out.println("-------------------------");
		} else {//vencedor1 == 2
			System.out.println("-------------------------");
			System.out.println("JAP�O EST� NA FINAL");
			System.out.println("BRASIL DISPUTAR� O 3�LUGAR");
			System.out.println("-------------------------");
		}
		if(vencedor2 == 1) {
			System.out.println("FRAN�A EST� NA FINAL");
			System.out.println("URUGUAI DISPUTAR� O 3�LUGAR");
			System.out.println("-------------------------");
		} else {//vencedor2 == 2
			System.out.println("URUGUAI EST� NA FINAL");
			System.out.println("FRAN�A DISPUTAR� O 3�LUGAR");
			System.out.println("-------------------------");
		}
	}

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Vari�veis:
		int golsBrasil, golsJap�o, golsFran�a, golsUruguai;
	
		System.out.println("Semifinais: ");
		System.out.println("--------------");
		System.out.println("Brasil X Jap�o");
		System.out.println("Fran�a X Uruguai");
		System.out.println("--------------");
		System.out.println("");
		
		//1�Jogo da Semifinal: BRASIL X JAP�O ---------------------------
		System.out.println("Primeira Semifinal: Brasil x Jap�o");
		System.out.print("Digite o n�mero de gols do Brasil na partida: ");
		golsBrasil = entrada.nextInt();
		while(golsBrasil < 0) {
			System.out.println("##VALOR INV�LIDO##");
			golsBrasil = entrada.nextInt();
		}
		System.out.print("Digite o n�mero de gols do Jap�o na partida: ");
		golsJap�o = entrada.nextInt();
		while(golsJap�o < 0 || golsJap�o == golsBrasil) {
			System.out.println("##VALOR INV�LIDO##");
			golsJap�o = entrada.nextInt();
		}
		System.out.println("-----PLACAR-----");
		System.out.println("BRASIL " + golsBrasil + "X" + golsJap�o + " JAP�O");
		System.out.println("----------------");
		System.out.println("");
				
		
		//2�Jogo da Semifinal: FRAN�A X URUGUAI -----------------------------
		System.out.println("Segunda Semifinal: Fran�a x Uruguai");
		System.out.print("Digite o n�mero de gols da Fran�a na partida: ");
		golsFran�a = entrada.nextInt();
		while(golsFran�a < 0) {
			System.out.println("##VALOR INV�LIDO##");
			golsFran�a = entrada.nextInt();
		}
		System.out.print("Digite o n�mero de gols do Uruguai na partida: ");
		golsUruguai = entrada.nextInt();
		while(golsUruguai < 0 || golsUruguai == golsFran�a) {
			System.out.println("##VALOR INV�LIDO##");
			golsUruguai = entrada.nextInt();
		}
		System.out.println("-----PLACAR-----");
		System.out.println("FRAN�A " + golsFran�a + "X" + golsUruguai + " URUGUAI");
		System.out.println("----------------");
		System.out.println("");
		
		
		anuncia��o(golsBrasil, golsJap�o, golsFran�a, golsUruguai);	
	}	
}
