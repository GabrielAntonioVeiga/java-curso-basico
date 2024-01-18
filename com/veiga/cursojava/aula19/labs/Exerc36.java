package com.veiga.cursojava.aula19.labs;

public class Exerc36 {
	
	public static void main(String[] args) {
		int[] A = new int[11];
		
		for (int i = 0; i < A.length; i++) {
			A[i] = (int) Math.pow(2, i); 
		}
		
		for (int i : A) {
			System.out.println(i);
		}
		
		
	}

}
