/*
Due date: June 23, 2021
Authors: Rana B. and Sophie Y.
File description: a simple calculator that can solve equations using the four operations (+,-,*,/); accepts decimal and negative input
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class SimpleCalculator extends JFrame implements ActionListener{
	
	//creating calculator display
	private JTextField output = new JTextField(20);
	
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
    
    //main menu button
    JButton menuButton = new JButton("Menu");
    Color red = Color.decode("#f09d97");
    Color white = Color.decode("#FFFFFF");
    
    //calculations variables
	String equation = "";
    double result = 0;

	/*
	SimpleCalculator() is the constructor, and is used to create containers and buttons
	Pre: String n must be passed. String n represents the name of the window "Graphing Calculator"
	Post: Creates container and buttons
	*/
	public SimpleCalculator(String n) {
		super(n);
		
		//creating container
        Container c = getContentPane();
        c.setLayout(null);
        
        //main menu button
        c.add(menuButton);
        menuButton.setBackground(red);
        menuButton.setFont(new Font("Arial", Font.PLAIN, 18));
        menuButton.setSize(70,40);
        menuButton.setLocation(390,10);
        menuButton.addActionListener(this);
		
		//output value
      	c.add(output);
      	output.setFont(new Font("Arial", Font.PLAIN, 20));
      	output.setSize(410,60);
        output.setLocation(50,50);
      	output.setEditable(false); 
       
	   	//number and operator buttons
        c.add(oneButton);
        oneButton.addActionListener(this);
        this.add(panel1);
        oneButton.setFont(new Font("Arial", Font.PLAIN, 30));
        oneButton.setSize(80,80);
        oneButton.setLocation(50,140);
       
        c.add(twoButton);
        twoButton.addActionListener(this);
        this.add(panel2);
        twoButton.setFont(new Font("Arial", Font.PLAIN, 30));
        twoButton.setSize(80,80);
        twoButton.setLocation(160,140);
        
        c.add(threeButton);
        threeButton.addActionListener(this);
        this.add(panel3);
        threeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        threeButton.setSize(80,80);
        threeButton.setLocation(270,140);
        
        c.add(addButton);
        addButton.addActionListener(this);
        this.add(panelAdd);
        addButton.setFont(new Font("Arial", Font.PLAIN, 30));
        addButton.setSize(80,80);
        addButton.setLocation(380,140);
       
        c.add(fourButton);
        fourButton.addActionListener(this);
        this.add(panel4);
        fourButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fourButton.setSize(80,80);
        fourButton.setLocation(50,250);
        
        c.add(fiveButton);
        fiveButton.addActionListener(this);
        this.add(panel5);
        fiveButton.setFont(new Font("Arial", Font.PLAIN, 30));
        fiveButton.setSize(80,80);
        fiveButton.setLocation(160,250);
        
        c.add(sixButton);
        sixButton.addActionListener(this);
        this.add(panel6);
        sixButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sixButton.setSize(80,80);
        sixButton.setLocation(270,250);
        
        c.add(subtractButton);
        subtractButton.addActionListener(this);
        this.add(panelSubtract);
        subtractButton.setFont(new Font("Arial", Font.PLAIN, 30));
        subtractButton.setSize(80,80);
        subtractButton.setLocation(380,250);
        
        c.add(sevenButton);
        sevenButton.addActionListener(this);
        this.add(panel7);
        sevenButton.setFont(new Font("Arial", Font.PLAIN, 30));
        sevenButton.setSize(80,80);
        sevenButton.setLocation(50,360);
        
        c.add(eightButton);
        eightButton.addActionListener(this);
        this.add(panel8);
        eightButton.setFont(new Font("Arial", Font.PLAIN, 30));
        eightButton.setSize(80,80);
        eightButton.setLocation(160,360);
        
        c.add(nineButton);
        nineButton.addActionListener(this);
        this.add(panel9);
        nineButton.setFont(new Font("Arial", Font.PLAIN, 30));
        nineButton.setSize(80,80);
        nineButton.setLocation(270,360);
        
        c.add(multiplyButton);
        multiplyButton.addActionListener(this);
        this.add(panelMultiply);
        multiplyButton.setFont(new Font("Arial", Font.PLAIN, 30));
        multiplyButton.setSize(80,80);
        multiplyButton.setLocation(380,360);
        
        c.add(zeroButton);
        zeroButton.addActionListener(this);
        this.add(panel0);
        zeroButton.setFont(new Font("Arial", Font.PLAIN, 30));
        zeroButton.setSize(80,80);
        zeroButton.setLocation(50,470);
        
        c.add(decimalButton);
        decimalButton.addActionListener(this);
        this.add(panelDecimal);
        decimalButton.setFont(new Font("Arial", Font.PLAIN, 30));
        decimalButton.setSize(80,80);
        decimalButton.setLocation(160,470);
        
        c.add(negativeButton);
        negativeButton.addActionListener(this);
        this.add(panelNegative);
        negativeButton.setFont(new Font("Arial", Font.PLAIN, 30));
        negativeButton.setSize(80,80);
        negativeButton.setLocation(270,470);
        
        c.add(divideButton);
        divideButton.addActionListener(this);
        this.add(panelDivide);
        divideButton.setFont(new Font("Arial", Font.PLAIN, 30));
        divideButton.setSize(80,80);
        divideButton.setLocation(380,470);
        
        c.add(clearButton);
        clearButton.addActionListener(this);
        this.add(panelClear);
        clearButton.setFont(new Font("Arial", Font.PLAIN, 25));
        clearButton.setSize(190,50);
        clearButton.setLocation(270,580);
        
        c.add(calculateButton);
        calculateButton.addActionListener(this);
        this.add(panelCalculate);
        calculateButton.setFont(new Font("Arial", Font.PLAIN, 30));
        calculateButton.setSize(190,50);
        calculateButton.setLocation(50,580);
	}
	
	/*
	Calculations() is used to calculate the answer to a given equation
	Pre: none
	Post: outputs the answer to the inputted equation
	*/
	public void calculations() {
		
		String temp = ""; //used to separate equationArray into an array of numbers and an array of operators
		char [] equationArray = equation.toCharArray(); //convert equation to an array of characters
		
		String [] numbersArray = new String [equation.length()]; 
		String [] operationsArray = new String [equation.length()];
		int j = 0, k = 0;
		
		int count = 0, count2 = 0; //used to determine the length of various arrays
		
		//ERROR MESSAGES 
		//equation starts with an operator
		if(equationArray[0] == '+' || equationArray[0] == '-' || equationArray[0] == '*' || equationArray[0] == '/') {
			output.setText("Error");
			equation = "";
		}

		//multiple operators in a row
		for(int i = 0; i < equationArray.length-1; i++) {
			if((equationArray[i] == '+' || equationArray[i] == '-' || equationArray[i] == '*' || equationArray[i] == '/') && (equationArray[i+1] == '+' || equationArray[i+1] == '-' || equationArray[i+1] == '*' || equationArray[i+1] == '/')) {
				output.setText("Error");
				equation = "";
			}
		}
		
		//multiple decimal points in a row
		for(int i = 0; i < equationArray.length-1; i++) {
			if(equationArray[i] == '.' && equationArray[i+1] == '.') {
				output.setText("Error");
				equation = "";
			}
		}
			
		//STEP 1: SEPARATING equationArray INTO TWO ARRAYS: AN ARRAY OF NUMBERS AND AN ARRAY OF OPERATORS
		for(int i = 0; i < equation.length(); i++) {
			if(equationArray[i] != '+' && equationArray[i] != '-' && equationArray[i] != '*' && equationArray[i] != '/') {
				temp += equationArray[i];
				numbersArray [j] = temp;
			}
			else {
				j++;
				temp = "";
				operationsArray [k] = Character.toString(equationArray[i]);
				
				k++;
			}
		}

		//counting the non-null strings in numbersArray
		for(int i = 0; i < equation.length(); i++) {
			if(numbersArray[i] != null) {
				count++;
			}
		}
		
		//allowing negative input
		for(int i = 0;  i < count; i++) {
			if(numbersArray[i].charAt(0) == '_') {
				numbersArray[i] = String.valueOf(Double.parseDouble(numbersArray[i].substring(1, numbersArray[i].length())) * (-1));
			}
		}
		
		//STEP 2: FOLLOWING BEDMAS, CALCULATE * AND / FIRST, STORING THE RESULTS AND REMAINING NUMBERS INTO NEW ARRAYS
		//declaring new arrays
		double [] newNumbersArray = new double [count];
		String [] newOperationsArray = new String [count];
		int m = 0, n = 0;
		
		//multiplication and division
		for(int i = 0; i < count-1; i++) {
			if(operationsArray [i].equals("*")) {
				numbersArray [i+1] = Double.toString(Double.parseDouble(numbersArray [i])*Double.parseDouble(numbersArray [i+1]));
				numbersArray [i] = null;
				operationsArray [i] = null;
			}
		
			else if(operationsArray [i].equals("/")) {
				numbersArray [i+1] = Double.toString(Double.parseDouble(numbersArray [i])/Double.parseDouble(numbersArray [i+1]));
				numbersArray [i] = null;
				operationsArray [i] = null;
			}
		}
		
		//getting rid of null values in numbersArray  
		for(int i = 0; i < count; i++) {
			if(numbersArray [i] != null){
				newNumbersArray [m] = Double.parseDouble(numbersArray[i]);
				m++;
			}
		}
		 
		//getting rid of null values in operationsArray
		for(int i = 0; i < count-1; i++) {
			if(operationsArray [i] != null){
				newOperationsArray [n] = operationsArray[i];
				n++;
			}
		}
		
		//counting the non-null strings in newNumbersArray
		for(int i = 0; i < count; i++) {
			if(newNumbersArray[i] != 0) {
				count2++;
			}
		}
		
		//STEP 3: ADD AND SUBTRACT THE REMAINING NUMBERS
		//add and subtract
		result = newNumbersArray[0];
		
		for(int i = 0; i < count2-1; i++) {
			if(newOperationsArray[i].equals("+")){
				result += newNumbersArray[i+1];
			}
			else if(newOperationsArray[i].equals("-")){
				result -= newNumbersArray[i+1];
			}
		}		
	}

	/*
	actionPerformed() is used to define what happens when the user clicks on a given button
	Pre: ActionEvent must be passed as a result of a button being pressed
	Post: the String equation and the display is changed
	*/
	public void actionPerformed(ActionEvent e) {
		//recognizing which button was clicked, displaying its value, and adding it to a string (which is used in calculations() to actually solve the equation)
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
			equation += "_"; //note: underscore instead of negative sign
			output.setText(equation);
		}
		else if (e.getSource() == clearButton)
		{
			equation = "";
			output.setText("");
		}
		else if (e.getSource() == calculateButton)
		{
			calculations();
			output.setText(String.valueOf(result)); 
			equation = "";
		}
		else if (e.getSource() == menuButton)
		{
			new MainMenu("Main Menu");
			dispose();
			
		} 
	}
}