package aix;

public class Game {
	
	private World world;
	
	public Game(World world) {
		this.world = world;
	}
	
	public void run() {
		world.addAnt(5, 5);
		world.addAnt(1, 1);
		int T = 10; // Do 10 time steps
		for (int t=0; t<T; t++) {
			world.advance();
		}
		world.printGrid();
	}

	public static void main(String[] args) {
		Game game = new Game(new World(11, 11));
		game.run();
		
	}
}
