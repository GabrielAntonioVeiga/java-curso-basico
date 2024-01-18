package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int i : A) {
			if ( i %  2 == 0) {
				System.out.println("É par: " + i);
			}
		}
	}

}
