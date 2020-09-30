public class Cycle {
	public static void main(String[] args) {
		for (int i = 0; i <= 20; i++) {
			System.out.println(i);
		}

		int i = 6;
		while(i >= -6) {
			System.out.println(i + " ");
			i = i - 2;
		}

		int i = 10;
		int result = 0;
		do {
			i++;
			if(i % 2 == 1) {
				result = result + i;
				System.out.println(result);
			} 
		} while(i < 20);

		System.out.println("11+13+15+17+19 =" + result);
	}
}

