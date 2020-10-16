public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		System.out.println("gender = " + wolfOne.gender);
		System.out.println("name = " + wolfOne.name);
		System.out.println("weight = " + wolfOne.weight);
		System.out.println("age = " + wolfOne.age);
		System.out.println("color = " + wolfOne.color);
		wolfOne.move();
		wolfOne.sit();
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.howl());
		wolfOne.hunt();
	}
}