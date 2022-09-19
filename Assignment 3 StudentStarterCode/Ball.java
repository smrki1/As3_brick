import java.awt.Graphics;

public class Ball extends Sprite {

	private int xVelocity = 1, yVelocity = -1;
	
	// Constructor
	public Ball() {
		width = Settings.BALL_WIDTH;// SASHA??? TODO: Set width to Settings.BALL_WIDTH
		height = Settings.BALL_HEIGHT; //SASHA??? TODO: Set width to Settings.BALL_HEIGHT
		resetPosition();// SASHA TODO: Call resetPosition
		
	}
	
	/**
	 * Resets the ball to the initial position
	 * Uses Settings.INITIAL_BALL_X/Y to set the position of the ball
	 */
	public void resetPosition() {
		setX(Settings.INITIAL_BALL_X);
		setY(Settings.INITIAL_BALL_Y); // SASHA TODO: Set the balls y by using the INITIAL_BALL_Y (see above)
	}
	
	public void update() {
		x += xVelocity;
		y += yVelocity;// SASHA TODO: Increase the y variable by yVelocity (see above)
		
		// Bounce off left side of screen
		if(x <= 0) {
			x = 0;// SASHA TODO: Set x to 0 so it does not leave the screen
			x = x + 1; // SASHA?? TODO: Change the x velocity to make the ball go right
		}
		
		// Bounce off right side of screen
		if(x >= Settings.WINDOW_WIDTH - Settings.BALL_WIDTH) {
			// TODO: Set x to the right edge of the screen (see the above if condition)
			// TODO: Change the x velocity to make the ball go left
		}
		
		// Bounce off top of screen
		if(y <= 0) {
			y = 0; // SASHA TODO: Set y to 0 so it does not leave the screen
			y = y - 1; // SASHA?? TODO: Change the y velocity to make the ball go downward
			
		}
		
	}
	
	public void setXVelocity(int x) {
		this.xVelocity = x; //SASHA??? TODO: Set the x velocity
	}
	public void setYVelocity(int y) {
		this.yVelocity = y;// SASHA??? TODO: Set the y velocity
	}
	
	public int getXVelocity() {
		return xVelocity;	// SASHA TODO: Return the x velocity
	}
	public int getYVelocity() {
		return yVelocity;	// SASHA TODO: Return the y velocity
	}
	
	public void paint(Graphics g) {
		g.fillOval(x, y, Settings.BALL_WIDTH, Settings.BALL_HEIGHT);
	}
}
