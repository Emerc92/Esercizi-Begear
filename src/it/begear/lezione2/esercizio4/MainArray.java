package it.begear.lezione2.esercizio4;

import java.util.Arrays;

public class MainArray {
	// Dare in ingresso 3 nomi, metterli in un array, aggiungere il cognome
	// "Torretti" a tutti e stamparli in ordine alfabetico.

	public static void main(String[] args) {

		String[] nomi = { "Salvatore", "Fausto", "Paola" };

		getArr(nomi);
		System.out.println(Arrays.toString(nomi));

	}

	public static void getArr(String[] arr) {
		
		for (int e =0; e<arr.length;e++) {
			arr[e] += " Torrenti";
		}
		 Arrays.sort(arr);
		
	}
}
