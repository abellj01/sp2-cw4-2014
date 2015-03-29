package battleshipAy;

import java.util.Random;

<<<<<<< HEAD
/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
import org.hamcrest.core.IsSame;

=======
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
/**
 * @author abellj01
 *
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
 */
public class Ocean {

	private Ship[][] ships = new Ship[10][10];
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	public Ocean() {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
			}
		}
<<<<<<< HEAD
=======
=======
		ships = new Ship[10][10];
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7

	}

	/**
	 * Places ships randomly in the ocean
	 */
	public void placeAllShipsRandomly() {

		Random rnd = new Random();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
		int row = 0;
		int column = 0;
		boolean horizontal = false;

		int totalShips = 0;
<<<<<<< HEAD
=======
		
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7

		Ship[] fleet = new Ship[10];
		for (int j = 0; j < fleet.length; j++) {
			if (j == 0) {
				fleet[j] = new Battleship();
			}
			if (j == 1 || j == 2) {
				fleet[j] = new Cruiser();
			}
			if (j >= 3 && j <= 5) {
				fleet[j] = new Destroyer();
			}
<<<<<<< HEAD
			if (j > 5 && j <= 9) {
=======
			if (j > 5 && j<=9) {
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
				fleet[j] = new Submarine();
			}
		}

		for (Ship ship : fleet) {
			do {
				horizontal = rnd.nextBoolean();
				row = rnd.nextInt(10);
				column = rnd.nextInt(10);
<<<<<<< HEAD
				// totalShips++;
			} while (ship.okToPlaceShipAt(row, column, horizontal, this));
=======
				//totalShips++;
			} while (!ship.okToPlaceShipAt(row, column, horizontal, this));
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7

			ship.placeShipAt(row, column, horizontal, this);

		}
<<<<<<< HEAD
=======
=======
		int totalShips = 0;
		int numBattleship = 0;
		int numCruiser = 0;
		int numDestroyer = 0;
		int numSubmarine = 0;
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7

	}

	/**
	 * Checks if a square is free
	 * 
	 * @param row
	 * @param column
	 * @return true if the square is occupied or false otherwise
	 */
	public boolean isOccupied(int row, int column) {
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea()
				&& (row >= 0 && row <= 9 && column >= 0 && column <= 9)) {
=======
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea()
				&& (row >= 0 && row <= 9 && column >= 0 && column <= 9)) {
=======
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea() && (row>=0 && row<=9 && column>=0 && column<=9)) {
=======
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea()) {
=======
		if(ships[row][column] != null){
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
			return true;
		}
		return false;

	}

	/**
	 * Checks if a square has been hit
	 * 
	 * @param row
	 * @param column
	 * @return true if the occupied square is hit or false otherwise
	 */
	public boolean shootAt(int row, int column) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
		Ship s = ships[row][column];
		if (isOccupied(row, column) && !s.isSunk()) {
			shotsFired++;
			hitCount++;
<<<<<<< HEAD
			if (s.isSunk()) {
				shipsSunk++;

=======
<<<<<<< HEAD
			if (s.isSunk()) {
				shipsSunk++;

=======
			if(s.isSunk()){
				shipsSunk ++;
				
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
			}
			return true;
		}

		shotsFired++;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======
		if (isOccupied(row, column)){
			shotsFired ++;
			hitCount ++;
			return true;
		}
		shotsFired ++;
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
		return false;

	}

	/**
	 * Counts how many shots fired
	 * 
	 * @return shotsFired
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * Counts how many successful hits
	 * 
	 * @return hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * Counts number of ships sunk
	 * 
	 * @return shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}

	/**
<<<<<<< HEAD
	 * Checks the state of the game
	 * 
	 * @return true or false
=======
<<<<<<< HEAD
	 * Checks the state of the game
	 * 
	 * @return true or false
=======
<<<<<<< HEAD
	 * Checks the state of the game
	 * 
	 * @return true or false
=======
<<<<<<< HEAD
	 * Checks the state of the game
	 * 
	 * @return true or false
=======
	 * @return
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	 */
	public boolean isGameOver() {
		if (shipsSunk == 10) {
			return true;
		}
		return false;

	}

	/**
	 * Helps set up the ocean
	 * 
	 * @return array of ships
	 */
	public Ship[][] getShipArray() {
		return ships;
	}

<<<<<<< HEAD
	/**
	 * Simulates empty squares as the ocean
	 */
	void print() {
		System.out.print(" " + " ");
		for (int i = 0; i < 10; i++) {

=======
	void print() {
<<<<<<< HEAD
		System.out.print(" " + " ");
		for (int i = 0; i < 10; i++) {

=======
<<<<<<< HEAD
		System.out.print(" " + " ");
		for (int i = 0; i < 10; i++) {

=======
<<<<<<< HEAD
		for (int i = 0; i < 10; i++) {
			//System.out.print(" ");
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
			System.out.print(" " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
=======

		for (int i = 0; i < 10; i++) {
			//System.out.println(i);
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
