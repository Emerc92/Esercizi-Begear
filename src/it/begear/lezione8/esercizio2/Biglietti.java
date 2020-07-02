package it.begear.lezione8.esercizio2;

public class Biglietti {
	  int biglietto = (int) (Math.random() * 10 + 1);
	
public int getBiglietto () {
	return biglietto;
}
	public String toString() {
		return "biglietto numero " + biglietto;
	}
}
