package mouseMaze.implementation;

import mouseMaze.interfaces.MazeInterface;

import java.util.ArrayList;
import java.util.List;

public class MazeImplementation implements MazeInterface {
	private int length = 0;
	private int width = 0;
	private int numTraps=0;
	private int numHoles=0;
	private List<int[]> mazeMatrix;
	
	@Override
	public void startMouse(Mouse currentMouse) {
		currentMouse.setCurrentPosition(new int[] {0,0});
	}

	@Override
	public int moveMouse(Mouse currentMouse) {
		return 0;
	}

	@Override
	public boolean createMaze() {
		length = 10;
		width = 10;
		
		numTraps = length * width /4;
		numHoles = numTraps;
		
		mazeMatrix = new ArrayList<>(length*width);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				mazeMatrix.add(new int[] {i,j});
			}
		}
		
		return true;
	}

	@Override
	public void displayStatistics() {

	}
}
