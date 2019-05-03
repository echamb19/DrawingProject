package draw.view;

import draw.controller.DrawController;
import javax.swing.JFrame;

public class DrawFrame extends JFrame 
{
	private DrawController app; 
//	private DrawAppPanel panel; 
	
	public DrawFrame(DrawController app)
	{
		super(); 
		
		this.app = app; 
//		this.panel = panel; 
		
		setupFrame(); 
	}
	
	private void setupFrame()
	{
//		this.setContentPane(panel); 
		this.setTitle("Draw GUI"); 
		this.setSize(1000, 800); 
		this.setResizable(false); 
		this.setVisible(true); 
	}
}
