package mouseMaze;

import interfaces.MouseInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MouseImpl implements MouseInterface {
	private List<int[]> moveList = new ArrayList<>();

	private int[] currentPosition = {0, 0};
	private boolean alive;

	public MouseImpl() {
		alive = true;
	}

	@Override
	public int[] move() {

		Random random = new Random();
		currentPosition[0] += random.nextInt(2 + 1) - 1;
		currentPosition[1] += random.nextInt(2 + 1) - 1;
		moveList.add(currentPosition);

		return currentPosition;
	}

	@Override
	public void die() {
		currentPosition[0] = 0;
		currentPosition[1] = 0;
		alive = false;
	}

	@Override
	public boolean isAlive() {
		return alive;
	}

	public List<int[]> getMoveList() {
		return moveList;
	}
}