import java.awt.Rectangle;

public class Sprite {
	
	protected int x,y,width,height;
	
	// Note: This should only set a single value, they can be done in a single statement
	public void setX(int x) {
		this.x = x;// Sasha TODO
	}
	public void setY(int y) { 
		this.y = y; // Sasha TODO
	}
	public void setWidth(int width) { 
		this.width = width; // Sasha TODO
	}
	public void setHeight(int height) { 
		this.height = height; //Sasha TODO
	}
	
	// Note: Change the "0" to the correct variable
	public int getX() { 
		return x;	// SASHA TODO: Return correct value
	}
	public int getY() { 
		return y;	// SASHA TODO: Return correct value
	}
	public int getWidth() { 
		return width;	// SASHA TODO: Return correct value
	}
	public int getHeight() { 
		return height;	// SASHA TODO: Return correct value
	}
	
	Rectangle getRectangle() {
		return new Rectangle(x, y, width, height);
	}
}
