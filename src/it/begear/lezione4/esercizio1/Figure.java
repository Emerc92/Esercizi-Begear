package it.begear.lezione4.esercizio1;

public abstract class Figure {

	private String nome;

	public Figure(String nome) {
		this.nome = nome;
	}

	// metodi abstratti
	public abstract double getAreaBase();

	public abstract double getVolume();

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return "tipo di figura: [" + nome + "] ";
	}
}
