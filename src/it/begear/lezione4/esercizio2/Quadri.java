package it.begear.lezione4.esercizio2;

public class Quadri extends Opera {
	private int lunghezza;
	private int altezza;
	private int ingombro;

	public Quadri(String nome, String artista, int lung, int alt) {
		super(nome, artista);
		this.lunghezza = lung;
		this.altezza = alt;
	}

	public int getLunghezza() {
		return lunghezza;
	}

	public void setLunghezza(int lunghezza) {
		this.lunghezza = lunghezza;
	}

	public int getAltezza() {
		return altezza;
	}

	public void setAltezza(int altezza) {
		this.altezza = altezza;
	}

	@Override
	public int getIngombro() {
		this.ingombro = altezza * lunghezza;
		return ingombro;
	}

	@Override
	public String toString() {
		return super.toString() + "\nil suo ingombro è di: '" + ingombro + "' cm^";
	}
}
