package aix.actions;

import aix.Ant;
import aix.Cell;

public class MoveRight extends Intent implements Action {
	
	public MoveRight(Ant ant) {
		super(ant);
	}
	
	@Override
	public boolean canPerform() {
		Cell nextCell = ant.getCell().getRight();
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
			Cell nextCell = currentCell.getRight();
			nextCell.occupy(ant);
			ant.setCell(nextCell);	
		}
	}

}
