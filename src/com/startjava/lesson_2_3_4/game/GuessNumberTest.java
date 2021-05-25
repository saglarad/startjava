package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Угадай число");

		System.out.println("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.println("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.nextLine());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

		String answer = "yes";

		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				guessNumber.play();
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.next();
		}
	}
}
