package it.begear.lezione2.esercizio1;

public class MainRettangoli {

	public static void main(String[] args) {

		Rettangolo primo = new Rettangolo("Alberto", 4, 6);
		Rettangolo secondo = new Rettangolo("Fausto", 3, 5);
	
		getIlPiuGrande(primo.getArea(), secondo.getArea());
		
		if (primo.getArea() < secondo.getArea()) {
			System.out.println("e si chiama: " + secondo.getNome());
		} else if (primo.getArea() > secondo.getArea()) {
			System.out.println("e si chiama: " + primo.getNome());
		} else {
			System.out.println("");
		}
	
	}

	public static void getIlPiuGrande(double a, double b) {
		if (a < b) {
			System.out.println("il più grande è : " + b);
		} else if (a > b) {

			System.out.println("il rettangolo più grande è: " + a);
		} else {
			System.out.println("i triangoli sono uguali");
		}

	}
}
