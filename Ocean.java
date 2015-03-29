package battleshipAy;

import java.util.Random;

<<<<<<< HEAD
import org.hamcrest.core.IsSame;

=======
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
/**
 * @author abellj01
 *
 */
public class Ocean {

	private Ship[][] ships;
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	public Ocean() {
		ships = new Ship[10][10];
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;

	}

	public void placeAllShipsRandomly() {

		Random rnd = new Random();
		int totalShips = 0;
		int numBattleship = 0;
		int numCruiser = 0;
		int numDestroyer = 0;
		int numSubmarine = 0;

	}

	public boolean isOccupied(int row, int column) {
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea() && (row>=0 && row<=9 && column>=0 && column<=9)) {
=======
<<<<<<< HEAD
		if (ships[row][column] != new EmptySea()) {
=======
		if(ships[row][column] != null){
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
			return true;
		}
		return false;

	}

	public boolean shootAt(int row, int column) {
<<<<<<< HEAD
		Ship s = ships[row][column];
		if (isOccupied(row, column) && !s.isSunk()) {
			shotsFired++;
			hitCount++;
			if(s.isSunk()){
				shipsSunk ++;
				
			}
			return true;
		}

		shotsFired++;
=======
		if (isOccupied(row, column)){
			shotsFired ++;
			hitCount ++;
			return true;
		}
		shotsFired ++;
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
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
	 * @return
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
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
		for (int i = 0; i < 10; i++) {
			//System.out.print(" ");
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
			System.out.print(" " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
<<<<<<< HEAD
=======
=======

		for (int i = 0; i < 10; i++) {
			//System.out.println(i);
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
