package draw.view;

import javax.swing.JPanel; 
import draw.controller.DrawController;

public class ArtPanel extends JPanel
{
	private DrawController app; 
	
	public ArtPanel(DrawController app)
	{
		super(); 
		this.app = app;
	}

}
