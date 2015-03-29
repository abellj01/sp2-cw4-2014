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
public class OceanTest {

	
	@Test
	public void testShootAt() {
		Ocean oc = new Ocean();
		int column = 3;
		int row = 5;
		boolean a = oc.shootAt(5, 3);
		assertEquals(true, a);
	}

	@Test
<<<<<<< HEAD
	public void testIsOccupied() {
		Ocean oc = new Ocean();
		int column = 4;
		int row = 2;
		boolean f = oc.isOccupied(2, 4);
		assertEquals(true, f);
=======
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
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	}

	@Test
	public void testPlaceAllShipsRandomly() {
		Ocean oc = new Ocean();
<<<<<<< HEAD
		//oc.placeAllShipsRandomly();
=======
>>>>>>> cfeba341bf404498f1057745bd7a59bd6bb407b7
	}
}
