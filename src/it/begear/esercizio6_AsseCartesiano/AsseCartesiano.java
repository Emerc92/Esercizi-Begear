package it.begear.esercizio6_AsseCartesiano;

public class AsseCartesiano {

	public static void main(String[] args) {

		// Inseriti due punti su un asse cartesiano determinarne la distanza

		int x1 = 5, x2 = 10;
		int y1 = 27, y2 = 15;
		double distanza = (Math.pow((x2-x1),2)) + (Math.pow((y2-y1), 2));
		distanza = Math.sqrt(distanza);
		System.out.println(distanza);
		

	}
}
