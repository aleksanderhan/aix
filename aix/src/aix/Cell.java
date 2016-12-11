package aix;

public class Cell {
	
	private Cell up, down, left, right;
	
	private boolean isOccupied;
	private OccupyingObject object;
	private int x, y;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		isOccupied = false;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public void occupy(OccupyingObject o) {
		if (!isOccupied) {
			object = o;
			object.setCell(this);
			isOccupied = true;
		} else {
			throw new IllegalAccessError("Cell already populated.");
		}
	}
	
	public void removeObject() {
		object = null;
		isOccupied = false;
	}
	
	public OccupyingObject getObject() {
		return object;
	}
	
	public String toString() {
		if (isOccupied) {
			return "X";
		} else {
			return ".";
		}
	}
	
	public Cell getUp() {
		return up;
	}
	
	public Cell getDown() {
		return down;
	}
	
	public Cell getLeft() {
		return left;
	}
	
	public Cell getRight() {
		return right;
	}
	
	public void setUp(Cell up) {
		this.up = up;
	}
	
	public void setDown(Cell down) {
		this.down = down;
	}
	
	public void setRight(Cell right) {
		this.right = right;
	}
	
	public void setLeft(Cell left) {
		this.left = left;
	}
}
