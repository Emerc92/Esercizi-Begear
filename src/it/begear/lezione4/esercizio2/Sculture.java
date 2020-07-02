package it.begear.lezione4.esercizio2;

public class Sculture extends Opera {
	private int altezza;
	private int lunghezza;
	private int proffondità;
	private int ingombro;

	public Sculture(String nomeOp, String art, int alt, int lung, int prof) {
		super(nomeOp, art);
		altezza = alt;
		lunghezza = lung;
		proffondità = prof;
	}

	@Override
	public int getIngombro() {
		ingombro = altezza * lunghezza * proffondità;
		return ingombro;
	}

	public String toString() {
		return super.toString() + "\ne il suo ingombro è di '" + ingombro + " cm^'";
	}

}
