//package mouseMaze.previous_code;
//
//import mouseMaze.interfaces.MazeInterface;
//
//import java.util.ArrayList;
//import java.util.InputMismatchException;
//import java.util.List;
//import java.util.Scanner;
//
//public class Maze implements MazeInterface {
//	static Scanner keyboard = new Scanner(System.in);	
//	Cell[][] maze;
//	public static List<int[]> holeList = new ArrayList<>();
//	public static List<int[]> trapList = new ArrayList<>();
//	private int dimensionX = 0;
//	private int dimensionY = 0;
//	private int numTraps = 0;
//	private int numHoles = 2;
//	private int numSpecialCells = 0;
//	public static int fellOffboard = 0;
//	
//	public Maze()
//	{
//		maze = new Cell[4][4];
//	}
//
//public void startMouse(Mouse currentMouse) {
//	Mouse.moveList.clear();
//	resetTraps();
//}
//
//
//@Override
//public int moveMouse(Mouse currentMouse) {
////	 * 2 if mouse escapes
////	 * 1 if mouse successfully exits the maze.
////	 * 0 if mouse moves to a new cell but not the exit
////	 * -1 if mouse dies
//	if (Mouse.currentPosition[0] == dimensionX && Mouse.currentPosition[1] == dimensionY)
//		return 1;
//	int tryMove [] = currentMouse.move();
//	if ((Mouse.currentPosition[0] == 0 && tryMove [0] == -1) ||
//			(Mouse.currentPosition[0] == dimensionX && tryMove [0] == +1) || 
//			(Mouse.currentPosition[1] == 0 && tryMove [1] == -1) || 
//			(Mouse.currentPosition[1] == dimensionY && tryMove [1] == +1))
//				{
//					fellOffboard++;
//					currentMouse.die();
//					return -1;
//				}
//	boolean holeExists = maze[Mouse.currentPosition[0]][Mouse.currentPosition[1]].getHole();
//	boolean trapExists = maze[Mouse.currentPosition[0]][Mouse.currentPosition[1]].getTrap();
//	if (holeExists == true) {
//		int holeOutcome [] = new Hole().tryHole();
//		if (holeOutcome[0] == -1 && holeOutcome[1] == -1) {return 2;}
//		else {
//			Mouse.currentPosition[0] = holeOutcome[0];
//			Mouse.currentPosition[1] = holeOutcome[1];
//			return 0;
//		}
//	}
//	if (trapExists == true) {
//		boolean mouseDead = new Trap().springTrap();
//		if (mouseDead = false) {
//			Mouse.currentPosition[0] += tryMove[0];
//			Mouse.currentPosition[1] += tryMove[1];
//			return 0;
//		}
//		else {
//			currentMouse.die();
//			return -1;
//		}
//	}
//	Mouse.currentPosition[0] += tryMove[0];
//	Mouse.currentPosition[1] += tryMove[1];
//	return 0;
//}
//
//@Override
//public boolean createMaze() {
//	dimensionX = queryUserDepth();
//	dimensionY = queryUserWidth();
//	numSpecialCells = specialCellCalculator(dimensionX, dimensionY);
//	numTraps = queryUserTraps(numSpecialCells);
//	numHoles = queryUserHoles(numSpecialCells);
//	Cell[][] maze = new Cell[dimensionX][dimensionY];
//    for(int i=0; i<dimensionX; i++)
//        for(int j=0; j<dimensionY; j++)
//            maze[i][j] = new Cell();
//    assignHoles(numHoles);
//    assignTraps(numTraps);
//    printMaze(maze);
//	return true;
//}
//
//private int queryUserWidth() {
//	int dimension = 2;
//	boolean invalidEntry = true;
//	String stringHolder = "";
//	do
//	try {
//	System.out.println("How wide is your maze?");
//	dimension = keyboard.nextInt();
//	if (dimension<4)
//		throw new Exception("Minimum number of rows is 4. Please try again.");
//	invalidEntry = false;
//	}		
//	catch (InputMismatchException error)
//	{
//		stringHolder = keyboard.nextLine();
//		System.out.printf("%s is an invalid entry!\n", stringHolder);
//		invalidEntry = true;
//	}		
//	catch (Exception rangeError)
//	{
//		System.out.println(rangeError.getMessage());
//	}
//	while (invalidEntry);
//	return dimension;
//}
//
//private int queryUserDepth() {
//	int dimension = 2;
//	boolean invalidEntry = true;
//	String stringHolder = "";
//	do
//	try {
//	System.out.println("How deep is your maze?");
//	dimension = keyboard.nextInt();
//	if (dimension<4)
//		throw new Exception("Minimum number of columns is 4. Please try again.");
//	invalidEntry = false;
//	}		
//	catch (InputMismatchException error)
//	{
//		stringHolder = keyboard.nextLine();
//		System.out.printf("%s is an invalid entry!\n", stringHolder);
//		invalidEntry = true;
//	}		
//	catch (Exception rangeError)
//	{
//		System.out.println(rangeError.getMessage());
//	}
//	while (invalidEntry);
//	return dimension;
//}	
//
//private int specialCellCalculator(int dimension1, int dimension2) {
//	return ((dimension1*dimension2)/4);
//}
//
//private int queryUserTraps(int numSpecialCells) {
//	int input = 0;
//	boolean invalidEntry = true;
//	String stringHolder = "";
//	do
//	try {
//	System.out.println("How many traps are in your maze?");
//	input = keyboard.nextInt();
//	if (input<0)
//		throw new Exception("Invalid entry. Please try again.");
//	if (input>numSpecialCells)
//		throw new Exception("Number of traps cannot exceed "+numSpecialCells+". Please try again.");
//	invalidEntry = false;
//	}		
//	catch (InputMismatchException error)
//	{
//		stringHolder = keyboard.nextLine();
//		System.out.printf("%s is an invalid entry!\n", stringHolder);
//		invalidEntry = true;
//	}		
//	catch (Exception rangeError)
//	{
//		System.out.println(rangeError.getMessage());
//	}
//	while (invalidEntry);
//	return input;
//}
//
//private int queryUserHoles(int numSpecialCells) {
//	int input = 2;
//	boolean invalidEntry = true;
//	String stringHolder = "";
//	do
//	try {
//	System.out.println("How many holes are in your maze?");
//	input = keyboard.nextInt();
//	if (input<2)
//		throw new Exception("Minimum number of holes is 2. Please try again.");
//	if (input>numSpecialCells)
//		throw new Exception("Number of holes cannot exceed "+numSpecialCells+". Please try again.");
//	invalidEntry = false;
//	}		
//	catch (InputMismatchException error)
//	{
//		stringHolder = keyboard.nextLine();
//		System.out.printf("%s is an invalid entry!\n", stringHolder);
//		invalidEntry = true;
//	}		
//	catch (Exception rangeError)
//	{
//		System.out.println(rangeError.getMessage());
//	}
//	while (invalidEntry);
//	return input;
//}
//
//public int [] randomCoordinate() {
//	int [] coordinate = new int [2];
//	do {
//	coordinate [0] = (int)(Math.random() * (dimensionX-1));
//	coordinate [1] = (int)(Math.random() * (dimensionY-1));
//	} while ((coordinate [0] == 0 && coordinate [1] == 0) || (coordinate [0] == dimensionX && coordinate[1] == dimensionY));
//	return coordinate;
//}
//
//private void assignHoles(int numHoles) {
//	int [] newRandomCoordinate = null;
//	boolean holeExists;
//	while (holeList.size()<numHoles) {
//		newRandomCoordinate = randomCoordinate();
//		holeExists = maze[newRandomCoordinate[0]][newRandomCoordinate[1]].getHole();
//		if (holeExists == false) {
//			Hole currentHole = new Hole();
//			holeList.add(newRandomCoordinate);
//			System.out.println("Random hole at " + newRandomCoordinate[0]+","+newRandomCoordinate[1]);
//			maze[newRandomCoordinate[0]][newRandomCoordinate[1]].setHole(currentHole);
//			}
//		}		
//	System.out.println("Holes Assigned");
//}
//		
//private void assignTraps(int numTraps) {
//	int [] newRandomCoordinate = null;
//	boolean trapExists;
//	while (trapList.size()<numHoles) {
//		newRandomCoordinate = randomCoordinate();
//		trapExists = maze[newRandomCoordinate[0]][newRandomCoordinate[1]].getTrap();
//		if (trapExists == false && (!holeList.contains(newRandomCoordinate))) {
//			Trap currentTrap = new Trap();
//			holeList.add(newRandomCoordinate);
//			System.out.println("Random hole at " + newRandomCoordinate[0]+","+newRandomCoordinate[1]);
//			maze[newRandomCoordinate[0]][newRandomCoordinate[1]].setTrap(currentTrap);
//			}
//		}		
//	System.out.println("Traps Assigned");
//}
//
//private void resetTraps() {
//	for	(int i=0; i<trapList.size(); i++) {
//		trapList.get(i);
//	}
//}
//
//public void printMaze(Cell[][] maze) {
//	System.out.println("Your maze looks like this -");
//	for (int i=0; i<maze.length; i++)
//	{
//		for (int j=0; j<maze[0].length; j++)
//			{
//			if (maze[i][j].getHole() == true)
//				System.out.print("h");
//			if (maze[i][j].getTrap() == true)
//				System.out.print("t");
//			else System.out.print("_");
//			}
//		System.out.println()	;
//	}
//}
//
//@Override
//public void displayStatistics() {
//	// TODO Auto-generated method stub
//	
//}
//}