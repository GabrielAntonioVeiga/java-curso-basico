package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc33 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] A = new int[10];
		int qtnPrimo = 0;

		
		for (int i = 0; i < A.length; i++) {
			A[i] = scan.nextInt();
		}
		
		
        for (int i = 0; i < A.length; i++) {
        	if ( primo(A[i]) ) {
        		System.out.println(A[i] + " é primo");
        	} else {
        		System.out.println(A[i] + " não é primo");
        	}
		}
	}
	
	public static boolean primo(int n) {
		
		if ( n < 2 ) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if ( n % i == 0  ){
				return false;
			} 
		}
		return true;
	}
	
}
