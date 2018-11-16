package mouseMaze.implementation;

import mouseMaze.interfaces.MazeInterface;

import java.util.*;

public class MazeImplementation implements MazeInterface {
	private int length = 0;
	private int width = 0;
	private int numTraps = 0;
	private int numHoles = 0;
	private List<int[]> mazeMatrix;
	private Set<int[]> trapCoordinates;
	private Set<int[]> holeCoordinates;

	@Override
	public void startMouse(Mouse currentMouse) {
		currentMouse.setCurrentPosition(new int[]{0, 0});
	}

	@Override
	public int moveMouse(Mouse currentMouse) {
		int[] position = currentMouse.move();
		System.out.printf("%d %d\n", position[0], position[1]);
		if (position == new int[]{length, width}) {
			return 1;
		} else if (mazeMatrix.stream().anyMatch(coordinate -> Arrays.equals(coordinate,position)))
			return 0;
		else if (trapCoordinates.stream().anyMatch(coordinate -> Arrays.equals(coordinate,position)))
			return - 1;
		else return 2;
	}

	@Override
	public boolean createMaze() {
		length = 10;
		width = 10;

		numTraps = length * width / 4;
		numHoles = numTraps;

		mazeMatrix = new ArrayList<>(length * width);
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				mazeMatrix.add(new int[]{i, j});
			}
		}

		Random random = new Random();
		trapCoordinates = new HashSet<>(numTraps);
		holeCoordinates = new HashSet<>(numHoles);
		for (int i = 0; i < numHoles; ) {
			if (holeCoordinates.add(new int[]{random.nextInt(length), random.nextInt(width)})) {
				i++;
			}
		}

		for (int i = 0; i < numTraps; ) {
			if (trapCoordinates.add(new int[]{random.nextInt(length), random.nextInt(width)})) {
				i++;
			}
		}


		return true;
	}

	@Override
	public void displayStatistics() {

	}
}
