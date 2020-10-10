import java.util.Scanner;

public class MyFirstGame {
	public static void main(String[] args) {
		int computerNumber = 20;
		int userNamber = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Угадай число");
		
		while(userNamber != computerNumber) {
			userNamber = scan.nextInt();
			if(userNamber > computerNumber) {
				System.out.println("Введенное вами число больше того, что загадал компьютер");
			} else if (userNamber < computerNumber) {
				System.out.println("Введенное вами число меньше того, что загадал компьютер");
			}
			}
			System.out.println("Вы угадали!");
	} 
}