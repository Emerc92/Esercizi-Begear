package it.begear.lezione3.esercizio3.mattia;

public class Utente {
	
	private Biglietto[] biglietti = new Biglietto[3];
	private int indice;
	
	public void acquista(int numero, String tipo, int valido) {
		if(indice > 2) {
			
			System.out.println("Limite di biglietti per questo utente raggiunto (3 biglietti per utente max)");
			
		} else {
//			Creiamo il nuovo biglietto generico tramite switch e, se non nullo, lo aggiungiamo all'array di biglietti
			
			Biglietto newBiglietto;
			switch(tipo.toLowerCase()) {
				case "giornaliero":
					newBiglietto = new Giornaliero(numero, valido);
					break;
				case "settimanale":
					newBiglietto = new Settimanale(numero, valido);
					break;
				case "mensile":
					newBiglietto = new Mensile(numero, valido);
					break;
				default:
					newBiglietto = null;
					System.out.println("Tipo di biglietto inserito sbagliato, biglietto non creato");
			}
			if(newBiglietto != null) {
				Biglietto[] b = getBiglietti();
				b[indice] = newBiglietto;
				indice++;
			}
		}
		
	}

	public Biglietto[] getBiglietti() {
		return biglietti;
	}

	public int getIndice() {
		return indice;
	}

	public void setBiglietti(Biglietto[] biglietti) {
		this.biglietti = biglietti;
	}

	public void setIndice(int indice) {
		this.indice = indice;
	}

	
	

}
