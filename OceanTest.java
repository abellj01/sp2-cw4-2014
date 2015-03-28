/**
 * 
 */
package battleshipAy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author abellj01
 *
 */
public class OceanTest {

	@Test
	public void testShootAt() {
		Ocean oc = new Ocean();
		int column = 0;
		int row = 0;
		oc.shootAt(row, column);
	}
	
	@Test
	public void testIsOccupied() {
		Ocean oc = new Ocean();
		int column = 0;
		int row = 0;
		oc.isOccupied(row, column);
	}

	@Test
	public void testPlaceAllShipsRandomly() {
		Ocean oc = new Ocean();
	}
}
