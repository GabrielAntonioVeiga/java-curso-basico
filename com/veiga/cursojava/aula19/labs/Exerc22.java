package com.veiga.cursojava.aula19.labs;

import java.util.Iterator;
import java.util.Random;

public class Exerc22 {
	
	public static void main(String[] args) {
		
		int somaUm = 0;
		int somaZero= 0;
		int[] A = new int[10]; 
		
	    for (int i = 0; i < A.length; i++) {
			A[i] = (int)Math.round(Math.random() * 1);
			
			if ( A[i] == 1 ) {
				somaUm++;
			} else {
				somaZero++;
			}
		}
	    
	    System.out.println("0s: " + somaZero);
	    System.out.println("1s: " + somaUm);
		
	}
}
