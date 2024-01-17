package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc18 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int  maior = Integer.MIN_VALUE;
		int menor = Integer.MAX_VALUE;
		int soma = 0;
		int num = 0;
		boolean valido = false;
		
		System.out.println("Quantos números você quer informar?? ");
		int qtnNum = scan.nextInt();
		
		for (int i = 1; i <= qtnNum; i++) {
			while ( !valido ) {
				System.out.println("Digite o número: " + i);
				num = scan.nextInt();
                if ( num > 0 && num < 1000 ) {
                	valido = true;
                }
			}
			
			if ( num > maior) {
				maior = num;
			}
			
			if (num < menor) {
				menor = num;
			}
			
			soma += num;
			valido = false;
		}
		
		System.out.println("Maior número: " + maior +
				"\nMenor número: "+ menor + 
				"\nSoma: " + soma);
		
		
	}

}
