package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc30 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[20];
		int[] B = new int[20];
		int[] C = new int[20];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * (100 - 1 + 1) + 1);
		}

		int posB = 0;
		int posC = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				B[posB] = A[i];
				posB++;
			} else {
				C[posC] = A[i];
				posC++;
			}
		}

		System.out.println("Par");
		for (int i = 0; i < posB; i++) {
			System.out.print(B[i] + " ");
		}
		System.out.println();
		System.out.println("Impar");
		for (int i = 0; i < posC; i++) {
			System.out.print(C[i] + " ");
		}
	}
}
