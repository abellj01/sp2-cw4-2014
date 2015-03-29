package battleshipAy;

import java.util.Scanner;

public class BattleshipGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Battleship Game!");
<<<<<<< HEAD
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
=======
		System.out.println("The aim is to sink a fleet of 10 ships.");
		System.out.println();

		Ocean oc = new Ocean();
<<<<<<< HEAD
		System.out
				.println("Below is the ocean with ten ships randomly placed.");
		System.out.println();
=======
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
		oc.print();

		System.out.println();
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
		int row, col;
		row = getValue(scan, "Enter an integer for the row: ");
		col = getValue(scan, "Enter another integer for the column: ");

		// method to accept shots;
		// Display results;
		// Print final score;
		// all this in a do ( System.out.print("Enter f to stop playing: ");
		// String s = scan.next();) while (!s.equals(f));

=======
		//game to be set up;
		System.out.print("Enter a value: ");
		int x = scan.nextInt();
		System.out.print("Enter another value: ");
		int y = scan.nextInt();
		Ocean oc = new Ocean();
		oc.print();
		//method to accept shots;
		//Display results;
		//Print final score;
		//all this in a do ( System.out.print("Enter f to stop playing: ");
		//String s = scan.next();) while (!s.equals(f));
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
		scan.close();
	}

	public static int getValue(Scanner sc, String a) {
		System.out.print(a);
		return sc.nextInt();
	}

}
