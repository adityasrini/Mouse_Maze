package mouseMaze.previous_code;

import mouseMaze.interfaces.MouseInterface;
import mouseMaze.interfaces.MouseTrapInterface;

import java.util.ArrayList;

public class Trap implements MouseTrapInterface {
	ArrayList<MouseInterface> deadList;
	boolean trapOn = false;
	
public Trap () {
		
	}
	
	@Override
	public void setTrap() {
		trapOn = true;
	}
	
	public boolean springTrap() {
		disableTrap();
		int trapFailed = (int)(Math.random() * 9);
		if (trapFailed == 0) return false;
		else {
			Mouse currentMouse = new Mouse();
			currentMouse.die();
			deadList.add(currentMouse);
		}
		return true;
	}
	
	@Override
	public void disableTrap() {
		trapOn = false;
	}
	@Override
	public ArrayList<MouseInterface> returnTheDead() {
		return deadList;
	}
}
