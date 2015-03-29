package battleshipAy;

import java.util.Arrays;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class Cruiser extends Ship {

	public Cruiser() {
		length = 3;
		hit = new boolean[2];
		for (int i = 0; i < 3; i++) {
<<<<<<< HEAD
			hit[i] = false;
=======
			hit[i]= false;
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "This is a cruiser";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Cruiser [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

}
