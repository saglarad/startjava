package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
	private Player playerOne;
	private Player playerTwo;
	private int randomNum;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void play() {
		generateRandomNumber();
		System.out.println("У Вас 10 попыток");
		while (makeMove()) {}
		resetGame();
	}

	private void generateRandomNumber() {
		randomNum = (int) (Math.random() * 101);
		System.out.println("Компьютер загадал число: " + randomNum);
	}

	private boolean makeMove() {
		enterNumber(playerOne);
		if (compareNumber(playerOne)) {
			return false;
		}

		enterNumber(playerTwo);
		if (compareNumber(playerTwo)) {
			return false;
		}

		if (isGameEnd()) {
			System.out.println("У " + playerOne.getName() + " закончились попытки");
			System.out.println(displayAttempts(playerOne));
			System.out.println("У " + playerTwo.getName() + " закончились попытки");
			System.out.println(displayAttempts(playerTwo));
		}
		return true;
	}

	private boolean isGameEnd() {
		return playerOne.isAttemptsEnd() && playerTwo.isAttemptsEnd();
	}

	private int getRandomNum() {
		return randomNum;
	}

	private void enterNumber(Player player) {
		System.out.println("Введите число " + player.getName());
		player.setNumber(scan.nextInt());
	}

	private boolean compareNumber(Player player) {
		if (player.getNumber() == getRandomNum()) {
			System.out.println("Игрок " + player.getName() + " угадал число " + getRandomNum() + " с " + player.getAttempts() + " попытки");
			return true;
		}

		System.out.println("Введенное вами число " + (player.getNumber() > randomNum ? "больше" : "меньше") + " того, что загадал компьютер");
		return false;
	}

	private String displayAttempts(Player player) {
		StringBuilder numbersStr = new StringBuilder();
		int[] numbersTemp = player.getNumbers();
		for (int i = 0; i < player.getAttempts(); i++) {
			numbersStr.append(numbersTemp[i]);
			if (i < player.getAttempts()) {
				numbersStr.append(" ");
			}
		}
		return numbersStr.toString();
	}

	private void resetGame() {
		playerOne.clearNumbers();
		playerTwo.clearNumbers();
	}
}