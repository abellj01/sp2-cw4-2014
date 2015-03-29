package battleshipAy;

import java.util.Random;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class Ocean {

	private Ship[][] ships = new Ship[10][10];
	private int shotsFired;
	private int hitCount;
	private int shipsSunk;

	public Ocean() {
		shotsFired = 0;
		hitCount = 0;
		shipsSunk = 0;
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
			}
		}

	}

	/**
	 * Places ships randomly in the ocean
	 */
	public void placeAllShipsRandomly() {

		Random rnd = new Random();
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
			if (j > 5 && j <= 9) {
				fleet[j] = new Submarine();
			}
		}

		for (Ship ship : fleet) {
			do {
				horizontal = rnd.nextBoolean();
				row = rnd.nextInt(10);
				column = rnd.nextInt(10);
				// totalShips++;
			} while (ship.okToPlaceShipAt(row, column, horizontal, this));

			ship.placeShipAt(row, column, horizontal, this);

		}

	}

	/**
	 * Checks if a square is free
	 * 
	 * @param row
	 * @param column
	 * @return true if the square is occupied or false otherwise
	 */
	public boolean isOccupied(int row, int column) {
		if (ships[row][column] != new EmptySea()
				&& (row >= 0 && row <= 9 && column >= 0 && column <= 9)) {
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
		Ship s = ships[row][column];
		if (isOccupied(row, column) && !s.isSunk()) {
			shotsFired++;
			hitCount++;
			if (s.isSunk()) {
				shipsSunk++;

			}
			return true;
		}

		shotsFired++;
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
	 * Checks the state of the game
	 * 
	 * @return true or false
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

	/**
	 * Simulates empty squares as the ocean
	 */
	void print() {
		System.out.print(" " + " ");
		for (int i = 0; i < 10; i++) {

			System.out.print(" " + i);
		}
		System.out.println();

		for (int i = 0; i < 10; i++) {
			System.out.print(i + " ");
			for (int j = 0; j < 10; j++) {
				// Initialises each square of the ocean
				ships[i][j] = new EmptySea();
				System.out.print(" " + ships[i][j]);
			}
			System.out.println();
		}
	}

}
