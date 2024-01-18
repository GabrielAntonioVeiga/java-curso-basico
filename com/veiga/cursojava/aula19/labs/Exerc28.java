package com.veiga.cursojava.aula19.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc28 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] A = new int[6];
		int[] B = new int[A.length];
		int index = A.length - 1;
		
		for (int i = 0; i < A.length; i++) {
			    System.out.println("Valor vetor A: " + ( i + 1 ));
			    A[i] = scan.nextInt();
			    System.out.println("Index " + index);
				B[index] = A[i]; 
				index--;
		}
		
		for (int i : B) {
			System.out.println(i + " ");
		}

	}

}
