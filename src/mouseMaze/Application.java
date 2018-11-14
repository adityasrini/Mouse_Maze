package mouseMaze;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length of the maze: ");
		int length = scanner.nextInt();
		System.out.println("Enter the width of the maze: ");
		int width = scanner.nextInt();
		System.out.printf("Length and Width of the maze are: %d and %d", length, width);
	}
}
