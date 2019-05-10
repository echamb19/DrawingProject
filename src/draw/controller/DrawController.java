package draw.controller;

import javax.swing.JOptionPane;
import draw.view.DrawFrame; 


public class DrawController
{
	private DrawFrame appFrame; 
	
	public DrawController()
	{
		appFrame = new DrawFrame(this); 
	}
	
	public void start()
	{
		
	}
	
	public void handleErrors(Exception error)
	{
		JOptionPane.showMessageDialog(appFrame, "Error received:" + error.getMessage());
	}
}
