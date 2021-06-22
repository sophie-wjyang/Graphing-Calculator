import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTabbedPane;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;



public class MainMenu extends JFrame implements ActionListener{
	JButton simpleCalc = new JButton("Simple Calculator");
	JButton graphingCalc = new JButton("Graphing Calculator");
	JButton weightConv = new JButton("Weight Converter");
	JButton distanceConv = new JButton("Distance Converter");
	JButton tempConv = new JButton("Temperature Converter");
	Color pink = Color.decode("#f5c6e8");
	Color teal = Color.decode("#446B87");
	Color white = Color.decode("#FFFFFF");
	Container c = getContentPane();
		
	
	public MainMenu()
	{
		c.setBackground(teal);
		c.setLayout(null);
		//background of buttons
		simpleCalc.setBackground(pink);
		simpleCalc.setOpaque(true);
		c.add(simpleCalc);
		
		graphingCalc.setBackground(pink);
		graphingCalc.setOpaque(true);
		c.add(graphingCalc);
		
		distanceConv.setBackground(pink);
		distanceConv.setOpaque(true);
		c.add(distanceConv);
		
		weightConv.setBackground(pink);
		weightConv.setOpaque(true);
		c.add(weightConv);
		
		tempConv.setBackground(pink);
		tempConv.setOpaque(true);
		c.add(tempConv);
	
		//size of buttons 
		simpleCalc.setSize(260,70);
		simpleCalc.setLocation(120,210);
		
	
		graphingCalc.setSize(260,70);
		graphingCalc.setLocation(120,270);
		graphingCalc.addActionListener(this);
		
		distanceConv.setSize(260,70);
		distanceConv.setLocation(120,350);
		
		weightConv.setSize(260,70);
		weightConv.setLocation(120,410);
		
		tempConv.setSize(260,70);
		tempConv.setLocation(120,470);
		
		
		
		//listen for click on  buttons
		simpleCalc.addActionListener(this);
		
		setVisible(true);
		setSize(510,690);
		repaint();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == simpleCalc)
		{
			SimpleCalculator one = new SimpleCalculator("Simple Calculator");
			one.setSize(510,690);
			one.setVisible(true);
			dispose();
		}
		else if (e.getSource() == graphingCalc)
		{
			GraphingCalculator two = new GraphingCalculator("Graphing Calculator");
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
		









