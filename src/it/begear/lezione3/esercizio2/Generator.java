package it.begear.lezione3.esercizio2;

public class Generator {

	public static int[] generator() {
		
		int x = (int) (Math.random() * 10 + 10);
		int y = (int) (Math.random() * 10 + 10);
		int z =(int) (Math.random() * 10 + 10);
		
		
		int[] numeri = {x,y,z};
		//controlla se cè almeno un numero > 15 
		int contatore = 0;
		for(int i = 0; i<numeri.length;i++)
		{
			if(numeri[i] > 15)
			{
				contatore++;
			}
		}
		//se non cè manco un numero sopra il 15 allora creane uno in posizione 0 dell'array
		if(contatore == 0)
		{
			System.out.println("sfortunato! manco uno!");
			
			numeri[0]= (int) (Math.random() * 10 + 10);
		}
		//se ce nè più d'uno rendi inferiore a 16 fino a che non ne rimane solo 1;
		else if(contatore > 1)
			System.out.println("troppo fortunato!ce n'era più d'uno!");
		{
			for(int i = 0; i<numeri.length;i++)
			{
				if(numeri[i] > 15)
				{
					numeri[i] = (int) (Math.random() * 10 + 10);
					contatore--;
				}
				if(contatore == 1)
				{
					break;
				}
			}
		}
		System.out.println(contatore);
		//System.out.println(Arrays.toString(numeri));
		return numeri;
	}
}
