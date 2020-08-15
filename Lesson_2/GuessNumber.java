
public class GuessNumber {

	int playerNumber;
	int computerNumber = Math.random();
	while (playerNumber != computerNumber) {
		if (computerNumber > playerNumber) {
			System.out.println("Your number " + playerNumber + " more than computer number");
			playerNumber++;
		} else {
			System.out.println("Your number " + playerNumber + " less than computer number");	
			playerNumber--;
		}
	}
	System.out.println(" You guess! Computer number is " + playerNumber);
}