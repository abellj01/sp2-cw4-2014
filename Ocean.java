package battleshipAy;

import java.util.Random;

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
		if (ships[row][column] != new EmptySea()) {
=======
		if(ships[row][column] != null){
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
			return true;
		}
		return false;

	}

	public boolean shootAt(int row, int column) {
		if (isOccupied(row, column)){
			shotsFired ++;
			hitCount ++;
			return true;
		}
		shotsFired ++;
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
	 * @return
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
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
		for (int i = 0; i < 10; i++) {
			//System.out.print(" ");
			System.out.print(" " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
=======

		for (int i = 0; i < 10; i++) {
			//System.out.println(i);
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
