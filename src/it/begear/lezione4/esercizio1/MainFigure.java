package it.begear.lezione4.esercizio1;

public class MainFigure {

	public static void main(String[] args) {

		Cilindro bellino = new Cilindro("sono un cilindro", 12, 8);
		bellino.getAreaBase();
		bellino.getVolume();
		System.out.println(bellino.toString());
		
		Parallelepipedo paral = new Parallelepipedo("parallelopipedo", 8, 20, 6);
		paral.getAreaBase();
		paral.getVolume();
		System.out.println(paral.toString());
	}

}
