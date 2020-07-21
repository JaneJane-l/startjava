public class Calculation {
	public static void main(String[] args) {
		int firstNumber = 0;
		int secondNumber = 3;
		char operation ='^';
		int result = 0;
		if (operation == '/' && secondNumber != 0) {
			result = firstNumber / secondNumber;
		} else if (operation == '/' && secondNumber == 0) {
			System.out.println("None");
			return;
		}
		if (operation == '+') {
			result = firstNumber + secondNumber;
		} else if (operation == '-') {
			result = firstNumber - secondNumber;
		} else if (operation == '*') {
			result = firstNumber * secondNumber;
		} else if (operation == '^') {
			result = 1;
			if (secondNumber == 0)
				result = 1;
			else {
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
			} 	
		} else if (operation == '%') {
			result = firstNumber % secondNumber;
		}
		System.out.println(result);	
	}
}