import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		char sign = ' ';
		Scanner scan = new Scanner(System.in);

		while(sign != 'x') {
			System.out.println("Введите математический знак");
			sign = scan.next().charAt(0);
			if(sign == '+') {
				System.out.println(a + b);
			} else if(sign == '-') {
				System.out.println(a - b);
			} else if (sign == '*') {
				System.out.println(a * b);
			} else if (sign == '/') {
				System.out.println(a / b);
			} else if (sign == '^') {
				System.out.println(a*a);
			} else if (sign == '%') {
				System.out.println(a % b);
			}
		}
	}
}