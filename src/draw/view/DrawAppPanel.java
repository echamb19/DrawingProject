package draw.view;

import javax.swing.*; 
import draw.controller.DrawController; 

public class DrawAppPanel extends JPanel
{
	private DrawController app; 
	private SpringLayout appLayout; 
	
	// Buttons
	private JButton loadButton; 
	private JButton clearButton; 
	private JButton saveButton; 
	
	private JButton redButton; 
	private JButton orangeButton; 
	private JButton yellowButton; 
	private JButton greenButton; 
	private JButton blueButton; 
	private JButton violetButton; 
	private JButton blackButton; 
	
	// Labels
	private JLabel widthLabel; 
	private JLabel duckLabel; 
	
	// Everything Else
	private JSlider widthSlider; 
	private JScrollPane artPane; 
	
	public DrawAppPanel(DrawController app)
	{
		super(); 
		this.app = app; 
		
		// Buttons
		this.loadButton = new JButton("Load");
		this.clearButton = new JButton("Clear");
		this.saveButton = new JButton("Save");
		
		this.redButton = new JButton("Red");
		this.orangeButton = new JButton("Orange");
		this.yellowButton = new JButton("Yellow"); 
		this.greenButton = new JButton("Green"); 
		this.blueButton = new JButton("Blue");
		this.violetButton = new JButton("Violet");
		
		// Labels
		this.widthLabel = new JLabel("Width"); 
		this.duckLabel = new JLabel(); 
		
		// Everything Else
		this.widthSlider = new JSlider(); 
		this.artPane = new JScrollPane(); 
		
		setupMenuPanels(); 
		setupScrollPane(); 
		setupPanel(); 
		setupLayout(); 
		setupListeners();
	}
	
	private void setupMenuPanels()
	{
		
	}
	
	private void setupScrollPane()
	{
		
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		
	}
	
	private void setupListeners() 
	{
		
	}
}
