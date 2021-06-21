import java.awt.*;
import java.awt.color.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.geom.*;
import java.awt.geom.Line2D.Double;


public class GraphingCalculator extends JFrame implements ActionListener{
	Color grey = Color.decode("#ebf0f7");
	Color grey2 = Color.decode("#dce1e8");
	Color dBlue = Color.decode("#0a314a");
	Color red = Color.decode("#f09d97");
	JTextField yIntcpt = new JTextField(7);
	JTextField slope = new JTextField(7);
	JTextField eqtn = new JTextField(7);
	JButton graph = new JButton("Graph");
	JButton clear = new JButton("Clear");
	JButton menu = new JButton("Menu");
	//variables for graph
	private int yInt, ySlope;
	
	/*
	x order:         -6, -5, -4,-3, -2, -1, 0,  1,   2,  3,    4,  5,  6,
	int xJCoords [] = {42,77,112,147,182,217,252,287, 322, 357, 392,427,462};
	y order:         -7, -6, -5,-4, -3, -2, -1,   0,  1,  2,  3,  4,  5, 6	7
	int yJCoords [] = {627,592,557,522,487,452,417,382,347,312,277,242,207,172,137};
	*/
	
	int normX1, normY1, normX2, normY2; //normal coordinates
	int convX1, convY1, convX2, convY2; //converted to java coordinates

	boolean pressGraph = false; //control variable for paint


	
	public GraphingCalculator(String n)
	{
		super(n);
		Container c = getContentPane();
		//setBackground(Color.WHITE);
		c.setLayout(null);
		yIntcpt.setBounds(70, 30, 40, 30);
		yIntcpt.setLocation(40, 50);
		c.add(yIntcpt);
		
		slope.setBounds(70, 30, 40, 30);
		slope.setLocation(95, 50);
		c.add(slope);
		
		eqtn.setBounds(180,30, 200,30);
		eqtn.setLocation(150,50);
		eqtn.setEditable(false);
		c.add(eqtn);
		
		graph.setSize(89,25);
		graph.setLocation(370,42);
		graph.addActionListener(this);
		c.add(graph);
		
		clear.setSize(89,25);
		clear.setLocation(370,70);
		clear.addActionListener(this);
		c.add(clear);
		
		menu.setBackground(red);
        menu.setSize(70,30);
        menu.setLocation(216,610);
        menu.addActionListener(this);
        c.add(menu);

		setSize(510,690);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setVisible(true);
		
	}
	
	public void LinearGraph()
	{
		yInt = yInt*7;
		
		//Step 1: calculate norm coordinates by plugging a very small and a very big number into the given linear equation
		normX1 = 300;
		normY1 = ySlope * normX1 + yInt;
		normX2 = -300;
		normY2 = ySlope * normX2 + yInt;
			
		
		//Step 2: find java coordinates by translating the normal coordinates 
		convX1 = normX1 + 254;
		convY1 = -normY1 + 386;
		convX2 = normX2 + 254;
		convY2 = -normY2 + 386;
		

		
		repaint();


		
	}
	
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
		Font basic = new Font("TimesRoman", Font.BOLD, 11);
		g.setFont(basic);
		g.setColor(dBlue);
		g.drawString("Y-Intercept:", 30, 72);
		g.drawString("Slope:", 104, 72);
		g.drawString("Equation:", 157, 72);
		
		g.setColor(Color.gray);
		
		//y axis line
		g2.draw(new Line2D.Double(255,140,255,630));
		//x axis line
		g2.draw(new Line2D.Double(44,384,465,384));
		
		g2.setColor(Color.RED);


		g2.fillOval(252, 382, 5, 5);
		//actually drawing the function (if graph button is pressed)
		if(pressGraph)
		{
			g2.drawLine(convX1, convY1, convX2, convY2);
		}
		
		
		
	}
	
	public static void main(String[] args)
	{
		new GraphingCalculator("Graphing Calculator");
	
	}
	

	public void actionPerformed(ActionEvent e) {
		String userIn1, userIn2;
		//convert text input to integers
		if(e.getSource() == graph)
		{
			pressGraph = true;
			//check for valid input loop

			userIn1 = yIntcpt.getText();
			userIn2 = slope.getText();

			try {
				yInt = Integer.parseInt(userIn1);
				ySlope = Integer.parseInt(userIn2);
			}
			catch (Exception e1){
				yIntcpt.setText("");
				slope.setText("");
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
				LinearGraph();
			}
			
		}
		
		else if(e.getSource() == clear)
		{
			pressGraph= false;
			yIntcpt.setText("");
			slope.setText("");
			eqtn.setText("");
			repaint();
		}
		
		/*else if(e.getSource() == menu)
		{
			MainMenuV2 get = new MainMenuV2();
			dispose();
		}
		*/
		
		
		
	}
	
	
	
	
	
	
	
	
}