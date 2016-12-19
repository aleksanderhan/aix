package aix;

public class Cell {
	
	private Cell up, down, left, right, upLeft, upRight, downLeft, downRight;
	
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
			if (object.getType().equals("ant")) {
				return "X";
			} else if (object.getType().equals("resource")) {
				return "R";
			} else {
				return null;
			}
		} else {
			return ".";
		}
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
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
	
	public Cell getUpLeft() {
		return upLeft;
	}
	
	public Cell getUpRight() {
		return upRight;
	}
	
	public Cell getDownLeft() {
		return downLeft;
	}
	
	public Cell getDownRight() {
		return downRight;
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
	
	public void setUpLeft(Cell upLeft) {
		this.upLeft = upLeft;
	}
	
	public void setUpRight(Cell upRight) {
		this.upRight = upRight;
	}
	
	public void setDownLeft(Cell downLeft) {
		this.downLeft = downLeft;
	}
	
	public void setDownRight(Cell downRight) {
		this.downRight = downRight;
	}
	
}
