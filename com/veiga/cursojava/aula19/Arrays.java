package com.veiga.cursojava.aula19;

public class Arrays {

	public static void main(String[] args) {
		
		double[] temperaturas = new double[365] ;
		
		temperaturas[0] = 31.3;
		temperaturas[1] = 32;
		temperaturas[2] = 33.7;
		temperaturas[3] = 34;
		temperaturas[4] = 33.1;
		
		System.out.println("O valor da temperatura do dia 1 é: " + temperaturas.length);
		
//		for (int i = 0; i < 5; i++) {
//			System.out.println("Temperatura: " + (i + 1) + " " + temperaturas[i]);
//		}
		
		for (double temp : temperaturas) {
			System.out.println(temp);
		}
		
		
	}

}
