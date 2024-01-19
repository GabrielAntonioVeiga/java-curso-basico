package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc17 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		boolean escolhaCorreta = false;
		int num = 0;
		
	    while (continuar) {
	    	
		while ( !escolhaCorreta ) {			
			System.out.println("Diga um número inteiro: ");
			num = scan.nextInt();
			if ( num > 0 && num < 16 ) {
				escolhaCorreta = true;
			}
		}
		
		System.out.println("Fatorial de: " + num);
		for (int i = num-1; i != 1 ; i--) {
		num = num * i;  	
		}
		System.out.println(num);
		System.out.println("Deseja calcular outro numero? S/n");
		String escolha = scan.next();
		if ( escolha.equalsIgnoreCase("N") ) {
			continuar = false;
		}
			escolhaCorreta = false;
	    }
	}

}
