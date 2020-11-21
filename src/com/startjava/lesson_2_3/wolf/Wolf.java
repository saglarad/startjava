package com.startjava.lesson_2_3.wolf;

public class Wolf {
	
	private String gender = "Самец";
	private String name = "Серый";
	private float weight = 35.5f;
	private int age = 3;
	private String color = "серо-белый";

	public String getGender() {
		return gender;
	}

	void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	public float getWeight() {
		return weight;
	}

	void setWeight(float weight) {
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		if(age > 8) {
			System.out.println("Некорректный возраст");
		} else {
			this.age = age;
		}
	}

	public String getColor() {
		return color;
	}

	void setColor(String color) {
		this.color = color;
	}

	public String move() {
		System.out.println("Умеет ходить бесшумно");
		return "nothing";
	}

	public void sit() {

	}

	public int run() {
		System.out.println("Волк бежит со скоростью 20 км в час");
		return 20;
	}

	public boolean howl() {
		System.out.println("В полнолуние воет");
		return true;
	}

	public void hunt() {

	}
}