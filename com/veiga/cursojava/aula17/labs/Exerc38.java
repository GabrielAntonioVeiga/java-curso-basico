package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc38 {

	public static void main(String[] args) {
		
//		1015
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Qual o ano atual? ");
		double porcentualAumento = 1.5;
		double salario = 1000;
		int j = 0;
		
	for (int i = 1997; i < 2024; i++) {
		j++;
		porcentualAumento = 0.015 * j;
		salario += salario * porcentualAumento;
	}
	
	System.out.println(String.format("%.2f", salario) );
		
	}
}
