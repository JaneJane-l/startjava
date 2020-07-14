public class Guessing {
	public static void main(String[] args) {
		int num = 8;
		int guess_num = 8;
		if (guess_num > num) {
			System.out.println("Your number more than computer number");
		}
		else if (guess_num < num) {
			System.out.println("Your number less than computer number");	
		}
		else {
			System.out.println("You guess");
		}

	}
}