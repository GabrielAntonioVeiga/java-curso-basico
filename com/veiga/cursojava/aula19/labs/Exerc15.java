package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc15 {
	
	public static void main(String[] args) {
		int somaPar = 0;
		int somaImpar = 0;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int i : A) {
			if ( i % 2 == 0) {
			somaPar++;	
		} else {
			somaImpar++;
		}
		}
		System.out.println("Porcentual de números pares: " + (somaPar/(double) A.length) * 100 + "% ");
		System.out.println("Porcentual de números ímpares: " + (somaImpar/(double) A.length) * 100 + "% ");
	}

}
