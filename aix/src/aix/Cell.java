package aix;

public class Cell {
	
	private Cell up, down, left, right;
	
	private boolean isOccupied;
	private Ant ant;
	private Resource resource;
	private int x, y;
	
	public Cell(int x, int y) {
		this.x = x;
		this.y = y;
		isOccupied = false;
	}
	
	public boolean isOccupied() {
		return isOccupied;
	}
	
	public void occupy(Ant a) {
		if (!isOccupied) {
			ant = a;
			ant.setCell(this);
			isOccupied = true;
		} else {
			throw new IllegalAccessError("Cell already populated.");
		}
	}
	
	public void removeAnt() {
		ant = null;
		isOccupied = false;
	}
	
	public Object getObject() {
		if (resource != null) {
			return resource;
		} else {
			return ant;
		}
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
