package it.begear.lezione6.esercizio1;


public class Main_Persone {

	public static void main (String[] args) {
		
	Persona ut1 = Persona.getPersona("emiliano", "mercado", "14/03/1992");
	Persona  ut2 = Persona.getPersona("jessica", "hasa", "13/06/1998");
	Persona [] persone = {ut1, ut2};
	Persona.stampaPersona(persone);
	
	}
	
}
