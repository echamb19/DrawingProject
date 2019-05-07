package draw.view;

import java.awt.*;
import java.awt.event.*;
import java.util.Hashtable;
import javax.swing.*;
import draw.controller.DrawController;

public class DrawAppPanel extends JPanel
{
	private DrawController app; 
	private SpringLayout appLayout; 
	private ArtPanel canvas; 
	private JPanel colorPanel; 
	private JPanel menuPanel; 
	private JSlider widthSlider; 
	private JScrollPane canvasPane; 
	
	// Buttons
	private JButton loadButton; 
	private JButton clearButton; 
	private JButton saveButton; 
	
	private JButton redButton; 
	private JButton orangeButton; 
	private JButton yellowButton; 
	private JButton greenButton; 
	private JButton blueButton; 
	private JButton purpleButton; 
	private JButton blackButton;
	private JButton whiteButton; 
//	private JButton randomColorButton; 
	
	// Labels
	private JLabel widthLabel; 
	private JLabel duckLabel; 	
	
	private final int MINIMUM_LINE = 1; 
	private final int MAXIMUM_LINE = 25; 
	
	public DrawAppPanel(DrawController app)
	{
		super(); 
		
		this.app = app; 
		canvas = new ArtPanel(app); 
		canvasPane = new JScrollPane(); 
		appLayout = new SpringLayout(); 

		widthSlider = new JSlider(MINIMUM_LINE, MAXIMUM_LINE);
		
		colorPanel = new JPanel(new GridLayout(0,1)); 
		menuPanel = new JPanel(new GridLayout(0,1));
		
		// Buttons
		loadButton = new JButton("Load");
		clearButton = new JButton("Clear");
		saveButton = new JButton("Save");
		
		redButton = new JButton("Red");
		orangeButton = new JButton("Orange");
		yellowButton = new JButton("Yellow"); 
		greenButton = new JButton("Green"); 
		blueButton = new JButton("Blue");
		purpleButton = new JButton("Violet");
		whiteButton = new JButton("White");
		
		// Labels
		widthLabel = new JLabel("Width"); 
		duckLabel = new JLabel(); 		
		
		setupMenuPanels(); 
		setupScrollPane(); 
		setupPanel(); 
		setupLayout(); 
		setupListeners();
		setupSlider(); 
	}
	
	private void setupMenuPanels()
	{
		colorPanel.setPreferredSize(new Dimension(50, 700));
		menuPanel.setPreferredSize(new Dimension(50,700));
				
		purpleButton.setForeground(new Color(75, 0, 130));
		blueButton.setForeground(Color.BLUE);
		greenButton.setForeground(Color.GREEN);
		orangeButton.setForeground(Color.ORANGE);
		redButton.setForeground(Color.RED);
		yellowButton.setForeground(Color.YELLOW);
				
		colorPanel.add(blackButton);
		colorPanel.add(purpleButton);
		colorPanel.add(blueButton);
		colorPanel.add(greenButton);
		colorPanel.add(yellowButton);
		colorPanel.add(orangeButton);
		colorPanel.add(redButton);
		colorPanel.add(whiteButton);
				
		menuPanel.add(widthSlider);
		menuPanel.add(loadButton);
		menuPanel.add(saveButton);
		menuPanel.add(clearButton);
	}
	
	private void setupSlider()
	{
		Hashtable<Integer, JLabel> scaleLabels = new Hashtable<Integer, JLabel>();
		scaleLabels.put(MINIMUM_LINE, new JLabel("<HTML>Small<BR>Line</HTML>"));
		scaleLabels.put(MAXIMUM_LINE, new JLabel("<HTML>Large<BR>Line</HTML>"));
		widthSlider.setLabelTable(scaleLabels);
		widthSlider.setSnapToTicks(true);
		widthSlider.setMajorTickSpacing(5);
		widthSlider.setMinorTickSpacing(1);
		widthSlider.setPaintTicks(true);
		widthSlider.setPaintLabels(true);
		widthSlider.setValue((MAXIMUM_LINE + MINIMUM_LINE) / 2);
	}
	
	private void setupScrollPane()
	{
		canvasPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED); 
		canvasPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED); 
		canvasPane.setViewportView(canvasPane); 
	}
	
	private void setupPanel()
	{
		
	}
	
	private void setupLayout()
	{
		appLayout.putConstraint(SpringLayout.NORTH, colorPanel, 0, SpringLayout.NORTH, canvasPane);
		appLayout.putConstraint(SpringLayout.SOUTH, colorPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putConstraint(SpringLayout.WEST, colorPanel, 50, SpringLayout.EAST, canvasPane);
		appLayout.putConstraint(SpringLayout.EAST, colorPanel, 0, SpringLayout.WEST, menuPanel);
				
		appLayout.putConstraint(SpringLayout.WEST, menuPanel, 200, SpringLayout.EAST, canvasPane);
		appLayout.putConstraint(SpringLayout.SOUTH, menuPanel, 0, SpringLayout.SOUTH, canvasPane);
		appLayout.putConstraint(SpringLayout.EAST, menuPanel, -50, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, menuPanel, 0, SpringLayout.NORTH, canvasPane);
					
		appLayout.putConstraint(SpringLayout.NORTH, canvasPane, 25, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.WEST, canvasPane, 50, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, canvasPane, -50, SpringLayout.SOUTH, this);
	}
	
	private void setupListeners() 
	{
		
	}
}
