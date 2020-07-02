package it.begear.lezione3.esercizio3.mattia;

public class Giornaliero extends Biglietto {

	private int giorno;

	public Giornaliero(int numero, int giorno) {
		super(numero);
		if(giorno < 1 || giorno > 31) {
			this.giorno = 1;
			System.out.println("Giorno di validit� inserito sbagliato, stampato biglietto con validit� per il primo giorno del mese");
		} else {
			this.giorno = giorno;
			System.out.println("Questo biglietto ha validit� per il giorno: " + this.giorno);
		}
		
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int giorno) {
		if(giorno < 1 || giorno > 31) {
			System.out.println("Giorno di validit� inserito sbagliato, giorno di validit� non cambiato");
		} else {
			this.giorno = giorno;
			System.out.println("Giorno di validit� cambiato, questo biglietto ha ora validit� per il giorno: " + this.giorno);
		}
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", giorno di validit�: " + this.giorno;
	}
	
	
	
	
}
