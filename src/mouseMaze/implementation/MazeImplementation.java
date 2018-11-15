package mouseMaze.implementation;

import mouseMaze.interfaces.MazeInterface;

public class MazeImplementation implements MazeInterface {
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
		return false;
	}

	@Override
	public void displayStatistics() {

	}
}
