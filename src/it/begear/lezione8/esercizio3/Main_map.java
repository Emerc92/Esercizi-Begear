package it.begear.lezione8.esercizio3;

import java.util.*;

public class Main_map {
	public static void main(String[] args) {
		LinkedHashMap<String, String> utente = new LinkedHashMap<String, String>();

		utente.put((Utenti.creaUtenti()), (Codice_fiscale.creaCodice_fiscale()));
		utente.put((Utenti.creaUtenti()), (Codice_fiscale.creaCodice_fiscale()));

		for (String key : utente.keySet()) {
			String value = utente.get(key);
			System.out.print("nombre utente: [" + key + "] codice fiscale: [" + value + "]");
			System.out.println();
		}
	}
}