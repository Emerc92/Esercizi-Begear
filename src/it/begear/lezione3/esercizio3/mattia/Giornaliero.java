package it.begear.lezione3.esercizio3.mattia;

public class Giornaliero extends Biglietto {

	private int giorno;

	public Giornaliero(int numero, int giorno) {
		super(numero);
		if(giorno < 1 || giorno > 31) {
			this.giorno = 1;
			System.out.println("Giorno di validità inserito sbagliato, stampato biglietto con validità per il primo giorno del mese");
		} else {
			this.giorno = giorno;
			System.out.println("Questo biglietto ha validità per il giorno: " + this.giorno);
		}
		
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		if(giorno < 1 || giorno > 31) {
			System.out.println("Giorno di validità inserito sbagliato, giorno di validità non cambiato");
		} else {
			this.giorno = giorno;
			System.out.println("Giorno di validità cambiato, questo biglietto ha ora validità per il giorno: " + this.giorno);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", giorno di validità: " + this.giorno;
	}
	
	
	
	
}
