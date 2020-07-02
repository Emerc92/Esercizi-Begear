package it.begear.esercizio5_Random;

public class Random {

	public static void main(String[] args) {
				
		//Creare due variabili, alla prima si assegna un numero random da 0 a 100, alla seconda da 50 a 100

	
		int prima = (int)(Math.random()*100+1);
		int seconda = (int)(Math.random()*50+50);
		
		System.out.println(prima);
		System.out.println(seconda);
	
	}

}
