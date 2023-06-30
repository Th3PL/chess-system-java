package boardgame;

public class Position {
	private int row, column;

	public Position(int row, int columm) {
		this.row = row;
		this.column = column;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getColumn() {
		return column;
	}

	public void setColumn(int colum) {
		this.column = colum;
	}
	
	@Override 
	public String toString() {
		return row + ", " + column;
	}
	
}
