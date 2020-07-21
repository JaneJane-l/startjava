public class GuessNumber {
	public static void main(String[] args) {
		int yourNum = 8;
		int guessNum = 10;
		while (yourNum != guessNum) {
			if (guessNum > yourNum) {
				System.out.println("Your number "+ yourNum + " more than computer number");
				yourNum += 1;
			} else {
				System.out.println("Your number " + yourNum + " less than computer number");	
				yourNum -= 1;
			}
		}
		System.out.println("You guess! Computer number is " + yourNum);
	}
}