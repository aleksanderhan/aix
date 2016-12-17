package aix;

public class Game {
	
	private World world;
	
	public Game(World world) {
		this.world = world;
	}
	
	public void run() {
		world.addAnt(0, 1);
		world.addAnt(1, 0);
		int T = 20; // Do 10 time steps
		for (int t=0; t<T; t++) {
			world.advance();
		}
		world.printGrid();
	}

	public static void main(String[] args) {
		Game game = new Game(new World(20, 20));
		game.run();		
	}
}
