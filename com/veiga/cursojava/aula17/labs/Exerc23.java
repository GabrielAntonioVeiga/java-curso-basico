package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc23 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);
	int qtnDivisoes = 0;
	
	System.out.println("Digite até qual número você deseja descobrir o primo");
	int num = scan.nextInt();
	
    for (int i = 1; i <= num ; i++) {
    	if ( primo(i, num, qtnDivisoes) ) {
    		System.out.println(i);
    	}
	}
}

public static boolean primo(int n, int num, int qtnDivisoes) {
	
	if ( n < 2 ) {
		return false;
	}
	
	for (int i = 2; i < n; i++) {
		qtnDivisoes++;
		if ( n % i == 0  ){
			return false;
		} 
	}
	System.out.println("Quantidade de divisoes " + qtnDivisoes);
	return true;
}

}
