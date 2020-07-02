package it.begear.lezione3.esercizio3.mattia;

public class Biglietto {
	
	private int numero;

	public Biglietto(int numero) {
		if(Integer.toString(numero).length() != 8) {
			this.numero = 00000000;
			System.out.println("Numero di cifre sbagliate, creato biglietto con numero default 00000000");
		} else {
			this.numero = numero;
			System.out.println("Biglietto creato, numero: " + this.numero);
		}
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		if(Integer.toString(numero).length() != 8) {
			System.out.println("Numero di cifre sbagliate, numero biglietto non modificato");
		} else {
			this.numero = numero;
			System.out.println("Numero biglietto modificato, nuovo numero: " + this.numero);
		}
	}

	@Override
	public String toString() {
		return "Biglietto numero: " + this.numero + ", tipo " + this.getClass().getSimpleName();
	}
	
	
	
	
	
	

}
