import java.util.Scanner;
public class MyFirstGame {
	public static void main (String [] args){
		// int i = 5;
		// 	Scanner s = new Scanner(System.in);
		// 	System.out.println("Угадай число");
		// 	String st = s.nextLine();
		// 		do {
		// 			if(i>5) {
		// 				System.out.println("Введенное вами число больше того, что загадал компьютер");
		// 			} else {
		// 				System.out.println("Введенное вами число меньше того, что загадал компьютер");
		// 			} 
		// 		} while(i==5);
		// 		System.out.println("Вы угадали!");
				


		
			Scanner s = new Scanner(System.in);
			System.out.println("Угадай число");

			int i = 5;
			
			String a = s.nextLine();
			while(i==5);
				
				System.out.println("Вы угадали!");

					if(i>5) {
						System.out.println("Введенное вами число больше того, что загадал компьютер");
					} else {
						System.out.println("Введенное вами число меньше того, что загадал компьютер");
					} 


		// int i = 10;
		// int j = 0;
		// do {
		// 	if (j < i) {
		// 		System.out.println("Введенное вами число меньше того, что загадал компьютер");
		// 		j++;
		// 	} else if (j > i) {
		// 		System.out.println("Введенное вами число меньше того, что загадал компьютер");
		// 		j--;
		// 	}
		// } while (j == i);

		// System.out.println("Вы угадали!"); 

	} 
}
