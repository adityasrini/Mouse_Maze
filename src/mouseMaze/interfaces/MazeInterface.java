package mouseMaze.interfaces;


import mouseMaze.implementation.Mouse;

/**
 * @author lrs2169
 *
 */
public interface MazeInterface
{
	/**
	 * Introduces a new mouse at the start of the maze.
	 * @param currentMouse Current Mouse object.
	 */
	void startMouse(Mouse currentMouse);
	
	/**
	 * Finds the current mouse and instructs the mouse to move.
	 * @param currentMouse Current Mouse object
	 * @return
	 * 2 if mouse escapes
	 * 1 if mouse successfully exits the maze.
	 * 0 if mouse moves to a new cell but not the exit
	 * -1 if mouse dies
	 */
	int moveMouse(Mouse currentMouse);
	
	/**
	 * Queries the user for size of maze, mouse traps, and mouse holes.
	 * Creates maze with random mouse traps and mouse holes.
	 * @return
	 * true if maze successfully created
	 */
	boolean createMaze();
	
	/**
	 * Prints all required information on dead mice.
	 */
	void displayStatistics();
}
