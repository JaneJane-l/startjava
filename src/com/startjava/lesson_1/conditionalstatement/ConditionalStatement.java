public class ConditionalStatement {
	public static void main(String[] args) {
		int age = 27;
	  	if (age > 20) {
	  		System.out.println("good age");
	  	}

	  	boolean isMale = false;
	  	if (isMale) {
	  		System.out.println("male");
	  	} else {
			System.out.println("notMale");
	  	}

	  	float height = 1.6f;
	  	if (height >= 1.8f) {
	  		System.out.println("High");
	  	} else {
	  		System.out.println("Load");
	  	}

	  	char firstNameLetter = 'J';
	  	if (firstNameLetter =='M') {
	  		System.out.println("Name M!");
	  	} else if (firstNameLetter == 'I') {
	  		System.out.println("Name I!");
	  	} else {
	  		System.out.println ("Other letter");
	  	}
	}
}