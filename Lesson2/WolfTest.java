public class WolfTest {
	public static void main(String[] args) {
		Wolf wolfOne = new Wolf();
		
		System.out.println("gender = " + wolfOne.getGender());
		wolfOne.setGender("самка");
		System.out.println("gender = " + wolfOne.getGender());
		
		System.out.println("name = " + wolfOne.getName());
		wolfOne.setName("Серая");
		System.out.println("name = " + wolfOne.getName());
		
		System.out.println("weight = " + wolfOne.getWeight());
		wolfOne.setWeight(20);
		System.out.println("weight = " + wolfOne.getWeight());
		
		System.out.println("age = " + wolfOne.getAge());
		wolfOne.setAge(10);
		System.out.println("age = " + wolfOne.getAge());
		
		System.out.println("color = " + wolfOne.getColor());
		wolfOne.setColor("white");
		System.out.println("color = " + wolfOne.getColor());
		
		wolfOne.move();
		wolfOne.sit();
		System.out.println(wolfOne.run());
		System.out.println(wolfOne.howl());
		wolfOne.hunt();
	}
}