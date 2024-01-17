package com.veiga.cursojava.aula15.labs;

import java.util.Scanner;

public class Exerc14 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		double nota1, nota2;
		String conceito;
		
		System.out.println("Digite as duas notas do aluno: ");
		nota1 = scan.nextDouble();
		nota2 = scan.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if ( media >= 9 ) {
			conceito = "A";
		} else if ( media >= 7.5 ) {
			conceito = "B";
		} else if (media >= 6) {
			conceito = "C";
		} else if ( media >= 4 ) {
			conceito = "D";
		} else {
			conceito = "E";
		}
		
		System.out.println("Notas: "+ nota1 + " " + nota2 + 
				".\nMédia: " + media +
				".\nconceito: " + conceito + 
				".\n" + verificaAprovado(conceito));
		
	}
	
	public static String verificaAprovado(String conceito) {
		if (conceito == "A" || conceito == "B" || conceito == "C") {
			return "Aprovado";
		} else {
			return "Reprovado";
		}
	}

}
