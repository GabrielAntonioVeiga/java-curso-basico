package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc02 {

	public static void main(String[] args) {
		boolean senhaValida = false;

		Scanner scan = new Scanner(System.in);

		while (!senhaValida) {
			System.out.println("Digite seu nome  e sua senha: ");
			String nome = scan.next();
			String senha = scan.next();
			if ( nome.equals(senha)  ) {
				System.out.println("Sua senha não pode ser seu nome!");
			} else {
				senhaValida = true;
			}

		}
	}

}
