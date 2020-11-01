public class GuessNumber {
	
	private int number;
	private boolean finish;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public boolean match(Player player) {
		if(player.getNumber() == number) {
			System.out.println("Победил игрок по имени: " + player.getName());
			return true;
		}
		return false;
	}

	public boolean getFinish() {
		return finish;
	}
}