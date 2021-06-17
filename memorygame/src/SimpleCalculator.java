package calculator;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleCalculator extends JFrame implements ActionListener{
	
	//creating display
	private JTextField output = new JTextField(20);
	private JPanel panel;
	
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
	 
	 
	public SimpleCalculator(String n) {
		super(n);
		
		JPanel panel1= new JPanel();
		JPanel panel2= new JPanel();
		JPanel panel3= new JPanel();
		JPanel panel4= new JPanel();
		JPanel panel5= new JPanel();
		JPanel panel6= new JPanel();
		JPanel panel7= new JPanel();
		JPanel panel8= new JPanel();
		JPanel panel9= new JPanel();
		JPanel panel0= new JPanel();
		JPanel panelAdd= new JPanel();
		JPanel panelSubtract= new JPanel();
		JPanel panelMultiply= new JPanel();
		JPanel panelDivide= new JPanel();
		JPanel panelDecimal= new JPanel();
		JPanel panelNegative= new JPanel();
		JPanel panelCalculate= new JPanel();
		JPanel panelClear= new JPanel();
		
		
        Container c = getContentPane();
        //getContentPane().setBackground(Color.gray);
        c.setLayout(null);
		
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
        //addButton.addActionListener(this);
        
       
        c.add(twoButton);
        twoButton.addActionListener(this);
        this.add(panel2);
        twoButton.setSize(80,80);
        twoButton.setLocation(160,140);
        //addButton.addActionListener(this);
        
        c.add(threeButton);
        threeButton.addActionListener(this);
        this.add(panel3);
        threeButton.setSize(80,80);
        threeButton.setLocation(270,140);
        //addButton.addActionListener(this);
        
        c.add(addButton);
        addButton.addActionListener(this);
        this.add(panelAdd);
        addButton.setSize(80,80);
        addButton.setLocation(380,140);
        //addButton.addActionListener(this);

        c.add(fourButton);
        fourButton.addActionListener(this);
        this.add(panel4);
        fourButton.setSize(80,80);
        fourButton.setLocation(50,250);
        //subtractButton.addActionListener(this);
        
        c.add(fiveButton);
        fiveButton.addActionListener(this);
        this.add(panel5);
        fiveButton.setSize(80,80);
        fiveButton.setLocation(160,250);
        //subtractButton.addActionListener(this);
        
        c.add(sixButton);
        sixButton.addActionListener(this);
        this.add(panel6);
        sixButton.setSize(80,80);
        sixButton.setLocation(270,250);
        //subtractButton.addActionListener(this);
        
        c.add(subtractButton);
        subtractButton.addActionListener(this);
        this.add(panelSubtract);
        subtractButton.setSize(80,80);
        subtractButton.setLocation(380,250);
        //subtractButton.addActionListener(this);
        
        c.add(sevenButton);
        sevenButton.addActionListener(this);
        this.add(panel7);
        sevenButton.setSize(80,80);
        sevenButton.setLocation(50,360);
        //multiplyButton.addActionListener(this);
        
        c.add(eightButton);
        eightButton.addActionListener(this);
        this.add(panel8);
        eightButton.setSize(80,80);
        eightButton.setLocation(160,360);
        //multiplyButton.addActionListener(this);
        
        c.add(nineButton);
        nineButton.addActionListener(this);
        this.add(panel9);
        nineButton.setSize(80,80);
        nineButton.setLocation(270,360);
        //multiplyButton.addActionListener(this);
        
        c.add(multiplyButton);
        multiplyButton.addActionListener(this);
        this.add(panelMultiply);
        multiplyButton.setSize(80,80);
        multiplyButton.setLocation(380,360);
        //multiplyButton.addActionListener(this);
        
        c.add(zeroButton);
        zeroButton.addActionListener(this);
        this.add(panel0);
        zeroButton.setSize(80,80);
        zeroButton.setLocation(50,470);
        //multiplyButton.addActionListener(this);
        
        c.add(decimalButton);
        decimalButton.addActionListener(this);
        this.add(panelDecimal);
        decimalButton.setSize(80,80);
        decimalButton.setLocation(160,470);
        //multiplyButton.addActionListener(this);
        
        c.add(negativeButton);
        negativeButton.addActionListener(this);
        this.add(panelNegative);
        negativeButton.setSize(80,80);
        negativeButton.setLocation(270,470);
        //multiplyButton.addActionListener(this);
        
        c.add(divideButton);
        divideButton.addActionListener(this);
        this.add(panelDivide);
        divideButton.setSize(80,80);
        divideButton.setLocation(380,470);
        //divideButton.addActionListener(this);
     
        c.add(calculateButton);
        calculateButton.addActionListener(this);
        this.add(panelCalculate);
        calculateButton.setSize(190,50);
        calculateButton.setLocation(50,580);
        //divideButton.addActionListener(this);
        
        c.add(clearButton);
        clearButton.addActionListener(this);
        this.add(panelClear);
        clearButton.setSize(190,50);
        clearButton.setLocation(270,580);
        //divideButton.addActionListener(this);
      	    
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == oneButton)
		{
			output.setText(output.getText().concat(String.valueOf(1)));
		}
		else if (e.getSource() == twoButton)
		{
			output.setText(output.getText().concat("2"));
		}
		else if (e.getSource() == threeButton)
		{
			output.setText(output.getText().concat(String.valueOf(3)));
		}
		else if (e.getSource() == fourButton)
		{
			output.setText(output.getText().concat("4"));
		}
		else if (e.getSource() == fiveButton)
		{
			output.setText(output.getText().concat("5"));
		}
		else if (e.getSource() == sixButton)
		{
			output.setText(output.getText().concat("6"));
		}
		else if (e.getSource() == sevenButton)
		{
			output.setText(output.getText().concat("7"));
		}
		else if (e.getSource() == eightButton)
		{
			output.setText(output.getText().concat("8"));
		}
		else if (e.getSource() == nineButton)
		{
			output.setText(output.getText().concat("9"));
		}
		else if (e.getSource() == zeroButton)
		{
			output.setText(output.getText().concat("0"));
		}
		else if (e.getSource() == addButton)
		{
			output.setText("");
		}
		else if (e.getSource() == subtractButton)
		{
			output.setText("");
		}
		else if (e.getSource() == multiplyButton)
		{
			output.setText("");
		}
		else if (e.getSource() == divideButton)
		{
			output.setText("");
		}
		else if (e.getSource() == decimalButton)
		{
			output.setText(output.getText().concat("."));
		}
		else if (e.getSource() == negativeButton)
		{
			output.setText(output.getText().concat("-"));
		}
		else if (e.getSource() == clearButton)
		{
			output.setText(""); //need to edit
		}
		else if (e.getSource() == calculateButton)
		{
			output.setText(output.getText().concat("")); //need to edit
		}
		
		
	}
	
	
}