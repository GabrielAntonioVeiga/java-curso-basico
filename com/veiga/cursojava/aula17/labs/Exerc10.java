package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc10 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 	
		
		System.out.println("Digite dois números inteiros: ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		int soma = 0;
		
		for (int i = num1+1; i < num2; i++) {
			System.out.print(i + " ");
			soma += i;
		}
		System.out.println();
		System.out.println(soma);
		
	}

}
