public class ConditionalStatement {
	public static void main(String[] args) {
	  int age = 27;
	  boolean isAges = age >= 20;
	  if (isAges==true){
	  	System.out.println("good age");
	  }

	  boolean isSex=false;
	  if (isSex==false){
	  	System.out.println("Notmale");
	  } else {
		System.out.println("male");
	  }

	  float height = 1.6f;
	  boolean isHigh = height >= 1.8f;
	  if (isHigh==true){
	  	System.out.println("High");
	  }else {
	  	System.out.println("Load");
	  }

	  char firstLetter = 'J';
	  if (firstLetter =='M'){
	  	System.out.println("Name M!");
	  } else if (firstLetter=='I') {
	  	System.out.println("Name I!");
	  } else {
	  	System.out.println ("Other letter");
	  }
	}
}