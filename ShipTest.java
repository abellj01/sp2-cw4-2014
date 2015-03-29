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
	public void testOkToPlaceShipAt() {
		Ship ship = new Ship();
		Ocean ocean = null;
		int column = 0;
		boolean horizontal = false;
		int row = 0;
		ship.okToPlaceShipAt(row, column, horizontal, ocean);

	}

	@Test
	public void test() {
		Ship ship = new Ship();
		Ocean ocean = null;
		int column = 0;
		boolean horizontal = false;
		int row = 0;
		ship.okToPlaceShipAt(row, column, horizontal, ocean);
<<<<<<< HEAD
		ship.placeShipAt(row, column, horizontal, ocean);
		ship.shootAt(row, column);
		ship.isSunk();
=======
<<<<<<< HEAD
		ship.placeShipAt(row, column, horizontal, ocean);
		ship.shootAt(row, column);
		ship.isSunk();
=======
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2
>>>>>>> 6bc314e0e714e71fed341c6fc0db64b4f9f7decf
	}

}
