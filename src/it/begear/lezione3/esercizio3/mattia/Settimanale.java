package it.begear.lezione3.esercizio3.mattia;

public class Settimanale extends Biglietto {
	
	private int settimana;

	public Settimanale(int numero, int settimana) {
		super(numero);
		if(settimana < 1 || settimana > 4) {
			this.settimana = 1;
			System.out.println("Settimana di validità inserita sbagliata, stampato biglietto con validità per la prima settimana del mese");
		} else {
			this.settimana = settimana;
			System.out.println("Questo biglietto ha validità per la settimana numero: " + this.settimana);
		}
	}

	public int getSettimana() {
		return settimana;
	}

	public void setSettimana(int settimana) {
		if(settimana < 1 || settimana > 4) {
			System.out.println("Settimana di validità inserita sbagliata, settimana di validità non cambiata");
		} else {
			this.settimana = settimana;
			System.out.println("Settimana di validità cambiata, questo biglietto ha ora validità per la settimana numero: " + this.settimana);
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", settimana di validità: " + this.settimana;
	}
	
	
}
