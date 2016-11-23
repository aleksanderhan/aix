package aix;

import java.util.Random;

import aix.actions.Action;
import aix.actions.MoveDown;
import aix.actions.MoveLeft;
import aix.actions.MoveRight;
import aix.actions.MoveUp;

public class Ant {
	
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
		int rndInt = rnd.nextInt(4);
		if (rndInt == 0) {
			return new MoveUp(this);
		} else if (rndInt == 1) {
			return new MoveDown(this);
		} else if (rndInt == 2) {
			return new MoveLeft(this);
		} else {
			return new MoveRight(this);
		}
		
	}
	
	public void setCell(Cell c) {
		cell = c;
	}
	
	public Cell getCell() {
		return cell;
	}
}
