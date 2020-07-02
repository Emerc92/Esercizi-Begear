package it.begear.lezione2.esercizio5;

import java.util.Arrays;

public class MainArray {

	public static void main(String[] args) {
		/*
		 * Immettere 4 ingredienti come stringhe. Creare due array, uno vuoto e uno con
		 * dentro le 4 stringhe. Creare un metodo che controlla se nell'array ci sono
		 * "pomodoro", "mozzarella", "lattuga" e "spezie" e li mette nel secondo array.
		 * Nel caso in cui il primo array sia vuoto o diversamente costruito segnalarlo
		 * a console.
		 */

		String a = "pomodori", b = "mozzarella", c = "spezie", d = "lattuga";

		String[] insalata = { a, b, c, d };

		String[] contenitore = new String[4];

		MainArray.controllaDati(insalata, contenitore);

	}

	public static void controllaDati(String ctrl[], String[] vuoto) {
		String a = "pomodori", b = "mozzarella", c = "spezie", d = "lattuga";

		String[] deflt = { a, b, c, d };
		
		//utilizzando equals non prendeva le differenze degli elementi contenuti dentro l'array
		if (Arrays.deepEquals(ctrl, deflt)) {
			System.out.println("l'insalata è completa\n");
			vuoto = ctrl;
			System.out.println("ho riempito il secondo elemento con : " + Arrays.toString(vuoto));
		} else {
			System.out.println("i dati non corrispondono, per favore verifica il contenuto di" + ctrl);
		}
	}
}