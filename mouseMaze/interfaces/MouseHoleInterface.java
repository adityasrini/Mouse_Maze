package mouseMaze.interfaces;

public interface MouseHoleInterface
{
	/**
	 * The hole is tried my the mouse and the location of the next hole is returned.
	 * The next hole may not be behind the current hole.
	 * @return
	 * row and column values for the next hole.
	 * if -1, -1 then mouse escaped.
	 */
	int[] tryHole();
}
