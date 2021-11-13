package com.bridgelabz.decofcards;

import java.util.Scanner;

public class DecOfCards {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter number of players :");
		int playerCount = sc.nextInt();

		CardsPlay play = new CardsPlay(playerCount);
		play.generateCards();
		play.printCards();
		play.addPlayer();
		play.distributeCards();
		play.printCardList();
	}
}