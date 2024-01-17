package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc31 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Lojas Tabajara");
		double valorTotal = 0;
		double valorProduto = 1;
		int i = 1;
		
		while(valorProduto != 0 ) {
			System.out.print("Produto " + i++ + ": R$ ");
			valorProduto = scan.nextDouble();
			
			valorTotal += valorProduto;
		}
		
		System.out.println("Total: R$ " + valorTotal);
		System.out.print("Dinheiro: R$ ");
		double dinheiro = scan.nextDouble();
		
		System.out.print( dinheiro - valorTotal );
		
	}

}
