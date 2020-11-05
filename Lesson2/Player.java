import java.util.Scanner;
import java.util.Random;

public class Player {

	public String name;
	public int number;

	public Player(String name) {
		this.name = name;
	}

	public Player(String name, int number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean match(int guessNumber) {
		if(number == guessNumber) {
			System.out.println("Победил игрок по имени: " + name);
			return true;
		}
		return false;
	}
}