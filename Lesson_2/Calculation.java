public class Calculation {
	private int firstNumber;
	private char operation;
	private int secondNumber;

	public void setFirstNumber(int firstNumber) {
		this.firstNumber = firstNumber;
	}

	public void setSecondNumber(int secondNumber) {
		this.secondNumber = secondNumber;
	}

	public void setOperation(char operation) {
		this.operation = operation;
	}

	public void calculate(int firstNumber, int secondNumber, char operation) {
		int result = 0;
		switch (operation) {
			case '/': 
				if (secondNumber != 0) {
					result = firstNumber / secondNumber;
				} else {
					System.out.println("None");
				}
				break; 	
			case '+':
				result = firstNumber + secondNumber;
				break;
			case '-': 
				result = firstNumber - secondNumber;
				break;
		 	case '*':
				result = firstNumber * secondNumber;
				break;
			case '^':
				result = 1;
				for (int i = 1; i <= secondNumber; i++) {
					result *= firstNumber;
				}
				break;
			case '%':
				result = firstNumber % secondNumber;
				break;
			default:
				System.out.println("Unknown operation");
				break;
		}
	}
}
