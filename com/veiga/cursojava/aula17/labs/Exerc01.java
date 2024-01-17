package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc01 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean isValid = false;

		while (!isValid) {
			System.out.println("Nota entre 0 a 10");
			int nota = scan.nextInt();
			if (nota >= 0 && nota <= 10) {
				isValid = true;
			} else {
				System.out.println("Valor inválido");
			}
		}
	}
}
