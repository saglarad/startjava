package com.startjava.lesson_2_3_4.calculator;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private int result;

	public int getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}



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
		}
		return 0;
	}
}