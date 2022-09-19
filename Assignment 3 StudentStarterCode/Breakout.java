import java.awt.Color;

import javax.swing.JFrame;

public class Breakout extends JFrame{
	
	static final long serialVersionUID = 1L;
	
	private BreakoutPanel panel;
	
	public Breakout() {
		setSize(Settings.WINDOW_WIDTH, Settings.WINDOW_HEIGHT);// SASHA TODO: Set the size of the screen (use Settings.WINDOW_WIDTH/HEIGHT)
		setTitle(Settings.WINDOW_NAME);	// SASHA TODO: Set the title
		super.setBackground(Color.WHITE); //SASHA  TODO: Set the background colour to white
		setResizable(false); //SASHA TODO: Set resizable to false
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        panel = new BreakoutPanel(this);
        add(panel);
		setVisible(true);// SASHA TODO: Set visible to true
	}

	public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
	         public void run() {
	        	 new Breakout();	
	         }
		});

	}
}
