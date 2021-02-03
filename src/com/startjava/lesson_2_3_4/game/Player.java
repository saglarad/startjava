package com.startjava.lesson_2_3_4.game;

import java.util.Arrays;

public class Player {

	private String name;
	private int[] numbers = new int[10];
	private int attempts = 0;

	public Player(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int[] getNumbers() {
		return Arrays.copyOf(numbers, attempts);
	}

	public int getNumber() {
		int currentElementIndex = attempts-1;
		return numbers[currentElementIndex];
	}

	public void setNumber(int number) {
		if (!isAttemptsEnd()) {
			numbers[attempts] = number;
			attempts++;
		}
	}

	public boolean isAttemptsEnd() {
		return attempts >= numbers.length;
	}

	public void clearNumbers() {
		Arrays.fill(numbers, 0, attempts, -1);
		attempts = 0;
	}

	public int getAttempts() {
		return attempts;
	}

	public String displayAttempts() {
		StringBuilder numbersStr = new StringBuilder();
		int[] numbersTemp = getNumbers();
		for (int i = 0; i < attempts; i++) {
			numbersStr.append(numbersTemp[i]);
			if (i < attempts) {
				numbersStr.append(" ");
			}
		}
		return numbersStr.toString();
	}

}