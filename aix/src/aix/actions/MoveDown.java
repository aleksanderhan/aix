package aix.actions;

import aix.Ant;
import aix.Cell;

public class MoveDown extends Intent implements Action {
	
	public MoveDown(Ant ant) {
		super(ant);
	}
	
	@Override
	public boolean canPerform() {
		Cell nextCell = ant.getCell().getDown();
		if (nextCell == null) {
			return false;
		} else if (nextCell.isOccupied()){
			return false;
		} else {
			return true;
		}
	}

	@Override
	public void perform() {
		if (canPerform()) {
			Cell currentCell = ant.getCell();
			currentCell.removeAnt();
			Cell nextCell = currentCell.getDown();
			nextCell.occupy(ant);
			ant.setCell(nextCell);
		}
	}

}
