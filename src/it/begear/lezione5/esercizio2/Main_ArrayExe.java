package it.begear.lezione5.esercizio2;

public class Main_ArrayExe {

	public static void main(String[] args) {

		int[][] arr = new int[4][4];

		try {
			for (int file = 0; file < 5; file++) {

				for (int colonne = 0; colonne < arr.length; colonne++) {
					arr[file][colonne] = (int) (Math.random() * 5 + 1);

				}
			}
			for (int file = 0; file < arr.length; file++) {
				for (int colonne = 0; colonne < arr.length; colonne++) {
					System.out.print("[" + arr[file][colonne] + "]");
				}
				System.out.println(" ");
			}

		} catch (IndexOutOfBoundsException e) {
			System.out.println(
					"************************************************************\n* Attenzione!! parametro per lunghezza dell'array superata *\n************************************************************");
		} finally {
			System.out.println("fine del programa");
			;
		}

	}
}
