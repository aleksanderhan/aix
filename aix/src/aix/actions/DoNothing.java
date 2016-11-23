package aix.actions;

import aix.Ant;

public class DoNothing extends Intent implements Action {
	
	public DoNothing(Ant ant) {
		super(ant);
	}

	@Override
	public void perform() {
		
	}

	@Override
	public boolean canPerform() {
		return true;
	}

}
