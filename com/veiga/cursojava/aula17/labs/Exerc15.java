package com.veiga.cursojava.aula17.labs;

import java.util.Scanner;

public class Exerc15 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();

		int j = 0;
		int count = 0;

		for (int i = 1; i <= num; i++) {
			if (i == 1) {
				System.out.print("0, ");
				j = 1;
				count = 0;
			} else {
				System.out.print(j + ", ");
				j += count;
				count = j - count;
			}
		}

	}

}
