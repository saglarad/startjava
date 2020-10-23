import java.util.Scanner;

public class CalculatorTest {
	public static void main(String[] args) {
		Calculator calculatorOne = new Calculator();
		Scanner scanner = new Scanner(System.in);
		String answer = "yes";

		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				System.out.print("Введите первое число: ");
				int firstNumber = scanner.nextInt();
				calculatorOne.setFirstNumber(firstNumber);

				System.out.println("");
				System.out.print("Введите знак математической операции: ");
				char mathOperation = scanner.next().charAt(0);

				System.out.println("");
				System.out.print("Введите второе число: ");
				int secondNumber = scanner.nextInt();
				calculatorOne.setSecondNumber(secondNumber);

				calculatorOne.setResult(mathOperation);

				System.out.println("Результат: " + calculatorOne.getResult());

				System.out.println("Хотите продолжить? [yes/no]");
				answer = scanner.nextLine();
			} else {
				System.out.println("Хотите продолжить? [yes/no]");
				answer = scanner.nextLine();
			}
		}
	}
}