package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

/*
 * 
 * @author Calvin Mak
 * @author Jacob Mcbee
 * 
 */

/**
 * 
 * @author Mark Baldwin
 * @author Cyndi Rader
 *
 *  This is an abstract class because it contains an abstract 
 *  method AND an instance variable
 */
public abstract class GamePiece implements Drawable {
	// Interfaces cannot have instance variables
	private char symbol;
	// Stores the piece location, which will be needed to interact
	// with the player. 
	private int location;

	/**
	 * Constructor for the game piece
	 * 
	 * @param symbol  symbol for the game piece
	 * @param location initial location
	 */
	public GamePiece(char symbol, int location) {
		super();
		this.symbol = symbol;
		this.location = location;
	}

	/**
	 * Draws the pieces symbol on the board
	 * 
	 * Abstract classes can have concrete/defined methods
	 * 
	 */
	public void draw() {
		System.out.print(symbol);
	}

	/**
	 * 
	 * Abstract classes should have at least one abstract method
	 * 
	 * @param pieces
	 * @param playerLocation
	 * @return
	 */
	public abstract InteractionResult interact(Drawable [] pieces, int playerLocation);

	public int getLocation() {
		return location;
	}
	
	public void setLocation(int newLocation) {
		// Ensure the location remains on the board
		if (newLocation >= 0 && newLocation < GameEngine.BOARD_SIZE)
			location = newLocation;
	}
}
