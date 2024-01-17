package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc13 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int soma = 1;
		
		System.out.println("Digite a base: ");
		int base = scan.nextInt();
		
		System.out.println("Digite o expoente: ");
		int expoente = scan.nextInt();
		
		for (int i = 1; i <= expoente; i++) {
			soma *= base;
		}
		
		System.out.println(soma);
		
	}

}
