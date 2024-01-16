package com.veiga.cursojava.aula11;

public class VariaveisPontoFlutuante {
	
	
		public static void main(String[] args) {
			
		double valorPassagemCuritiba = 6.00;	
		Boolean cartaoUrbs = false;
		
		
		if ( !cartaoUrbs && valorPassagemCuritiba == 6.00 ) {
			valorPassagemCuritiba = 6.15;
		}
		
		System.out.println(valorPassagemCuritiba);
			
		}
}
