package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc25 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantidade de pessoas: ");
		int qtnPessoa = scan.nextInt();
		int count = 0;
		
		for (int i = 0; i < qtnPessoa; i++) {
			System.out.println("Pessoa " + (i+1) + " Qual a sua idade?  ");
			int idade = scan.nextInt();
			count += idade;
		}
		
		if ( count / qtnPessoa <= 25 ) {
			System.out.println("Jovem");
		} else if ( count / qtnPessoa <= 60 ) {
			System.out.println("Adulta");
		} else {
			System.out.println("Idosa");
		}
	}
}
