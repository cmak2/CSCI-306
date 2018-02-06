package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.Moveable;

/**
 * 
 * @author Calvin Mak
 * @author Jacob Mcbee
 *
 * Programming pair 23
 * CSCI 306 SEC A
 * 
 */

public class LevelEngine {

	public void createLevel(int levelNum) {
		/**
		 *	create level grabs pieces and assigns their positions
		 * 
		 */
		
		//TODO: levelNum needs a function to differentiate the levels
		//TODO: set up moveable pieces
		currentBoard = new Drawable[GameEngine.BOARD_SIZE];
		interactingPieces = new ArrayList<GamePiece>(GameEngine.BOARD_SIZE);
		movingPieces = new ArrayList<Moveable>(GameEngine.BOARD_SIZE);
		
		for(int i = 0; i < MAX_HEAL_UNITS; i++) {
			switch()
		}
		
		
		
	}

	public Drawable[] getBoard() {
		/**
		 *  Returns board state and locations; i.e. setups draw function
		 */
		return currentBoard;
	}

	public ArrayList<Moveable> getMovingPieces() {
		return movingPieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		return GameEngine.BOARD_SIZE / 2;
	}
	
	private Drawable[] currentBoard;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;
	
	
	/*
	 * The following consts are used to determine the maximum amount of units of a InteractionResult type
	 * For example for takeDamage class (called ATTACK here), there will be an upper limit of 2 attacking units
	 * 
	 */
	private final int MAX_HEAL_UNITS = 2;
	private final int MAX_ATTACK_UNITS = 2;
	private final int MAX_KILL_UNITS = 1;
	private final int MAX_TRIP_UNITS = 1;
	private final int MAX_ADVANCE_UNITS = 1;
	private final int MAX_GET_POINT_UNITS = 2;
	
	private final int MAX_DRAW_ONLY_UNITS = 3;
}
