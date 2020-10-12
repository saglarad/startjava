import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		int computerNumber = 20;
		int userNumber = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Угадай число");
		
		while(userNumber != computerNumber) {
			userNumber = scan.nextInt();
			if(userNumber > computerNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (userNumber < computerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
		}
		System.out.println("Вы угадали!");
	} 
}