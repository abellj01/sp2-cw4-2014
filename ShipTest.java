/**
 * 
 */
package battleshipAy;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This program simulates a battle ship game
 * 
 * @author AbJr
 * @version 290315
 */
public class ShipTest {

	@Test
	public void testOkToPlaceShipAt() {
		Ship ship = new Ship();
		Ocean ocean = null;
		int column = 0;
		boolean horizontal = false;
		int row = 0;
		ship.okToPlaceShipAt(row, column, horizontal, ocean);

	}

	@Test
	public void testPlaceShipAt() {
		Ship ship = new Ship();
		Ocean ocean = null;
		int column = 0;
		boolean horizontal = false;
		int row = 0;
		ship.okToPlaceShipAt(row, column, horizontal, ocean);

	}
	
	@Test
	public void testShootAt() {
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
