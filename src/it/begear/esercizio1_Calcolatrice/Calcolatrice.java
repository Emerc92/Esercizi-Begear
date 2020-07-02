package it.begear.esercizio1_Calcolatrice;

public class Calcolatrice {
	protected int valore1;
	public int getValore1() {
		return valore1;
	}

	public void setValore1(int valore1) {
		this.valore1 = valore1;
	}

	public int getValore2() {
		return valore2;
	}

	public void setValore2(int valore2) {
		this.valore2 = valore2;
	}

	protected int valore2;
	public static void getSomma(int a, int b) {
		System.out.println(a + b);
	}

	public static void getResta(int a, int b) {
		System.out.println(a - b);
	}

	public static void getMoltiplica(int a, int b) {
		System.out.println(a*b);
	}

	public static void getDividi(double a, double b) {
		System.out.println(a / b);
	}

	public static void getModulo(double a, double b) {
		System.out.println(a % b);
	}
}