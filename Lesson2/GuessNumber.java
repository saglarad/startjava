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

	public void enterNumber(Player player) {
		System.out.println("Введите число " + player.getName());
		player.setNumber(scan.nextInt());
	}

	public int compare(Player player) {
		int number = player.getNumber();
		String name = player.getName();
		if(number == computerNumber) {
			System.out.println("Победил игрок по имени: " + player.getName());
		} if(number > computerNumber) {
			System.out.println("Введенное вами число больше того, что загадал компьютер");
		} else if(number < computerNumber) {
			System.out.println("Введенное вами число меньше того, что загадал компьютер");
		}
		return number;
	}

	public void play() {
		computerNumber = (int)(Math.random() * 100);
		System.out.println("Компьютер загадал число: " + computerNumber);

		while(true) {
			enterNumber(playerOne);
			enterNumber(playerTwo);
			int numberPlayerOne = compare(playerOne);
			int numberPlayerTwo = compare(playerTwo);
			if(computerNumber == compare(playerOne)) {
				break;
			} else if(computerNumber == compare(playerTwo)) {
				break;
			}
		}
	}
}