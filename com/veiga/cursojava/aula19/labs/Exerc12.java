package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc12 {
	
	public static void main(String[] args) {
		int soma = 0;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int i : A) {
			soma += i;	
		}
		
		System.out.println(soma);
	}

}
