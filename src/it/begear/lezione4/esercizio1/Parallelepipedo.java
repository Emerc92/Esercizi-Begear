package it.begear.lezione4.esercizio1;

public class Parallelepipedo extends Figure {
	private double lunghezza;
	private double altezza;
	private double proffondit�;
	private double volume;
	private double areaBase;

	public Parallelepipedo(String nome, double base, double altezza, double proffondit�) {
		super(nome);
		this.altezza = altezza;
		this.lunghezza = base;
		this.proffondit� = proffondit�;
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

	public double getProffondit�() {
		return proffondit�;
	}

	public void setProffondit�(double lunghezza) {
		this.proffondit� = lunghezza;
	}

	@Override
	public double getAreaBase() {
		areaBase = lunghezza * proffondit�;
		return areaBase;
	}

	@Override
	public double getVolume() {
		volume = areaBase * altezza;
		return volume;
	}

	@Override
	public String toString() {
		return super.toString() + "con base: [" + lunghezza + "] altezza : [" + altezza + "] " + "proffondit� [" + proffondit� + "] area base: [" + areaBase
				+ "] " + "volume: [" + volume + "]";
	}
}
