package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class RandomPiece extends GamePiece implements Moveable {

	public RandomPiece() {
		super('T', 5);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		super.draw();

	}

	@Override
	public InteractionResult interact(Drawable[] pieces, int playerLocation) {
		if(this.getLocation() == playerLocation)
			return InteractionResult.KILL;
		return null; 
	}

	@Override
	public void move(Drawable[] gameBoard, int playerLocation) {
		// TODO Auto-generated method stub
		
	}
	
	
}
