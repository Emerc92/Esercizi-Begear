package it.begear.lezione2.esercizio2;

import java.util.Arrays;

public class MainOperazioni {
	/*
	 * dati in ingresso quattro numeri double. Un metodo prende i due più piccoli e
	 * ne fa il modulo. Un altro prende i due più piccoli e li somma, ma restituisce
	 * un intero. Un terzo prende i risultati dei due metodi precedenti e li mostra
	 * entrambi.
	 */
	public static void main(String[] args) {

		double primo = 10;
		double secondo = 3;
		double terzo = 7;
		double quarto = 12;
		double [] num = {primo, secondo, terzo, quarto};
		 getModulo(num);
		System.out.println(num.toString());
		
	}

	public static void getModulo(double [] num) {
		Arrays.parallelSort(num);
		System.out.println(num.toString());
		
	}
	public static double getSomma (double a, double b) {
		return a + b ;
	}
}
