package battleshipAy;

import java.util.Scanner;

public class BattleshipGame {

	public static void main(String[] args) {

		System.out.println("Welcome to the Battleship Game!");
		System.out.println("The aim is to sink a fleet of 10 ships.");
		System.out.println();

		Ocean oc = new Ocean();
		oc.print();

		System.out.println();
		Scanner scan = new Scanner(System.in);
<<<<<<< HEAD
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
