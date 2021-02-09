package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {

	private Player playerOne;
	private Player playerTwo;
	private int computerNumber;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void play() {
		computerNumber = (int) (Math.random() * 101);

		System.out.println("Компьютер загадал число: " + computerNumber);
		System.out.println("У Вас 10 попыток");
		do {
			enterNumber(playerOne);
			if (compare(playerOne)) {
				break;
			}
			enterNumber(playerTwo);
			compare(playerTwo);
		} while(!playerOne.isAttemptsEnd() && !playerTwo.isAttemptsEnd());
		playerOne.clearNumbers();
		playerTwo.clearNumbers();
	}

	private void enterNumber(Player player) {
		System.out.println("Введите число " + player.getName());
		player.setNumber(scan.nextInt());
	}

	private boolean compare(Player player) {
		if(player.getNumber() == computerNumber) {
			System.out.println("Игрок " + player.getName() + " угадал число " + computerNumber + " с " + player.getAttempts() + " попытки");
			return true;
		}
		if (playerOne.isAttemptsEnd() && playerTwo.isAttemptsEnd()) {
			System.out.println("У " + playerOne.getName() + " закончились попытки");
			System.out.println(playerOne.displayAttempts());
			System.out.println("У " + playerTwo.getName() + " закончились попытки");
			System.out.println(playerTwo.displayAttempts());
		} else {
			System.out.println("Введенное вами число " + (player.getNumber() > computerNumber ? "больше" : "меньше") + " того, что загадал компьютер");
		}
		return false;
	}
}
