package Treino;

import java.util.Scanner;

public class Copa {
	
	public static int semifinal1(int golsBrasil, int golsJapão) {
		int vencedor;
		if(golsBrasil > golsJapão) {
			vencedor = 1;
		} else {//golsBrasil < golsJapão
			vencedor = 2;
		}
		return vencedor;
	}
	
	public static int semifinal2(int golsFrança, int golsUruguai) {
		int vencedor;
		if(golsFrança > golsUruguai) {
			vencedor = 1;
		} else {//golsFrança < golsUruguai
			vencedor = 2;
		}
		return vencedor;
	}
	//A- Brasil, B- França, C – Uruguai e D – Japão
	public static void anunciação(int golsBrasil, int golsJapão, int golsFrança, int golsUruguai) {
		int vencedor1, vencedor2;
		vencedor1 = semifinal1(golsBrasil, golsJapão);
		vencedor2 = semifinal2(golsFrança, golsUruguai);
		if(vencedor1 == 1) {
			System.out.println("-------------------------");
			System.out.println("BRASIL ESTÁ NA FINAL");
			System.out.println("JAPÃO DISPUTARÁ O 3ºLUGAR");
            System.out.println("-------------------------");
		} else {//vencedor1 == 2
			System.out.println("-------------------------");
			System.out.println("JAPÃO ESTÁ NA FINAL");
			System.out.println("BRASIL DISPUTARÁ O 3ºLUGAR");
			System.out.println("-------------------------");
		}
		if(vencedor2 == 1) {
			System.out.println("FRANÇA ESTÁ NA FINAL");
			System.out.println("URUGUAI DISPUTARÁ O 3ºLUGAR");
			System.out.println("-------------------------");
		} else {//vencedor2 == 2
			System.out.println("URUGUAI ESTÁ NA FINAL");
			System.out.println("FRANÇA DISPUTARÁ O 3ºLUGAR");
			System.out.println("-------------------------");
		}
	}

	public static void main(String[]args) {
		Scanner entrada = new Scanner(System.in);
		//Variáveis:
		int golsBrasil, golsJapão, golsFrança, golsUruguai;
	
		System.out.println("Semifinais: ");
		System.out.println("--------------");
		System.out.println("Brasil X Japão");
		System.out.println("França X Uruguai");
		System.out.println("--------------");
		System.out.println("");
		
		//1ºJogo da Semifinal: BRASIL X JAPÃO ---------------------------
		System.out.println("Primeira Semifinal: Brasil x Japão");
		System.out.print("Digite o número de gols do Brasil na partida: ");
		golsBrasil = entrada.nextInt();
		while(golsBrasil < 0) {
			System.out.println("##VALOR INVÁLIDO##");
			golsBrasil = entrada.nextInt();
		}
		System.out.print("Digite o número de gols do Japão na partida: ");
		golsJapão = entrada.nextInt();
		while(golsJapão < 0 || golsJapão == golsBrasil) {
			System.out.println("##VALOR INVÁLIDO##");
			golsJapão = entrada.nextInt();
		}
		System.out.println("-----PLACAR-----");
		System.out.println("BRASIL " + golsBrasil + "X" + golsJapão + " JAPÃO");
		System.out.println("----------------");
		System.out.println("");
				
		
		//2ºJogo da Semifinal: FRANÇA X URUGUAI -----------------------------
		System.out.println("Segunda Semifinal: França x Uruguai");
		System.out.print("Digite o número de gols da França na partida: ");
		golsFrança = entrada.nextInt();
		while(golsFrança < 0) {
			System.out.println("##VALOR INVÁLIDO##");
			golsFrança = entrada.nextInt();
		}
		System.out.print("Digite o número de gols do Uruguai na partida: ");
		golsUruguai = entrada.nextInt();
		while(golsUruguai < 0 || golsUruguai == golsFrança) {
			System.out.println("##VALOR INVÁLIDO##");
			golsUruguai = entrada.nextInt();
		}
		System.out.println("-----PLACAR-----");
		System.out.println("FRANÇA " + golsFrança + "X" + golsUruguai + " URUGUAI");
		System.out.println("----------------");
		System.out.println("");
		
		
		anunciação(golsBrasil, golsJapão, golsFrança, golsUruguai);	
	}	
}
