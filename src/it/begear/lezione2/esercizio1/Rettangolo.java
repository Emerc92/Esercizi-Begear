package it.begear.lezione2.esercizio1;

public class Rettangolo extends absRettangoli{

	private double base;
	private double altezza;
	private double area;
	private double perimetro;

	public Rettangolo(String nome, double base, double altezza) {
		super(nome);
		this.base = base;
		this.altezza = altezza;
	}

	public double getBase() {
		return base;
	}

	public double getAltezza() {
		return altezza;
	}

	public double getPerimetro() {
		this.perimetro = (base + altezza) * 2;
		return perimetro;
	}

	public double getArea() {
		this.area = base * altezza;
		return area;
	}

	public String toString() {
		return super.toString() + " area: [" + getArea() + "] perimetro: [" + getPerimetro() + "]";
	}
}


