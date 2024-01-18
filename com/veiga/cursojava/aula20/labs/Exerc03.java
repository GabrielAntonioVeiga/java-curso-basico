package com.veiga.cursojava.aula20.labs;

public class Exerc03 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		int qtnPar = 0;
		int qtnImpar = 0;
		
		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 9);
				if (matriz[i][j] % 2 == 0) {
					qtnPar++;
				} else {
					qtnImpar++;
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
		
		System.out.println("Par: " + qtnPar);
		System.out.println("Impar: " + qtnImpar);

	}
}
