package it.begear.lezione3.esercizio3.mattia;

public class Mensile extends Biglietto {
	
	private int mese;

	public Mensile(int numero, int mese) {
		super(numero);
		if(mese < 1 || mese > 12) {
			this.mese = 1;
			System.out.println("Mese di validit� inserito sbagliato, stampato biglietto con validit� gennaio");
		} else {
			this.mese = mese;
			System.out.println("Questo biglietto ha validit� per il mese numero: " + this.mese);
		}
		
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		if(mese < 1 || mese > 12) {
			System.out.println("Mese di validit� inserito sbagliato, mese di validit� non cambiato");
		} else {
			this.mese = mese;
			System.out.println("Mese di validit� cambiato, questo biglietto ha ora validit� per il mese numero: " + this.mese);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", mese di validit�: " + this.mese;
	}
	
	
	
}
