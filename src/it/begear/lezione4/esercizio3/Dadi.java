package it.begear.lezione4.esercizio3;

public class Dadi extends Lanci {

	private final int dado = (int) (Math.random() * 6 + 1);

	public void lancia() {
		System.out.println("nel tuo dado è uscito un : [" + dado + "]");
	}

}
