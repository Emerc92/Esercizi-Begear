package it.begear.lezione4.esercizio2;


public class MainOpere {

	public static void main(String[] args) {

		Quadri quad = new Quadri("l'ultima cena", "Da Vinci", 80, 60);

		quad.getIngombro();
		System.out.println(quad.toString());

		System.out.println("\n***************************\n");

		Sculture statua = new Sculture("michelangelo", "Davide", 165, 65, 35);

		statua.getIngombro();
		System.out.println(statua.toString());

		System.out.println("\n***************************\n");


		Sculture quad2 = new Sculture("l'ultima cena", "Da Vinci", 80, 60, 2);
		quad2.getIngombro();
		System.out.println(quad2.toString());
		System.out.println(quad.confrontaOpere(statua));

	}

}
