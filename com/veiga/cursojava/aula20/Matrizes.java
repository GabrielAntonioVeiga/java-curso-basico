package com.veiga.cursojava.aula20;

public class Matrizes {
	
	public static void main(String[] args) {
		
		double[][] notasAlunos = new double[30][4];
		
		for (int i = 0; i < notasAlunos.length; i++) {
			int soma = 0;
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.println(notasAlunos[i][j]);
			}
			System.out.println();
		}
		
		
		
	}
}
