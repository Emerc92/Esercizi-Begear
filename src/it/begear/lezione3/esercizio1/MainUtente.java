package it.begear.lezione3.esercizio1;

public class MainUtente {
	/*ESERCIZIO 1 - Classe Utente attributi nome, cognome, età
	Usare l'incapsulamento per segnalare con un errore la creazione di una istanza con nome e cognome non valorizzati (null)
	 e con età minore di 18 anni.*/
	public static void main(String[] args) {
		

		Utente admin = new Utente();
		admin.setEtà(18);
		admin.setNome("emiliano");
		admin.setCognome("mercado");

		System.out.println(admin.toString());
	}

}
