import java.util.Scanner;
import java.util.Random;

public class GuessNumberTest {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

	String answer = "yes";

	while(!answer.equals("no")) {
		if(answer.equals("yes")) {
			int computerNumber = (int)(Math.random() * 100);
			GuessNumber game = new GuessNumber(computerNumber);
			game.play();
		}
		System.out.println("Хотите продолжить? [yes/no]");
		answer = scan.next();
	}
	}
}