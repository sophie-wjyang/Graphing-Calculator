/*
Due date: June 23, 2021
Authors: Rana B. and Sophie Y.
File description: A graphing calculator class that graphs linear equations in the form of y = mx + b
*/

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.geom.*;

public class GraphingCalculatorLinear extends JFrame implements ActionListener{
	//setting up colours using hex codes
	Color grey = Color.decode("#ebf0f7");
	Color grey2 = Color.decode("#dce1e8");
	Color dBlue = Color.decode("#0a314a");
	Color red = Color.decode("#f09d97");

	//creating user input fields
	JTextField yIntcpt = new JTextField(7);
	JTextField slope = new JTextField(7);
	JTextField eqtn = new JTextField(7);

	//creating command buttons 
	JButton graph = new JButton("Graph");
	JButton clear = new JButton("Clear");
	JButton menu = new JButton("Menu");
	
	//variables for graph
	double yInt, ySlope;
	protected Graphics2D g3;
	String userIn1, userIn2; //used to check valid input
	boolean pressGraph = false; //control variable for paint

	/*
    GraphingCalculatorLinear() is the constructor; sets up the layout and size of the graphing calculator and its frame; sets up action listener on buttons
    Pre: String n must be passed. String n represents the name of the window "Graphing Calculator"
    Post: Outputs the display of the calculator, allows buttons to be clickable 
    */

	public void LinearGraph(Graphics g) {
		
	double y;
	
	for (double x=-30; x<=30; x = x+0.01)
       {
		g.setColor(Color.RED);
        y = ySlope*x + yInt;
         
        xp = (int)Math.round(254 + x*7);
    	yp = (int)Math.round(384 - y*7);
         
        if (yp >= 141 && yp<=630 && xp>=42 && xp<=462)
	    {
	    	g.fillOval(xp-2,yp-2,2,2);
	    }
       }
	}
	
    /*
    paint() is an overriden method to display graphics
    Pre: Graphics object g must be passed from overriden paint method
    Post: Prints out error messages, grid, and graph 
    */

	public void paint(Graphics g)
	{
		super.paint(g);

		//setting up the grid
		Graphics2D g2 = (Graphics2D) g;
		g.setColor(grey);
		g.fillRect(45, 140, 420, 490);
		
		//drawing vertical lines for grid
		g2.setColor(grey2);
		for (int i = -35; i<400; i+=35)
		{
			g2.draw(new Line2D.Double(80+i, 140, 80+i, 630));
		}
		
		//drawing horizontal lines for grid
		for(int j = -35; j<470; j+=35)
		{
			g2.draw(new Line2D.Double(45,175+j, 465, 175+j));
		}

		//setting fonts and colour
		Font basic = new Font("TimesRoman", Font.BOLD, 11);
		g.setFont(basic);
		g.setColor(dBlue);

		//display prompting text 
		g.drawString("Y-Intercept:", 30, 72);
		g.drawString("Slope:", 104, 72);
		g.drawString("Equation:", 157, 72);
		
		g.setColor(Color.gray);
		
		//y axis line
		g2.draw(new Line2D.Double(255,140,255,630));

		//x axis line
		g2.draw(new Line2D.Double(44,384,465,384));
		
		//set colour
		g2.setColor(Color.RED);
		
		//actually drawing the function (if graph button is pressed) or displaying an error if input is invalid
		if(error)
		{
			g.setColor(red);
			error = false;
			pressGraph = false;
			g.drawString("Please enter a decimal or an integer value for both fields", 50,120);
		}

		if(pressGraph)
		{
			//g2.draw(new Line2D.Double(convX1, convY1, convX2, convY2));
			LinearGraph(g);
		}
	}
	
	 /*
    main() is the main method
    Pre: none
    Post: instantiates an object of the GraphingCalculatorLinear class
    */

	public static void main(String[] args)
	{
		new GraphingCalculatorLinear("Graphing Calculator");
	}
	
    /*
	actionPerformed() is used to define what happens when the user clicks on a given button
	Pre: ActionEvent must be passed as a result of a button being pressed
	Post: Checks for valid input before calling the findPoints() function. Prints out equation onto screen. Clears screen when button is pressed. Can transport to main menu if button is pressed 
	*/

	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == graph)
		{
			pressGraph = true;

			userIn1 = yIntcpt.getText();
			userIn2 = slope.getText();

			//check for valid input, and convert text input to double
			try {
				yInt = Double.parseDouble(userIn1);
				ySlope = Double.parseDouble(userIn2);
			}
			catch (Exception e1){
				yIntcpt.setText("");
				slope.setText("");
				error = true;
				yInt = 0;
				ySlope = 0;
				repaint();
			}
			
			//print the equation formatting
			if(yInt>0)
			{
				eqtn.setText("y = "+ySlope+"x + "+yInt);
			}
			else if (yInt<0)
			{
				eqtn.setText("y = "+ySlope+"x "+yInt);
			}
			if(!yIntcpt.getText().equals("") && !slope.getText().equals(""))
			{
				repaint();
			}
		}
		
		//clears graph and y-int + slope text fields
		else if(e.getSource() == clear)
		{
			error = false;
			pressGraph= false;
			yIntcpt.setText("");
			slope.setText("");
			eqtn.setText("");
			repaint();
		}
		
		//goes back to main menu 
		else if(e.getSource() == menu)
		{
			MainMenu get = new MainMenu();
			dispose();
		}
	}
}
	
	
	
	
	
	
