package it.begear.esercizio2_Persona;

public class Persona {
	// ESERCIZIO 2 – Classe Persona con nome e cognome. Metodo che restituisce nome
	// e cognome maiuscoli
	protected String nome;
	protected String cognome;

	public Persona(String nome, String cognome) {
		this.nome = nome;
		this.cognome = cognome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String toString() {
		return "nome e cognome del utente: " + nome.toUpperCase() + " " + cognome.toUpperCase();
	}
}
