package it.begear.lezione2.esercizio1;

public abstract class absRettangoli {

	protected String nome;

	public abstract double getArea();

	public abstract double getPerimetro();

	public absRettangoli(String nome) {
		this.nome = nome;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
