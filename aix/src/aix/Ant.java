package aix;

import java.util.Random;

import aix.actions.*;

public class Ant implements OccupyingObject {
	
	private Action futureAction;
	private Cell cell;

	public Ant() {
		futureAction = randomMovement();
	}
	
	public Action getFutureAction() {
		return futureAction;
	}
	
	public void decideNextAction() {
		futureAction = randomMovement();
	}
	
	public Action randomMovement() {
		Random rnd = new Random();
		int rndInt = rnd.nextInt(8);
		if (rndInt == 0) {
			return new MoveUp(this);
		} else if (rndInt == 1) {
			return new MoveDown(this);
		} else if (rndInt == 2) {
			return new MoveLeft(this);
		} else if (rndInt == 3){
			return new MoveRight(this);
		} else if (rndInt == 4) {
			return new MoveUpRight(this);
		} else if (rndInt == 5) {
			return new MoveUpLeft(this);
		} else if (rndInt == 6) {
			return new MoveDownRight(this);
		} else {
			return new MoveDownLeft(this);
		}
	}
	
	public void setCell(Cell c) {
		cell = c;
	}
	
	public Cell getCell() {
		return cell;
	}
	
	public String getType() {
		return "ant";
	}

}
