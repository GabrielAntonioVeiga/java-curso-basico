package com.veiga.cursojava.aula19.labs;

import java.util.Scanner;

public class Exerc16 {

	public static void main(String[] args) {
		int soma = 0;
		int somaElementosMaiorQuinze = 0;
		int qtnElementosIgualQuinze = 0;
		int qtnElementosMaiorQuinze = 0;
		Scanner scan = new Scanner(System.in);

		int[] A = new int[10];

		for (int i = 0; i < A.length; i++) {
			System.out.println("Valor vetor A: ");
			A[i] = scan.nextInt();
		}

		for (int i : A) {
			if (i < 15) {
				soma += i;
			} else 
			if ( i  == 15) {
				qtnElementosIgualQuinze++;
			} else
			if ( i > 15 ) {
				somaElementosMaiorQuinze += i;
				qtnElementosMaiorQuinze++;
			}
		}

		
		System.out.println("Soma dos elementos inferiores a 15: " + soma);
		System.out.println("Quantidade de elementos iguais a 15: " + qtnElementosIgualQuinze);
		if ( qtnElementosMaiorQuinze > 0 ) {
			System.out.println("Media dos elementos superiores a 15: " + (double) somaElementosMaiorQuinze/qtnElementosMaiorQuinze);			
		} else {
			System.out.println("Media dos elementos superiores a 15: 0");
		}
	}
}
