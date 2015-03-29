package battleshipAy;

import java.util.Arrays;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class EmptySea extends Ship {

	public EmptySea() {
		length = 1;

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#shootAt(int, int)
	 */
	@Override
	public boolean shootAt(int row, int column) {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#isSunk()
	 */
	@Override
	public boolean isSunk() {
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		// It will be used to initialise cells in ocean
		return ".";
	}

}
