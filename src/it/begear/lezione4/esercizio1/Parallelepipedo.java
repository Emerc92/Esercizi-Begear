package it.begear.lezione4.esercizio1;

public class Parallelepipedo extends Figure {
	private double lunghezza;
	private double altezza;
	private double proffondità;
	private double volume;
	private double areaBase;

	public Parallelepipedo(String nome, double base, double altezza, double proffondità) {
		super(nome);
		this.altezza = altezza;
		this.lunghezza = base;
		this.proffondità = proffondità;
	}

	public double getBase() {
		return lunghezza;
	}

	public void setBase(double base) {
		this.lunghezza = base;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	public double getProffondità() {
		return proffondità;
	}

	public void setProffondità(double lunghezza) {
		this.proffondità = lunghezza;
	}

	@Override
	public double getAreaBase() {
		areaBase = lunghezza * proffondità;
		return areaBase;
	}

	@Override
	public double getVolume() {
		volume = areaBase * altezza;
		return volume;
	}

	@Override
	public String toString() {
		return super.toString() + "con base: [" + lunghezza + "] altezza : [" + altezza + "] " + "proffondità [" + proffondità + "] area base: [" + areaBase
				+ "] " + "volume: [" + volume + "]";
	}
}
