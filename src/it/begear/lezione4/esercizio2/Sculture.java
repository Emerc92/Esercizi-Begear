package it.begear.lezione4.esercizio2;

public class Sculture extends Opera {
	private int altezza;
	private int lunghezza;
	private int proffondit�;
	private int ingombro;

	public Sculture(String nomeOp, String art, int alt, int lung, int prof) {
		super(nomeOp, art);
		altezza = alt;
		lunghezza = lung;
		proffondit� = prof;
	}

	@Override
	public int getIngombro() {
		ingombro = altezza * lunghezza * proffondit�;
		return ingombro;
	}

	public String toString() {
		return super.toString() + "\ne il suo ingombro � di '" + ingombro + " cm^'";
	}

}
