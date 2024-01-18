package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc09 {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] A = new int[3];
		int[] B = new int[A.length];
		double[] C = new double[A.length];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
			System.out.println("Valor vetor B: ");
			B[i] = scan.nextInt();
			C[i] = A[i] / B[i];
		}

		for (double i : C) {
			System.out.println(i);

		}
	}

}
