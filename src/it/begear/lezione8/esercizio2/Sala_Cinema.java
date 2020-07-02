package it.begear.lezione8.esercizio2;

import java.util.LinkedHashSet;

public class Sala_Cinema <T>{
	protected LinkedHashSet<T> sala;
	
	public Sala_Cinema(T utenteConBiglietto) {
		sala = (LinkedHashSet<T>) utenteConBiglietto;
	}
	public T getContenuto() {
		return (T) sala;
	}
}
