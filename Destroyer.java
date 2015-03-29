package battleshipAy;

import java.util.Arrays;
/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class Destroyer extends Ship {

	public Destroyer() {

		length = 2;
		hit = new boolean[1];
		for (int i = 0; i < 2; i++) {
			hit[i]= false;
		}

	}
	
	/* (non-Javadoc)
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "This is a destroyer";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Destroyer [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

	
	
	

}
