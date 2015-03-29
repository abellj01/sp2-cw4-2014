package battleshipAy;

public class Ship {

	private int bowRow;
	private int bowColumn;
	protected int length;

	private boolean horizontal = true;
	protected boolean[] hit = new boolean[4];

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
		if (row >=0 && row <=9){
			bowRow = row;
		}
		bowRow = 0;
	}

	/**
	 * Sets value for first cell in column
	 * 
	 * @param column
	 */
	public void setBowColumn(int column) {
		if (column >=0 && column <=9){
			bowColumn = column;
		}
		bowColumn = 0;
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
		if (row >=0 && row <=9 && column >=0 && (column + length <=9) && isHorizontal()) {
			return true;
		} else if (row >=0 && (row + length<=9) && column >=0 && column <=9 && !isHorizontal()){
			return true;
		} else {
			return false;
		}
		
	}

	public void placeShipAt(int row, int column, boolean horizontal, Ocean ocean) {
		if (okToPlaceShipAt(row, column, horizontal, ocean)) {
			setBowRow(row);
			setBowColumn(column);
			setHorizontal(horizontal);
		}

	}

	public boolean shootAt(int row, int column) {
		return false;

	}

	public boolean isSunk() {
		return false;

	}

}
