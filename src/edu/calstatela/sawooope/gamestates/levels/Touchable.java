package edu.calstatela.sawooope.gamestates.levels;

import edu.calstatela.sawooope.entity.creature.Creature;

/**
 * This is implemented by the TouchAction class
 * @author Benji
 *
 */
public interface Touchable {
	
	/**
	 * @property
	 */
	public static final int SWIPE_UP = Creature.NORTH;
	/**
	 * @property
	 */
	public static final int SWIPE_DOWN = Creature.SOUTH;
	/**
	 * @property
	 */
	public static final int SWIPE_RIGHT = Creature.EAST;
	/**
	 * @property
	 */
	public static final int SWIPE_LEFT = Creature.WEST;
	/**
	 * @property
	 */
	public static final int IGNORE_SWIPE = 4;
	/**
	 * @property
	 */
	public static final int TAP = 0;
	/**
	 * @property
	 */
	public static final int SWIPE = TAP+1;
	/**
	 * @property
	 */
	public static final int DRAG = SWIPE+1;
	
	/**
	 * Used to get the direction the user swiped
	 *  
	 * @param startX x location where user pressed the screen
	 * @param startY y location where user pressed the screen
	 * @param endX x location where user released the screen
	 * @param endY y location where user released the screen
	 * @return the direction of the swipe
	 */
	public int getSwipeDirection(float startX, float startY, float endX, float endY);
	
}
