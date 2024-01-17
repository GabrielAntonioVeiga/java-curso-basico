package com.veiga.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc22 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Número");
		int num = scan.nextInt();
		
		if ( (num % 2) == 0 ) {
			System.out.println(num + " é par");
		} else {
			System.out.println(num + " é impar");
		}
		
	}

}
