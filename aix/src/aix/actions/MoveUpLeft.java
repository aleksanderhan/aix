package aix.actions;

import aix.Ant;
import aix.Cell;

public class MoveUpLeft extends Intent implements Action {
	
	public MoveUpLeft(Ant ant) {
		super(ant);
	}
	
	@Override
	public boolean canPerform() {
		Cell nextCell = ant.getCell().getUpLeft();
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
			currentCell.removeObject();
			Cell nextCell = currentCell.getUpLeft();
			nextCell.occupy(ant);
			ant.setCell(nextCell);
		}
	}

}