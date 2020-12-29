package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	public int calculate(String expression) {
		String[] number = expression.split(" ");
		int firstNumber = Integer.parseInt(number[0]);
		String mathOperation = number[1];
		int secondNumber = Integer.parseInt(number[2]);
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