package com.veiga.cursojava.aula20.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc06 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String jogador = "X";
		String[][] jogoVelha = new String[3][3];
		boolean vencedor = false;
		boolean jogadaValida = false;
		int linha = 0;
		int coluna = 0;
		int qtnJogadas = 0;
		
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				jogoVelha[i][j] = " ";
			}
		}

		while (!vencedor) {

			mostrarTabuleiro(jogoVelha, jogador);

			while (!jogadaValida) {
				System.out.println("Qual linha e coluna o jogador " + jogador + " deseja jogar? ");
				linha = scan.nextInt();
				coluna = scan.nextInt();
				if (jogoVelha[linha - 1][coluna - 1] != " ") {
					System.out.println("Esse espaço já está ocupado");
				} else {
					jogoVelha[linha - 1][coluna - 1] = jogador;
					jogadaValida = true;
					qtnJogadas++;
				}
			}

			
			int camposIguais = 0;

			for (int i = 0; i < jogoVelha.length; i++) {
				for (int j = 0; j < jogoVelha[i].length; j++) {
					if ( jogoVelha[i][j].equals(jogador) ) {
						camposIguais++;
						if ( camposIguais == 3 ) {
							System.out.println("Temos um vencedor de linha " + jogador);
							mostrarTabuleiro(jogoVelha, jogador);
							vencedor = true;
						}
					}
				}
				camposIguais = 0;
			}
				
				for (int j = 0; j < 3; j++) {
					for (int i = 0; i < jogoVelha.length; i++) {
						if ( jogoVelha[i][j].equals(jogador) ) {
							camposIguais++;
							if ( camposIguais == 3 ) {
								System.out.println("Temos um vencedor de coluna " + jogador);
								mostrarTabuleiro(jogoVelha, jogador);
								vencedor = true;
							}
						}
				}
					camposIguais = 0;
			}
				
				if ( qtnJogadas == 9 ) {
					System.out.println("Deu velha!");
					mostrarTabuleiro(jogoVelha, jogador);
					vencedor = true;
				}

			if (jogador.equalsIgnoreCase("X")) {
				jogador = "O";
			} else {
				jogador = "X";
			}

			jogadaValida = false;

		}
	}
	
	public static void mostrarTabuleiro(String[][] jogoVelha, String jogador) {
		System.out.println(" -- " + jogador + " -- ");
		System.out.println();
		for (int i = 0; i < jogoVelha.length; i++) {
			for (int j = 0; j < jogoVelha[i].length; j++) {
				System.out.print("[" + jogoVelha[i][j] + "] ");
			}
			System.out.println();
		}
	}
}
