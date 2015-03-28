package battleshipAy;

public class Ship {

	private int bowRow;
	private int bowColumn;
	protected int length;

	private boolean horizontal;
	protected boolean[] hit;

	/**
	 * Accessor method for the first cell on the row
	 * 
	 * @return the bowRow
	 */
	public int getBowRow() {
		return bowRow;
	}

	/**
	 * Accessor method for the first cell on the column
	 * 
	 * @return the bowColumn
	 */
	public int getBowColumn() {
		return bowColumn;
	}

	/**
	 * Determines number of squares occupied by the ship
	 * 
	 * @return the length
	 */
	public int getLength() {
		return length;
	}

	/**
	 * Determines state of ship ie vertical or horizontal
	 * 
	 * @return true
	 */
	public boolean isHorizontal() {
		return horizontal;
	}

	/**
	 * Determines the type of ship
	 * 
	 * @return an empty string
	 */
	public String getShipType() {
		return "";
	}

	/**
	 * Sets value for first cell in row
	 * 
	 * @param row
	 */
	public void setBowRow(int row) {
		bowRow = row;
	}

	/**
	 * Sets value for first cell in column
	 * 
	 * @param column
	 */
	public void setBowColumn(int column) {
		bowColumn = column;
	}

	/**
	 * Sets position of the ship
	 * 
	 * @param horizontal
	 */
	public void setHorizontal(boolean horizontal) {
		this.horizontal = horizontal;
	}

	public boolean okToPlaceShipAt(int row, int column, boolean horizontal,
			Ocean ocean) {
		if (bowRow == row && bowColumn == column && isHorizontal()) {
			return true;
		}
		return false;
	}

	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
<<<<<<< HEAD
		if (okToPlaceShipAt(row, column, horizontal, ocean)) {
			setBowRow(row);
			setBowColumn(column);
			setHorizontal(horizontal);
		}
=======
		bowRow = row;
		bowColumn = column;
		horizontal = true;
>>>>>>> 4fde76f9b333c0060944f764528f210f66494ea2

	}

	public boolean shootAt(int row, int column) {
		return false;

	}

	public boolean isSunk() {
		return false;

	}

}
