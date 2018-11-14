package mouseMaze.previous_code;

import java.util.Scanner;

public class MouseMaze {
	static Scanner keyboard = new Scanner(System.in);	
	public static int moveResult = 0;

	public static void main(String[] args) {
		boolean isSolved = false;
		boolean mazeExists = false;
		int moveAttempt = 0;
// generating maze		
		do {
		Maze box = new Maze();
		mazeExists = box.createMaze();
		}
// movement loop
		while (isSolved == false); {
		Mouse currentMouse = new Mouse();
		Maze maze = new Maze();
				maze.startMouse(currentMouse);
		do {
			moveAttempt = maze.moveMouse(currentMouse);
			if (moveAttempt == 2) System.out.println("Mouse escaped. Generating new mouse.");
			if (moveAttempt == -1) System.out.println("Mouse died. Generating new mouse.");
			} while (moveAttempt != 1);
			isSolved = true;
		} 
		System.out.println("Mouse successfully exited the maze.");
//print moveList				System.out.println();
	}
}