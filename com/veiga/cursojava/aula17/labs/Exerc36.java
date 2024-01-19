package com.veiga.cursojava.aula17.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc36 {

	public static void main(String[] args) {
		int comeco = 0;
		int fim = 0;
		boolean correto =  false;
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Montar a tabuada de: ");
		int num = scan.nextInt();
		
		
		while (!correto) {			
		System.out.print("Começar por: ");
		comeco = scan.nextInt();
		System.out.print("Terminar em: ");
		fim = scan.nextInt();
		if ( fim < comeco ) {
			System.out.println("Fim é maior que o começo");
		} else {
			correto = true;
		}
		}
		
		System.out.println("Vou montar a tabuada de "  + num + " começando em " + comeco + 
				" terminando em " + fim + ": ");
		
		for (int i = comeco; i <= fim; i++) {
			System.out.println(num + " X " + i + " = " + num*i);
		}
		
		
		
	}
}
