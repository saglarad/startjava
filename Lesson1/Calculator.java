public class Calculator {
	public static void main (String [] args) {
		int a = 5;
		int b = 2;

		char sign = '5';

		if (sign == '+'){
			int addition = a + b;
			System.out.println(addition);
		}

		else if (sign == '-'){
			int subtraction = a - b;
			System.out.println(subtraction);
		}

		else if (sign == '*') {
			int multiplication = a * b;
			System.out.println(multiplication);
		}

		else if (sign == '/') {
			int division = a/b;
			System.out.println(division);
		}

		else if (sign == '^') {
			int degree = a^b;
			System.out.println(degree);
		}

		else if (sign == '%') {
			int percent = a%b;
			System.out.println(percent);
		}

		else {
			System.out.println("Введите математический знак");
		}
	}
}