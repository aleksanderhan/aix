package aix;

import java.util.ArrayList;

public class World{
	
	private Cell[][] grid;
	private ArrayList<Ant> ants = new ArrayList<Ant>();
	
	public World(int n, int m) {
		grid = new Cell[n][m]; // Empty grid
		
		// Creating cells
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				grid[i][j] = new Cell(i, j);
			}
		}
		
		// Linking cells
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				if (i==0) {
					grid[i][j].setUp(null);
				} else {
					grid[i][j].setUp(grid[i-1][j]);
				}
				if (i==n-1) {
					grid[i][j].setDown(null);
				} else {
					grid[i][j].setDown(grid[i+1][j]);
				}
				if (j==0) {
					grid[i][j].setLeft(null);
				} else {
					grid[i][j].setLeft(grid[i][j-1]);
				}
				if (j==m-1) {
					grid[i][j].setRight(null);
				} else {
					grid[i][j].setRight(grid[i][j+1]);
				}
				if (i==0 || j==0) {
					grid[i][j].setUpLeft(null);
				} else {
					grid[i][j].setUpLeft(grid[i-1][j-1]);
				}
				if (i==0 || j==m-1) {
					grid[i][j].setUpRight(null);
				} else {
					grid[i][j].setUpRight(grid[i-1][j+1]);
				}
				if (i==n-1 || j==0) {
					grid[i][j].setDownLeft(null);
				} else {
					grid[i][j].setDownLeft(grid[i+1][j-1]);
				}
				if (i==n-1 || j==m-1) {
					grid[i][j].setDownRight(null);
				} else {
					grid[i][j].setDownRight(grid[i+1][j+1]);
				}
			}
		}
	}
	
	// Advance the world one step into the future
	public void advance() {
		for (Ant a : ants) {
			a.getFutureAction().perform();
			a.decideNextAction();
		}		
	}

	// Adds an ant at position (x, y)
	public void addAnt(int x, int y) {
		try {
			Ant a = new Ant();
			ants.add(a);
			grid[x][y].occupy(a);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// Prints a representation of the world to terminal 
	public void printGrid() {
		for (int i=0; i<grid.length; i++) {
			for (int j=0; j<grid[0].length; j++) {
				System.out.print(grid[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
