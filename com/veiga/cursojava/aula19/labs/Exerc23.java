package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc23 {

	public static void main(String[] args) {

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.round(Math.random() * (100 - 1 + 1) + 1 );
			System.out.println(A[i]);	
		}
		
		boolean continua = true;
		int j = 0;
		while ( continua ) {
			if ( A[j] % 2 != 0 ) {
				continua = false;
			} else {
				System.out.println("Par: " + A[j]);
			}
			++j;
		}

	}

}
