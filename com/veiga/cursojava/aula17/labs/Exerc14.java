package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc14 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int par = 0;
		int impar = 0;
		
		for (int i = 1; i <= 10; i++) {
			System.out.println("Número " + i);
			int num = scan.nextInt();
			if ( num % 2 == 0 ) {
				 par++;
			} else {
				impar++;
			}
		}
		
		System.out.println("Pares = " + par + 
				"\nImpares = " + impar);
	}

}
