public class Calculation {
	public static void main(String[] args) {
		int firstNumber = 1;
		int secondNumber = 0;
		char operation ='^';
		int result = 0;

		if (operation == '/') {
			if (secondNumber != 0) {
				result = firstNumber / secondNumber;
			} else {
				System.out.println("None");
			}
		} else if (operation == '+') {
			result = firstNumber + secondNumber;
		} else if (operation == '-') {
			result = firstNumber - secondNumber;
		} else if (operation == '*') {
			result = firstNumber * secondNumber;
		} else if (operation == '^') {
			result = 1;
			for (int i = 1; i <= secondNumber; i++) {
				result *= firstNumber;
			}
		} else if (operation == '%') {
			result = firstNumber % secondNumber;
		}
		System.out.println(result);	
	}
}