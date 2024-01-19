package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc21 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um número: ");
		int num = scan.nextInt();
		
        	if ( primo(num) ) {
        		System.out.println(num + " é primo");
        	} else {
        		System.out.println(num + " não é primo");
        		for (int i = 1; i <= num; i++) {
					if ( num % i == 0 ) {
						System.out.println("É divisivel por: " + i);
					}
				}
        	}
	}
	
	public static boolean primo(int n) {
		
		if ( n < 2 ) {
			return false;
		}
		
		for (int i = 2; i < n; i++) {
			if ( n % i == 0  ){
				return false;
			} 
		}
		return true;
	}
	}


