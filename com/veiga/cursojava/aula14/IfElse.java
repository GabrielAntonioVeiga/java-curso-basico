package com.veiga.cursojava.aula14;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

//		System.out.println("Idade ?");
//
//		int idade = scan.nextInt();
//
//		if (idade >= 18) {
//			System.out.println("É maior de idade");
//		} else {
//			System.out.println("Não é maior de idade");
//		}
		
		System.out.println("Valor");
		double valor = scan.nextDouble();
		
		if ( valor <= 10   ) {
			System.out.println("Barato");
		} else if ( valor >= 10 && valor <=15   ) {
			System.out.println("Pedir desconto");
		} else if (valor >= 15 && valor <= 17 ) {
			System.out.println("Pesquisar mais");
		} else {
			System.out.println("Muito caro");
		}
		
	}
}
