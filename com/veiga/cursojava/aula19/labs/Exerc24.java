package com.veiga.cursojava.aula19.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc24 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		
//		for (int i = 0; i < A.length; i++) {
//			for (int k = 9; k != i ; k--) {
//				if (A[i] == A[k] ) {
//					System.out.println(A[i] + " é igual a: " + A[k]);
//					System.out.println("Index " + i + " Index " + k);
//				}
//			
//			}
//		}
		
	  for (int i = 0; i < A.length; i++) {
		if (A[i] !=  A[A.length - 1 -i  ]) {
			System.out.println("Não é palindromo");
		} 
	}
	}
}
