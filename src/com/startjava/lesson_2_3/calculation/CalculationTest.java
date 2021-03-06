package com.startjava.lesson_2_3.calculation;

import java.util.Scanner;


public class CalculationTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

		char answerContinue = 'Y';
		while (answerContinue == 'Y') {
			System.out.println("Print firstnumber:");
			int firstNumber = sc.nextInt();


			System.out.println("Print symbol math operation:");
			char operation = sc.next().charAt(0);

			System.out.println("Print secondnumber:");	
			int secondNumber = sc.nextInt();

			Calculation calculator = new Calculation();

			calculator.setFirstNumber(firstNumber);
			calculator.setSecondNumber(secondNumber);
			calculator.setOperation(operation);


			int result = calculator.calculate();

			System.out.println("Result "+result);

			System.out.println("Do you want to continue: Y/N");
			answerContinue = sc.next().charAt(0);	

			while (answerContinue != 'Y' && answerContinue != 'N') {
				System.out.println("Do you want to continue: Y/N");
				answerContinue = sc.next().charAt(0);	
			}
		}

	}
}