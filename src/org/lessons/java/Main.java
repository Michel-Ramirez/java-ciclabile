package org.lessons.java;

public class Main {

	public static void main(String[] args) {

		// DICHIARO L'ARRAY
		int[] arrayN = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		// COSTRUISCO L'OGGETTO E PASSO L'ARRAY DI INTERI
		Element e = new Element(arrayN);

		// RICHIAMO IL METODO PER AGGIUNGERE UN NUOVO INTERO ALL'ARRAY GIA' ESISTENTE
		e.addElement(11);

		// TENGO CONTO DEL CONTEGGIO
		int count = 0;

		// COSTRUISCO UN CICLO RICHIAMANDO IL METODO (SE CI SONO ANCORA ELEMENTO
		// CONTINIO A CICLARE)
		while (e.hasAnotherElements(count)) {

			// ALL'INTERO ASSEGNO IL NUMERO RESTITUITO DAL METODO PRESENTE NELLA CLASSE
			// INVOCANDOLO
			int number = e.getNextElement();

			count++;

			// PASSO IL VALORE DI COUNT AL METODO
			e.hasAnotherElements(count);

			System.out.println("Numero corrent: " + number);
		}

	}

}
