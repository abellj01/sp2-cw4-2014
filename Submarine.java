package battleshipAy;

import java.util.Arrays;

public class Submarine extends Ship {

	public Submarine() {

		length = 1;
		hit = new boolean[0];
		for (int i=0; i<hit.length; i++){
			hit[i] = false;
		}
	
	}
	
	/* (non-Javadoc)
	 * @see battleshipAy.Ship#getShipType()
	 */
	@Override
	public String getShipType() {
		return "This is a submarine";
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Submarine [length=" + length + ", hit=" + Arrays.toString(hit)
				+ "]";
	}
	
	
	
	

}

