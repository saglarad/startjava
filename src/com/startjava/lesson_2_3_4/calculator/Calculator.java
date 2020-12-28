package com.startjava.lesson_2_3_4.calculator;
import java.util.Scanner;
public class Calculator {
	Scanner scan = new Scanner(System.in);
	private int firstNumber;
	private int secondNumber;
	private int result;

	public int calculate(String mathOperation) {
		switch (mathOperation) {
			case "+":
				return firstNumber + secondNumber;
			case "-":
				return firstNumber - secondNumber;
			case "*":
				return firstNumber * secondNumber;
			case "/":
				return firstNumber / secondNumber;
			case "^":
				return (int) Math.pow(firstNumber, secondNumber);
			case "%":
				return firstNumber % secondNumber;

			default:
				System.out.println("Неверный знак");
		}
		return 0;
	}
}