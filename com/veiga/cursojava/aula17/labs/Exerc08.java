package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc08 {
	
	public static void main(String[] args) {
		
		int count = 0;
		Scanner scan = new Scanner(System.in);
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Digite número: " + i);
			int num = scan.nextInt();
			count += num;
		}
		System.out.println("Soma: " + count );
		System.out.println("Média: " + count/5);
	}

}
