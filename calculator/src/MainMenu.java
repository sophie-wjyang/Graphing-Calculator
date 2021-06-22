
/*
Due date: June 23 2021
Name: Rana B. and Sophie Y.
File description: Main menu for our calculator program. Includes buttons to transport you to other functions of the program. 
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;  




public class MainMenu extends JFrame implements ActionListener{

	//main method calls on the MainMenu class
	public static void main(String[] args)
	{
		new MainMenu ("Main Menu");
	}
	
	//calculation buttons 
	JButton simpleCalc = new JButton("Simple Calculator");
	JButton linGraphs = new JButton("Linear Graphing Calculator");
	JButton quadGraphs = new JButton("Quadratic Graphing Calculator");
	
	//background colour buttons
	JButton periwinkle = new JButton("Periwinkle");
	JButton babyBlue = new JButton("Baby Blue");
	JButton pastelGreen = new JButton("Pastel Green");
	
	//theme buttons
	JButton starryNight = new JButton("Starry Night");
	JButton fireworks = new JButton("Fireworks");
	JButton jellyfish = new JButton("Jellyfish");
	
	//background colours 
	Color periwinkleColour = Color.decode("#CCCCFF");
	Color babyBlueColour = Color.decode("#C0DFF7");
	Color pastelGreenColour = Color.decode("#A2E4B8");
	
	//default colours
	Color white = Color.decode("#FFFFFF");
	Color defaultGrey = Color.decode("#D3D3D3");
	
	boolean starryNightPressed = false;
	
	Container c = getContentPane();
		
	/*
    MainMenu() is the constructor; sets up the layout of the main menu and its frame; sets up action listener on buttons
    Pre: String n must be passed. String n represents the name of the window "Main Menu"
    Post: Outputs the display of the calculator, allows buttons to be clickable 
    */
	
	public MainMenu(String n)
	{
		super(n);
		c.setBackground(defaultGrey);
		c.setLayout(null);
		
		//background of buttons
		c.add(simpleCalc);
		c.add(linGraphs);
		c.add(quadGraphs);
		c.add(periwinkle);
		c.add(babyBlue);
		c.add(pastelGreen);
		c.add(starryNight);
		c.add(fireworks);
		c.add(jellyfish);
		
		
		//graph buttons: setting size of buttons and implementing action listener
		simpleCalc.setSize(340,70);
		simpleCalc.setLocation(90,110);
		simpleCalc.addActionListener(this);
	
		linGraphs.setSize(340,70);
		linGraphs.setLocation(90,190);
		linGraphs.addActionListener(this);
		
		quadGraphs.setSize(340,70);
		quadGraphs.setLocation(90,270);
		quadGraphs.addActionListener(this);
		
		//colour palette buttons
		periwinkle.setSize(130,50);
		periwinkle.setLocation(90,440);
		periwinkle.addActionListener(this);
	
		babyBlue.setSize(130,50);
		babyBlue.setLocation(90,495);
		babyBlue.addActionListener(this);
		
		pastelGreen.setSize(130,50);
		pastelGreen.setLocation(90,550);
		pastelGreen.addActionListener(this);
		
		//colour palette buttons
		starryNight.setSize(130,50);
		starryNight.setLocation(300,440);
		starryNight.addActionListener(this);
	
		fireworks.setSize(130,50);
		fireworks.setLocation(300,495);
		fireworks.addActionListener(this);
		
		jellyfish.setSize(130,50);
		jellyfish.setLocation(300,550);
		jellyfish.addActionListener(this);
		
		

		//setting up the frame 
		setSize(510,690);
		repaint();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}

	/*
	actionPerformed() is used to define what happens when the user clicks on a given button
	Pre: ActionEvent must be passed as a result of a button being pressed
	Post: allows the buttons to load classes
	*/
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == simpleCalc)
		{
			SimpleCalculator one = new SimpleCalculator("Simple Calculator");
			one.setSize(510,690);
			one.setVisible(true);
			dispose();
		}
		else if (e.getSource() == linGraphs)
		{
			GraphingCalculatorLinear two = new GraphingCalculatorLinear("Linear Graphing Calculator");
			two.setSize(510,690);
			two.setVisible(true);
			dispose();
		}
		else if (e.getSource() == quadGraphs)
		{
			GraphingCalculatorQuadratic two = new GraphingCalculatorQuadratic("Graphing Calculator");
			two.setSize(510,690);
			two.setVisible(true);
			dispose();
		}
		else if (e.getSource() == periwinkle)
		{
			c.setBackground(periwinkleColour);
			repaint();
		}
		else if (e.getSource() == babyBlue)
		{
			c.setBackground(babyBlueColour);
			repaint();
		}
		else if (e.getSource() == pastelGreen)
		{
			c.setBackground(pastelGreenColour);
			repaint();
		}
		else if (e.getSource() == starryNight)
		{
			Test background = new Test();
			background.setVisible(true);
		}
		else if (e.getSource() == babyBlue)
		{
			c.setBackground(babyBlueColour);
			repaint();
		}
		else if (e.getSource() == pastelGreen)
		{
			c.setBackground(pastelGreenColour);
			repaint();
		}
	}
	
	/*
    paint() is an overriden method to display graphics
    Pre: Graphics object g must be passed from overriden paint method
    Post: Prints out welcome message
    */
	public void paint(Graphics g)
	{
		
		super.paint(g);
		
		
		//welcome text
		g.setColor(white);
		g.setFont(new Font("Courier", Font.BOLD, 20));
		g.drawString("Welcome to Sophie and Rana's ", 90, 80);
		g.drawString("calculator! Take your pick:", 90, 100);
		
		//colour palettes
		g.drawString("Colour ", 90, 420);
		g.drawString("palettes:", 90, 440);
		
		//themes
		g.drawString("Themes: ", 320, 420);
		
		Image img = Toolkit.getDefaultToolkit().getImage(  
		MainMenu.class.getResource("starbackground.jpeg"));  
		g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);  
		
//		if(starryNightPressed == true) {
//			
//		}
		
	}
	
}
		


















		
















