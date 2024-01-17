package com.veiga.cursojava.aula17.labs;

import java.util.Iterator;
import java.util.Scanner;

public class Exerc12 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Qual número entre 1 a 10 você deseja ver a tabuada?");
		int num = scan.nextInt();
		
		for (int i = 1; i <= 10 ; i++) {
			System.out.println(num + " X " + i + " = " + num*i );
		}
	}

}
