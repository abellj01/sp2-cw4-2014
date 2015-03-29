package battleshipAy;

import java.util.Random;

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
 */
public class Ocean {

	private Ship[][] ships = new Ship[10][10];
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	public Ocean() {
<<<<<<< HEAD
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
			}
		}
=======
		ships = new Ship[10][10];
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea

	}

	public void placeAllShipsRandomly() {

		Random rnd = new Random();
<<<<<<< HEAD
		int row = 0;
		int column = 0;
		boolean horizontal = false;

		int totalShips = 0;
		

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
			if (j > 5 && j<=9) {
				fleet[j] = new Submarine();
			}
		}

		for (Ship ship : fleet) {
			do {
				horizontal = rnd.nextBoolean();
				row = rnd.nextInt(10);
				column = rnd.nextInt(10);
				//totalShips++;
			} while (!ship.okToPlaceShipAt(row, column, horizontal, this));

			ship.placeShipAt(row, column, horizontal, this);

		}
=======
		int totalShips = 0;
		int numBattleship = 0;
		int numCruiser = 0;
		int numDestroyer = 0;
		int numSubmarine = 0;
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea

	}

	public boolean isOccupied(int row, int column) {
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
			return true;
		}
		return false;

	}

	public boolean shootAt(int row, int column) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
		Ship s = ships[row][column];
		if (isOccupied(row, column) && !s.isSunk()) {
			shotsFired++;
			hitCount++;
<<<<<<< HEAD
			if (s.isSunk()) {
				shipsSunk++;

=======
			if(s.isSunk()){
				shipsSunk ++;
				
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
			}
			return true;
		}

		shotsFired++;
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
	 * @return
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
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
			System.out.print(" " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
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
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
