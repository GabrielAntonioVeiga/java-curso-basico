package com.veiga.cursojava.aula17.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc32 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um número inteiro: ");
		int num = scan.nextInt();
		System.out.println("Fatorial de: " + num);
		
		System.out.print(num + "! = ");
		for (int i = num; i > 0 ; i--) {
		if ( i == num || i == 1) {
			if (i == num) {
				System.out.print(i + " . ");
			} else {
				System.out.print(i);
			}
		} else {
			
		System.out.print(i + " . ");
		num = num * i;  	
		}
		}
		System.out.print(" = " + num);
		
	}

}
