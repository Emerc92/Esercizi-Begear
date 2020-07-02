package it.begear.esercizio3_Portafoglio;

public class Portafoglio { // Classe portafoglio con attributo un valore in denaro euro,centesimi.
							// Calcolarne una percentuale a piacere usando valore e percentuale come dati di
							// ingresso di un metodo.
	private double denaro;
	private double valoreTotale;
	public double percentuale;

	public Portafoglio(double denaro) {
		this.denaro = denaro;
	}

	public void setDenaro(double denaro) {
		this.denaro = denaro;
	}

	public double getDenaro() {
		return denaro;
	}

	public void setValoreTotale(double valore) {
		this.valoreTotale = valore;
	}

	public double getValoreTotale() {
		return valoreTotale;
	}

 double getPercentuale(double denaro, double valoreTotale) {
		this.valoreTotale = valoreTotale;
		percentuale = (denaro * 100) / valoreTotale;
		return percentuale;
	}
}
