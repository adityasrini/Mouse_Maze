package mouseMaze.previous_code;

public class Cell {
	Hole currentHole = null;
	Trap currentTrap = null;

Cell () {
	
}

	public boolean getTrap () {
		if (currentTrap == null) return false;
		else return true;
	}

	public boolean getHole () {
		if (currentHole == null) return false;
		else return true;
	}
	
	public void setTrap (Trap pCurrentTrap) {
		Trap currentTrap = pCurrentTrap;
	}
	public void setHole (Hole pCurrentHole) {
		Hole currentHole = pCurrentHole;
	}
}