package boardgame;

public class Board {
	
	private Integer rows;
	private Integer columns;
	private Piece[][] pieces;
	
	public Board(Integer rows, Integer columns) {
		this.rows = rows;
		this.columns = columns;
		pieces = new Piece[rows][columns];
	}

	private Integer getRows() {
		return rows;
	}

	private void setRows(Integer rows) {
		this.rows = rows;
	}

	private Integer getColumns() {
		return columns;
	}

	private void setColumns(Integer columns) {
		this.columns = columns;
	}

}
