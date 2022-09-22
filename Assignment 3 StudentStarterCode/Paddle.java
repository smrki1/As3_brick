import java.awt.Graphics;

public class Paddle extends Sprite {

	private int xVelocity;
	
	public Paddle() {
		this.width = Settings.PADDLE_WIDTH;// SASHA TODO: Set width to Settings.PADDLE_WIDTH
		this.height = Settings.PADDLE_HEIGHT;// SASHA TODO: Set width to Settings.PADDLE_HEIGHT
		resetPosition();// SASHA TODO: Call resetPosition
	}
	
	public void resetPosition() {
		setX(Settings.INITIAL_PADDLE_X);// SASHA TODO: Set initial position x and y (use INITIAL_PADDLE_X/Y)
		setY(Settings.INITIAL_PADDLE_Y);
		// Note: Check Ball.java for a hint
	}
	
	public void update() {
		x += xVelocity;
		
		// TODO: Prevent the paddle from moving outside of the screen
		// This can be done using two if statements (one for the left side of the screen and one for the right)

	}
	
	public void paint(Graphics g) {
		g.fillRect(x, y, Settings.PADDLE_WIDTH, Settings.PADDLE_HEIGHT);
	}
	
	public void setXVelocity(int vel) {
		this.xVelocity = vel;// SASHA TODO: Set x velocity

	}
}
