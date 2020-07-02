package it.begear.lezione8.esercizio3;

import java.util.Scanner;

public class Utenti {
	private static String nome;
	static Scanner imput = new Scanner(System.in);

	public static String creaUtenti() {
		System.out.print("dammi il nome e cognome del utente: ");
		nome = imput.nextLine();
		return nome;
	}

}
