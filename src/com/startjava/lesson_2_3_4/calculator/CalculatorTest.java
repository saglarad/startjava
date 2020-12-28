package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";
		
		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				System.out.println("Введите математическое выражение");
				String expression = scan.next();
				String[] number = expression.split("[+\\-\\*/]");
				int firstNumber = Integer.parseInt(number[0]);
				String mathOperation = number[0];
				int secondNumber = Integer.parseInt(number[0]);
				int result;


				System.out.println("Результат: " + calc.calculate(mathOperation));
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.next();
		}
	}
}