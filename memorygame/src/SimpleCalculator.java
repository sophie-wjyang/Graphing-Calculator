import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class SimpleCalculator extends JFrame{
	
	private JTextField output = new JTextField(20);
	JPanel panel;
	
	public SimpleCalculator(String n) {
		super(n);
		
        Container c = getContentPane();
        //getContentPane().setBackground(Color.gray);
        c.setLayout(null);
		
		//output value
      	c.add(output);
      	output.setSize(410,60);
        output.setLocation(50,50);
      	output.setEditable(false); //doesn't let user input in output field
		
        JButton oneButton = new JButton("1"); 
        c.add(oneButton);
        oneButton.setSize(80,80);
        oneButton.setLocation(50,140);
        //addButton.addActionListener(this);
        
        JButton twoButton = new JButton("2"); 
        c.add(twoButton);
        twoButton.setSize(80,80);
        twoButton.setLocation(160,140);
        //addButton.addActionListener(this);
        
		JButton threeButton = new JButton("3"); 
        c.add(threeButton);
        threeButton.setSize(80,80);
        threeButton.setLocation(270,140);
        //addButton.addActionListener(this);
        
        JButton addButton = new JButton("+"); 
        c.add(addButton);
        addButton.setSize(80,80);
        addButton.setLocation(380,140);
        //addButton.addActionListener(this);

        JButton fourButton = new JButton("4");
        c.add(fourButton);
        fourButton.setSize(80,80);
        fourButton.setLocation(50,250);
        //subtractButton.addActionListener(this);
        
        JButton fiveButton = new JButton("5");
        c.add(fiveButton);
        fiveButton.setSize(80,80);
        fiveButton.setLocation(160,250);
        //subtractButton.addActionListener(this);
        
        JButton sixButton = new JButton("6");
        c.add(sixButton);
        sixButton.setSize(80,80);
        sixButton.setLocation(270,250);
        //subtractButton.addActionListener(this);
        
        JButton subtractButton = new JButton("-");
        c.add(subtractButton);
        subtractButton.setSize(80,80);
        subtractButton.setLocation(380,250);
        //subtractButton.addActionListener(this);

        JButton sevenButton = new JButton("7");
        c.add(sevenButton);
        sevenButton.setSize(80,80);
        sevenButton.setLocation(50,360);
        //multiplyButton.addActionListener(this);
        
        JButton eightButton = new JButton("8");
        c.add(eightButton);
        eightButton.setSize(80,80);
        eightButton.setLocation(160,360);
        //multiplyButton.addActionListener(this);
        
        JButton nineButton = new JButton("9");
        c.add(nineButton);
        nineButton.setSize(80,80);
        nineButton.setLocation(270,360);
        //multiplyButton.addActionListener(this);
        
        JButton multiplyButton = new JButton("*");
        c.add(multiplyButton);
        multiplyButton.setSize(80,80);
        multiplyButton.setLocation(380,360);
        //multiplyButton.addActionListener(this);
        
        JButton zeroButton = new JButton("0");
        c.add(zeroButton);
        zeroButton.setSize(80,80);
        zeroButton.setLocation(50,470);
        //multiplyButton.addActionListener(this);
        
        JButton decimalButton = new JButton(".");
        c.add(decimalButton);
        decimalButton.setSize(80,80);
        decimalButton.setLocation(160,470);
        //multiplyButton.addActionListener(this);
        
        JButton negativeButton = new JButton("(-)");
        c.add(negativeButton);
        negativeButton.setSize(80,80);
        negativeButton.setLocation(270,470);
        //multiplyButton.addActionListener(this);
        
        JButton divideButton = new JButton("/");
        c.add(divideButton);
        divideButton.setSize(80,80);
        divideButton.setLocation(380,470);
        //divideButton.addActionListener(this);
     
        
        JButton calculateButton = new JButton("=");
        c.add(calculateButton);
        calculateButton.setSize(190,50);
        calculateButton.setLocation(50,580);
        //divideButton.addActionListener(this);
        
        JButton clearButton = new JButton("Clear");
        c.add(clearButton);
        clearButton.setSize(190,50);
        clearButton.setLocation(270,580);
        //divideButton.addActionListener(this);
        
       
      		
        
	}
	
	
}