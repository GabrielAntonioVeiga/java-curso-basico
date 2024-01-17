package com.veiga.cursojava.aula17.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc32 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Diga um número inteiro: ");
		int num = scan.nextInt();
		System.out.println("Fatorial de: " + num);
		
		for (int i = num-1; i != 1 ; i--) {
		num = num * i;  	
		}
		System.out.println(num);
		
	}

}
