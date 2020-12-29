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
				String expression = scan.nextLine();
				System.out.println("Результат: " + calc.calculate(expression));
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.nextLine();
		}
	}
}