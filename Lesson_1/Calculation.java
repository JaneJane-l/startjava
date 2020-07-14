public class Calculation {
	public static void main(String[] args) {
	int first_number = 0;
	int second_number = 3;
	char operation ='^';
	int result = 0;
		if (operation == '/' && second_number !=0) {
		result = first_number / second_number;
		}
		else if (operation == '/' && second_number == 0 ) {
		System.out.println("None");
		return;
		}
		if (operation == '+') {
		result = first_number + second_number;
		}
		else if (operation == '-') {
		result = first_number - second_number;
		}
		else if (operation == '*') {
		result = first_number * second_number;
		}
		else if (operation == '^') {
			result = 1;
			if (second_number == 0)
				result = 1;
			else{
				for(int i = 1; i <= second_number; i++) {
				result=result * first_number;
				}
			} 	
		}
		else if (operation == '%') {
			result = first_number % second_number;
			
		}
	System.out.println(result);	
	}
	

}