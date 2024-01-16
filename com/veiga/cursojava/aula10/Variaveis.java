package com.veiga.cursojava.aula10;

import java.util.Scanner;

public class Variaveis {
	
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int idade;
		String nome;
		String nomeCachorro;

		idade = 25;

		System.out.println("Idade = " + idade);
		
		double price;
		
		price = scan.nextDouble();
		
		System.out.println(price);
		

	}
}
