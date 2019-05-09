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
	private Color currentColor; 
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
	
	public void resetPoint()
	{
		previousX = Integer.MIN_VALUE; 
		previousY = Integer.MAX_VALUE; 
	}
	
	public void setupPanel()
	{
		this.setPreferredSize(new Dimension(700, 700)); 
		this.setBackground(Color.BLACK); 
		this.currentColor = Color.WHITE;
	}
	
	public void drawDot(int currentX, int currentY, int width)
	{
		Graphics2D current = currentCanvas.createGraphics(); 
		current.setColor(currentColor); 
		current.setStroke(new BasicStroke(width)); 
		current.drawOval(currentX, currentY, width, width); 
		repaint(); 
	}
	
	public void setCurrentColor(String color)
	{
		if(color.equalsIgnoreCase("Black"))
		{
			currentColor = Color.BLACK; 
		}
		
		else if(color.equalsIgnoreCase("Red"))
		{
			currentColor = Color.RED;
		}
		
		else if(color.equalsIgnoreCase("Blue"))
		{
			currentColor = Color.BLUE; 
		}
		
		else
		{
			currentColor = randomColor(); 
		}
	}
	
	public void drawLine(int currentX, int currentY, int width)
	{
		
	}
	
	@Override
	protected void paintComponent(Graphics graphics)
	{
		super.paintComponent(graphics); 
		graphics.drawImage(currentCanvas, 0, 0, null); 
	}
	
	private Color randomColor()
	{
		int red = (int)(Math.random() * 256); 
		int green = (int)(Math.random() * 256); 
		int blue = (int)(Math.random() * 256); 
		int alpha = (int)(Math.random() * 256); 
		
		Color randomColor = new Color(red, green, blue, alpha); 
		return randomColor; 
	}
}
