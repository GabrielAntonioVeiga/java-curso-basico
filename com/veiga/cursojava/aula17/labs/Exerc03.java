package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc03 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean valido = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		String regexSexo = "[fm]";
		String regexEstadoCivil = "[scvd]";
		
		while (!valido) {
			System.out.println("Digite seu nome, sua idade, seu salário, seu sexo e seu estado civil (s, c, v, d) ");
			nome = scan.next();
			idade = scan.nextInt();
			salario = scan.nextDouble();
			sexo = scan.next();
			estadoCivil = scan.next();
			
			if (nome.length() <= 3) {
				System.out.println("Seu nome deve possuir mais que 3 caracteres");
			} else if ( idade <=0 || idade >= 150 ) {
				System.out.println("Idade deve ser entre 0 e 150");
			} else if ( salario <= 0 ) {
				System.out.println("Seu salário deve ser maior que 0");
			} else if ( !sexo.matches(regexSexo)) {
				System.out.println("Sexo deve ser f ou m");
			} else if ( !estadoCivil.matches(regexEstadoCivil) ) {
				System.out.println("Estado civil deve ser s, c, v ou d");
			} else {
				valido = true;
			}
			
			
		}
		
	}

}
