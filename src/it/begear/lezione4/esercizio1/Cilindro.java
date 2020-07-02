package it.begear.lezione4.esercizio1;

public class Cilindro extends Figure {
	private double raggio;
	private double altezza;
	private double volume;
	private double areaBase;

	public Cilindro(String nome, double raggio, double altezza) {
		super(nome);
		this.raggio = raggio;
		this.altezza = altezza;
	}

	public double getRaggio() {
		return raggio;
	}

	public void setRaggio(double raggio) {
		this.raggio = raggio;
	}

	public double getAltezza() {
		return altezza;
	}

	public void setAltezza(double altezza) {
		this.altezza = altezza;
	}

	@Override
	public double getAreaBase() {
		areaBase = Math.PI * (Math.pow(raggio, 2));
		return areaBase;
	}

	@Override
	public double getVolume() {
		volume = areaBase * altezza;
		return volume;
	}

	public String toString() {
		return super.toString() + " con altezza : [" + altezza + "] raggio: [" + raggio + "] area base: [" + areaBase + "] "
				+ "volume: [" + volume + "]";
	}

}
