package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		char[] B = new char[A.length];

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
			if (A[i] < 7) {
				B[i] = 'a';
			} else if (A[i] == 7) {
				B[i] = 'b';
			} else if (A[i] > 7 && A[i] < 10) {
				B[i] = 'c';
			} else if (A[i] == 10) {
				B[i] = 'd';
			} else {
				B[i] = 'e';
			}
		}
		
		for (char i : B) {
			System.out.println(i);
		}
	}
}
