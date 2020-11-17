import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	private Player playerOne;
	private Player playerTwo;
	private int computerNumber;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player playerOne, Player playerTwo) {
		this.playerOne = playerOne;
		this.playerTwo = playerTwo;
	}

	public void play() {
		computerNumber = (int) (Math.random() * 100);
		System.out.println("Компьютер загадал число: " + computerNumber);

		do {
			enterNumber(playerOne);
			if (compare(playerOne)) {
				break;
			}
			enterNumber(playerTwo);
		} while(!compare(playerTwo));
	}

	private void enterNumber(Player player) {
		System.out.println("Введите число " + player.getName());
		player.setNumber(scan.nextInt());
	}

	private boolean compare(Player player) {
		if(player.getNumber() == computerNumber) {
			System.out.println("Победил игрок по имени: " + player.getName());
			return true;
		} System.out.println(player.getNumber() > computerNumber ? "Введенное вами число больше того, что загадал компьютер" : "Введенное вами число меньше того, что загадал компьютер");
		return false;
	}
}