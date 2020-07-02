package it.begear.lezione4.esercizio4;

public class MainNumeri {
	public static void main (String []args) {

	Ridammi num1 = new Numero(2);
	Quadrato qua = new Quadrato();
	Cubo cu = new Cubo();
	num1.ridammi(2);
	num1 = qua;
	
	num1.ridammi(2);
	
	num1 = cu;
	num1.ridammi(2);
}
}