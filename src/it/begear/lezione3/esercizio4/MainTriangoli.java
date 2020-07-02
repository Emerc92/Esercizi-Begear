package it.begear.lezione3.esercizio4;

import java.util.Arrays;

public class MainTriangoli {

	public static void main(String[] args) {

		int lato1 = 8;
		int lato2 = 6;
		int lato3 = 2;

		int tri[] = { lato1, lato2, lato3 };

		getForma(tri);
	}

	public static void getForma(int[] arr) {

		if (arr[0] < arr[1] + arr[2]) {

			if (arr[2] < arr[0] + arr[1])

				if (arr[1] < arr[2] + arr[0]) {
					System.out.println("il triangolo esiste\ne i lati sono: " + "\nlato 1 = [" + arr[0]
							+ "] lato 2 = [" + arr[1] + "] lato 3 = [" + arr[2] + "]");

				}
		} else {
			System.out.println("il triangolo NON esiste perchè i lati non corrispondono");
			System.out.println( "i lati inseriti sono: " + Arrays.toString(arr) + " prova a inserire di nuovo i dati");
		}

	}
}
