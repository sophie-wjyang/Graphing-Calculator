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



public class MainMenuV2 extends JFrame implements ActionListener{
	JButton simpleCalc = new JButton("Simple Calculator");
	JButton graphingCalc = new JButton("Graphing Calculator");
	JButton distanceConv = new JButton("Distance Converter");
	Color pink = Color.decode("#DEA5a4");
	Color teal = Color.decode("#265B5F");
	Container c = getContentPane();
	

	
	public MainMenuV2()
	{
		c.setBackground(pink);
		c.add(simpleCalc);
		c.add(graphingCalc);
		c.add(distanceConv);
		c.setLayout(null);
		simpleCalc.addActionListener(this);
		simpleCalc.setSize(260,100);
		simpleCalc.setLocation(100,200);
		
		//graphingCalc.addActionListener(this);
		graphingCalc.setSize(260,100);
		graphingCalc.setLocation(100,310);
		
		distanceConv.setSize(260,100);
		distanceConv.setLocation(100,420);
		
		setVisible(true);
		setSize(510,690);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == simpleCalc)
		{
			new SimpleCalculator();
			dispose();
		}
	}
	
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(teal);
		g.setFont(new Font("TimesRoman", Font.BOLD, 30));
		g.drawString("			Welcome to Sophie and Rana's ", 50, 60);
		g.drawString("					ULTIMATE calculator ", 98, 100);
		g.drawString("					Take your pick! ", 120, 190);
		
	}
		
	
	
	
	
	
	}
		









