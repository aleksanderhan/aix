package aix.actions;

import aix.Ant;
import aix.Cell;

public class MoveUp extends Intent implements Action {
	
	public MoveUp(Ant ant) {
		super(ant);
	}
	
	@Override
	public boolean canPerform() {
		Cell nextCell = ant.getCell().getUp();
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
			Cell nextCell = currentCell.getUp();
			nextCell.occupy(ant);
			ant.setCell(nextCell);
		}
	}

}
