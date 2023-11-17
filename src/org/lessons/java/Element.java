package org.lessons.java;

import java.util.Arrays;

public class Element {

	private int[] numbers;
	private int currentIndex = 0;

	// COSTRUTTORE
	public Element(int[] numbers) {

		setNumbers(numbers);
	}

	public Element() {
	}

	// GETTER & SETTER
	public int[] getNumbers() {
		return numbers;
	}

	private void setNumbers(int[] numbers) {
		this.numbers = numbers;
	}

	// METODI

	// METODO PER RESTITUIRE IL PROSSIMO ELEMENTO NEL ARRAY
	public int getNextElement() {

		int number = numbers[currentIndex];
		currentIndex = (currentIndex + 1) % numbers.length;

		return number;
	}

	// RESTITUISCE TRUE O FALSE SE CI SONO ANCORA ELEMENTI NEL ARRAY
	public boolean hasAnotherElements(int count) {

		return count < numbers.length;
	}

	// METODO PER AGGIUNGERE UN NUOVO INERO ALL'ARRAY GIA' ESISTENTE
	public int[] addElement(int value) {

		// CREO IL NUOCO ARRAY COPIANDO QUELLO INIZIALE E AGGIUNGENDO UNO SPAZIO IN PIU'
		int[] newElement = Arrays.copyOf(numbers, numbers.length + 1);

		// AGGIUNGO AL NUOVO ARRAY L'ELEMENTO NELL'ULTIMA POSIZIONE
		newElement[numbers.length] = value;

		// SOVRASCRIVO L'ARRAY INIZIALE
		numbers = newElement;

		// RITORNO L'ARRAY SOVRASCRITTO
		return numbers;

	}

}
