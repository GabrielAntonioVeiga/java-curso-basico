package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc37 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] A = new int[3];
		int[] B = new int[A.length];
		
		for (int i = 0; i < A.length; i++) {
			System.out.println("Numero " + i);
			A[i] = scan.nextInt();
		}
		
		
		for (int i = 0; i < A.length; i++) {
			int count = A[i];
			for (int j = A[i]-1; j != 1; j--) {
				count = count * j;
			}
			B[i] = count;
		}
		
		for (int i : B) {
			System.out.println(i);
		}
		

		
		
	}

}
