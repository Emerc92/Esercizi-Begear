package it.begear.lezione5.esercizio3;

public class MainUtenti {

	public static void main(String[] args) {

		Utente nuovoUtente= new Utente (null, null, "@gmail.com");
		Utente [] persone= {nuovoUtente};
		Utente.getUtenti(persone);
		
	}

}
