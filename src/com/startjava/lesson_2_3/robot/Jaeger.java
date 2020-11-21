public class Jaeger {
	String modelName;
	String mark;
	String origin;
	float height;
	float weight;
	int speed;
	int strength;
	int armor;

	boolean drift() {
		System.out.println("Вы вошли в дрифт");
		return true;
	}

	void move() {
		System.out.println("Вы прошли 5 шагов");
	}

	String scanKaiju() {
		return "nothing";
	}

	void useVortexCannon() {
		
	}
}