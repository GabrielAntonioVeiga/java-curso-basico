package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc05 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		boolean ultrapassou = false;
		
		System.out.println("Qual o valor da popA ?");
		double populacaoA = scan.nextDouble();
		System.out.println("Qual o valor da popB ?");
		double populacaoB = scan.nextDouble();
		
		System.out.println("Qual a taxa de crescimento da popA ??");
		double taxaCrescimentoPopA = scan.nextDouble(); 
		System.out.println("Qual a taxa de crescimento da popB ??");
		double taxaCrescimentoPopB = scan.nextDouble(); 
		
		
		for (int anos = 0; !ultrapassou  ; anos++) {
			if (populacaoA >= populacaoB) {
				System.out.println(anos);
				ultrapassou = true;
			} else {
				populacaoA += populacaoA * taxaCrescimentoPopA;
				populacaoB += populacaoB * taxaCrescimentoPopB;
			}
		}
		
	}

}

//15 000

// 22 000

// 22 500

// 24 000


