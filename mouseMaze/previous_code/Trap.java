package mouseMaze.previous_code;

import mouseMaze.interfaces.MouseTrapInterface;

import java.util.ArrayList;

public class Trap implements MouseTrapInterface {
	ArrayList<Mouse> deadList;
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
			Mouse.die();
			deadList.add(currentMouse.MouseMaze);
		}
		return true;
	}
	
	@Override
	public void disableTrap() {
		trapOn = false;
	}
	@Override
	public ArrayList<Mouse> returnTheDead() {
		return deadList;
	}
}
