package com.veiga.cursojava.aula20.labs;

public class Exerc02 {

	public static void main(String[] args) {

		int[][] matriz = new int[10][10];
		int maiorLinhaCinco = 0;
		int menorLinhaCinco = Integer.MAX_VALUE;
		
		int maiorColunaSete = 0;
		int menorColunaSete = Integer.MAX_VALUE;
		

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = (int) Math.round(Math.random() * 9);
				if (i == 5) {
					if (matriz[i][j] > maiorLinhaCinco) {
						maiorLinhaCinco = matriz[i][j];
					}

					if (matriz[i][j] < menorLinhaCinco) {
						menorLinhaCinco = matriz[i][j];
					}
					
				} else if ( j == 7 ) {
					if (matriz[i][j] > maiorColunaSete) {
						maiorColunaSete = matriz[i][j];
					}
					
					if (matriz[i][j] < menorColunaSete) {
						menorColunaSete= matriz[i][j];
					
				}
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
		
		System.out.println("Maior valor da linha 5: " + maiorLinhaCinco +
				"\nMenor valor da linha 5:  " + menorLinhaCinco);
		
		System.out.println();
		
		System.out.println("Maior valor da coluna 7: " + maiorColunaSete+
				"\nMenor valor da coluna 7:  " + menorColunaSete);

	}

}
