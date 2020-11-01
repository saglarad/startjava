import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Player playerOne = new Player();
		System.out.println("Введите имя первого игрока: ");
		playerOne.setName(scan.nextLine());

		Player playerTwo = new Player();
		System.out.println("Введите имя второго игрока: ");
		playerTwo.setName(scan.nextLine());

		String answer = "yes";

		System.out.println("Угадай число");

		while(!answer.equals("no")) {
			if(answer.equals("yes")) {
				GuessNumber computerNumber = new GuessNumber();
				Random random = new Random();
				computerNumber.setNumber(random.nextInt(100));
				System.out.println(computerNumber.getNumber());

				boolean finish = false;

				while(!finish) {
					System.out.println("Введите число первого игрока: " + playerOne.getName() + " ");
					playerOne.setNumber(scan.nextInt());
					finish = computerNumber.match(playerOne);

					if(!finish) {
						System.out.println("Введите число второго игрока: " + playerTwo.getName() + " ");
						playerTwo.setNumber(scan.nextInt());
						finish = computerNumber.match(playerTwo);
					}
				}
			}
			System.out.println("Хотите продолжить? [yes/no]");
			answer = scan.next();
		}
	}
}