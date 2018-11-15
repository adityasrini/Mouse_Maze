package mouseMaze;

import mouseMaze.implementation.MazeImplementation;
import mouseMaze.implementation.Mouse;
import mouseMaze.interfaces.MazeInterface;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the maze: ");
		int length = scanner.nextInt();
		System.out.println("Enter the width of the maze: ");
		int width = scanner.nextInt();
		System.out.printf("Length and Width of the maze are: %d and %d", length, width);
		Mouse mouse = new Mouse();
		MazeInterface maze = new MazeImplementation();
		maze.startMouse(mouse);
	}
}
