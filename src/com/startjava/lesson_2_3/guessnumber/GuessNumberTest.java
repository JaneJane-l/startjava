package com.startjava.lesson_2_3.guessnumber;

import java.util.Scanner;

public class GuessNumberTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);	

		System.out.println(" Print Player1 Name: ");
		String namePlayer1 = sc.nextLine();

		System.out.println(" Print Player2 Name: ");
		String namePlayer2 = sc.nextLine();

		Player player1 = new Player(namePlayer1);
		Player player2 = new Player(namePlayer2);

		GuessNumber newGame = new GuessNumber(player1, player2);

		newGame.startGame(sc);

		System.out.println("Do you want to continue: Y/N");
			char answerContinue = sc.next().charAt(0);	

			while (answerContinue != 'Y' && answerContinue != 'N') {
				System.out.println("Do you want to continue: Y/N");
				answerContinue = sc.next().charAt(0);}
	}

}