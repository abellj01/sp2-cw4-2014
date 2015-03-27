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

	}

	public boolean isOccupied(int row, int column) {
		if(ships[row][column] != null){
			return true;
		}
		return false;

	}

	public boolean shootAt(int row, int column) {
		return false;

	}

	/**
	 * @return the shotsFired
	 */
	public int getShotsFired() {
		return shotsFired;
	}

	/**
	 * @return the hitCount
	 */
	public int getHitCount() {
		return hitCount;
	}

	/**
	 * @return the shipsSunk
	 */
	public int getShipsSunk() {
		return shipsSunk;
	}

	/**
	 * @return
	 */
	public boolean isGameOver() {
		return false;

	}

	/**
	 * @return the ships
	 */
	public Ship[][] getShipArray() {
		return ships;
	}

	void print() {

		for (int i = 0; i < 10; i++) {
			//System.out.println(i);
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
