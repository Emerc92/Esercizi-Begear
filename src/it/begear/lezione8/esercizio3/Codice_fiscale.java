package it.begear.lezione8.esercizio3;

import java.util.Scanner;

public class Codice_fiscale {
	public static String codicef;

	static Scanner insert = new Scanner(System.in);

	public static String creaCodice_fiscale() {
		System.out.print("dammi il codice fiscale per l'utente: ");
		codicef = insert.nextLine();
		return codicef;

	}
}
