package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc19 {
	
	public static void main(String[] args) {
		
		double[] Nota01 = new double[10];
		double[] Nota02 = new double[10];
		double[] Result = new double[10];
		
		
		Scanner scan = new Scanner(System.in);


		for (int i = 0; i < Nota01.length; i++) {
			System.out.println("Digite a nota1 e nota2 do aluno: " + (i+1));
			Nota01[i] = scan.nextDouble();
			Nota02[i] = scan.nextDouble();
			Result[i] = (Nota01[i] + Nota02[i]) / 2;
		}

		for (int i = 0; i < Result.length; i++) {
				if ( Result[i] >= 7 ) {
					System.out.println("O aluno " + (i + 1) +  " está aprovado");
				} else {
					System.out.println("O aluno " + (i + 1) +  " está reprovado");
				}
		}
		
	}

}
