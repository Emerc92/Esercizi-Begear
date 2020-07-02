package it.begear.lezione2.esercizio3;

public class MainArray { // Inserire un intero 'dimensione array'.
							// Creare un array e riempirlo di numeri incrementali da 0 in poi fino a che
							// l'array risulta pieno.

	public static void main(String[] args) {

		int arr[] = new int[9];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;

			System.out.print(arr[i] + " ");
		}
	}
}
