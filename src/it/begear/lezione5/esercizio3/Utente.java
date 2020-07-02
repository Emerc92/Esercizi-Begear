package it.begear.lezione5.esercizio3;

public class Utente {
	private String nome;
	private String cognome;
	private String mail;

	public static void getUtenti(Utente[] persone) {
	try {
		for (Utente i : persone) {
			
		System.out.println(i);
		}

	}catch (Exception e) {
		System.out.println(e);
	}
	}

	public Utente(String n, String cn, String mail) {

		this.nome = n;
		this.cognome = cn;
		this.mail = mail;
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

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

}
