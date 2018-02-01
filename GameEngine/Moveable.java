package gameEngine;

/**
 * Moveable extends Drawable because ALL pieces must be able to
 * be shown. 
 * 
 * @author Mark Baldwin
 * @author Cyndi Rader
 * 
 */
public interface Moveable extends Drawable{
	
	/**
	 * move takes the list of pieces and the player's location and 
	 * updates the list of pieces (i.e., moves this piece to a new
	 * location). 
	 * 
	 * NOTE: It is possible with this function signature for a piece
	 * to move other pieces. This could make for interesting game play..
	 * but should be done with caution! If safety becomes a concern,
	 * this method could be modified to return the new location, with
	 * additional calls in GameEngine to move the piece. 
	 * 
	 * @param gameBoard board with piece/null that is in each location
	 * @param playerLocation players current location on board
	 * 
	 */
	public void move(Drawable[] gameBoard, int playerLocation);

}
