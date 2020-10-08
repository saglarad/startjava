import java.util.Scanner;
public class MyFirstGame {
	public static void main(String[] args){

			int i = 5;
			int j = 0;
			Scanner scan = new Scanner(System.in);
			System.out.println("Угадай число");
			
			do {
				j = scan.nextInt();
				if(j > i) {
					System.out.println("Введенное вами число больше того, что загадал компьютер");
				} else if (j < i) {
					System.out.println("Введенное вами число меньше того, что загадал компьютер");
				}
			} while(j != i);
			System.out.println("Вы угадали!");
	} 
}