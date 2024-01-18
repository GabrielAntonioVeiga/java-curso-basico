package com.veiga.cursojava.aula20.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String[][][] agenda = new String[12][30][24];
		int mes = 0;
		int dia = 0;
		int hora = 0;
		boolean continuar = true;

		while (continuar) {

			System.out.println("Você deseja adicionar um compromisso ou visualizar a genda ? 1/2");
			int escolha = scan.nextInt();
			switch (escolha) {
			case 1: {
				System.out.println("Qual mês? ");
				mes = scan.nextInt();
				
				System.out.println(
						"Qual o dia (1-30) que você deseja adicionar um compromisso e qual o horário (1 -24) ?");
				dia = scan.nextInt();
				hora = scan.nextInt();
				System.out.println("Qual o compromisso ?");
				agenda[mes - 1][dia - 1][hora - 1] = scan.next();

				System.out.println("MÊS: " + mes );
				
				for (int i = 0; i < agenda.length; i++) {
					if ( i == mes - 1 ) {
					System.out.print("mês " + (i + 1) + " ");
					for (int j = 0; j < agenda[i].length; j++) {
						System.out.println();
						System.out.print("dia " + (j + 1) + " ");
						for (int k = 0; k < agenda[i][j].length; k++) {
							System.out.print(" Hora " + (k + 1) + ": ");
							System.out.print(agenda[i][j][k]);
							}
						}
					}
				}
				
				break;
			}
			case 2: {
				System.out.println("Qual mes ??");
				mes = scan.nextInt();
				System.out.println("Qual o dia (1-30) que você visualizar um compromisso e qual o horário (1 -24) ?");
				dia = scan.nextInt();
				hora = scan.nextInt();
				System.out.println(agenda[mes -1][dia-1][hora-1]);
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
