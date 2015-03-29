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
<<<<<<< HEAD
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
=======
	public void test() {
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
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
>>>>>>> 56d2bf00300e6b8c92a9c129fd2bfcbd7b1aacea
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	}

}
