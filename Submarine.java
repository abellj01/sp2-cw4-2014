package battleshipAy;

import java.util.Arrays;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class Submarine extends Ship {

	public Submarine() {

		length = 1;
		hit = new boolean[0];
<<<<<<< HEAD
		for (int i = 0; i < hit.length; i++) {
			hit[i] = false;
		}

=======
		for (int i=0; i<hit.length; i++){
			hit[i] = false;
		}
	
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "This is a submarine";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Submarine [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

}
