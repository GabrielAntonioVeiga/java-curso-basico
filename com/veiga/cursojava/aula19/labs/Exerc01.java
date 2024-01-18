package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc01 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[5];
		int[] B = new int[5];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
			B[i] = A[i];
		}
		
		for (int i : B) {
			System.out.println(i);
		}
		
		
		
	}

}
