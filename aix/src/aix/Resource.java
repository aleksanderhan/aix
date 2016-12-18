package aix;

public class Resource implements OccupyingObject {
	
	private int amount;
	private Cell cell;
	
	public Resource(int amount) {
		this.amount = amount;
	}
	
	public int take(int n) {
		if (amount - n >= 0) {
			amount -= n;
			return n;
		} else {
			return amount;
		}
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
