package mouseMaze.interfaces;



public interface MouseInterface 
{
	
	/**
	 * 
	 * @return
	 * the number of units to move the animal
	 */
	 int[] move();
	
	/**
	 * This method kills the animal
	 * and sets an instance variable identifying that
	 * the animal is dead
	 */
	 void die();
	
	/**
	 * Queries animal to see if it is alive
	 * @return
	 * true if it is alive
	 */
	boolean isAlive();

}
