package it.begear.lezione4.esercizio3;

public class Monete extends Lanci {
	private final String testa = "testa";
	private final String croce = "croce";

	public String getTesta() {
		return testa;
	}

	public String getCroce() {
		return croce;
	}

	@Override
	public void lancia() {
		int cont = (int) (Math.random() * 2 + 1);
		if (cont == 1) {
			System.out.println("è uscita la faccia: [" + testa + "]");
		} else {
			System.out.println("è uscita la faccia: [" + croce + "]");
		}
	}
}
