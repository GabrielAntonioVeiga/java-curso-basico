package com.veiga.cursojava.aula17.labs;

public class Exerc04 {
	
	public static void main(String[] args) {
		boolean ultrapassou = false;
		double populacaoA = 80000;
		double populacaoB = 200000;
		
		
		for (int anos = 0; !ultrapassou  ; anos++) {
			if (populacaoA >= populacaoB) {
				System.out.println(anos);
				ultrapassou = true;
			} else {
				populacaoA += populacaoA * 0.03;
				populacaoB += populacaoB * 0.015;
			}
		}
		
	}

}
