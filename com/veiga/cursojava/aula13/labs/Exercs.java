package com.veiga.cursojava.aula13.labs;

import java.util.Scanner;

public class Exercs {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);

		System.out.println("Qual exercício você deseja resolver ??");
		int escolha = scan.nextInt();
		switch (escolha) {
		case 8: {
			// Exerc 08
			salarioTotal();
			break;
		}
		case 11: {
			// Exerc 11
			calculoNumeros();
			break;
		}

		}

	}

	public static void calculoNumeros() {
		int num1, num2;
		double num3;
		System.out.println("Digite dois (2) números inteiros e (1) número real");
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		num3 = scan.nextDouble();
		System.out.println((num1 * 2) * (num2 / 2));
		System.out.println((num1 * 3) + num3);
		System.out.println(Math.pow(num3, 3));
	}

	public static void salarioTotal() {
		double salarioHora, horasTrabalhadasMes;
		System.out.println("Quanto você ganha por hora ??");
		salarioHora = scan.nextDouble();
		System.out.println("Quantas horas você trabalha no mês? ");
		horasTrabalhadasMes = scan.nextDouble();
		System.out.println("Salário total: " + salarioHora * horasTrabalhadasMes);
	}

}
