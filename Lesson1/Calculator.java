import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		int a = 5;
		int b = 2;
		char sign = '7';
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
				System.out.println(Math.pow(a, b));
			} else if (sign == '%') {
				System.out.println(a % b);
			} else {
				System.out.println("Не математический знак");
			}
		}
	}
}