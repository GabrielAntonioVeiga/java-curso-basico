package com.veiga.cursojava.aula19.labs;

public class Exerc34 {
	
	public static void main(String[] args) {
			
		int[] A = new int[10];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * (100 - 1 + 1) + 1);
		}
		
		for (int i = 0; i < A.length; i++) {
			System.out.println();
			System.out.print(A[i] + " -- Pares: ");
			for (int j = 0; j < A[i]; j++) {
				if ( j % 2 == 0 ) {
					System.out.print(j + " ");
				}
			}
			
		}
		
	}

}
