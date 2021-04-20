package com.startjava.lesson_2_3_4.game;

import java.util.Scanner;
import java.util.stream.IntStream;

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
            if(makeMove(playerOne)) {
                break;
            }
            if (makeMove(playerTwo)) {
                break;
            }
        }
        resetGame();
    }

    private boolean makeMove(Player player) {
        enterNumber(playerOne);
        if (compareNumber(playerOne)) {
            return false;
        }

        enterNumber(playerTwo);
        if (compareNumber(playerTwo)) {
            return false;
        }

        if (isGameEnd()) {
            if (isGameEnd()) {
            System.out.println("У " + playerOne.getName() + " закончились попытки");
            System.out.println(displayAttempts(playerOne));
            System.out.println("У " + playerTwo.getName() + " закончились попытки");
            System.out.println(displayAttempts(playerTwo));
        }
        }
        return true;
    }

    private boolean isGameEnd() {
        return playerOne.isAttemptsEnd() && playerTwo.isAttemptsEnd();
    }


    private void enterNumber(Player player) {
        System.out.println("Введите число " + player.getName());
        player.setNumber(scan.nextInt());
    }

    private boolean compareNumber(Player player) {
        if (player.getNumber() == randomNumber) {
            System.out.println("Игрок " + player.getName() + " угадал число " + randomNumber + " с " + player.getAttempts() + " попытки");
            return true;
        }

        System.out.println("Введенное вами число " + (player.getNumber() > randomNumber ? "больше" : "меньше") + " того, что загадал компьютер");
        return false;
    }

    private String displayAttempts(Player player) {
        StringBuilder numbersStr = new StringBuilder();
        int[] numbersTemp = player.getNumbers();
        IntStream.range(0, player.getAttempts()).forEach(i -> {
            numbersStr.append(numbersTemp[i]);
            if (i < player.getAttempts()) {
                numbersStr.append(" ");
            }
        });
        return numbersStr.toString();
    }

    private void resetGame() {
        playerOne.clearNumbers();
        playerTwo.clearNumbers();
    }
}