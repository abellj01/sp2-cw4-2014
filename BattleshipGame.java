package battleshipAy;

import java.util.Scanner;

public class BattleshipGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Battleship Game!");
		System.out.println("The aim is to sink a fleet of 10 ships of various lengths.");
		System.out.println();

		Ocean oc = new Ocean();
		System.out
				.println("Below is the ocean with ten ships randomly placed.");
		System.out.println();
		oc.print();
		
		oc.placeAllShipsRandomly();

		System.out.println();
		Scanner scan = new Scanner(System.in);
		int row, col;
		row = getValue(scan, "Enter an integer for the row: ");
		col = getValue(scan, "Enter another integer for the column: ");

		// method to accept shots;
		// Display results;
		// Print final score;
		// all this in a do ( System.out.print("Enter f to stop playing: ");
		// String s = scan.next();) while (!s.equals(f));

		scan.close();
	}

	public static int getValue(Scanner sc, String a) {
		System.out.print(a);
		return sc.nextInt();
	}

}
