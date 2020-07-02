package it.begear.lezione7.esercizio2;

import java.util.Scanner;

public class Directory {
	private String nome;
	private String cognome;
	private String tel;

	Scanner insert = new Scanner(System.in);

	public String setNome() {
		System.out.println("inserisci nuovo nome: ");
		this.nome = insert.nextLine();
		return nome;
	}

	public String setCognome() {
		System.out.println("inserisci nuovo cognome: ");
		this.cognome = insert.nextLine();
		return cognome;
	}

	public String setTel() {
		System.out.println("inserisci numero di telefono: ");
		this.tel = insert.nextLine();
		return tel;
	}

	@Override
	public String toString() {
		return "Directory nome= [" + nome + "], cognome= [" + cognome + "], tel= [" + tel + "]";
	}

		
}
