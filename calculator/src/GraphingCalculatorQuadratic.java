/*
Due date: June 23, 2021
Authors: Rana B. and Sophie Y.
File description: A graphing calculator class that draws quadratic equations the form of y= ax^2 + bx + c 
*/

import java.awt.*;
import javax.swing.*;
import java.awt.geom.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GraphingCalculatorQuadratic extends JFrame implements ActionListener{
    //Constants used in the program
    private final int XORIGIN = 254; 
    private final int YORIGIN = 384; 

    //Colors used in the program
	Color grey = Color.decode("#ebf0f7");
	Color grey2 = Color.decode("#dce1e8");
	Color dBlue = Color.decode("#0a314a");
	Color red = Color.decode("#f09d97");

    //Textfields for handling user input
	JTextField aValue = new JTextField(4);
	JTextField bValue = new JTextField(4);
	JTextField cValue = new JTextField(4);
	JTextField eqtn = new JTextField(7);
	JButton graph = new JButton("Graph");
	JButton clear = new JButton("Clear");
	JButton menu = new JButton("Menu");

    //Points that to be used to plot the points in the graph
	int xPoint, yPoint;
    
	//Variables used to check for valid input and then used in calculations 
	String userIn1, userIn2, userIn3;
	double aNum, bNum, cNum;
	
    //Control variables to control output for paint
	boolean pressGraph = false; 
	boolean error = false;

	/*
    GraphingCalculatorQuadratic() is the constructor, and sets up the layout of the graphing calculator and its frame; sets up action listener on buttons
    Pre: String n must be passed. String n represents the name of the window "Graphing Calculator"
    Post: Outputs the display of the calculator, allows buttons to be clickable 
    */
	public GraphingCalculatorQuadratic(String n)
	{
		super(n);
		Container c = getContentPane();
		
        //Location of textfield to hold a Value
		c.setLayout(null);
		aValue.setBounds(55, 10, 30, 25);
		aValue.setLocation(40, 70);
		c.add(aValue);
		
        //Location of textfield to hold b Value
		bValue.setBounds(55, 10, 30, 25);
		bValue.setLocation(80, 70);
		c.add(bValue);
		
        //Location of textfield to hold c Value
		cValue.setBounds(55,10, 30, 25);
		cValue.setLocation(120,70);
		c.add(cValue);
		
        //Location of textfield to hold final equation
		eqtn.setBounds(55,10, 200,25);
		eqtn.setLocation(160,70);
		eqtn.setEditable(false);
		c.add(eqtn);
		
        //Location of graph button 
		graph.setSize(89,25);
		graph.setLocation(370,42);
		graph.addActionListener(this);
		c.add(graph);
		
        //Location of clear button 
		clear.setSize(89,25);
		clear.setLocation(370,70);
		clear.addActionListener(this);
		c.add(clear);
		
        //Location of menu button 
		menu.setBackground(red);
        menu.setSize(70,30);
        menu.setLocation(216,610);
        menu.addActionListener(this);
        c.add(menu);

        //Set up frame
		setSize(510,690);
		setLocationRelativeTo(null);
		setResizable(false); 
		repaint();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
    /*
    findPoints() finds all the x and y coordinates needed to print the shape of the graph. Paint calls on this method to paint the parabola on the screen
    Pre: Graphics object g must be passed from overriden paint method
    Post: prints out a series of circles, that join together to display the given quadration function
    */
	public void findPoints(Graphics g)
	{
		//declaring variables for boundaries
		double y;                                                       //finds y values for the equation
        int offset = 2;                                                 //offset value of the oval
        int paddingV = 7;                                               //7 pixels represent one unit on our grid
        int topBound = 141;                                             //top bound of grid in java coordinate
        int bottomBound = 630;                                          //bottom bound of grid in java coordinate
        int rightBound = 42;                                            //right bound of grid in java coordinate
        int leftBound = 462;                                            //left bound of grid in java coordinate
        
		g.setColor(Color.RED);                                          //sets color of points to be red 

		for (double x=-50; x<=50; x = x+0.0001)                          //all x-coordinates to be used to plot the points
	    {
	       y = aNum*x*x+bNum*x+cNum;                                  //calculates y value using the equation
	       xPoint = (int)Math.round(XORIGIN + x*paddingV);             //converts x coordinates to java coordinate 
	       yPoint = (int)Math.round(YORIGIN - y*paddingV);             //converts y coordinates to java coordinate 
	         
	       if (yPoint >= topBound && yPoint<=bottomBound && xPoint>=rightBound && xPoint<=leftBound)
		   {
	    	   g.fillOval(xPoint-offset,yPoint-offset,2,2);            //prints coordinates if they lie within bounds
		   }  
	    }     
	}

    /*
    grid() displays grid after paint calls on grid()
    Pre: Graphics object g must be passed from overriden paint method
    Post: Prints out grid onto frame  
    */
    public void grid(Graphics g)
    {
        //setting up the grid
        int distanceBtwnBox = 35;
        Graphics2D g2 = (Graphics2D) g;

        //outline of grid box
        g2.setColor(grey);
		g2.fillRect(45, 140, 420, 490);
		
		//drawing vertical lines for grid
        g2.setColor(grey2);
		for (int i = -distanceBtwnBox; i<400; i+=distanceBtwnBox)
		{
			g2.draw(new Line2D.Double(80+i, 140, 80+i, 630));
		}
		
		//drawing horizontal lines for grid
		for(int j = -distanceBtwnBox; j<470; j+=distanceBtwnBox)
		{
			g2.draw(new Line2D.Double(45,175+j, 465, 175+j));
		}

        g2.setColor(Color.gray);

        //y axis line
        g2.draw(new Line2D.Double(255,140,255,630));
		//x axis line
		g2.draw(new Line2D.Double(44,384,465,384));
    }
    
    /*
    paint() overriden method to display graphics
    Pre: Graphics object g must be passed from overriden paint method
    Post: Prints out error messages, grid, and graph 
    */
	public void paint(Graphics g)
	{
		super.paint(g);
       
		//draws grid
		grid(g);

        //Prompts for user input
		Font basic = new Font("TimesRoman", Font.BOLD, 14);
		g.setFont(basic);
		g.setColor(dBlue);
		g.drawString("a", 50, 95);
		g.drawString("b", 90, 95);
		g.drawString("c", 130, 95);
		g.drawString("Equation in standard form:", 170, 95);
		
		g.setColor(Color.RED);
		
        //if check for valid input failed, print error message
		if(error)
		{
			g.setColor(Color.RED);
			g.drawString("Please enter a decimal or an integer value for both fields", 50,50);
			eqtn.setText("");
			error = false;
			pressGraph = false;
		}
		
        //drawing the function if graph button is pressed
		if(pressGraph)
		{
			findPoints(g);
		}
	}
	
    /*
	actionPerformed() is used to define what happens when the user clicks on a given button
	Pre: ActionEvent must be passed as a result of a button being pressed
	Post: Checks for valid input before calling the findPoints() function. Prints out equation onto screen. Clears screen when button is pressed. Can transport to main menu if button is pressed 
	*/
	public void actionPerformed(ActionEvent e) {
		//convert text input to doubles if graph button is pressed 
		if(e.getSource() == graph)
		{
			pressGraph = true;
			userIn1 = aValue.getText();
			userIn2 = bValue.getText();
			userIn3 = cValue.getText();

			try {
				aNum = Double.parseDouble(userIn1);
				bNum = Double.parseDouble(userIn2);
				cNum = Double.parseDouble(userIn3);
			}
			catch (Exception e1){                               //clear fields if input is invalid
				aValue.setText("");
				bValue.setText("");
				cValue.setText("");
				error = true;
				repaint();
			}
			
			//print the equation in y = ax^2 + bx + c
			eqtn.setText("y = "+aNum+"x² + "+bNum+"x +"+cNum);

			//if none of the fields are blank, call the paint method to call on the graphing method
			if(!aValue.getText().equals("") && !bValue.getText().equals("") && !cValue.getText().equals(""))
			{
				repaint();
			}
		}
		
        //clear screen if user clicks clear
		else if(e.getSource() == clear)
		{
			error = false;
			pressGraph= false;
			aValue.setText("");
			bValue.setText("");
			cValue.setText("");
			eqtn.setText("");
			repaint();
		}
		
        //transport to main menu if user chooses menu
		else if(e.getSource() == menu)
		{
			new MainMenu("Main Menu");
			dispose();
		}
	}
}
	
	
	
	
	
	

	
	
	
	
