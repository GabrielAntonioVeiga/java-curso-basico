package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc06 {
	
	public static void main(String[] args) {
		String direcao;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Você quer ver os números na vertical ou horizontal ??");
		direcao = scan.next();
		
		for (int i = 1; i <= 20; i++) {
			if ( direcao.equalsIgnoreCase("horizontal") ) {
				System.out.print(i + " ");
				
   			} else {
   				System.out.println(i);
   			}
			
		}
		
	}

}
