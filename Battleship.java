package battleshipAy;

import java.util.Arrays;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class Battleship extends Ship {

	public Battleship() {
		length = 4;
		hit = new boolean[3];
		for (int i = 0; i < 4; i++) {
			hit[i] = false;
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Battleship [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "This is a battleship";
	}

}
