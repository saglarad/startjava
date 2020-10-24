import java.util.Scanner;

public class Calculator {

	private int firstNumber;
	private int secondNumber;
	private char mathOperation;
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

	public void calculate(char mathOperation) {
		switch (mathOperation) {
			case '+' :
				result = firstNumber + secondNumber;
				break;
			case '-' :
				result = firstNumber - secondNumber;
				break;
			case '*' :
				result = firstNumber * secondNumber;
				break;
			case '/' :
				result = firstNumber / secondNumber;
				break;
			case '^' :
				int result = 1;
				for(int i = 0; i < secondNumber; i++) {
					result *= firstNumber;
				}
				result = result;
				break;
			case '%' :
				result = firstNumber % secondNumber;
		}
	}

	public int getResult() {
		return result;
	}
}