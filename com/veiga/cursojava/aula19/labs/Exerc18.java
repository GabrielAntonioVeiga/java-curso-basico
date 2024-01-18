package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc18 {
	
	public static void main(String[] args) {
		int indexMaiorIdade = 0;
		int indexMenorIdade = 0;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}
		
		int maior = A[0];
		int menor = A[0];

		for (int i = 1; i < A.length; i++) {
			if ( A[i] > maior ) {
				maior = A[i];
				indexMaiorIdade = i;
			} else if ( A[i] < menor ) {
				menor = A[i];
				indexMenorIdade = i;
			}
		}
		
		System.out.println("Maior: " + maior + " Index: " + indexMaiorIdade);
		System.out.println("Menor : " + menor + " Index: " + indexMenorIdade);
	}

}
