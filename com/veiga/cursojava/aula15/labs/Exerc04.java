package com.veiga.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc04 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite a letra: ");

		//alternativa usando String e regex
		String regex = "[aeiou]";
		String letra = scan.next();
		
		if (letra.length() > 1 ) {
			System.out.println("Você digitou uma palavra");
		} else 
		if ( letra.toLowerCase().matches(regex) ) {
			System.out.println("Vogal");
		} else {
			System.out.println("Consoante");
		}
		
		//alternativa usando char 
//		String s = scan.next();
//		char c = s.toUpperCase().charAt(0);
		
//		if ( c == 'A' || c == 'E'  || c == 'I' || c == 'O' || c == 'U' ) {
//			System.out.println("Vogal");
//		} else {
//			System.out.println("Consoante");
//		}
		
	}

}
