package it.begear.lezione7.esercizio2;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main_Directory {

	public static void main(String[] args) {

		Directory ut1 = new Directory();
		ut1.setNome();
		ut1.setCognome();
		ut1.setTel();
		Directory ut2 = new Directory();
		ut2.setNome();
		ut2.setCognome();
		ut2.setTel();
		Directory[] directory = { ut1, ut2 };

		PrintWriter writer = null;
		try {
			writer = new PrintWriter(new FileWriter("src.it.begear.file.txt"));
			for (Directory i : directory) {

				writer.println(i.toString());

			}

		} catch (IOException e) {
			System.out.println("attenzione + '" + e + "'");
		} finally {

			writer.close();
			System.out.println("Eclipse");
		}

	}
}
