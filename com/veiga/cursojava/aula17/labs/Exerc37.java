package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc37 {
	
	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		boolean continuar = true;
		
		double countAltura = 0;
		double countPeso= 0;
		
		double maisAlto = 0;
		int codigoMaisAlto = 0;
		
		double maisBaixo = Integer.MAX_VALUE;
		int codigoMaisBaixo = 0;
		
		double maisGordo = 0;
		int codigoMaisGordo = 0;

		double maisMagro = Integer.MAX_VALUE;
		int codigoMaisMagro = 0;
		
		int qtnClientes = 0;
		
		while ( continuar ) {
			
		System.out.println("Seu codigo, sua altura e seu peso: ");
		int codigo = scan.nextInt();
		if ( codigo == 0 ) {
			continuar = false;
		} else {
			double altura = scan.nextDouble();
			double peso = scan.nextDouble();
			qtnClientes++;
			
			countAltura += altura;
			countPeso += peso;
			
			
			if ( peso > maisGordo ) {
				maisGordo = peso;
				codigoMaisGordo = codigo;
			} 
			
			if ( peso < maisMagro ) {
				maisMagro = peso;
				codigoMaisMagro = codigo;
			}
			
			if ( altura > maisAlto) {
				maisAlto = altura;
				codigoMaisAlto = codigo;
			}
			
			if ( altura < maisBaixo ) {
				maisBaixo = altura;
				codigoMaisBaixo = codigo;
			}
				
			}
		}
		
		System.out.println("Mais alto: " + maisAlto + " " + codigoMaisAlto);
		System.out.println("Mais baixo: " + maisBaixo+ " " + codigoMaisBaixo);
		System.out.println("Mais gordo: " + maisGordo + " " + codigoMaisGordo);
		System.out.println("Mais magro: " + maisMagro + " " + codigoMaisMagro);
		
	    System.out.println("Media altura " + countAltura/qtnClientes);
	    System.out.println("Media peso " + countPeso/qtnClientes);
	}
}
