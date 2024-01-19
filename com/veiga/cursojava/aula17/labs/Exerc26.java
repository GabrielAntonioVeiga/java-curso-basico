package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc26 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int candidatoA =0;
		int candidatoB =0;
		int candidatoC =0;
		
		System.out.println("Numero de eleitores: ");
		int numCandidatos = scan.nextInt();
		
		
		for (int i = 0; i < numCandidatos; i++) {
			System.out.println("VOTE 1 2 ou 3");
			int escolha = scan.nextInt();
			switch (escolha) {
			case 1: {
				candidatoA++;	
				break;
			}
			case 2: {
				candidatoB++;	
				break;
			}
			case 3: {
				candidatoC++;	
				break;
			}
			default:
				System.out.println("Essa escolha está errada");
			}
		}
		
		System.out.println("Candidato A: " + candidatoA);
		System.out.println("Candidato B: " + candidatoB);
		System.out.println("Candidato C: " + candidatoC);
		
		
		
	}
}
