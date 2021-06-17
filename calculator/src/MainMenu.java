import java.awt.GridLayout;
import java.awt.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTabbedPane;
	 
	public class MainMenu extends JFrame {
		public MainMenu()
		{
			SimpleCalculator one = new SimpleCalculator("");
		}

	    public static void Tabs() {
	    	Container c = new Container();
	        // Create and set up the window.
	        final JFrame frame = new JFrame("Calculators");
	        // Display the window.
	        frame.setSize(800, 500);
	        frame.setVisible(true);
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	        // set grid layout for the frame
	        frame.getContentPane().setLayout(new GridLayout(1, 1));
	 
	        JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	 
	        // add tab with title
	        tabbedPane.addTab("Simple Calculator", new JLabel(""));
	        
	    
	        // add tab with title and icon
	        Icon icon = new ImageIcon("icon.gif");
	        tabbedPane.addTab("Scientific Calculator", icon, new JLabel(""));

	        // add tab with title, icon 
	        tabbedPane.addTab("Graphing Calculator", icon, new JLabel(""));
	        
	        // add tab with title, icon 
	        tabbedPane.addTab("Length Converter", icon, new JLabel(""));
	        
	        // add tab with title, icon 
	        tabbedPane.addTab("Weight Converter", icon, new JLabel(""));
	        
	        // add tab with title, icon 
	        tabbedPane.addTab("Distance Converter", icon, new JLabel(""));
	
	 
	        frame.getContentPane().add(tabbedPane);
	 
	    }

	    }
	 
	


