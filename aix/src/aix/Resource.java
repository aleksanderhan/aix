package aix;

public class Resource {
	
	private int amount;
	
	public Resource(int amount) {
		this.amount = amount;
	}
	
	public int take(int n) {
		amount -= n;
		return n;
	}

}
