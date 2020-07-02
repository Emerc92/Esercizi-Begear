package it.begear.lezione3.esercizio1;

/*ESERCIZIO 1 - Classe Utente attributi nome, cognome, età
Usare l'incapsulamento per segnalare con un errore la creazione di una istanza con nome e cognome non valorizzati (null)
 e con età minore di 18 anni.*/

public class Utente {
	private String nome;
	private String cognome;
	private int età;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			System.out.println("inserisci un nome valido");
		} else
			this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		if (cognome == null) {
			this.cognome = cognome;
		} else {
			this.cognome = cognome;
		}
	}

	public int getEtà() {
		return età;
	}

	public void setEtà(int età) {
		if (età < 18) {
			System.out.println("spiacenti non sei maggiorenne per questo gioco");
		} else if (età > 70) {
			System.out.println("non sei troppo vecchio?");
			
		}
		else
			this.età = età;
	}

	public Utente() {
	}

	public String toString() {
		return "nombre utente: [" + nome + "] cognome utente: [" + cognome + "] età: [" + età + "]";
	}
}
