package draw.view;

import draw.controller.DrawController;
import javax.swing.JPanel; 

import java.awt.BasicStroke;
import java.awt.Color; 
import java.awt.Dimension; 
import java.awt.Graphics; 
import java.awt.Graphics2D; 
import java.awt.image.BufferedImage; 

import java.io.File; 
import java.io.IOException; 

import javax.imageio.ImageIO; 
import javax.swing.JFileChooser; 
import javax.swing.filechooser.FileFilter; 
import javax.swing.filechooser.FileNameExtensionFilter; 


public class ArtPanel extends JPanel
{
	private DrawController app; 
	private Color currenetColor; 
	private BufferedImage currentCanvas; 
	private int previousX; 
	private int previousY; 
	
	public ArtPanel(DrawController app)
	{
		super(); 
		this.app = app;
		this.currentCanvas = new BufferedImage(700, 700, BufferedImage.TYPE_INT_ARGB); 
		setupPanel(); 
		resetPoint(); 
	}
	}

}
