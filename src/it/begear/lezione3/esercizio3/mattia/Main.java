package it.begear.lezione3.esercizio3.mattia;

public class Main {
	
	public static void main(String[] args) {
		
		Utente ut1 = new Utente();
		ut1.acquista(152, "giornaliero", 5);
		ut1.acquista(12345678, "settimanale", 6);
		ut1.acquista(20003000, "mensile", 7);
		ut1.acquista(10000000, "blabla", 100);
		
		System.out.println("****************************");
		
		stampaBiglietti(ut1);
		
		
	}
	
	public static void stampaBiglietti(Utente ut) {
		for(Biglietto b : ut.getBiglietti()) {
			System.out.println(b.toString());
		}
	}

}
