package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc32 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite vetor A: " + ( i + 1));
			A[i] = scan.nextInt();
		}
		
		for (int i = 0; i < A.length; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.println(A[i] + " * " + j + " = " + (A[i] * j));
			}
			System.out.println();
		}
		
	}
}
