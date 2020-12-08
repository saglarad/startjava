package com.startjava.lesson_2_3_4.calculator;

import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calc = new Calculator();
		Scanner scan = new Scanner(System.in);
		String answer = "yes";

		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				System.out.print("Введите первое число: ");
				int firstNumber = scan.nextInt();
				calc.setFirstNumber(firstNumber);

				System.out.print("\nВведите знак математической операции: ");
				char mathOperation = scan.next().charAt(0);

				System.out.print("\nВведите второе число: ");
				int secondNumber = scan.nextInt();
				calc.setSecondNumber(secondNumber);

				System.out.println("Результат: " + calc.calculate(mathOperation));
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.next();
		}
	}
}