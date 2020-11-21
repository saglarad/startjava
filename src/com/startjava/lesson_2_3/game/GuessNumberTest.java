package com.startjava.lesson_2_3.game;


import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		String answer = "yes";

		System.out.println("Угадай число");

		System.out.println("Введите имя первого игрока: ");
		Player playerOne = new Player(scan.nextLine());

		System.out.println("Введите имя второго игрока: ");
		Player playerTwo = new Player(scan.nextLine());

		GuessNumber guessNumber = new GuessNumber(playerOne, playerTwo);

		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				guessNumber.play();
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.next();
		}
	}
}