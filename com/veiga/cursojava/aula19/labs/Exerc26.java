package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc26 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[A.length];
		
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A e B: " + ( i + 1 )  );
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			if ( A[i] > B[i] ) {
				C[i] = 1;
			} else if ( A[i] == B[i] ) {
				C[i] = 0;
			} else if ( A[i] < B[i] ) {
				C[i] = -1;
			}
		}
		
		for (int i : C) {
			System.out.println(i);
		}
	}
}
