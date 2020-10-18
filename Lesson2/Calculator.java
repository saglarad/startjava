import java.util.Scanner;

public class Calculator {

	Scanner scanner = new Scanner(System.in);
	private int firstNumber = 1;
	private int secondNumber = 1;
	private char mathOperation = '+';
	private int result = 2;

	public int getFirstNumber() {
		return firstNumber;
	}

	void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public int getSecondNumber() {
		return secondNumber;
	}

	void setSecondNumber(int secondNumber) {
		this.secondNumber =secondNumber;
	}

	public char getMathOperation() {
		return mathOperation;
	}

	void setMathOperation(char mathOperation) {
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
				int tmpResult = 1;
				for(int i = 0; i < secondNumber; i++) {
					tmpResult *= firstNumber;
				}
				result = tmpResult;
				break;
			case '%' :
				result = firstNumber % secondNumber;
		this.mathOperation = mathOperation;
		}
	}

	public int getResult() {
		return result;
	}
}