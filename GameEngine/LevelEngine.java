package levelPieces;

import java.util.ArrayList;

import gameEngine.Drawable;
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
		currentBoard = new Drawable[MAX_BOARD_SIZE];
		RandomPiece testPiece = new RandomPiece();
		currentBoard[5] = testPiece;
		
	}

	public Drawable[] getBoard() {
		/**
		 *  Returns board state and locations; i.e. setups draw function
		 */
		return currentBoard;
	}

	public ArrayList<Moveable> getMovingPieces() {
		// TODO Auto-generated method stub
		return movingPieces;
	}

	public ArrayList<GamePiece> getInteractingPieces() {
		// TODO Auto-generated method stub
		return interactingPieces;
	}

	public int getPlayerStartLoc() {
		
		return 0;
	}
	
	public final static int MAX_BOARD_SIZE = 10;
	private Drawable[] currentBoard;
	private ArrayList<Moveable> movingPieces;
	private ArrayList<GamePiece> interactingPieces;

}
