package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc24 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double num = scan.nextInt();
		double total = 0;
		double nota = 0;
		
		for (int i = 1; i <= num; i++) {
			System.out.println("Digite nota: " + i);
			nota = scan.nextInt();
			total += nota;
		}
		
		System.out.println("Média: " + total/num);
		
	}

}
