package it.begear.lezione8.esercizio2;

import java.io.ObjectInputStream.GetField;
import java.util.*;

import javax.swing.JOptionPane;

public class Main_Cinema {

	public static void main(String[] args) {

		Map<String, Integer> utenti = new LinkedHashMap<String, Integer>();
		
		utenti.put("primo utente", 10);
		utenti.put("secondo utente", 2);
		utenti.put("terzo utente", 4);
		utenti.put("quarto utente", 3);
		utenti.put("quinto utente", null);

		for (String key : utenti.keySet()) {
		try {	int value = utenti.get(key);
			if (utenti.containsValue(null)) {
			}
			System.out.println("utente: " + key);
			System.out.println("biglietto: " + value);
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "biglietti esauriti");		}
	}
	}
}
