package it.begear.lezione4.esercizio4;

public class Numero implements Ridammi {
	private int num;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Numero(int num) {
		this.num = num;
	}
	@Override
	public void ridammi (int num) {
		this.num = num;
		System.out.println("il valore del tuo numero è : "+num);
	}
}
