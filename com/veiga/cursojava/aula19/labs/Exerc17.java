package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc17 {

	public static void main(String[] args) {
		int qtnPessoasAcima35 = 0;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int i : A) {
			if (i > 35) {
				qtnPessoasAcima35 ++;

			}
		}

		System.out.println(qtnPessoasAcima35);
	}
}
