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
public class ShipTest {

	@Test
	public void test() {
		Ship ship = new Ship();
		Ocean ocean = null;
		int column = 0;
		boolean horizontal = false;
		int row = 0;
		ship.okToPlaceShipAt(row, column, horizontal, ocean);
		ship.placeShipAt(row, column, horizontal, ocean);
		ship.shootAt(row, column);
		ship.isSunk();
	}

}
