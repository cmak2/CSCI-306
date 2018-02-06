package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;
import java.util.Random;


public class Ball extends GamePiece {

	public Ball() {
		super('B', 0);
		super.setLocation(num);
		rnd = new Random();
	}

	

	@Override
	public void draw() {
		super.draw();

	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(this.getLocation() == playerLocation)
			return InteractionResult.TRIP;
		return null; 
	}

	private Random rnd;
	private int num = rnd.nextInt(GameEngine.BOARD_SIZE - 1) + 1;

}
