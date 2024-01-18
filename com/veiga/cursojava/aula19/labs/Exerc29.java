package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc29 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		 
		int[] A = new int[10];
		int[] B = new int[A.length];
		int[] C = new int[20];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Digite os " +( i + 1 )+"*s valores de A e B: ");
			A[i] = scan.nextInt();
			B[i] = scan.nextInt();
			C[i] = A[i];
			C[i + A.length] = B[i];
		}			
		
		for (int i : C) {
			System.out.println(i);
		}
		
	}
}
