package com.startjava.lesson_2_3.guessnumber;

import java.util.Scanner;

public class GuessNumber {

	private int computerNumber;
	private Player player1;
	private Player player2;

	public GuessNumber(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
		this.computerNumber = (int) (Math.random() * 100);
	}
	public void startGame (Scanner sc) {

	while (true) {
			System.out.println (" Print " + player1.getNamePlayer() + " number: ");
			int playerNumber = sc.nextInt();
			if (computerNumber < playerNumber) {
				System.out.println("Your number " + playerNumber + " more than computer number");
			} else if (computerNumber > playerNumber) {
				System.out.println("Your number " + playerNumber + " less than computer number");	
			} else {
				System.out.println(" You guess," + player1.getNamePlayer() + "! Computer number is " + playerNumber);
				break;
			}

			System.out.println (" Print " + player2.getNamePlayer() + " number: ");
			playerNumber = sc.nextInt();
			if (computerNumber < playerNumber) {
				System.out.println("Your number " + playerNumber + " more than computer number");
			} else if (computerNumber > playerNumber) {
				System.out.println("Your number " + playerNumber + " less than computer number");	
			} else {
				System.out.println(" You guess," + player2.getNamePlayer() + "! Computer number is " + playerNumber);
				break;
			}
		}
	}
}
