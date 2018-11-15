package mouseMaze.implementation;

import mouseMaze.interfaces.MouseInterface;

import java.util.Random;

public class Mouse implements MouseInterface {

	private int[] currentPosition;
	private boolean alive;

	public Mouse() {
		alive = true;
	}

	@Override
	public int[] move() {

		Random random = new Random();
		currentPosition[0] += random.nextInt(2 + 1) - 1;
		currentPosition[1] += random.nextInt(2 + 1) - 1;

		return currentPosition;
	}

	@Override
	public void die() {
		alive = false;
	}

	@Override
	public boolean isAlive() {
		return alive;
	}

	public void setCurrentPosition(int[] currentPosition) {
		this.currentPosition = currentPosition;
	}
}