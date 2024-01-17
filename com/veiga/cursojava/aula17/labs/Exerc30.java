package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc30 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor do pão: ");
		double valorPao = scan.nextDouble();
		
		System.out.println("Preço do pão: R$" + valorPao);
		System.out.println("Panificadora Pão de Ontem - Tabela de preços");
		for (int i = 1; i <= 50; i++) {
			System.out.println(i + " - R$ " +  String.format("%.2f", valorPao * i));
		}
	}

}
