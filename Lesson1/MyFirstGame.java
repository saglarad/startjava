import java.util.Scanner;
public class MyFirstGame {
	public static void main (String [] args){

			int i = 5;
			int num = 0;
			Scanner s = new Scanner(System.in);
			System.out.println("Угадай число");

			do{

				num = s.nextInt();
				if(num > 5) {
						System.out.println("Введенное вами число больше того, что загадал компьютер");
				} else if (num < 5) {
						System.out.println("Введенное вами число меньше того, что загадал компьютер");
				}
			}
			while (num != 5);
			System.out.println("Вы угадали!");
	} 
}
