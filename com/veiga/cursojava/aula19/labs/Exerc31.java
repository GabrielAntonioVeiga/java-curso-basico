package com.veiga.cursojava.aula19.labs;

public class Exerc31 {

	public static void main(String[] args) {

		int[] A = new int[20];
		int[] B = new int[20];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * (100 - 1 + 1) + 1);
		}

		int posB = 0;

		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				B[posB] = A[i];
				posB++;
			}
		}
		
		System.out.println(posB + " Números pares");
		int novoIndex = posB;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 != 0) {
				B[posB] = A[i];
				posB++;
			}
		}
		
		System.out.println(posB - novoIndex + " Números ímpares");

		for (int i = 0; i < posB; i++) {
			if ( i < novoIndex ) {
				System.out.println("par " + B[i] + " ");				
			} else {
				System.out.println("Impar " + B[i] + " ");
			}
		}
	}
}
