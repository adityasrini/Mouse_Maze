package mouseMaze.previous_code;

import interfaces.MouseHoleInterface;

public class Hole implements MouseHoleInterface {

public Hole () {
}

@Override
public int[] tryHole() {
	int [] outcome = null;
	int isEscaped = (int)(Math.random() * 9);
	if (isEscaped == 0) {
		outcome [0] = -1;
		outcome [1] = -1;
		return outcome;
		}
	else {
		int randomHole = (int)(Math.random() * (Maze.holeList.size()-1));
		return Maze.holeList.get(randomHole);
	}
}
}