package com.veiga.cursojava.aula17.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc35 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite até qual número você deseja descobrir o primo");
		int num = scan.nextInt();
		
        for (int i = 1; i <= num ; i++) {
        	if ( primo(i) ) {
        		System.out.println(i);
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

