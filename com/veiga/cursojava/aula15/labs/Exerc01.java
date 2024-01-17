package com.veiga.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc01 {
	
	public static void main(String[] args) {
		
	    int num1, num2;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite dois números inteiros: ");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		if ( num1 > num2 ) {
			System.out.println(num1 + " é maior que " + num2);
		} else {
			System.out.println(num2 + " é maior que " + num1);
		}
		
	}
}
