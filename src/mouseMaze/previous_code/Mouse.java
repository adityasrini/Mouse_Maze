package mouseMaze.previous_code;

import interfaces.MouseInterface;

import java.util.ArrayList;

public class Mouse implements MouseInterface {
	int startX = 0;
	int startY = 0;
	public static ArrayList<int[]> moveList = new ArrayList<int[]>();
	public static int [] currentPosition = {0,0};
	boolean alive = true;
	
	Mouse () {
	}

	@Override
	public int[] move() {
//   1 | 2 | 3
//	---+---+---
//	 0 | x | 4	
//  ---+---+---
//	 7 | 6 | 5
		int [] position = null;
		int rand1 = (int)(Math.random() * 7);
		switch (rand1) {
		case 0:	
			position = new int [] {-1,0};
			break;
		case 1:
			position = new int [] {-1,-1};
			break;
		case 2:
			position = new int [] {0,-1};
			break;
		case 3:
			position = new int [] {+1,-1};
			break;
		case 4:
			position = new int [] {+1,0};
			break;
		case 5:
			position = new int [] {+1,+1};
			break;
		case 6:
			position = new int [] {0,+1};
			break;
		case 7:
			position = new int [] {-1,-1};
			break;
		}
		return position;
	}

	public void die() {
		alive = false;
		}
	
	@Override
	public boolean isAlive() {
		return alive;
	}
}