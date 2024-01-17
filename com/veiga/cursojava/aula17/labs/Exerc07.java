package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc07 {
	public static void main(String[] args) {
		int num = 0;
//	    int maior = Integer.MIN_VALUE;
		int maior = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite um número positivo inteiro: ");
			num = scan.nextInt();
			
			if ( num > maior ) {
				maior = num;
			}
		}
		
		System.out.println(maior);
		
		
		
		
	}

}
