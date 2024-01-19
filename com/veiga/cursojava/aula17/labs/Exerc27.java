package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc27 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean correto = false;
		int total = 0;

		System.out.println("Quantidade de turmas: ");
		int qtnTurmas = scan.nextInt();

		for (int i = 0; i < qtnTurmas; i++) {
			while (!correto) {
				System.out.println("Quantos alunos na turma: " + (i + 1));
				int qtnAlunosTurma = scan.nextInt();
				if (qtnAlunosTurma > 40) {
					System.out.println("Não pode haver mais que 40 alunos");
				} else {
					total += qtnAlunosTurma;
					correto = true;
				}
			}
			correto = false;
		}
		
		System.out.println("Media: " + total/qtnTurmas);

	}
}
