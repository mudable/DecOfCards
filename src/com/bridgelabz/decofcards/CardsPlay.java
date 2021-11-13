package com.bridgelabz.decofcards;

import java.util.ArrayList;
import java.util.Scanner;
/*Added generateUniqueCards method to generate unique cards.
 * created the method addPlayer Method to add the players used scanner to take the input from the user.
 */
public class CardsPlay {
	String[] cards = new String[52];
	ArrayList<Player> playerList = new ArrayList<>();

	public void generateUniqueCards() {
		String[] suit = { "Clubs", "Diamonds", "Hearts", "Spades" };
		String[] rank = { "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace" };
		int position = 0;
		for (int i = 0; i < suit.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				cards[position] = suit[i] + rank[j];
				System.out.println(position);
				System.out.println(cards[position]);
				position++;
			}
		}
	}

	public void addPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.print(" Enter the No of players : ");
		int playerCount = sc.nextInt();
		
		System.out.println("Enter first name");
		String firstName=sc.nextLine();
		
		if (playerCount >= 2 && playerCount <= 4) {
			for (int i = 0; i < playerCount; i++) {
				Player player = new Player(firstName);
				playerList.add(player);
			}
		} else {
			System.out.println("Invalid input # Enter between 2 to 4 #");
		}
	}
}
