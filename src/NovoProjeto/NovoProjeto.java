package NovoProjeto;

import java.util.Random;
import java.util.Scanner;

public class NovoProjeto {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		
		Random rand = new Random();
		
		int jogador, cpu = rand.nextInt(3);
		
		System.out.println("Bem vindo ao jogo!");
		System.out.println("EScolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
		jogador = ent.nextInt();
				
		
		switch (jogador) {
			case 0: 
				switch (cpu) {
				case 0:
				System.out.println("Empate! Tente novamente");
				System.out.println("EScolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
				jogador = ent.nextInt();
				case 1:
				System.out.println("Você perdeu!");
				break;
				case 2:
				System.out.println("Você ganhou!");
				break;
				default:
				}
				break;
			case 1:{
				switch (cpu) {
				case 0:
				System.out.println("Você ganhou! ");
				break;
				case 1:
				System.out.println("Empate! Tente novamente");
				System.out.println("EScolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
				jogador = ent.nextInt();
				case 2:
				System.out.println("Você perdeu! ");
				break;
				default:
				}
				break;
			}
			case 2:{
				switch (cpu) {
				case 0:
				System.out.println("Você perdeu!");
				break;
				case 1:
				System.out.println("Você ganhou!");
				break;
				case 2:
				System.out.println("Empate! Tente novamente");
				System.out.println("EScolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
				jogador = ent.nextInt();
				default:
				}
				break;
				}
		}
		System.out.println("Adversário escolheu: " + cpu);
		
		
//		if ((jogador < 0) || (jogador > 2)) {
//			System.out.println("Bem vindo ao jogo22!");
//			System.out.println("EScolha, PEDRA-0 PAPEL-1 TESOURA-2: ");
//			jogador = ent.nextInt();
//		}
		
		
		
	}

}





