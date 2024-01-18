package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc25 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] A = new int[5];
		int[] B = new int[5];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: " + (i + 1));
			A[i] = scan.nextInt();
			B[i] = (A[i] % 2 == 0) ? 1 : 0;
		}

		for (int i : B) {
			System.out.print(i + " ");
		}
	}

}
