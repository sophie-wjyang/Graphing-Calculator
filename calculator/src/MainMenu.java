/*
Due date: June 23 2021
Name: Rana B. and Sophie Y.
File description: Main menu for our calculator program. Includes buttons to transport you to other functions of the program. 
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JFrame;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JButton;

public class MainMenu extends JFrame implements ActionListener{

	//main method calls on the MainMenu class
	public static void main(String[] args)
	{
		new MainMenu ("Main Menu");
	}
	
	//BUTTONS
	//calculation buttons 
	JButton simpleCalc = new JButton("Simple Calculator");
	JButton linGraphs = new JButton("Linear Graphing Calculator");
	JButton quadGraphs = new JButton("Quadratic Graphing Calculator");
	
	//pastel palette buttons
	JButton periwinkle = new JButton("Periwinkle");
	JButton babyBlue = new JButton("Baby Blue");
	JButton pastelGreen = new JButton("Pastel Green");
	
	//summer palette buttons
	JButton yellow = new JButton("Lemon Yellow");
	JButton orange = new JButton("Tangerine");
	JButton blue = new JButton("Cerulean");
	
	//COLOURS
	//pastel palette colours 
	Color periwinkleColour = Color.decode("#CCCCFF");
	Color babyBlueColour = Color.decode("#C0DFF7");
	Color pastelGreenColour = Color.decode("#A2E4B8");
	
	//summer palette colours
	Color yellowColour = Color.decode("#F3D111");
	Color orangeColour = Color.decode("#F2872F");
	Color blueColour = Color.decode("#15B2D3");
	
	//default colours
	Color white = Color.decode("#FFFFFF");
	Color defaultGrey = Color.decode("#D3D3D3");

	//Audio objects 
	AudioInputStream audioInputStream;
	Clip clip;
	
	Container c = getContentPane();

	//variable to control stop/start of music
	boolean musicControl = true;
		
	/*
    MainMenu() is the constructor; sets up the layout of the main menu and its frame; sets up action listener on buttons
    Pre: String n must be passed. String n represents the name of the window "Main Menu"
    Post: Outputs the display of the calculator; adds actionlistener 
    */
	
	public MainMenu(String n)
	{
		super(n);
		
		//set default background before user chooses a colour
		c.setBackground(defaultGrey);
		c.setLayout(null);
		
		//add buttons
		c.add(simpleCalc);
		c.add(linGraphs);
		c.add(quadGraphs);
		c.add(periwinkle);
		c.add(babyBlue);
		c.add(pastelGreen);
		c.add(yellow);
		c.add(orange);
		c.add(blue);
		
		//graph buttons: setting size of buttons and implementing action listener
		simpleCalc.setBackground(white);
		simpleCalc.setSize(340,70);
		simpleCalc.setLocation(90,110);
		simpleCalc.addActionListener(this);
	
		linGraphs.setBackground(white);
		linGraphs.setSize(340,70);
		linGraphs.setLocation(90,190);
		linGraphs.addActionListener(this);
		
		quadGraphs.setBackground(white);
		quadGraphs.setSize(340,70);
		quadGraphs.setLocation(90,270);
		quadGraphs.addActionListener(this);
		
		//colour palette buttons
		periwinkle.setBackground(white);
		periwinkle.setSize(130,50);
		periwinkle.setLocation(90,440);
		periwinkle.addActionListener(this);
	
		babyBlue.setBackground(white);
		babyBlue.setSize(130,50);
		babyBlue.setLocation(90,495);
		babyBlue.addActionListener(this);
		
		pastelGreen.setBackground(white);
		pastelGreen.setSize(130,50);
		pastelGreen.setLocation(90,550);
		pastelGreen.addActionListener(this);
		
		//colour palette buttons
		yellow.setBackground(white);
		yellow.setSize(130,50);
		yellow.setLocation(300,440);
		yellow.addActionListener(this);
	
		orange.setBackground(white);
		orange.setSize(130,50);
		orange.setLocation(300,495);
		orange.addActionListener(this);
		
		blue.setBackground(white);
		blue.setSize(130,50);
		blue.setLocation(300,550);
		blue.addActionListener(this);

		playSound();
		//setting up the frame 
		setSize(510,690);
		repaint();
		setLocationRelativeTo(null);
		setResizable(false); 
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/*
	actionPerformed() is used to define what happens when the user clicks on a given button
	Pre: ActionEvent must be passed as a result of a button being pressed
	Post: allows the buttons to load classes and change the background colour
	*/
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == simpleCalc)
		{
			musicControl = false;
			playSound();
			SimpleCalculator one = new SimpleCalculator("Simple Calculator");
			one.setSize(510,690);
			one.setVisible(true);
			dispose();
		}
		else if (e.getSource() == linGraphs)
		{
			musicControl = false;
			playSound();
			GraphingCalculatorLinear two = new GraphingCalculatorLinear("Linear Graphing Calculator");
			two.setSize(510,690);
			two.setVisible(true);
			dispose();
		}
		else if (e.getSource() == quadGraphs)
		{
			musicControl = false;
			playSound();
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
		else if (e.getSource() == yellow)
		{
			c.setBackground(yellowColour);
			repaint();
		}
		else if (e.getSource() == orange)
		{
			c.setBackground(orangeColour);
			repaint();
		}
		else if (e.getSource() == blue)
		{
			c.setBackground(blueColour);
			repaint();
		}
	}
	
	/*
    paint() is an overriden method to display graphics
    Pre: Graphics object g must be passed from overriden paint method
    Post: Prints out welcome message and colour palette prompts
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
		g.drawString("Pastel ", 90, 420);
		g.drawString("palette:", 90, 440);
		
		//themes
		g.drawString("Summer: ", 320, 420);
		g.drawString("palette:", 320, 440);
	}	

	public void playSound()
	 {
		if(musicControl)
		{
			try 
			{
				 audioInputStream = AudioSystem.getAudioInputStream(new File("MenuMusic.wav").getAbsoluteFile( ));
				 clip = AudioSystem.getClip( );
				
				clip.open(audioInputStream);
				clip.start( );
				clip.loop(Clip.LOOP_CONTINUOUSLY); 
				
				    
			}
			catch(Exception ex)
			{
				System.out.println("Error with playing sound.");
				ex.printStackTrace( );
			}
		}
		
		else 
		{
			try 
			{
				if (clip.isRunning())
                    clip.stop();   // Stop the player if it is still running

			}
			catch(Exception ex)
			{
				System.out.println("Error with playing sound.");
				ex.printStackTrace( );
			}
		}
	 }


}
		


















		
















