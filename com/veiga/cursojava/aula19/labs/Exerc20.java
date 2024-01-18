package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc20 {

	public static void main(String[] args) {

		double[] A = new double[20];
		double cotacao;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cotacao dolar: ");
		cotacao = scan.nextDouble();

		for (int i = 0; i < A.length; i++) {
			A[i] = cotacao * (i + 1);
		}

		for (double i : A) {
			System.out.println(String.format("%.2f", i) );
		}
	}

}
