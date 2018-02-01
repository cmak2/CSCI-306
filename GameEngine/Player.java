package gameEngine;

import java.util.Scanner;

/**
 * Keeps track of player status (location, hit points, etc.)
 * Manages player movement. 
 * 
 * @author Mark Baldwin
 * @author Cyndi Rader
 *
 */
public class Player implements Drawable {
	
	/**
	 * The number of hits that can be taken before death. 
	 */
	public static final int POINTS_TO_DIE = 2;
	
	/**
	 * The number of points to complete a level. 
	 * Player can earn 1 point at a time by interacting with a game piece.
	 */
	public final static int POINTS_TO_ADVANCE = 2;

	// Variables to track the player status
	private int location;
	private int levelPoints; 
	private int damagePoints;
	public enum PlayerStatus {DEAD, ADVANCING, OK; }
	private PlayerStatus playerStatus;
	
	/**
	 * Constructor for player
	 * 
	 * @param location location the player starts at
	 */
	public Player(int location) {
		// always reset status when create player or start new level
		resetLevel(location);
	}
	
	/**
	 * resetLevel resets all player statistics for the new level
	 * 
	 * @param location location for the player
	 */
	public void resetLevel(int location) {
		playerStatus = PlayerStatus.OK;
		this.location = location;
		damagePoints = 0; 
		levelPoints = 0;
	}
	
	/**
	 * Draws the player
	 */
	@Override
	public void draw() {
		System.out.print('P');
	}

	/**
	 * Test to see if player can advance to next level
	 * 
	 * @return true if can advance
	 */
	public boolean canAdvance() {
		if (levelPoints >= POINTS_TO_ADVANCE || playerStatus == PlayerStatus.ADVANCING) {
			return true;
		}
		return false;
	}
	
	/**
	 * Test to see if player is dead
	 * 
	 * @return true if dead
	 */
	public boolean isDead() {
		return (playerStatus == PlayerStatus.DEAD || damagePoints >= POINTS_TO_DIE);
	}
	
	/**
	 * Increments players points in current level
	 */
	public void addPoint() {
		levelPoints++;
	}
	
	/**
	 * Increments damage player has taken
	 */
	public void takeDamage() {
		damagePoints++;
	}
	
	/**
	 * Sets player status to killed
	 */
	public void killed() {
		playerStatus = PlayerStatus.DEAD;
	}
	
	/**
	 * Sets player status to advancing
	 */
	public void wonAdvance() {
		playerStatus = PlayerStatus.ADVANCING;
	}
	
	/**
	 * Get the players move, and move him
	 * 
	 * @param gameBoard Current game board
	 */
	public void doMove(Drawable[] gameBoard) {
		// ensure the player moves each turn
		boolean moved = false; 
		while (!moved) {
			// display the menu and get player choice
			int choice = getPlayerChoice();
			// will be true if move is valid
			moved = updatePlayerLocation(choice);
		}
		
	}
	

	/**
	 * Accepts and returns the player's movement choice. 
	 * Ensures the value is between 1 and 4.  
	 * 
	 * @return user's validated selection
	 */
	@SuppressWarnings("resource")
	private int getPlayerChoice() {
		int playerChoice = 0;
		do {
			displayMenu();
			Scanner scan = new Scanner(System.in);
			String choiceStr = scan.next();
			try {
				playerChoice = Integer.parseInt(choiceStr);
				if (playerChoice < 1 || playerChoice > 4) {
					System.out.println("Invalid option, please retry");
				}					
			} catch (NumberFormatException e) {
				System.out.println("Must enter a number, please retry");
			}
		} while (playerChoice < 1 || playerChoice > 4);
		return playerChoice;
	}
	
	/**
	 * Display the players menu of choices
	 */
	private void displayMenu() {
		System.out.println();
		System.out.println("1: Move right");
		System.out.println("2: Move left");
		System.out.println("3: Jump right");
		System.out.println("4: Jump left");
		System.out.print("Enter your choice: ");
	}

	/**
	 * Moves the player as determined by the menu option. 
	 * A "move" goes one space in the desired direction, "jump" goes two. 
	 * If move would go beyond ends of board, an error message is displayed. 
	 * 
	 * @param option a numeric option representing the direction selected by the user
	 * @return true if the option is valid (within bounds), false otherwise
	 */
	private boolean updatePlayerLocation(int option) {
		int newLocation = -1;
		if (option == 1 && location < (GameEngine.BOARD_SIZE-1)) {
			newLocation = location + 1;
		}
		if (option == 2 && location > 0) {
			newLocation = location - 1;
		}
		if (option == 3 && location < (GameEngine.BOARD_SIZE - 2)) {
			newLocation = location + 2;
		}
		if (option == 4 && location > 1) {
			newLocation = location - 2;
		}	
		if (newLocation == -1) {
			System.out.println("Invalid option, please retry");
			return false;
		}
		// if didn't return, then we have a valid new location
		// so update the board
		location = newLocation;		
		return true;
	}
	
	/**
	 * Getter for player location
	 * 
	 * @return player location
	 */
	public int getLocation() {
		return location;
	}

}
