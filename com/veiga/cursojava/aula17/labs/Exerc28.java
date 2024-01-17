package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc28 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int qtnCDs = scan.nextInt();
		double valorTotal = 0;
		
		for (int i = 1; i <= qtnCDs; i++) {
			System.out.println("Qual o valor do CD: " + i);
			double valorCD = scan.nextDouble();
			
			valorTotal += valorCD;
		}
		
		System.out.println("Gasto total: " + valorTotal + 
				"\nValor médio por CD: " + valorTotal/qtnCDs);
	}

}
