public class Wolf {
	
	String gender = "Самец";
	String name = "Серый";
	float weight = 35.5f;
	int age = 3;
	String color = "серо-белый";

	String move() {
		System.out.println("Умеет ходить бесшумно");
		return "nothing";
	}

	void sit() {

	}

	int run() {
		System.out.println("Волк бежит со скоростью 20 км в час");
		return 20;
	}

	boolean howl() {
		System.out.println("В полнолуние воет");
		return true;
	}

	void hunt() {

	}
}