package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;

public class GuessNumber {
    private Player playerOne;
    private Player playerTwo;
    private int randomNumber;
    private Scanner scan = new Scanner(System.in);

    public GuessNumber(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public void play() {
        randomNumber = (int) (Math.random() * 101);
        System.out.println("Компьютер загадал число: " + randomNumber);
        System.out.println("У Вас 10 попыток");
        while (true) {
            if (makeMove(playerOne)) {
                break;
            }
            if (makeMove(playerTwo)) {
                break;
            }
            if (isAttemptsEnd()) {
                break;
            }
            System.out.println("Ни один из игроков не угадал. Следующий ход");
        }
        resetGame();
    }

    private boolean makeMove(Player player) {
        enterNumber(player);
        if (isNumberGuessedBy(player)) {
            return true;
        }

        if (player.isAttemptsEnd()) {
            System.out.println("У " + player.getName() + " закончились попытки");
            displayAttempts(player);
        }
        return false;
    }

    private void enterNumber(Player player) {
        System.out.println("Введите число " + player.getName());
        player.setNumber(scan.nextInt());
    }

    private boolean isNumberGuessedBy(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getAttempts() + " попытки");
            return true;
        }

        System.out.println("Введенное вами число " + (player.getNumber() > randomNumber ? "больше" : "меньше") + " того, что загадал компьютер");
        return false;
    }

    private void displayAttempts(Player player) {
        for (int number:player.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println("");
    }

    private boolean isAttemptsEnd() {
        return playerOne.isAttemptsEnd() && playerTwo.isAttemptsEnd();
    }

    private void resetGame() {
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
    }
}