package battleshipAy;

import java.util.Scanner;

public class BattleshipGame {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
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
		scan.close();
	}

}
