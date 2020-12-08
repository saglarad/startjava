package com.startjava.lesson_2_3_4.person;

public class Person {

	String sex = "Male";
	String name = "Pol";
	int height = 180;
	float weight = 92.2f;
	int age = 30;

	void move() {
		System.out.println("Проходит в день 5000 шагов");
	}

	String sit() {
		return "nothing";
	}
	
	String run() {
		System.out.println("Пробежал 5 км");
		return "5";
	}

	void speak() {

	}
	
	boolean learnJava() {
		System.out.println("Изучает StartJava");
		return true;
	}
}