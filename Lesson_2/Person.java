public class Person {

	String sex = "Male";
	String name = "Roman";
	float height = 1.78f;
	float weight = 75.0f;
	int age = 31;

	void move() {
		System.out.println ("Go to the toilet");
	}
	void sit() {
		System.out.println ("Sitting on the toilet bowl");
	}
	boolean run() {
		System.out.println ("Run to the toilet");
		return true;
	}
	String speak() {
		return "I make some shit";
	}
	String learningJava() {
		return "I've made some code";
	}
}