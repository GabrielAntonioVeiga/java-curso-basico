package com.veiga.cursojava.aula20.labs;

import java.util.Scanner;

public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][] agenda = new String[30][24];
		int dia = 0;
		int hora = 0;
		boolean continuar = true;

		while (continuar) {

			System.out.println("Você deseja adicionar um compromisso ou visualizar a genda ? 1/2");
			int escolha = scan.nextInt();
			switch (escolha) {
			case 1: {

				System.out.println(
						"Qual o dia (1-30) que você deseja adicionar um compromisso e qual o horário (1 -24) ?");
				dia = scan.nextInt();
				hora = scan.nextInt();
				System.out.println("Qual o compromisso ?");
				agenda[dia - 1][hora - 1] = scan.next();

				for (int i = 0; i < agenda.length; i++) {
					System.out.println();
					System.out.print("dia " + (i + 1) + " ");
					for (int j = 0; j < agenda[i].length; j++) {
						System.out.print(" Hora " + (j + 1) + ": ");
						System.out.print(agenda[i][j]);
					}
				}
				break;
			}
			case 2: {
				System.out.println("Qual o dia (1-30) que você visualizar um compromisso e qual o horário (1 -24) ?");
				dia = scan.nextInt();
				hora = scan.nextInt();
				System.out.println(agenda[dia-1][hora-1]);
				break;
			}
			}
			System.out.println();
			System.out.println("Deseja continuar S/N");
			String escolhaContinuar = scan.next();
			if ( escolhaContinuar.equalsIgnoreCase("n")   ) {
				continuar = false;
			}
		}
	}
}
