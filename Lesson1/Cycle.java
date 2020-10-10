public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int i = 6;
		while(i >= -6) {
			System.out.println(i + " ");
			i -= 2;
		}

		int j = 10;
		int sumOdd = 0;
		do {
			j++;
			if(j % 2 == 1) {
				sumOdd += j;
			}
		} while(j < 20);
		System.out.println("11 + 13 + 15 + 17 + 19 = " + sumOdd);
	}
}