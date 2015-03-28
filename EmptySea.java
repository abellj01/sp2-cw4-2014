package battleshipAy;

import java.util.Arrays;

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
<<<<<<< HEAD
		// It will be used to initialise cells in ocean
		return ".";
=======
		//It will be used to initialise cells in ocean 
		return "0";
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
	}

}
