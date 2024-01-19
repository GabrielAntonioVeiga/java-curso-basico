package com.veiga.cursojava.aula17.labs;

public class Exerc33 {

	public static void main(String[] args) {
		int maior = 0;
		int menor = Integer.MAX_VALUE;
		int count = 0;
		
		int qtnTemperatuas = (int) Math.round(Math.random() * 10);
		for (int i = 0; i < qtnTemperatuas; i++) {
			int temperatura = (int) Math.round(Math.random() * 35);
			System.out.println(temperatura);
			count += temperatura;
			if ( temperatura > maior ) {
				maior = temperatura;
			}
			if ( temperatura < menor) {
				menor = temperatura;
			}
		}
		
		System.out.println("MENOR: " + menor);
		System.out.println("MAIOR: " + maior);
		System.out.println("MEDIA:" + count/qtnTemperatuas );
		
	}
}
