package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

import java.util.ArrayList;
import java.util.Random;


public class Ball extends GamePiece {

	public Ball() {
		super('B', 0);
		rnd = new Random();
		num = rnd.nextInt(GameEngine.BOARD_SIZE - 1) + 1;
		super.setLocation(num);
	}

	public Ball(int location) {
		super('B', location);
	}

	@Override
	public void draw() {
		super.draw();

	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(super.getLocation() == playerLocation) 
			pieces[super.getLocation()] = null;
		
		if(this.getLocation() == playerLocation)
			return InteractionResult.TRIP;
		return InteractionResult.NONE; 
	}

	private Random rnd;
	private int num;

}
