import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Color;

class SimpleCalculator extends JFrame implements ActionListener{
	
	//creating display
	private JTextField output = new JTextField(20);
	String equation = "";
	
	//creating panels
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	JPanel panel5 = new JPanel();
	JPanel panel6 = new JPanel();
	JPanel panel7 = new JPanel();
	JPanel panel8 = new JPanel();
	JPanel panel9 = new JPanel();
	JPanel panel0 = new JPanel();
	JPanel panelAdd = new JPanel();
	JPanel panelSubtract = new JPanel();
	JPanel panelMultiply = new JPanel();
	JPanel panelDivide = new JPanel();
	JPanel panelDecimal = new JPanel();
	JPanel panelNegative = new JPanel();
	JPanel panelCalculate = new JPanel();
	JPanel panelClear = new JPanel();
	
	//creating buttons
	JButton oneButton = new JButton("1"); 
	JButton twoButton = new JButton("2"); 
	JButton threeButton = new JButton("3");
	JButton addButton = new JButton("+"); 
	JButton fourButton = new JButton("4");
	JButton fiveButton = new JButton("5");
	JButton sixButton = new JButton("6");
	JButton subtractButton = new JButton("-");
	JButton sevenButton = new JButton("7");
	JButton eightButton = new JButton("8");
	JButton nineButton = new JButton("9");
    JButton multiplyButton = new JButton("*");
    JButton zeroButton = new JButton("0");
    JButton decimalButton = new JButton(".");
    JButton negativeButton = new JButton("(-)");
    JButton divideButton = new JButton("/");
    JButton calculateButton = new JButton("=");
    JButton clearButton = new JButton("Clear");
    JButton menuButton = new JButton("Menu");
    Color red = Color.decode("#f09d97");
    Color white = Color.decode("#FFFFFF");
	 
	 
	public SimpleCalculator(String n) {
		super(n);
		
		//creating container
        Container c = getContentPane();
        //getContentPane().setBackground(Color.gray);
        c.setLayout(null);
		
        c.add(menuButton);
        menuButton.setBackground(red);
        menuButton.setSize(70,40);
        menuButton.setLocation(390,10);
        menuButton.addActionListener(this);
        
		//output value
      	c.add(output);
      	output.setSize(410,60);
        output.setLocation(50,50);
      	output.setEditable(false); //doesn't let user input in output field
		
       
        c.add(oneButton);
        oneButton.addActionListener(this);
        this.add(panel1);
        oneButton.setSize(80,80);
        oneButton.setLocation(50,140);
       
        c.add(twoButton);
        twoButton.addActionListener(this);
        this.add(panel2);
        twoButton.setSize(80,80);
        twoButton.setLocation(160,140);
        
        c.add(threeButton);
        threeButton.addActionListener(this);
        this.add(panel3);
        threeButton.setSize(80,80);
        threeButton.setLocation(270,140);
        
        c.add(addButton);
        addButton.addActionListener(this);
        this.add(panelAdd);
        addButton.setSize(80,80);
        addButton.setLocation(380,140);
       
        c.add(fourButton);
        fourButton.addActionListener(this);
        this.add(panel4);
        fourButton.setSize(80,80);
        fourButton.setLocation(50,250);
        
        c.add(fiveButton);
        fiveButton.addActionListener(this);
        this.add(panel5);
        fiveButton.setSize(80,80);
        fiveButton.setLocation(160,250);
        
        c.add(sixButton);
        sixButton.addActionListener(this);
        this.add(panel6);
        sixButton.setSize(80,80);
        sixButton.setLocation(270,250);
        
        c.add(subtractButton);
        subtractButton.addActionListener(this);
        this.add(panelSubtract);
        subtractButton.setSize(80,80);
        subtractButton.setLocation(380,250);
        
        c.add(sevenButton);
        sevenButton.addActionListener(this);
        this.add(panel7);
        sevenButton.setSize(80,80);
        sevenButton.setLocation(50,360);
        
        c.add(eightButton);
        eightButton.addActionListener(this);
        this.add(panel8);
        eightButton.setSize(80,80);
        eightButton.setLocation(160,360);
        
        c.add(nineButton);
        nineButton.addActionListener(this);
        this.add(panel9);
        nineButton.setSize(80,80);
        nineButton.setLocation(270,360);
        
        c.add(multiplyButton);
        multiplyButton.addActionListener(this);
        this.add(panelMultiply);
        multiplyButton.setSize(80,80);
        multiplyButton.setLocation(380,360);
        
        c.add(zeroButton);
        zeroButton.addActionListener(this);
        this.add(panel0);
        zeroButton.setSize(80,80);
        zeroButton.setLocation(50,470);
        
        c.add(decimalButton);
        decimalButton.addActionListener(this);
        this.add(panelDecimal);
        decimalButton.setSize(80,80);
        decimalButton.setLocation(160,470);
        
        c.add(negativeButton);
        negativeButton.addActionListener(this);
        this.add(panelNegative);
        negativeButton.setSize(80,80);
        negativeButton.setLocation(270,470);
        
        c.add(divideButton);
        divideButton.addActionListener(this);
        this.add(panelDivide);
        divideButton.setSize(80,80);
        divideButton.setLocation(380,470);
        
        c.add(clearButton);
        clearButton.addActionListener(this);
        this.add(panelClear);
        clearButton.setSize(190,50);
        clearButton.setLocation(270,580);
        
        c.add(calculateButton);
        calculateButton.addActionListener(this);
        output.setText(equation);
        this.add(panelCalculate);
        calculateButton.setSize(190,50);
        calculateButton.setLocation(50,580);
        output.setText(equation);
        
     
      	    
	}
	
	public void actionPerformed(ActionEvent e) {
		
		
		
		//recognizing which button was clicked, displaying it, and adding it to a string
		//while(e.getSource() != calculateButton) {
			if (e.getSource() == oneButton)
			{
				equation += "1";
				output.setText(equation);
			}
			else if (e.getSource() == twoButton)
			{
				equation += "2";
				output.setText(equation);
			}
			else if (e.getSource() == threeButton)
			{
				equation += "3";
				output.setText(equation);
			}
			else if (e.getSource() == fourButton)
			{
				equation += "4";
				output.setText(equation);
			}
			else if (e.getSource() == fiveButton)
			{
				equation += "5";
				output.setText(equation);
			}
			else if (e.getSource() == sixButton)
			{
				equation += "6";
				output.setText(equation);
			}
			else if (e.getSource() == sevenButton)
			{
				equation += "7";
				output.setText(equation);
			}
			else if (e.getSource() == eightButton)
			{
				equation += "8";
				output.setText(equation);
			}
			else if (e.getSource() == nineButton)
			{
				equation += "9";
				output.setText(equation);
			}
			else if (e.getSource() == zeroButton)
			{
				equation += "0";
				output.setText(equation);
			}
			else if (e.getSource() == addButton)
			{
				equation += "+";
				output.setText(equation);
			}
			else if (e.getSource() == subtractButton)
			{
				equation += "-";
				output.setText(equation);
			}
			else if (e.getSource() == multiplyButton)
			{
				equation += "*";
				output.setText(equation);
			}
			else if (e.getSource() == divideButton)
			{
				equation += "/";
				output.setText(equation);
			}
			else if (e.getSource() == decimalButton)
			{
				equation += ".";
				output.setText(equation);
			}
			else if (e.getSource() == negativeButton)
			{
				equation += "_"; //underscore
				output.setText(equation);
			}
			else if (e.getSource() == clearButton)
			{
				equation = "";
				output.setText("");
			}
			else if (e.getSource() == calculateButton)
			{
				output.setText(equation);
			}
			else if (e.getSource() == menuButton)
			{
				MainMenu get = new MainMenu();
				dispose();
				
			}
	}
	
	
		
			
		//}
	
		
	}
	
	
