import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class MainMenu extends JFrame implements ActionListener{
	
	private boolean isBlue = true;
	JButton b;
	
	public MainMenu(String n) {
		super(n);
		
		b = new JButton("Simple Calculator"); //creates button
		b.addActionListener(this);
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(b);
		
		
	}
	
	public void paint(Graphics g){
		super.paint(g);
		g.drawString("A MyFrame object", 500, 50); //text, x coordinate, y coordinate
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		//switching back and forth between two colours
		 if(isBlue){
			 getContentPane().setBackground(Color.red);
			 isBlue = false;
		 }
		 else{
			 getContentPane().setBackground(Color.blue);
			 isBlue = true;
		 }
				
		 repaint();
	}
	
}
