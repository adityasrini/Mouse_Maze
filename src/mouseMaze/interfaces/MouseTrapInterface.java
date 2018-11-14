package mouseMaze.interfaces;
import mouseMaze.previous_code.Mouse;

import java.util.ArrayList;

public interface MouseTrapInterface
{
	/**
	 * sets the trap so that a mouse will be able to spring it
	 */
	void setTrap();
	
	/**
	 * Springs a set trap if a mouse is in the same location
	 * and the trap is set. Then unsets the trap
	 * @return
	 * true if the trap is sprung by a mouse
	 * false if the trap is unset
	 */
	boolean springTrap();
	
	/**
	 * this method disables the trap so that it is not an
	 * active object.
	 */
	void disableTrap();
	
	/**
	 * This method retrieves a list of the mice killed by this trap.
	 * @return
	 * ArrayList<> of Mouse objects.
	 */
	ArrayList<Mouse> returnTheDead();
}
