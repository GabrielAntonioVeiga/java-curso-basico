package com.veiga.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc11 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Salário do colaborador: ");
		double salario = scan.nextDouble();
		double salarioVelho = salario;

		if (salario <= 280) {
			salario += salario * 0.2;
		} else if (salario < 700) {
			salario += salario * 0.15;
		} else if (salario < 1500) {
			salario += salario * 0.1;
		} else {
			salario += salario * 0.05;
		}

		System.out.println("Antigo salário " + salarioVelho +
				 "\n" +  ((salario - salarioVelho) / salarioVelho * 100) + "% de aumento" +
				  "\n" + (salario - salarioVelho)  + " de aumento" + 
				  "\n" + salario );
	}

}
