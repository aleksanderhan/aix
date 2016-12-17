package aix.actions;

import aix.Ant;
import aix.Cell;

public class MoveLeft extends Intent implements Action {

	public MoveLeft(Ant ant) {
		super(ant);
	}
	
	@Override
	public boolean canPerform() {
		Cell nextCell = ant.getCell().getLeft();
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
			Cell nextCell = currentCell.getLeft();
			nextCell.occupy(ant);
			ant.setCell(nextCell);	
		}
	}

}
