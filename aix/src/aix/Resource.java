package aix;

public class Resource implements OccupyingObject {
	
	private int amount;
	private Cell cell;
	
	public Resource(int amount) {
		this.amount = amount;
	}
	
	public int take(int n) {
		amount -= n;
		return n;
	}
	
	public void setCell(Cell c) {
		cell = c;
	}
	
	public Cell getCell() {
		return cell;
	}
	
	public String getType() {
		return "resource";
	}

}
