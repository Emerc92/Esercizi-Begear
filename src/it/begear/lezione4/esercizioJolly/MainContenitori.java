package it.begear.lezione4.esercizioJolly;

import java.util.Arrays;

public class MainContenitori {

	public static void main(String[] args) {

		String aq = "acqua";
		String ac = "acido";
		String am = "amoniaca";
		String te = "te";

		String[] cont = { aq, ac, am, te };
		String[] filtr = getTipo(cont);

		System.out.println(Arrays.toString(filtr));

		// if (filtr.)

	}

	public static String[] getTipo(String[] arr) {
		String[] filtrato = new String[arr.length];
		int contatore = 0;
		for (String e : arr) {
			if ((e.toString().equals("acqua")) || (e.toString().equals("te"))) {

				filtrato[contatore] = "bevibile";
				contatore++;
			} else if (e.toString().equals("acido") || (e.toString().equals("amoniaca"))) {

				filtrato[contatore] = "nocivo";
				contatore++;
			} else {
				System.out.println("il contenuto non apartiene a nessun contenitore");
			}
		}
		return filtrato;
	}

}
