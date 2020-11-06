import java.util.Scanner;
import java.util.Random;

public class GuessNumber {

	private int guessNumber;
	private Player player1;
	private Player player2;
	private int computerNumber;
	private Scanner scan = new Scanner(System.in);

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void play() {
		computerNumber = (int)(Math.random() * 100);
		System.out.println("Компьютер загадал число: " + computerNumber);

		while(true) {
			userNumber(player1);
			userNumber(player2);
			int numberPlayer1 = match(player1);
			int numberPlayer2 = match(player2);
			if(numberPlayer1 == computerNumber) {
				break;
			} else if(numberPlayer2 == computerNumber) {
				break;
			}
		}
	}

	public void userNumber(Player player) {
		System.out.println("Игрок " + " " + player.getName() + " " + "вводит число");
		player.setNumber(scan.nextInt());
	}

	public int match(Player player) {
		int number = player.getNumber();
		String name = player.getName();
		if(number == computerNumber) {
			System.out.println("Победил игрок " + name);
		}
		return number;
	}
}