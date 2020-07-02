package it.begear.lezione6.esercizio1;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Persona {

	public static final DateTimeFormatter DATE_FORMAT = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	private String nome, cognome;
	 private LocalDate compleanno;

	private Persona(String nome, String cognome, String dataNascita) throws DateTimeException{
		this.cognome = cognome;
		this.nome = nome;
		this.compleanno = LocalDate.parse(dataNascita, DATE_FORMAT);
	}

	
	public static Persona getPersona(String nome, String cognome, String dataNascita) {
		try {
			Persona p1 = new Persona(nome,cognome, dataNascita);
			return p1;
		}catch (DateTimeException e) {
			System.out.println("formato data non valido. formato valido: gg/mm/aaaa");
			return null;
		}
	}
	
	public static void getCompleanno(Persona[] p1) {
		try {
			for(Persona p : p1) {
				System.out.println(p);
				System.out.println(p);
			}
			
		} catch (DateTimeException e) {
			;
		}
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


	@Override
	public String toString() {
		return "nome: [" + this.getNome() + "] cognome: [" + this.getCognome() + "] data di nascita: [" + compleanno + "]";
	}


	public static void stampaPersona(Persona [] p1) {
		for(Persona i : p1 ) {
			System.out.println(i);
		}
	}

	
}
