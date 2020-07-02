package it.begear.lezione5.esercizio1;

public class Exceptions extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int val1;
	private int val2;
	private int risult;
	
	public Exceptions (int val1, int val2) {
		setVal1(val1);
		setVal2(val2);	
	}
	
	public int getVal1() {
		return val1;
	}

	public void setVal1(int val1) {
		this.val1 = val1;
	}

	public int getVal2() {
		return val2;
	}

	public void setVal2(int val2) {
		this.val2 = val2;
	}	
	
	public int getRisult() {
		risult= val1/val2;
		return risult;
	}
}