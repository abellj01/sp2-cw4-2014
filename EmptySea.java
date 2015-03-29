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
<<<<<<< HEAD
		// It will be used to initialise cells in ocean
		return ".";
=======
<<<<<<< HEAD
		// It will be used to initialise cells in ocean
		return ".";
=======
<<<<<<< HEAD
		// It will be used to initialise cells in ocean
		return ".";
=======
<<<<<<< HEAD
		// It will be used to initialise cells in ocean
		return ".";
=======
		//It will be used to initialise cells in ocean 
		return "0";
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	}

}
