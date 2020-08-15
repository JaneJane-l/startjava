public class WolfTest {
	
	public static void main(String[] args) {
	Wolf happyWolf = new Wolf();
	System.out.println(happyWolf.sit());
	System.out.println(happyWolf.getColor());
	System.out.println(happyWolf.getAge());
	happyWolf.hunting();
	happyWolf.wow();
	happyWolf.setAge(123);
	System.out.println(happyWolf.getAge());
	}
}