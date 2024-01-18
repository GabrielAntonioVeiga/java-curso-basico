package com.veiga.cursojava.aula20.labs;

public class Exerc01 {
	
	public static void main(String[] args) {
		
		int[][] matriz = new int[4][4];
		int maior = 0;
		int indexI = 0;
		int indexJ = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 9);
				if ( matriz[i][j] > maior ) {
					maior = matriz[i][j];
					indexI = i;
					indexJ = j;
				}
			}
		}
		
		for (int i = 0; i < matriz.length; i++) {
			System.out.println();
			System.out.print("Linha " + i + " ");
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.print(" Coluna " + j + ": ");
				System.out.print(matriz[i][j]);
			}
		}
		System.out.println();
		System.out.println("O maior número é: " + maior + 
				"\nda linha: " + indexI + "  e coluna: " + indexJ);
	}

}
