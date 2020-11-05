import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	private int guessNumber;

	public GuessNumber(int guessNumber) {
		this.guessNumber = guessNumber;
	}

	public void play() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Угадай число");
		System.out.println("Компьютер загадал число: " + guessNumber);
		
		System.out.println("Введите имя первого игрока: ");
		Player player1 = new Player(scan.nextLine());

		System.out.println("Введите имя второго игрока: ");
		Player player2 = new Player(scan.nextLine());

		boolean finish = false;

		while(!finish) {
			System.out.println("Введите число первого игрока: ");
			player1.setNumber(scan.nextInt());
			finish = player1.match(guessNumber);

			if(!finish) {
				System.out.println("Введите число второго игрока: " );
				player2.setNumber(scan.nextInt());
				finish = player2.match(guessNumber);
			}
		}
	}
}