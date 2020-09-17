package com.startjava.lesson_2_3.wolf;

public class Wolf {

	private String sex = "Male";
	private String name = "Romic";
	private float weight = 75.0f;
	private int age = 6;
	private String color = "Black";

	public String getSex() {
		return sex;
	}

	public String getName() {
		return name;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public String getColor() {
		return color;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public void setName(String name) {
		this.name = name;
	}
	public void setWeight(float age) {
		this.weight = weight;
	}
	public void setAge(int age) {
		if (age >= 8) {
			System.out.println("No correct age");
		}
		this.age = age;
	}
	public void setColor(String color) {
		this.color = color;
	}

	public void go() {
		System.out.println("Go to the forest");
	}
	
	public String sit() {
		return "Sit on the rock";
	}

	public boolean run() {
		System.out.println("Run to the field");
		return true;
	}

	public void wow() {
		System.out.println("Moun's wow");
	}
	public void hunting() {
	 	System.out.println("Where is rabbits?");
	 }

}