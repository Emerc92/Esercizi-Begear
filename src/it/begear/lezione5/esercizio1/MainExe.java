package it.begear.lezione5.esercizio1;

public class MainExe {

	public static void main(String[] args) throws Exceptions {

		Exceptions prova = new Exceptions(2,0);

		try {
			prova.getRisult();
			System.out.println("il risultato è: " + prova.getRisult());

		} catch (ArithmeticException e) {
			System.out.println("cambia il valore di 0 :" + e);

		} finally {
			System.out.println("operazione conclusa");
		}

	}
}
