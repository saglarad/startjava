import java.util.Scanner;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	// private char mathOperation;
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

	public int calculate(char mathOperation) {
		switch (mathOperation) {
			case '+' :
				return firstNumber + secondNumber;
			case '-' :
				return firstNumber - secondNumber;
			case '*' :
				return firstNumber * secondNumber;
			case '/' :
				return firstNumber / secondNumber;
			case '^' :
				int result = 1;
				for(int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				return result;
			case '%' :
				return firstNumber % secondNumber;
		}
		return 0;
	}
}