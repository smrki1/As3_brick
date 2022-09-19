import java.awt.Graphics;

public class Brick extends Sprite {
	
	private boolean broken = false;
	
	public Brick(int x, int y) {
		this.x = x;// ???????? TODO: Set x using the parameter
		this.y = y;// ????????? TODO: Set y using the parameter
		this.width = Settings.BRICK_WIDTH;
		this.height = Settings.BRICK_HEIGHT;// SASHA? TODO: Set the width and height of the brick using Settings.BRICK_WIDTH/HEIGHT
	}

	public boolean isBroken() {
		return true;	// SASHA??? TODO: Return the correct variable
	}
	public void setBroken(boolean b) {
		this.broken = b;  // SASHA??? TODO: Set the broken variable using the parameter given
	}
	
	public void paint(Graphics g) {
		if(!broken) {
			g.fillRect(x, y, Settings.BRICK_WIDTH, Settings.BRICK_HEIGHT);
		}
	}
}
