public class GuessNumber {
	public static void main(String[] args) {
		int playerNum = 8;
		int guessNum = 10;
		while (playerNum != guessNum) {
			if (guessNum > playerNum) {
				System.out.println("Your number " + playerNum + " more than computer number");
				playerNum++;
			} else {
				System.out.println("Your number " + playerNum + " less than computer number");	
				playerNum--;
			}
		}
		System.out.println("You guess! Computer number is " + playerNum);
	}
}