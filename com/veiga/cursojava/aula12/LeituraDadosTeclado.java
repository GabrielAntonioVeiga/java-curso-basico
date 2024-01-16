package com.veiga.cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		System.out.println("primeiro nome, idade e altura");
		String primeiroNome = scan.next();
		int idade = scan.nextInt();
		double altura =  scan.nextDouble();
		
		System.out.println("primeiro nome: " + primeiroNome + "\n" + "idade: " + idade + "\n" + "altura: " + altura);

	}

}
