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

		
	public static void main(String[] args)
	{
		new MainMenu ("Main Menu");
	}
	//buttons setup for main menu 
	JButton simpleCalc = new JButton("Simple Calculator");
	JButton linGraphs = new JButton("Linear Graphing Calculator");
	JButton quadGraphs = new JButton("Quadratic Graphing Calculator");
	JButton theme1 = new JButton("Tropical");
	JButton theme2 = new JButton("Dark Mode");
	JButton theme3 = new JButton("Minimalistic");
	Color pink = Color.decode("#f5c6e8");
	Color teal = Color.decode("#446B87");
	Color white = Color.decode("#FFFFFF");
	Container c = getContentPane();
		
	/*
    MainMenu()
    Function: Constructor--sets up the layout of the main menu and its frame. Sets up action listener on buttons
    Pre: String n must be passed. String n represents the name of the window "Main Menu"
    Post: Outputs the display of the calculator, allows buttons to be clickable 
    */
	public MainMenu(String n)
	{
		super(n);
		c.setBackground(teal);
		c.setLayout(null);
		//background of buttons
		simpleCalc.setBackground(pink);
		simpleCalc.setOpaque(true);
		c.add(simpleCalc);
		
		linGraphs.setBackground(pink);
		linGraphs.setOpaque(true);
		c.add(linGraphs);
		
		quadGraphs.setBackground(pink);
		quadGraphs.setOpaque(true);
		c.add(quadGraphs);
		
		//setting size of buttons and implementing action listener
		simpleCalc.setSize(260,70);
		simpleCalc.setLocation(120,210);
		simpleCalc.addActionListener(this);
	
		linGraphs.setSize(260,70);
		linGraphs.setLocation(120,270);
		linGraphs.addActionListener(this);
		
		quadGraphs.setSize(260,70);
		quadGraphs.setLocation(120,350);
		quadGraphs.addActionListener(this);

		//setting up the frame 
		setSize(510,690);
		repaint();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


	}

	
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
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(white);
		g.setFont(new Font("Courier", Font.BOLD, 20));
		g.drawString("Welcome to Sophie and Rana's ", 90, 80);
		g.drawString("calculator", 190, 100);
		g.drawString("					Take your pick! ", 160, 190);
		
	}
		
	
	
	
	
	
	}
		









